package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyInput extends StObject {
  
  /**
    * The ID of the resource policy you're deleting.
    */
  var policyId: PolicyId
  
  /**
    * The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
    */
  var resourceArn: Arn
}
object DeleteResourcePolicyInput {
  
  inline def apply(policyId: PolicyId, resourceArn: Arn): DeleteResourcePolicyInput = {
    val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyInput]
  }
  
  extension [Self <: DeleteResourcePolicyInput](x: Self) {
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
