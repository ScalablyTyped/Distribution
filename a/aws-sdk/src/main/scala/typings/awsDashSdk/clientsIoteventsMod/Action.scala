package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * Information needed to clear the timer.
    */
  var clearTimer: js.UndefOr[ClearTimerAction] = js.undefined
  /**
    * Sends information about the detector model instance and the event which triggered the action to a Kinesis Data Firehose stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.undefined
  /**
    * Sends an IoT Events input, passing in information about the detector model instance and the event which triggered the action.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.undefined
  /**
    * Publishes an MQTT message with the given topic to the AWS IoT message broker.
    */
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined
  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event which triggered the action.
    */
  var lambda: js.UndefOr[LambdaAction] = js.undefined
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
  /**
    * Sends information about the detector model instance and the event which triggered the action to an AWS SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    clearTimer: ClearTimerAction = null,
    firehose: FirehoseAction = null,
    iotEvents: IotEventsAction = null,
    iotTopicPublish: IotTopicPublishAction = null,
    lambda: LambdaAction = null,
    resetTimer: ResetTimerAction = null,
    setTimer: SetTimerAction = null,
    setVariable: SetVariableAction = null,
    sns: SNSTopicPublishAction = null,
    sqs: SqsAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (clearTimer != null) __obj.updateDynamic("clearTimer")(clearTimer)
    if (firehose != null) __obj.updateDynamic("firehose")(firehose)
    if (iotEvents != null) __obj.updateDynamic("iotEvents")(iotEvents)
    if (iotTopicPublish != null) __obj.updateDynamic("iotTopicPublish")(iotTopicPublish)
    if (lambda != null) __obj.updateDynamic("lambda")(lambda)
    if (resetTimer != null) __obj.updateDynamic("resetTimer")(resetTimer)
    if (setTimer != null) __obj.updateDynamic("setTimer")(setTimer)
    if (setVariable != null) __obj.updateDynamic("setVariable")(setVariable)
    if (sns != null) __obj.updateDynamic("sns")(sns)
    if (sqs != null) __obj.updateDynamic("sqs")(sqs)
    __obj.asInstanceOf[Action]
  }
}

