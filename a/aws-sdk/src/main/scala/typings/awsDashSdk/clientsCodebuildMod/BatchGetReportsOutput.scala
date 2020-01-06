package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportsOutput extends js.Object {
  /**
    *  The array of Report objects returned by BatchGetReports. 
    */
  var reports: js.UndefOr[Reports] = js.native
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a Report. 
    */
  var reportsNotFound: js.UndefOr[ReportArns] = js.native
}

object BatchGetReportsOutput {
  @scala.inline
  def apply(reports: Reports = null, reportsNotFound: ReportArns = null): BatchGetReportsOutput = {
    val __obj = js.Dynamic.literal()
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (reportsNotFound != null) __obj.updateDynamic("reportsNotFound")(reportsNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportsOutput]
  }
}

