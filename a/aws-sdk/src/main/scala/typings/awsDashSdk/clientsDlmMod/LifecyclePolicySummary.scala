package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicySummary extends js.Object {
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsDlmMod.PolicyId] = js.undefined
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
}

object LifecyclePolicySummary {
  @scala.inline
  def apply(
    Description: PolicyDescription = null,
    PolicyId: PolicyId = null,
    State: GettablePolicyStateValues = null
  ): LifecyclePolicySummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicySummary]
  }
}

