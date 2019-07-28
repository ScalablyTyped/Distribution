package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
trait XCertificate extends XInterface {
  /**
    * get the certificate usage. The return value is a set of bits, as defined in RFC3280 for the {@link KeyUsage} BIT STRING. Note the bit and byte order
    * used in ASN.1, so for instance the bit dataEncipherment in {@link KeyUsage} , "bit 3", corresponds to CERT_DATA_ENCIPHERMENT_KEY_USAGE in Win32 and
    * KU_DATA_ENCIPHERMENT in NSS, both with value 0x10.
    */
  val CertificateUsage: Double
  /** the DER encoded form of the certificate */
  var Encoded: SafeArray[Double]
  /** all extensions of a certificate. */
  var Extensions: SafeArray[XCertificateExtension]
  /** the issuer name attribute of the certificate. */
  var IssuerName: String
  /** the issuer unique ID attribute of the certificate. */
  var IssuerUniqueID: SafeArray[Double]
  /** the MD5 thumbprint */
  var MD5Thumbprint: SafeArray[Double]
  /** the validity NotAfter date attribute of the certificate. */
  var NotValidAfter: DateTime
  /** the validity NotBefore date attribute of the certificate. */
  var NotValidBefore: DateTime
  /** the SHA-1 thumbprint */
  var SHA1Thumbprint: SafeArray[Double]
  /** the serial number attribute of the certificate. */
  var SerialNumber: SafeArray[Double]
  /** the signature algorithm */
  var SignatureAlgorithm: String
  /** the subject name attribute of the certificate. */
  var SubjectName: String
  /** the algorithm of the subject public key */
  var SubjectPublicKeyAlgorithm: String
  /** the value of the subject public key */
  var SubjectPublicKeyValue: SafeArray[Double]
  /** the subject unique ID attribute of the certificate. */
  var SubjectUniqueID: SafeArray[Double]
  /** the version number attribute of the certificate. */
  var Version: Double
  /** Find a extension with a object identifier. */
  def findCertificateExtension(oid: SeqEquiv[Double]): XCertificateExtension
  /**
    * get the certificate usage. The return value is a set of bits, as defined in RFC3280 for the {@link KeyUsage} BIT STRING. Note the bit and byte order
    * used in ASN.1, so for instance the bit dataEncipherment in {@link KeyUsage} , "bit 3", corresponds to CERT_DATA_ENCIPHERMENT_KEY_USAGE in Win32 and
    * KU_DATA_ENCIPHERMENT in NSS, both with value 0x10.
    */
  def getCertificateUsage(): Double
}

object XCertificate {
  @scala.inline
  def apply(
    CertificateUsage: Double,
    Encoded: SafeArray[Double],
    Extensions: SafeArray[XCertificateExtension],
    IssuerName: String,
    IssuerUniqueID: SafeArray[Double],
    MD5Thumbprint: SafeArray[Double],
    NotValidAfter: DateTime,
    NotValidBefore: DateTime,
    SHA1Thumbprint: SafeArray[Double],
    SerialNumber: SafeArray[Double],
    SignatureAlgorithm: String,
    SubjectName: String,
    SubjectPublicKeyAlgorithm: String,
    SubjectPublicKeyValue: SafeArray[Double],
    SubjectUniqueID: SafeArray[Double],
    Version: Double,
    acquire: () => Unit,
    findCertificateExtension: SeqEquiv[Double] => XCertificateExtension,
    getCertificateUsage: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCertificate = {
    val __obj = js.Dynamic.literal(CertificateUsage = CertificateUsage, Encoded = Encoded, Extensions = Extensions, IssuerName = IssuerName, IssuerUniqueID = IssuerUniqueID, MD5Thumbprint = MD5Thumbprint, NotValidAfter = NotValidAfter, NotValidBefore = NotValidBefore, SHA1Thumbprint = SHA1Thumbprint, SerialNumber = SerialNumber, SignatureAlgorithm = SignatureAlgorithm, SubjectName = SubjectName, SubjectPublicKeyAlgorithm = SubjectPublicKeyAlgorithm, SubjectPublicKeyValue = SubjectPublicKeyValue, SubjectUniqueID = SubjectUniqueID, Version = Version, acquire = js.Any.fromFunction0(acquire), findCertificateExtension = js.Any.fromFunction1(findCertificateExtension), getCertificateUsage = js.Any.fromFunction0(getCertificateUsage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCertificate]
  }
}

