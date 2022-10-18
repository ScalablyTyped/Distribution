package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultPolicyVersionRequest extends StObject {
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
  
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}
object SetDefaultPolicyVersionRequest {
  
  inline def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
  
  extension [Self <: SetDefaultPolicyVersionRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
  }
}
