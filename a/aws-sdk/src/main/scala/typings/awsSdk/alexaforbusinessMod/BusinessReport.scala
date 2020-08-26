package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReport extends js.Object {
  /**
    * The time of report delivery.
    */
  var DeliveryTime: js.UndefOr[BusinessReportDeliveryTime] = js.native
  /**
    * The download link where a user can download the report.
    */
  var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.native
  /**
    * The failure code.
    */
  var FailureCode: js.UndefOr[BusinessReportFailureCode] = js.native
  /**
    * The S3 location of the output reports.
    */
  var S3Location: js.UndefOr[BusinessReportS3Location] = js.native
  /**
    * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
    */
  var Status: js.UndefOr[BusinessReportStatus] = js.native
}

object BusinessReport {
  @scala.inline
  def apply(): BusinessReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReport]
  }
  @scala.inline
  implicit class BusinessReportOps[Self <: BusinessReport] (val x: Self) extends AnyVal {
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
    def setDeliveryTime(value: BusinessReportDeliveryTime): Self = this.set("DeliveryTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryTime: Self = this.set("DeliveryTime", js.undefined)
    @scala.inline
    def setDownloadUrl(value: BusinessReportDownloadUrl): Self = this.set("DownloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadUrl: Self = this.set("DownloadUrl", js.undefined)
    @scala.inline
    def setFailureCode(value: BusinessReportFailureCode): Self = this.set("FailureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("FailureCode", js.undefined)
    @scala.inline
    def setS3Location(value: BusinessReportS3Location): Self = this.set("S3Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Location: Self = this.set("S3Location", js.undefined)
    @scala.inline
    def setStatus(value: BusinessReportStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

