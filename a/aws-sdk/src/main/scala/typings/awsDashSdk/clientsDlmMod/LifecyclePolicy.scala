package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicy extends js.Object {
  /**
    * The local date and time when the lifecycle policy was created.
    */
  var DateCreated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The local date and time when the lifecycle policy was last modified.
    */
  var DateModified: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsDashSdk.clientsDlmMod.ExecutionRoleArn] = js.undefined
  /**
    * The configuration of the lifecycle policy
    */
  var PolicyDetails: js.UndefOr[typings.awsDashSdk.clientsDlmMod.PolicyDetails] = js.undefined
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsDlmMod.PolicyId] = js.undefined
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
}

object LifecyclePolicy {
  @scala.inline
  def apply(
    DateCreated: Timestamp = null,
    DateModified: Timestamp = null,
    Description: PolicyDescription = null,
    ExecutionRoleArn: ExecutionRoleArn = null,
    PolicyDetails: PolicyDetails = null,
    PolicyId: PolicyId = null,
    State: GettablePolicyStateValues = null
  ): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated)
    if (DateModified != null) __obj.updateDynamic("DateModified")(DateModified)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn)
    if (PolicyDetails != null) __obj.updateDynamic("PolicyDetails")(PolicyDetails)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicy]
  }
}

