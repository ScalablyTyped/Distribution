package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
trait XCertificate
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(CertificateUsage = CertificateUsage.asInstanceOf[js.Any], Encoded = Encoded.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], IssuerName = IssuerName.asInstanceOf[js.Any], IssuerUniqueID = IssuerUniqueID.asInstanceOf[js.Any], MD5Thumbprint = MD5Thumbprint.asInstanceOf[js.Any], NotValidAfter = NotValidAfter.asInstanceOf[js.Any], NotValidBefore = NotValidBefore.asInstanceOf[js.Any], SHA1Thumbprint = SHA1Thumbprint.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], SignatureAlgorithm = SignatureAlgorithm.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], SubjectPublicKeyAlgorithm = SubjectPublicKeyAlgorithm.asInstanceOf[js.Any], SubjectPublicKeyValue = SubjectPublicKeyValue.asInstanceOf[js.Any], SubjectUniqueID = SubjectUniqueID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), findCertificateExtension = js.Any.fromFunction1(findCertificateExtension), getCertificateUsage = js.Any.fromFunction0(getCertificateUsage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCertificate]
  }
  
  extension [Self <: XCertificate](x: Self) {
    
    inline def setCertificateUsage(value: Double): Self = StObject.set(x, "CertificateUsage", value.asInstanceOf[js.Any])
    
    inline def setEncoded(value: SafeArray[Double]): Self = StObject.set(x, "Encoded", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: SafeArray[XCertificateExtension]): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setFindCertificateExtension(value: SeqEquiv[Double] => XCertificateExtension): Self = StObject.set(x, "findCertificateExtension", js.Any.fromFunction1(value))
    
    inline def setGetCertificateUsage(value: () => Double): Self = StObject.set(x, "getCertificateUsage", js.Any.fromFunction0(value))
    
    inline def setIssuerName(value: String): Self = StObject.set(x, "IssuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: SafeArray[Double]): Self = StObject.set(x, "IssuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setMD5Thumbprint(value: SafeArray[Double]): Self = StObject.set(x, "MD5Thumbprint", value.asInstanceOf[js.Any])
    
    inline def setNotValidAfter(value: DateTime): Self = StObject.set(x, "NotValidAfter", value.asInstanceOf[js.Any])
    
    inline def setNotValidBefore(value: DateTime): Self = StObject.set(x, "NotValidBefore", value.asInstanceOf[js.Any])
    
    inline def setSHA1Thumbprint(value: SafeArray[Double]): Self = StObject.set(x, "SHA1Thumbprint", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: SafeArray[Double]): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "SignatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSubjectName(value: String): Self = StObject.set(x, "SubjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyAlgorithm(value: String): Self = StObject.set(x, "SubjectPublicKeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyValue(value: SafeArray[Double]): Self = StObject.set(x, "SubjectPublicKeyValue", value.asInstanceOf[js.Any])
    
    inline def setSubjectUniqueID(value: SafeArray[Double]): Self = StObject.set(x, "SubjectUniqueID", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
