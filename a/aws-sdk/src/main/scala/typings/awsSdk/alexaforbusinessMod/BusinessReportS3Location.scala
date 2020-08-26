package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportS3Location extends js.Object {
  /**
    * The S3 bucket name of the output reports.
    */
  var BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The path of the business report.
    */
  var Path: js.UndefOr[BusinessReportS3Path] = js.native
}

object BusinessReportS3Location {
  @scala.inline
  def apply(): BusinessReportS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportS3Location]
  }
  @scala.inline
  implicit class BusinessReportS3LocationOps[Self <: BusinessReportS3Location] (val x: Self) extends AnyVal {
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
    def setBucketName(value: CustomerS3BucketName): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    @scala.inline
    def setPath(value: BusinessReportS3Path): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

