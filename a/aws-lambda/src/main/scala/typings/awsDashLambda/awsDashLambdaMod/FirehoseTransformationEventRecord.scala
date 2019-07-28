package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationEventRecord extends js.Object {
  var approximateArrivalTimestamp: Double
  /** Base64 encoded */
  var data: String
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
  var recordId: String
}

object FirehoseTransformationEventRecord {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: Double,
    data: String,
    recordId: String,
    kinesisRecordMetadata: FirehoseRecordMetadata = null
  ): FirehoseTransformationEventRecord = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp, data = data, recordId = recordId)
    if (kinesisRecordMetadata != null) __obj.updateDynamic("kinesisRecordMetadata")(kinesisRecordMetadata)
    __obj.asInstanceOf[FirehoseTransformationEventRecord]
  }
}

