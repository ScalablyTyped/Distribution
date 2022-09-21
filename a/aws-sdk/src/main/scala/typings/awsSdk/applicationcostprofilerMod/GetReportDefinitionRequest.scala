package typings.awsSdk.applicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReportDefinitionRequest extends StObject {
  
  /**
    * ID of the report to retrieve.
    */
  var reportId: ReportId
}
object GetReportDefinitionRequest {
  
  inline def apply(reportId: ReportId): GetReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportDefinitionRequest]
  }
  
  extension [Self <: GetReportDefinitionRequest](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
