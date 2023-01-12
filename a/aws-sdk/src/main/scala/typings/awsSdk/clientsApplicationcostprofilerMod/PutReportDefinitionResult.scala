package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutReportDefinitionResult extends StObject {
  
  /**
    * ID of the report.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
}
object PutReportDefinitionResult {
  
  inline def apply(): PutReportDefinitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutReportDefinitionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutReportDefinitionResult] (val x: Self) extends AnyVal {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
