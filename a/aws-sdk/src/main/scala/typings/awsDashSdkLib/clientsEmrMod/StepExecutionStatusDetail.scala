package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the step.
    */
  var CreationDateTime: _Date
  /**
    * The completion date and time of the step.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * A description of the step's current state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
  /**
    * The start date and time of the step.
    */
  var StartDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The state of the step.
    */
  var State: StepExecutionState
}

object StepExecutionStatusDetail {
  @scala.inline
  def apply(
    CreationDateTime: _Date,
    State: StepExecutionState,
    EndDateTime: _Date = null,
    LastStateChangeReason: XmlString = null,
    StartDateTime: _Date = null
  ): StepExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime, State = State.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (LastStateChangeReason != null) __obj.updateDynamic("LastStateChangeReason")(LastStateChangeReason)
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime)
    __obj.asInstanceOf[StepExecutionStatusDetail]
  }
}

