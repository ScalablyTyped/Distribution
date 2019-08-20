package typings.awsDashSdk.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReportDefinitionRequest extends js.Object {
  var ReportDefinition: typings.awsDashSdk.clientsCurMod.ReportDefinition
  var ReportName: typings.awsDashSdk.clientsCurMod.ReportName
}

object ModifyReportDefinitionRequest {
  @scala.inline
  def apply(ReportDefinition: ReportDefinition, ReportName: ReportName): ModifyReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition, ReportName = ReportName)
  
    __obj.asInstanceOf[ModifyReportDefinitionRequest]
  }
}

