package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLifecyclePolicyRequest extends StObject {
  
  /**
    * A description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.clientsDlmMod.ExecutionRoleArn] = js.undefined
  
  /**
    * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
    */
  var PolicyDetails: js.UndefOr[typings.awsSdk.clientsDlmMod.PolicyDetails] = js.undefined
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsSdk.clientsDlmMod.PolicyId
  
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: js.UndefOr[SettablePolicyStateValues] = js.undefined
}
object UpdateLifecyclePolicyRequest {
  
  inline def apply(PolicyId: PolicyId): UpdateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLifecyclePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setPolicyDetails(value: PolicyDetails): Self = StObject.set(x, "PolicyDetails", value.asInstanceOf[js.Any])
    
    inline def setPolicyDetailsUndefined: Self = StObject.set(x, "PolicyDetails", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setState(value: SettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
