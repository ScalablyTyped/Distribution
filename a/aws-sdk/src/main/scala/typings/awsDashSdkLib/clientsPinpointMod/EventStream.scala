package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStream extends js.Object {
  /**
    * The unique identifier for the application to publish event data for.
    */
  var ApplicationId: __string
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream to publish event data to. For a Kinesis data stream, the ARN format is: arn:aws:kinesis:region:account-id:stream/stream_name
    For a Kinesis Data Firehose delivery stream, the ARN format is: arn:aws:firehose:region:account-id:deliverystream/stream_name
    
    */
  var DestinationStreamArn: __string
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[__string] = js.undefined
  /**
    * The date, in ISO 8601 format, when the event stream was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The IAM user who last modified the event stream.
    */
  var LastUpdatedBy: js.UndefOr[__string] = js.undefined
  /**
    * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the stream in your AWS account.
    */
  var RoleArn: __string
}

object EventStream {
  @scala.inline
  def apply(
    ApplicationId: __string,
    DestinationStreamArn: __string,
    RoleArn: __string,
    ExternalId: __string = null,
    LastModifiedDate: __string = null,
    LastUpdatedBy: __string = null
  ): EventStream = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, DestinationStreamArn = DestinationStreamArn, RoleArn = RoleArn)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LastUpdatedBy != null) __obj.updateDynamic("LastUpdatedBy")(LastUpdatedBy)
    __obj.asInstanceOf[EventStream]
  }
}

