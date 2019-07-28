package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteEventStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream that you want to publish event data to. For a Kinesis data stream, the ARN format is: arn:aws:kinesis:region:account-id:stream/stream_name
    For a Kinesis Data Firehose delivery stream, the ARN format is: arn:aws:firehose:region:account-id:deliverystream/stream_name
    
    */
  var DestinationStreamArn: __string
  /**
    * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the stream in your AWS account.
    */
  var RoleArn: __string
}

object WriteEventStream {
  @scala.inline
  def apply(DestinationStreamArn: __string, RoleArn: __string): WriteEventStream = {
    val __obj = js.Dynamic.literal(DestinationStreamArn = DestinationStreamArn, RoleArn = RoleArn)
  
    __obj.asInstanceOf[WriteEventStream]
  }
}

