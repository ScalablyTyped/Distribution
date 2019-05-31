package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * Information needed to clear the timer.
    */
  var clearTimer: js.UndefOr[ClearTimerAction] = js.undefined
  /**
    * Publishes an MQTT message with the given topic to the AWS IoT Message Broker.
    */
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined
  /**
    * Information needed to reset the timer.
    */
  var resetTimer: js.UndefOr[ResetTimerAction] = js.undefined
  /**
    * Information needed to set the timer.
    */
  var setTimer: js.UndefOr[SetTimerAction] = js.undefined
  /**
    * Sets a variable to a specified value.
    */
  var setVariable: js.UndefOr[SetVariableAction] = js.undefined
  /**
    * Sends an Amazon SNS message.
    */
  var sns: js.UndefOr[SNSTopicPublishAction] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    clearTimer: ClearTimerAction = null,
    iotTopicPublish: IotTopicPublishAction = null,
    resetTimer: ResetTimerAction = null,
    setTimer: SetTimerAction = null,
    setVariable: SetVariableAction = null,
    sns: SNSTopicPublishAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (clearTimer != null) __obj.updateDynamic("clearTimer")(clearTimer)
    if (iotTopicPublish != null) __obj.updateDynamic("iotTopicPublish")(iotTopicPublish)
    if (resetTimer != null) __obj.updateDynamic("resetTimer")(resetTimer)
    if (setTimer != null) __obj.updateDynamic("setTimer")(setTimer)
    if (setVariable != null) __obj.updateDynamic("setVariable")(setVariable)
    if (sns != null) __obj.updateDynamic("sns")(sns)
    __obj.asInstanceOf[Action]
  }
}

