package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReportGroupOutput extends StObject {
  
  /**
    *  Information about the report group that was created. 
    */
  var reportGroup: js.UndefOr[ReportGroup] = js.undefined
}
object CreateReportGroupOutput {
  
  inline def apply(): CreateReportGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReportGroupOutput]
  }
  
  extension [Self <: CreateReportGroupOutput](x: Self) {
    
    inline def setReportGroup(value: ReportGroup): Self = StObject.set(x, "reportGroup", value.asInstanceOf[js.Any])
    
    inline def setReportGroupUndefined: Self = StObject.set(x, "reportGroup", js.undefined)
  }
}
