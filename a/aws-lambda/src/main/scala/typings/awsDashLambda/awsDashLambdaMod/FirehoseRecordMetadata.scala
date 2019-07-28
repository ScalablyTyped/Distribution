package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseRecordMetadata extends js.Object {
  var approximateArrivalTimestamp: String
  var partitionKey: String
  var sequenceNumber: String
  var shardId: String
  var subsequenceNumber: String
}

object FirehoseRecordMetadata {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: String,
    partitionKey: String,
    sequenceNumber: String,
    shardId: String,
    subsequenceNumber: String
  ): FirehoseRecordMetadata = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp, partitionKey = partitionKey, sequenceNumber = sequenceNumber, shardId = shardId, subsequenceNumber = subsequenceNumber)
  
    __obj.asInstanceOf[FirehoseRecordMetadata]
  }
}

