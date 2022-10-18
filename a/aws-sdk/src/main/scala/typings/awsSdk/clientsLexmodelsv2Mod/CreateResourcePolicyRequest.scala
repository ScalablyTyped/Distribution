package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourcePolicyRequest extends StObject {
  
  /**
    * A resource policy to add to the resource. The policy is a JSON structure that contains one or more statements that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON policy document, see  IAM JSON policy reference .  If the policy isn't valid, Amazon Lex returns a validation exception.
    */
  var policy: Policy
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: AmazonResourceName
}
object CreateResourcePolicyRequest {
  
  inline def apply(policy: Policy, resourceArn: AmazonResourceName): CreateResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourcePolicyRequest]
  }
  
  extension [Self <: CreateResourcePolicyRequest](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
