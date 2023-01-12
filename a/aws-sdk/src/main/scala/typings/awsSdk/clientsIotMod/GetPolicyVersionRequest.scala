package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyVersionRequest extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: PolicyName
  
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}
object GetPolicyVersionRequest {
  
  inline def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): GetPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPolicyVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
  }
}
