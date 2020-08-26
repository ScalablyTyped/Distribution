package typings.awsLambda.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData = js.native
}

object S3EventRecordGlacierEventData {
  @scala.inline
  def apply(restoreEventData: S3EventRecordGlacierRestoreEventData): S3EventRecordGlacierEventData = {
    val __obj = js.Dynamic.literal(restoreEventData = restoreEventData.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecordGlacierEventData]
  }
  @scala.inline
  implicit class S3EventRecordGlacierEventDataOps[Self <: S3EventRecordGlacierEventData] (val x: Self) extends AnyVal {
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
    def setRestoreEventData(value: S3EventRecordGlacierRestoreEventData): Self = this.set("restoreEventData", value.asInstanceOf[js.Any])
  }
  
}

