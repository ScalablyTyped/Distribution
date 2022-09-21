package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReportJobOutput extends StObject {
  
  /**
    * The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most 1,024 bytes long. The report job ID cannot be edited.
    */
  var ReportJobId: js.UndefOr[typings.awsSdk.backupMod.ReportJobId] = js.undefined
}
object StartReportJobOutput {
  
  inline def apply(): StartReportJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReportJobOutput]
  }
  
  extension [Self <: StartReportJobOutput](x: Self) {
    
    inline def setReportJobId(value: ReportJobId): Self = StObject.set(x, "ReportJobId", value.asInstanceOf[js.Any])
    
    inline def setReportJobIdUndefined: Self = StObject.set(x, "ReportJobId", js.undefined)
  }
}
