package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateReadSetSourceItem extends StObject {
  
  /**
    * The source's read set ID.
    */
  var readSetId: ReadSetId
  
  /**
    * The source's status.
    */
  var status: ReadSetActivationJobItemStatus
  
  /**
    * The source's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
}
object ActivateReadSetSourceItem {
  
  inline def apply(readSetId: ReadSetId, status: ReadSetActivationJobItemStatus): ActivateReadSetSourceItem = {
    val __obj = js.Dynamic.literal(readSetId = readSetId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateReadSetSourceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateReadSetSourceItem] (val x: Self) extends AnyVal {
    
    inline def setReadSetId(value: ReadSetId): Self = StObject.set(x, "readSetId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetActivationJobItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
