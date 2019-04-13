package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStream extends js.Object {
  /**
    * The ID of the application from which events should be published.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
    Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
    */
  var DestinationStreamArn: js.UndefOr[__string] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[__string] = js.undefined
  /**
    * The date the event stream was last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The IAM user who last modified the event stream.
    */
  var LastUpdatedBy: js.UndefOr[__string] = js.undefined
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
}

object EventStream {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    DestinationStreamArn: __string = null,
    ExternalId: __string = null,
    LastModifiedDate: __string = null,
    LastUpdatedBy: __string = null,
    RoleArn: __string = null
  ): EventStream = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (DestinationStreamArn != null) __obj.updateDynamic("DestinationStreamArn")(DestinationStreamArn)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LastUpdatedBy != null) __obj.updateDynamic("LastUpdatedBy")(LastUpdatedBy)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[EventStream]
  }
}

