package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the private CA that will have its policy retrieved. You can find the CA's ARN by calling the ListCertificateAuthorities action. 
    */
  var ResourceArn: Arn
}
object GetPolicyRequest {
  
  @scala.inline
  def apply(ResourceArn: Arn): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
  
  @scala.inline
  implicit class GetPolicyRequestMutableBuilder[Self <: GetPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
