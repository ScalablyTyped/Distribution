package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTaskStatus extends StObject {
  
  /**
    * The status code of the export task.
    */
  var code: js.UndefOr[ExportTaskStatusCode] = js.undefined
  
  /**
    * The status message related to the status code.
    */
  var message: js.UndefOr[ExportTaskStatusMessage] = js.undefined
}
object ExportTaskStatus {
  
  inline def apply(): ExportTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTaskStatus] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ExportTaskStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: ExportTaskStatusMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
