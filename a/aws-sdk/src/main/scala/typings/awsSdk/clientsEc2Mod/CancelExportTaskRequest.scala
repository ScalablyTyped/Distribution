package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelExportTaskRequest extends StObject {
  
  /**
    * The ID of the export task. This is the ID returned by CreateInstanceExportTask.
    */
  var ExportTaskId: ExportVmTaskId
}
object CancelExportTaskRequest {
  
  inline def apply(ExportTaskId: ExportVmTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(ExportTaskId = ExportTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelExportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setExportTaskId(value: ExportVmTaskId): Self = StObject.set(x, "ExportTaskId", value.asInstanceOf[js.Any])
  }
}
