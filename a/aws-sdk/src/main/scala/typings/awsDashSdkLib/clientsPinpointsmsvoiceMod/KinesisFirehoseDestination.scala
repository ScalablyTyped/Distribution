package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that can write data to an Amazon Kinesis Data Firehose stream.
    */
  var DeliveryStreamArn: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose destination that you want to use in the event destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
}

object KinesisFirehoseDestination {
  @scala.inline
  def apply(DeliveryStreamArn: String = null, IamRoleArn: String = null): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStreamArn != null) __obj.updateDynamic("DeliveryStreamArn")(DeliveryStreamArn)
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
}

