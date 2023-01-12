package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResiliencyPolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:partition:resiliencehub:region:account:resiliency-policy/policy-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var policyArn: Arn
}
object DeleteResiliencyPolicyResponse {
  
  inline def apply(policyArn: Arn): DeleteResiliencyPolicyResponse = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResiliencyPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResiliencyPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
  }
}
