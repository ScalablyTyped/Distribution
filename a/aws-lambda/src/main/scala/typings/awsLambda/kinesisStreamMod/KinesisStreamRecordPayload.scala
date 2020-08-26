package typings.awsLambda.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

object KinesisStreamRecordPayload {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: Double,
    data: String,
    kinesisSchemaVersion: String,
    partitionKey: String,
    sequenceNumber: String
  ): KinesisStreamRecordPayload = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamRecordPayload]
  }
  @scala.inline
  implicit class KinesisStreamRecordPayloadOps[Self <: KinesisStreamRecordPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApproximateArrivalTimestamp(value: Double): Self = this.set("approximateArrivalTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKinesisSchemaVersion(value: String): Self = this.set("kinesisSchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
  }
  
}

