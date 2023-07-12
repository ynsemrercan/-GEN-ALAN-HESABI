import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {

        double kenar1,kenar2,kenar3,yariCevre,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu girin: ");
        kenar1 = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu girin: ");
        kenar2 = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        kenar3 = input.nextDouble();

        // Üçgenin yarı çevresini hesapla
        yariCevre = (kenar1 + kenar2 + kenar3) / 2;


        alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
