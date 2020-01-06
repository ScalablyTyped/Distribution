package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportGroupsOutput extends js.Object {
  /**
    *  The array of report groups returned by BatchGetReportGroups. 
    */
  var reportGroups: js.UndefOr[ReportGroups] = js.native
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a ReportGroup. 
    */
  var reportGroupsNotFound: js.UndefOr[ReportGroupArns] = js.native
}

object BatchGetReportGroupsOutput {
  @scala.inline
  def apply(reportGroups: ReportGroups = null, reportGroupsNotFound: ReportGroupArns = null): BatchGetReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (reportGroups != null) __obj.updateDynamic("reportGroups")(reportGroups.asInstanceOf[js.Any])
    if (reportGroupsNotFound != null) __obj.updateDynamic("reportGroupsNotFound")(reportGroupsNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportGroupsOutput]
  }
}

