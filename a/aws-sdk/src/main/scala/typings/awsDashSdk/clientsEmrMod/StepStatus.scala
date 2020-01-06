package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepStatus extends js.Object {
  /**
    * The details for the step failure including reason, message, and log file path where the root cause was identified.
    */
  var FailureDetails: js.UndefOr[typings.awsDashSdk.clientsEmrMod.FailureDetails] = js.native
  /**
    * The execution state of the cluster step.
    */
  var State: js.UndefOr[StepState] = js.native
  /**
    * The reason for the step execution status change.
    */
  var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.native
  /**
    * The timeline of the cluster step status over time.
    */
  var Timeline: js.UndefOr[StepTimeline] = js.native
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
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepStatus]
  }
}

