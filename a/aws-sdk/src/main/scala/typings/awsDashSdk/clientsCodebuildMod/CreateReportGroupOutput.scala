package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReportGroupOutput extends js.Object {
  /**
    *  Information about the report group that was created. 
    */
  var reportGroup: js.UndefOr[ReportGroup] = js.native
}

object CreateReportGroupOutput {
  @scala.inline
  def apply(reportGroup: ReportGroup = null): CreateReportGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (reportGroup != null) __obj.updateDynamic("reportGroup")(reportGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportGroupOutput]
  }
}

