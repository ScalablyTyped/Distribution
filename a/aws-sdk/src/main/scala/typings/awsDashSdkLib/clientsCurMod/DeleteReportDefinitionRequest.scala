package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReportDefinitionRequest extends js.Object {
  var ReportName: js.UndefOr[ReportName] = js.undefined
}

object DeleteReportDefinitionRequest {
  @scala.inline
  def apply(ReportName: ReportName = null): DeleteReportDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    if (ReportName != null) __obj.updateDynamic("ReportName")(ReportName)
    __obj.asInstanceOf[DeleteReportDefinitionRequest]
  }
}

