package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAssessmentReportResponse extends js.Object {
  /**
    * Specifies the status of the request to generate an assessment report. 
    */
  var status: ReportStatus
  /**
    * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the report is successfully generated.
    */
  var url: js.UndefOr[Url] = js.undefined
}

object GetAssessmentReportResponse {
  @scala.inline
  def apply(status: ReportStatus, url: Url = null): GetAssessmentReportResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GetAssessmentReportResponse]
  }
}

