package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelExportTaskMessage extends StObject {
  
  /**
    * The identifier of the snapshot or cluster export task to cancel.
    */
  var ExportTaskIdentifier: String
}
object CancelExportTaskMessage {
  
  inline def apply(ExportTaskIdentifier: String): CancelExportTaskMessage = {
    val __obj = js.Dynamic.literal(ExportTaskIdentifier = ExportTaskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelExportTaskMessage] (val x: Self) extends AnyVal {
    
    inline def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
  }
}
