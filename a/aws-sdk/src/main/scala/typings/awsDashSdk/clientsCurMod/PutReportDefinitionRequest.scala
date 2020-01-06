package typings.awsDashSdk.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutReportDefinitionRequest extends js.Object {
  /**
    * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and data file information. 
    */
  var ReportDefinition: typings.awsDashSdk.clientsCurMod.ReportDefinition = js.native
}

object PutReportDefinitionRequest {
  @scala.inline
  def apply(ReportDefinition: ReportDefinition): PutReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutReportDefinitionRequest]
  }
}

