package typings.awsSdk.clientsApplicationcostprofilerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReportDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
