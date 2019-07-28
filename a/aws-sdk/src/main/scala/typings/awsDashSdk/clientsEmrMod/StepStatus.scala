package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepStatus extends js.Object {
  /**
    * The details for the step failure including reason, message, and log file path where the root cause was identified.
    */
  var FailureDetails: js.UndefOr[typings.awsDashSdk.clientsEmrMod.FailureDetails] = js.undefined
  /**
    * The execution state of the cluster step.
    */
  var State: js.UndefOr[StepState] = js.undefined
  /**
    * The reason for the step execution status change.
    */
  var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined
  /**
    * The timeline of the cluster step status over time.
    */
  var Timeline: js.UndefOr[StepTimeline] = js.undefined
}

object StepStatus {
  @scala.inline
  def apply(
    FailureDetails: FailureDetails = null,
    State: StepState = null,
    StateChangeReason: StepStateChangeReason = null,
    Timeline: StepTimeline = null
  ): StepStatus = {
    val __obj = js.Dynamic.literal()
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline)
    __obj.asInstanceOf[StepStatus]
  }
}

