package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachPolicyRequest extends StObject {
  
  /**
    * The policy to detach.
    */
  var policyName: PolicyName
  
  /**
    * The target from which the policy will be detached.
    */
  var target: PolicyTarget
}
object DetachPolicyRequest {
  
  inline def apply(policyName: PolicyName, target: PolicyTarget): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachPolicyRequest]
  }
  
  extension [Self <: DetachPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: PolicyTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
