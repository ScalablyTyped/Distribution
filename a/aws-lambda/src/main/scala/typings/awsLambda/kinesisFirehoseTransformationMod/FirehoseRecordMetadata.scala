package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseRecordMetadata extends js.Object {
  var approximateArrivalTimestamp: Double
  var partitionKey: String
  var sequenceNumber: String
  var shardId: String
  var subsequenceNumber: String
}

object FirehoseRecordMetadata {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: Double,
    partitionKey: String,
    sequenceNumber: String,
    shardId: String,
    subsequenceNumber: String
  ): FirehoseRecordMetadata = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], shardId = shardId.asInstanceOf[js.Any], subsequenceNumber = subsequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseRecordMetadata]
  }
}

