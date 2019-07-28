package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName
  /**
    * The record.
    */
  var Record: typings.awsDashSdk.clientsFirehoseMod.Record
}

object PutRecordInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Record: Record): PutRecordInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName, Record = Record)
  
    __obj.asInstanceOf[PutRecordInput]
  }
}

