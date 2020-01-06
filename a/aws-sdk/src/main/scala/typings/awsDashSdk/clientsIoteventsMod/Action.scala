package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * Information needed to clear the timer.
    */
  var clearTimer: js.UndefOr[ClearTimerAction] = js.native
  /**
    * Sends information about the detector model instance and the event which triggered the action to a Kinesis Data Firehose delivery stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.native
  /**
    * Sends an IoT Events input, passing in information about the detector model instance and the event which triggered the action.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.native
  /**
    * Publishes an MQTT message with the given topic to the AWS IoT message broker.
    */
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.native
  /**
    * Calls an AWS Lambda function, passing in information about the detector model instance and the event which triggered the action.
    */
  var lambda: js.UndefOr[LambdaAction] = js.native
  /**
    * Information needed to reset the timer.
    */
  var resetTimer: js.UndefOr[ResetTimerAction] = js.native
  /**
    * Information needed to set the timer.
    */
  var setTimer: js.UndefOr[SetTimerAction] = js.native
  /**
    * Sets a variable to a specified value.
    */
  var setVariable: js.UndefOr[SetVariableAction] = js.native
  /**
    * Sends an Amazon SNS message.
    */
  var sns: js.UndefOr[SNSTopicPublishAction] = js.native
  /**
    * Sends information about the detector model instance and the event which triggered the action to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.native
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
    if (clearTimer != null) __obj.updateDynamic("clearTimer")(clearTimer.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (iotEvents != null) __obj.updateDynamic("iotEvents")(iotEvents.asInstanceOf[js.Any])
    if (iotTopicPublish != null) __obj.updateDynamic("iotTopicPublish")(iotTopicPublish.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (resetTimer != null) __obj.updateDynamic("resetTimer")(resetTimer.asInstanceOf[js.Any])
    if (setTimer != null) __obj.updateDynamic("setTimer")(setTimer.asInstanceOf[js.Any])
    if (setVariable != null) __obj.updateDynamic("setVariable")(setVariable.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

