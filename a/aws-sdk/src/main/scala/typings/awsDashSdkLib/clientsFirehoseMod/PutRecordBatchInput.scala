package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordBatchInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamName
  /**
    * One or more records.
    */
  var Records: PutRecordBatchRequestEntryList
}

object PutRecordBatchInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Records: PutRecordBatchRequestEntryList): PutRecordBatchInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName, Records = Records)
  
    __obj.asInstanceOf[PutRecordBatchInput]
  }
}

