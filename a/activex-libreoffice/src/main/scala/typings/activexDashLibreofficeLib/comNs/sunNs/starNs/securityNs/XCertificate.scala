package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
trait XCertificate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * get the certificate usage. The return value is a set of bits, as defined in RFC3280 for the {@link KeyUsage} BIT STRING. Note the bit and byte order
    * used in ASN.1, so for instance the bit dataEncipherment in {@link KeyUsage} , "bit 3", corresponds to CERT_DATA_ENCIPHERMENT_KEY_USAGE in Win32 and
    * KU_DATA_ENCIPHERMENT in NSS, both with value 0x10.
    */
  val CertificateUsage: scala.Double
  /** the DER encoded form of the certificate */
  var Encoded: activexDashInteropLib.SafeArray[scala.Double]
  /** all extensions of a certificate. */
  var Extensions: activexDashInteropLib.SafeArray[XCertificateExtension]
  /** the issuer name attribute of the certificate. */
  var IssuerName: java.lang.String
  /** the issuer unique ID attribute of the certificate. */
  var IssuerUniqueID: activexDashInteropLib.SafeArray[scala.Double]
  /** the MD5 thumbprint */
  var MD5Thumbprint: activexDashInteropLib.SafeArray[scala.Double]
  /** the validity NotAfter date attribute of the certificate. */
  var NotValidAfter: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** the validity NotBefore date attribute of the certificate. */
  var NotValidBefore: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** the SHA-1 thumbprint */
  var SHA1Thumbprint: activexDashInteropLib.SafeArray[scala.Double]
  /** the serial number attribute of the certificate. */
  var SerialNumber: activexDashInteropLib.SafeArray[scala.Double]
  /** the signature algorithm */
  var SignatureAlgorithm: java.lang.String
  /** the subject name attribute of the certificate. */
  var SubjectName: java.lang.String
  /** the algorithm of the subject public key */
  var SubjectPublicKeyAlgorithm: java.lang.String
  /** the value of the subject public key */
  var SubjectPublicKeyValue: activexDashInteropLib.SafeArray[scala.Double]
  /** the subject unique ID attribute of the certificate. */
  var SubjectUniqueID: activexDashInteropLib.SafeArray[scala.Double]
  /** the version number attribute of the certificate. */
  var Version: scala.Double
  /** Find a extension with a object identifier. */
  def findCertificateExtension(oid: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): XCertificateExtension
  /**
    * get the certificate usage. The return value is a set of bits, as defined in RFC3280 for the {@link KeyUsage} BIT STRING. Note the bit and byte order
    * used in ASN.1, so for instance the bit dataEncipherment in {@link KeyUsage} , "bit 3", corresponds to CERT_DATA_ENCIPHERMENT_KEY_USAGE in Win32 and
    * KU_DATA_ENCIPHERMENT in NSS, both with value 0x10.
    */
  def getCertificateUsage(): scala.Double
}

