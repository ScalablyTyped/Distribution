package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReportDefinitionResult extends StObject {
  
  /**
    * ID of the report.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
}
object UpdateReportDefinitionResult {
  
  inline def apply(): UpdateReportDefinitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReportDefinitionResult]
  }
  
  extension [Self <: UpdateReportDefinitionResult](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
