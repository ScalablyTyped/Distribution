package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExecutionStep extends js.Object {
  /**
    * An error message if the step was interrupted during execution.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The details of the step.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The time when the step started.
    */
  var StartTime: js.UndefOr[_Date] = js.native
  /**
    * The valid status of the step.
    */
  var State: js.UndefOr[RemediationExecutionStepState] = js.native
  /**
    * The time when the step stopped.
    */
  var StopTime: js.UndefOr[_Date] = js.native
}

object RemediationExecutionStep {
  @scala.inline
  def apply(
    ErrorMessage: String = null,
    Name: String = null,
    StartTime: _Date = null,
    State: RemediationExecutionStepState = null,
    StopTime: _Date = null
  ): RemediationExecutionStep = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StopTime != null) __obj.updateDynamic("StopTime")(StopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationExecutionStep]
  }
}

