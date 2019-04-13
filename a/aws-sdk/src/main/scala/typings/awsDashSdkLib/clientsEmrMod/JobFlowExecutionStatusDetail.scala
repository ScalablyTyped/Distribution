package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobFlowExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the job flow.
    */
  var CreationDateTime: _Date
  /**
    * The completion date and time of the job flow.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Description of the job flow last changed state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
  /**
    * The date and time when the job flow was ready to start running bootstrap actions.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The start date and time of the job flow.
    */
  var StartDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The state of the job flow.
    */
  var State: JobFlowExecutionState
}

object JobFlowExecutionStatusDetail {
  @scala.inline
  def apply(
    CreationDateTime: _Date,
    State: JobFlowExecutionState,
    EndDateTime: _Date = null,
    LastStateChangeReason: XmlString = null,
    ReadyDateTime: _Date = null,
    StartDateTime: _Date = null
  ): JobFlowExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime, State = State.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (LastStateChangeReason != null) __obj.updateDynamic("LastStateChangeReason")(LastStateChangeReason)
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime)
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime)
    __obj.asInstanceOf[JobFlowExecutionStatusDetail]
  }
}

