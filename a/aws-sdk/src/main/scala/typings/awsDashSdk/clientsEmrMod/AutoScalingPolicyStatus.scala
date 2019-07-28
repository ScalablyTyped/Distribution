package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingPolicyStatus extends js.Object {
  /**
    * Indicates the status of the automatic scaling policy.
    */
  var State: js.UndefOr[AutoScalingPolicyState] = js.undefined
  /**
    * The reason for a change in status.
    */
  var StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.undefined
}

object AutoScalingPolicyStatus {
  @scala.inline
  def apply(State: AutoScalingPolicyState = null, StateChangeReason: AutoScalingPolicyStateChangeReason = null): AutoScalingPolicyStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    __obj.asInstanceOf[AutoScalingPolicyStatus]
  }
}

