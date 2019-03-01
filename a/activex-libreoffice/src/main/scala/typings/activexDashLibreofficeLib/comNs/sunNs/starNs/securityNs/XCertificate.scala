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

object XCertificate {
  @scala.inline
  def apply(
    CertificateUsage: scala.Double,
    Encoded: activexDashInteropLib.SafeArray[scala.Double],
    Extensions: activexDashInteropLib.SafeArray[XCertificateExtension],
    IssuerName: java.lang.String,
    IssuerUniqueID: activexDashInteropLib.SafeArray[scala.Double],
    MD5Thumbprint: activexDashInteropLib.SafeArray[scala.Double],
    NotValidAfter: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    NotValidBefore: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    SHA1Thumbprint: activexDashInteropLib.SafeArray[scala.Double],
    SerialNumber: activexDashInteropLib.SafeArray[scala.Double],
    SignatureAlgorithm: java.lang.String,
    SubjectName: java.lang.String,
    SubjectPublicKeyAlgorithm: java.lang.String,
    SubjectPublicKeyValue: activexDashInteropLib.SafeArray[scala.Double],
    SubjectUniqueID: activexDashInteropLib.SafeArray[scala.Double],
    Version: scala.Double,
    acquire: js.Function0[scala.Unit],
    findCertificateExtension: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      XCertificateExtension
    ],
    getCertificateUsage: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CertificateUsage")(CertificateUsage)
    __obj.updateDynamic("Encoded")(Encoded)
    __obj.updateDynamic("Extensions")(Extensions)
    __obj.updateDynamic("IssuerName")(IssuerName)
    __obj.updateDynamic("IssuerUniqueID")(IssuerUniqueID)
    __obj.updateDynamic("MD5Thumbprint")(MD5Thumbprint)
    __obj.updateDynamic("NotValidAfter")(NotValidAfter)
    __obj.updateDynamic("NotValidBefore")(NotValidBefore)
    __obj.updateDynamic("SHA1Thumbprint")(SHA1Thumbprint)
    __obj.updateDynamic("SerialNumber")(SerialNumber)
    __obj.updateDynamic("SignatureAlgorithm")(SignatureAlgorithm)
    __obj.updateDynamic("SubjectName")(SubjectName)
    __obj.updateDynamic("SubjectPublicKeyAlgorithm")(SubjectPublicKeyAlgorithm)
    __obj.updateDynamic("SubjectPublicKeyValue")(SubjectPublicKeyValue)
    __obj.updateDynamic("SubjectUniqueID")(SubjectUniqueID)
    __obj.updateDynamic("Version")(Version)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("findCertificateExtension")(findCertificateExtension)
    __obj.updateDynamic("getCertificateUsage")(getCertificateUsage)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCertificate]
  }
}

