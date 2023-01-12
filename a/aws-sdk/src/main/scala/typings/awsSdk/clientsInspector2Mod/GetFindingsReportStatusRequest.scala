package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsReportStatusRequest extends StObject {
  
  /**
    * The ID of the report to retrieve the status of.
    */
  var reportId: js.UndefOr[ReportId] = js.undefined
}
object GetFindingsReportStatusRequest {
  
  inline def apply(): GetFindingsReportStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsReportStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingsReportStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
