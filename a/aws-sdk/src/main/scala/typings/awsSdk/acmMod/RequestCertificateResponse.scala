package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestCertificateResponse extends StObject {
  
  /**
    * String that contains the ARN of the issued certificate. This must be of the form:  arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
}
object RequestCertificateResponse {
  
  @scala.inline
  def apply(): RequestCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCertificateResponse]
  }
  
  @scala.inline
  implicit class RequestCertificateResponseMutableBuilder[Self <: RequestCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
  }
}
