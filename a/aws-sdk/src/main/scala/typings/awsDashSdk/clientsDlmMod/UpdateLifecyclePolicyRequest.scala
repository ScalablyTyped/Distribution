package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsDashSdk.clientsDlmMod.ExecutionRoleArn] = js.undefined
  /**
    * The configuration of the lifecycle policy. Target tags cannot be re-used across policies.
    */
  var PolicyDetails: js.UndefOr[typings.awsDashSdk.clientsDlmMod.PolicyDetails] = js.undefined
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsDashSdk.clientsDlmMod.PolicyId
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: js.UndefOr[SettablePolicyStateValues] = js.undefined
}

object UpdateLifecyclePolicyRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    Description: PolicyDescription = null,
    ExecutionRoleArn: ExecutionRoleArn = null,
    PolicyDetails: PolicyDetails = null,
    State: SettablePolicyStateValues = null
  ): UpdateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn)
    if (PolicyDetails != null) __obj.updateDynamic("PolicyDetails")(PolicyDetails)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLifecyclePolicyRequest]
  }
}

