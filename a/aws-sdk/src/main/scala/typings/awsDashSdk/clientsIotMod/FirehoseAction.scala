package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseAction extends js.Object {
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: DeliveryStreamName
  /**
    * The IAM role that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: AwsArn
  /**
    * A character separator that will be used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.undefined
}

object FirehoseAction {
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName, roleArn: AwsArn, separator: FirehoseSeparator = null): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName, roleArn = roleArn)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[FirehoseAction]
  }
}

