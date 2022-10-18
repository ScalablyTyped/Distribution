package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateMessage extends StObject {
  
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: String
  
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[SecretString] = js.undefined
  
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL. Provide the name of a .sso file using the fileb:// prefix. You can't provide the certificate inline. Example: filebase64("${path.root}/rds-ca-2019-root.sso") 
    */
  var CertificateWallet: js.UndefOr[typings.awsSdk.clientsDmsMod.CertificateWallet] = js.undefined
  
  /**
    * The tags associated with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportCertificateMessage {
  
  inline def apply(CertificateIdentifier: String): ImportCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateIdentifier = CertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateMessage]
  }
  
  extension [Self <: ImportCertificateMessage](x: Self) {
    
    inline def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCertificatePem(value: SecretString): Self = StObject.set(x, "CertificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "CertificatePem", js.undefined)
    
    inline def setCertificateWallet(value: CertificateWallet): Self = StObject.set(x, "CertificateWallet", value.asInstanceOf[js.Any])
    
    inline def setCertificateWalletUndefined: Self = StObject.set(x, "CertificateWallet", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
