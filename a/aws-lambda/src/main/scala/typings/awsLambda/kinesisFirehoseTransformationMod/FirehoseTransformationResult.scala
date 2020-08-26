package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord] = js.native
}

object FirehoseTransformationResult {
  @scala.inline
  def apply(records: js.Array[FirehoseTransformationResultRecord]): FirehoseTransformationResult = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationResult]
  }
  @scala.inline
  implicit class FirehoseTransformationResultOps[Self <: FirehoseTransformationResult] (val x: Self) extends AnyVal {
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
    def setRecordsVarargs(value: FirehoseTransformationResultRecord*): Self = this.set("records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[FirehoseTransformationResultRecord]): Self = this.set("records", value.asInstanceOf[js.Any])
  }
  
}

