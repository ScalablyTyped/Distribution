package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportFilter extends StObject {
  
  /**
    *  The status used to filter reports. You can filter using one status only. 
    */
  var status: js.UndefOr[ReportStatusType] = js.undefined
}
object ReportFilter {
  
  inline def apply(): ReportFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFilter]
  }
  
  extension [Self <: ReportFilter](x: Self) {
    
    inline def setStatus(value: ReportStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
