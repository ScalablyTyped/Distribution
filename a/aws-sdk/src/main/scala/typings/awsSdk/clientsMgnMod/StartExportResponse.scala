package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExportResponse extends StObject {
  
  /**
    * Start export response export task.
    */
  var exportTask: js.UndefOr[ExportTask] = js.undefined
}
object StartExportResponse {
  
  inline def apply(): StartExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartExportResponse] (val x: Self) extends AnyVal {
    
    inline def setExportTask(value: ExportTask): Self = StObject.set(x, "exportTask", value.asInstanceOf[js.Any])
    
    inline def setExportTaskUndefined: Self = StObject.set(x, "exportTask", js.undefined)
  }
}
