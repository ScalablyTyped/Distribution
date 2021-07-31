package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueCertificateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the issued certificate and the certificate serial number. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
}
object IssueCertificateResponse {
  
  @scala.inline
  def apply(): IssueCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueCertificateResponse]
  }
  
  @scala.inline
  implicit class IssueCertificateResponseMutableBuilder[Self <: IssueCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
  }
}
