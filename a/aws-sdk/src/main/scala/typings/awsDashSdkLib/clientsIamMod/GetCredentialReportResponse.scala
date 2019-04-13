package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialReportResponse extends js.Object {
  /**
    * Contains the credential report. The report is Base64-encoded.
    */
  var Content: js.UndefOr[ReportContentType] = js.undefined
  /**
    *  The date and time when the credential report was created, in ISO 8601 date-time format.
    */
  var GeneratedTime: js.UndefOr[dateType] = js.undefined
  /**
    * The format (MIME type) of the credential report.
    */
  var ReportFormat: js.UndefOr[ReportFormatType] = js.undefined
}

object GetCredentialReportResponse {
  @scala.inline
  def apply(
    Content: ReportContentType = null,
    GeneratedTime: dateType = null,
    ReportFormat: ReportFormatType = null
  ): GetCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (GeneratedTime != null) __obj.updateDynamic("GeneratedTime")(GeneratedTime)
    if (ReportFormat != null) __obj.updateDynamic("ReportFormat")(ReportFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialReportResponse]
  }
}

