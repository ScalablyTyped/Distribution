package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportCertificateRequest extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:  arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: Arn
  
  /**
    * Passphrase to associate with the encrypted exported private key.   When creating your passphrase, you can use any ASCII character except #, $, or %.  If you want to later decrypt the private key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key. After entering the command, you are prompted for the passphrase.  openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
    */
  var Passphrase: PassphraseBlob
}
object ExportCertificateRequest {
  
  inline def apply(CertificateArn: Arn, Passphrase: PassphraseBlob): ExportCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Passphrase = Passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportCertificateRequest]
  }
  
  extension [Self <: ExportCertificateRequest](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: PassphraseBlob): Self = StObject.set(x, "Passphrase", value.asInstanceOf[js.Any])
  }
}
