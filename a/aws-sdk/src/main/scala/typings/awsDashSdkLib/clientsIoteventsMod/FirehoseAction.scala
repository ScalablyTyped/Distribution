package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseAction extends js.Object {
  /**
    * The name of the Kinesis Data Firehose stream where the data is written.
    */
  var deliveryStreamName: DeliveryStreamName
  /**
    * A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[FirehoseSeparator] = js.undefined
}

object FirehoseAction {
  @scala.inline
  def apply(deliveryStreamName: DeliveryStreamName, separator: FirehoseSeparator = null): FirehoseAction = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[FirehoseAction]
  }
}

