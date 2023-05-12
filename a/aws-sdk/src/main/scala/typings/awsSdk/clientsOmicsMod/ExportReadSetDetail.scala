package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportReadSetDetail extends StObject {
  
  /**
    * The set's ID.
    */
  var id: ReadSetId
  
  /**
    * The set's status.
    */
  var status: ReadSetExportJobItemStatus
  
  /**
    * The set's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
}
object ExportReadSetDetail {
  
  inline def apply(id: ReadSetId, status: ReadSetExportJobItemStatus): ExportReadSetDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportReadSetDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportReadSetDetail] (val x: Self) extends AnyVal {
    
    inline def setId(value: ReadSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetExportJobItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
