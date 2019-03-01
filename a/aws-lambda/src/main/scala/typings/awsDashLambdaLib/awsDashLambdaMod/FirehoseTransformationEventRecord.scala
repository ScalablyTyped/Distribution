package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationEventRecord extends js.Object {
  var approximateArrivalTimestamp: scala.Double
  /** Base64 encoded */
  var data: java.lang.String
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
  var recordId: java.lang.String
}

object FirehoseTransformationEventRecord {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: scala.Double,
    data: java.lang.String,
    recordId: java.lang.String,
    kinesisRecordMetadata: FirehoseRecordMetadata = null
  ): FirehoseTransformationEventRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approximateArrivalTimestamp")(approximateArrivalTimestamp)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("recordId")(recordId)
    if (kinesisRecordMetadata != null) __obj.updateDynamic("kinesisRecordMetadata")(kinesisRecordMetadata)
    __obj.asInstanceOf[FirehoseTransformationEventRecord]
  }
}

