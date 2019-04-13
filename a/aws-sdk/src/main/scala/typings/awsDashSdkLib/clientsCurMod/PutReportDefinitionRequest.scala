package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutReportDefinitionRequest extends js.Object {
  /**
    * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and data file information. 
    */
  var ReportDefinition: awsDashSdkLib.clientsCurMod.ReportDefinition
}

object PutReportDefinitionRequest {
  @scala.inline
  def apply(ReportDefinition: ReportDefinition): PutReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition)
  
    __obj.asInstanceOf[PutReportDefinitionRequest]
  }
}

