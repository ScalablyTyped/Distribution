package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAlarmStateInput extends js.Object {
  /**
    * The name for the alarm. This name must be unique within the AWS account. The maximum length is 255 characters.
    */
  var AlarmName: awsDashSdkLib.clientsCloudwatchMod.AlarmName
  /**
    * The reason that this alarm is set to this specific state, in text format.
    */
  var StateReason: awsDashSdkLib.clientsCloudwatchMod.StateReason
  /**
    * The reason that this alarm is set to this specific state, in JSON format.
    */
  var StateReasonData: js.UndefOr[StateReasonData] = js.undefined
  /**
    * The value of the state.
    */
  var StateValue: awsDashSdkLib.clientsCloudwatchMod.StateValue
}

object SetAlarmStateInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName,
    StateReason: StateReason,
    StateValue: StateValue,
    StateReasonData: StateReasonData = null
  ): SetAlarmStateInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName, StateReason = StateReason, StateValue = StateValue.asInstanceOf[js.Any])
    if (StateReasonData != null) __obj.updateDynamic("StateReasonData")(StateReasonData)
    __obj.asInstanceOf[SetAlarmStateInput]
  }
}

