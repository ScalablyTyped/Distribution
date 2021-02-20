package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPolicyRequest extends StObject {
  
  /**
    * The path and filename of a JSON-formatted IAM policy to attach to the specified private CA resource. If this policy does not contain all required statements or if it includes any statement that is not allowed, the PutPolicy action returns an InvalidPolicyException. For information about IAM policy and statement structure, see Overview of JSON Policies.
    */
  var Policy: AWSPolicy = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be found by calling the ListCertificateAuthorities action. 
    */
  var ResourceArn: Arn = js.native
}
object PutPolicyRequest {
  
  @scala.inline
  def apply(Policy: AWSPolicy, ResourceArn: Arn): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyRequest]
  }
  
  @scala.inline
  implicit class PutPolicyRequestMutableBuilder[Self <: PutPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: AWSPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
