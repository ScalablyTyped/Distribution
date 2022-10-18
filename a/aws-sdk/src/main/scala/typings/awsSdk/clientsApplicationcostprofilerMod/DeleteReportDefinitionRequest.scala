package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReportDefinitionRequest extends StObject {
  
  /**
    * Required. ID of the report to delete.
    */
  var reportId: ReportId
}
object DeleteReportDefinitionRequest {
  
  inline def apply(reportId: ReportId): DeleteReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportDefinitionRequest]
  }
  
  extension [Self <: DeleteReportDefinitionRequest](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
