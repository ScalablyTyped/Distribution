package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportCertificateRequest extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:  arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: Arn
  
  /**
    * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
    */
  var Passphrase: PassphraseBlob
}
object ExportCertificateRequest {
  
  @scala.inline
  def apply(CertificateArn: Arn, Passphrase: PassphraseBlob): ExportCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Passphrase = Passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportCertificateRequest]
  }
  
  @scala.inline
  implicit class ExportCertificateRequestMutableBuilder[Self <: ExportCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphrase(value: PassphraseBlob): Self = StObject.set(x, "Passphrase", value.asInstanceOf[js.Any])
  }
}
