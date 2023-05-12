package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSinkPolicyInput extends StObject {
  
  /**
    * The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here. The policy must be in JSON string format with quotation marks escaped and no newlines. For examples of different types of policies, see the Examples section on this page.
    */
  var Policy: SinkPolicy
  
  /**
    * The ARN of the sink to attach this policy to.
    */
  var SinkIdentifier: ResourceIdentifier
}
object PutSinkPolicyInput {
  
  inline def apply(Policy: SinkPolicy, SinkIdentifier: ResourceIdentifier): PutSinkPolicyInput = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], SinkIdentifier = SinkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSinkPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSinkPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: SinkPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setSinkIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "SinkIdentifier", value.asInstanceOf[js.Any])
  }
}
