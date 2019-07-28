package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events to.
    */
  var DeliveryStreamArn: AmazonResourceName
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon Kinesis Data Firehose stream.
    */
  var IamRoleArn: AmazonResourceName
}

object KinesisFirehoseDestination {
  @scala.inline
  def apply(DeliveryStreamArn: AmazonResourceName, IamRoleArn: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamArn = DeliveryStreamArn, IamRoleArn = IamRoleArn)
  
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
}

