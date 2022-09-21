package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPolicyRequest extends StObject {
  
  /**
    * The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If this policy does not contain all required statements or if it includes any statement that is not allowed, the PutPolicy action returns an InvalidPolicyException. For information about IAM policy and statement structure, see Overview of JSON Policies.
    */
  var Policy: AWSPolicy
  
  /**
    * The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be found by calling the ListCertificateAuthorities action. 
    */
  var ResourceArn: Arn
}
object PutPolicyRequest {
  
  inline def apply(Policy: AWSPolicy, ResourceArn: Arn): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyRequest]
  }
  
  extension [Self <: PutPolicyRequest](x: Self) {
    
    inline def setPolicy(value: AWSPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
