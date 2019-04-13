package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationExecutionStep extends js.Object {
  /**
    * An error message if the step was interrupted during execution.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The details of the step.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The time when the step started.
    */
  var StartTime: js.UndefOr[_Date] = js.undefined
  /**
    * The valid status of the step.
    */
  var State: js.UndefOr[RemediationExecutionStepState] = js.undefined
  /**
    * The time when the step stopped.
    */
  var StopTime: js.UndefOr[_Date] = js.undefined
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
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StopTime != null) __obj.updateDynamic("StopTime")(StopTime)
    __obj.asInstanceOf[RemediationExecutionStep]
  }
}

