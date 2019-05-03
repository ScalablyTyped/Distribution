package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessReport extends js.Object {
  /**
    * The time of report delivery.
    */
  var DeliveryTime: js.UndefOr[BusinessReportDeliveryTime] = js.undefined
  /**
    * The download link where a user can download the report.
    */
  var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.undefined
  /**
    * The failure code.
    */
  var FailureCode: js.UndefOr[BusinessReportFailureCode] = js.undefined
  /**
    * The S3 location of the output reports.
    */
  var S3Location: js.UndefOr[BusinessReportS3Location] = js.undefined
  /**
    * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
    */
  var Status: js.UndefOr[BusinessReportStatus] = js.undefined
}

object BusinessReport {
  @scala.inline
  def apply(
    DeliveryTime: BusinessReportDeliveryTime = null,
    DownloadUrl: BusinessReportDownloadUrl = null,
    FailureCode: BusinessReportFailureCode = null,
    S3Location: BusinessReportS3Location = null,
    Status: BusinessReportStatus = null
  ): BusinessReport = {
    val __obj = js.Dynamic.literal()
    if (DeliveryTime != null) __obj.updateDynamic("DeliveryTime")(DeliveryTime)
    if (DownloadUrl != null) __obj.updateDynamic("DownloadUrl")(DownloadUrl)
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode.asInstanceOf[js.Any])
    if (S3Location != null) __obj.updateDynamic("S3Location")(S3Location)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessReport]
  }
}

