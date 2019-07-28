package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestination extends js.Object {
  /**
    * An object that contains the names, default values, and sources of the dimensions associated with an Amazon CloudWatch event destination.
    */
  var CloudWatchDestination: js.UndefOr[typings.awsDashSdk.clientsSesMod.CloudWatchDestination] = js.undefined
  /**
    * Sets whether Amazon SES publishes events to this destination when you send an email with the associated configuration set. Set to true to enable publishing to this destination; set to false to prevent publishing to this destination. The default value is false.
    */
  var Enabled: js.UndefOr[typings.awsDashSdk.clientsSesMod.Enabled] = js.undefined
  /**
    * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsDashSdk.clientsSesMod.KinesisFirehoseDestination] = js.undefined
  /**
    * The type of email sending events to publish to the event destination.
    */
  var MatchingEventTypes: EventTypes
  /**
    * The name of the event destination. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 64 characters.  
    */
  var Name: EventDestinationName
  /**
    * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
    */
  var SNSDestination: js.UndefOr[typings.awsDashSdk.clientsSesMod.SNSDestination] = js.undefined
}

object EventDestination {
  @scala.inline
  def apply(
    MatchingEventTypes: EventTypes,
    Name: EventDestinationName,
    CloudWatchDestination: CloudWatchDestination = null,
    Enabled: js.UndefOr[Enabled] = js.undefined,
    KinesisFirehoseDestination: KinesisFirehoseDestination = null,
    SNSDestination: SNSDestination = null
  ): EventDestination = {
    val __obj = js.Dynamic.literal(MatchingEventTypes = MatchingEventTypes, Name = Name)
    if (CloudWatchDestination != null) __obj.updateDynamic("CloudWatchDestination")(CloudWatchDestination)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (KinesisFirehoseDestination != null) __obj.updateDynamic("KinesisFirehoseDestination")(KinesisFirehoseDestination)
    if (SNSDestination != null) __obj.updateDynamic("SNSDestination")(SNSDestination)
    __obj.asInstanceOf[EventDestination]
  }
}

