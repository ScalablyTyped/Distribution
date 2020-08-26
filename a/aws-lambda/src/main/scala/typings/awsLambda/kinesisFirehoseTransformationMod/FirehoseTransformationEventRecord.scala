package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  /** Base64 encoded */
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
  var recordId: String = js.native
}

object FirehoseTransformationEventRecord {
  @scala.inline
  def apply(approximateArrivalTimestamp: Double, data: String, recordId: String): FirehoseTransformationEventRecord = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationEventRecord]
  }
  @scala.inline
  implicit class FirehoseTransformationEventRecordOps[Self <: FirehoseTransformationEventRecord] (val x: Self) extends AnyVal {
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
    def setRecordId(value: String): Self = this.set("recordId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKinesisRecordMetadata(value: FirehoseRecordMetadata): Self = this.set("kinesisRecordMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisRecordMetadata: Self = this.set("kinesisRecordMetadata", js.undefined)
  }
  
}

