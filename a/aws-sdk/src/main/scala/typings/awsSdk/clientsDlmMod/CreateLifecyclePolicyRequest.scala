package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLifecyclePolicyRequest extends StObject {
  
  /**
    * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
    */
  var Description: PolicyDescription
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsDlmMod.ExecutionRoleArn
  
  /**
    * The configuration details of the lifecycle policy.
    */
  var PolicyDetails: typings.awsSdk.clientsDlmMod.PolicyDetails
  
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: SettablePolicyStateValues
  
  /**
    * The tags to apply to the lifecycle policy during creation.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateLifecyclePolicyRequest {
  
  inline def apply(
    Description: PolicyDescription,
    ExecutionRoleArn: ExecutionRoleArn,
    PolicyDetails: PolicyDetails,
    State: SettablePolicyStateValues
  ): CreateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], PolicyDetails = PolicyDetails.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLifecyclePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyDetails(value: PolicyDetails): Self = StObject.set(x, "PolicyDetails", value.asInstanceOf[js.Any])
    
    inline def setState(value: SettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
