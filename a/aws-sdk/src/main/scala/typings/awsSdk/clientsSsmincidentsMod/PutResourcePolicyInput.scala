package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyInput extends StObject {
  
  /**
    * Details of the resource policy.
    */
  var policy: Policy
  
  /**
    * The Amazon Resource Name (ARN) of the response plan you're adding the resource policy to.
    */
  var resourceArn: Arn
}
object PutResourcePolicyInput {
  
  inline def apply(policy: Policy, resourceArn: Arn): PutResourcePolicyInput = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyInput]
  }
  
  extension [Self <: PutResourcePolicyInput](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
