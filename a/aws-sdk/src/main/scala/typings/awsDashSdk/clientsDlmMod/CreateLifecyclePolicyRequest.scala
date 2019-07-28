package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
    */
  var Description: PolicyDescription
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: typings.awsDashSdk.clientsDlmMod.ExecutionRoleArn
  /**
    * The configuration details of the lifecycle policy. Target tags cannot be re-used across lifecycle policies.
    */
  var PolicyDetails: typings.awsDashSdk.clientsDlmMod.PolicyDetails
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: SettablePolicyStateValues
}

object CreateLifecyclePolicyRequest {
  @scala.inline
  def apply(
    Description: PolicyDescription,
    ExecutionRoleArn: ExecutionRoleArn,
    PolicyDetails: PolicyDetails,
    State: SettablePolicyStateValues
  ): CreateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(Description = Description, ExecutionRoleArn = ExecutionRoleArn, PolicyDetails = PolicyDetails, State = State.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateLifecyclePolicyRequest]
  }
}

