package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the certificate was created.
    */
  var CertificateCreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the certificate.
    */
  var CertificateOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.undefined
  
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL. Example: filebase64("${path.root}/rds-ca-2019-root.sso") 
    */
  var CertificateWallet: js.UndefOr[typings.awsSdk.clientsDmsMod.CertificateWallet] = js.undefined
  
  /**
    * The key length of the cryptographic algorithm being used.
    */
  var KeyLength: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The signing algorithm for the certificate.
    */
  var SigningAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * The beginning date that the certificate is valid.
    */
  var ValidFromDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The final date that the certificate is valid.
    */
  var ValidToDate: js.UndefOr[js.Date] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateCreationDate(value: js.Date): Self = StObject.set(x, "CertificateCreationDate", value.asInstanceOf[js.Any])
    
    inline def setCertificateCreationDateUndefined: Self = StObject.set(x, "CertificateCreationDate", js.undefined)
    
    inline def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    inline def setCertificateOwner(value: String): Self = StObject.set(x, "CertificateOwner", value.asInstanceOf[js.Any])
    
    inline def setCertificateOwnerUndefined: Self = StObject.set(x, "CertificateOwner", js.undefined)
    
    inline def setCertificatePem(value: String): Self = StObject.set(x, "CertificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "CertificatePem", js.undefined)
    
    inline def setCertificateWallet(value: CertificateWallet): Self = StObject.set(x, "CertificateWallet", value.asInstanceOf[js.Any])
    
    inline def setCertificateWalletUndefined: Self = StObject.set(x, "CertificateWallet", js.undefined)
    
    inline def setKeyLength(value: IntegerOptional): Self = StObject.set(x, "KeyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "KeyLength", js.undefined)
    
    inline def setSigningAlgorithm(value: String): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
    
    inline def setValidFromDate(value: js.Date): Self = StObject.set(x, "ValidFromDate", value.asInstanceOf[js.Any])
    
    inline def setValidFromDateUndefined: Self = StObject.set(x, "ValidFromDate", js.undefined)
    
    inline def setValidToDate(value: js.Date): Self = StObject.set(x, "ValidToDate", value.asInstanceOf[js.Any])
    
    inline def setValidToDateUndefined: Self = StObject.set(x, "ValidToDate", js.undefined)
  }
}
