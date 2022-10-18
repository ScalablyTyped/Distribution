package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyRequest extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: PolicyName
}
object GetPolicyRequest {
  
  inline def apply(policyName: PolicyName): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
  
  extension [Self <: GetPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
