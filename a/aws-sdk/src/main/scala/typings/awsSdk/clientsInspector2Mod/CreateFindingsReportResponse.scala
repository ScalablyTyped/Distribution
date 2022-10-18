package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFindingsReportResponse extends StObject {
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
}
object CreateFindingsReportResponse {
  
  inline def apply(): CreateFindingsReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFindingsReportResponse]
  }
  
  extension [Self <: CreateFindingsReportResponse](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
