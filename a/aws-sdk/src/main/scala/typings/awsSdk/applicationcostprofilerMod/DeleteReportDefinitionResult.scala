package typings.awsSdk.applicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReportDefinitionResult extends StObject {
  
  /**
    * ID of the report that was deleted.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
}
object DeleteReportDefinitionResult {
  
  inline def apply(): DeleteReportDefinitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReportDefinitionResult]
  }
  
  extension [Self <: DeleteReportDefinitionResult](x: Self) {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
