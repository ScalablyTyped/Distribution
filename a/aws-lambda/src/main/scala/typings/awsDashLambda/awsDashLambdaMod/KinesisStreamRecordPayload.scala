package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double
  var data: String
  var kinesisSchemaVersion: String
  var partitionKey: String
  var sequenceNumber: String
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
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp, data = data, kinesisSchemaVersion = kinesisSchemaVersion, partitionKey = partitionKey, sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[KinesisStreamRecordPayload]
  }
}

