package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventRequest extends StObject {
  
  /**
    * Specifies whether or not to delete any predictions associated with the event.
    */
  var deleteAuditHistory: js.UndefOr[DeleteAuditHistory] = js.undefined
  
  /**
    * The ID of the event to delete.
    */
  var eventId: identifier
  
  /**
    * The name of the event type.
    */
  var eventTypeName: identifier
}
object DeleteEventRequest {
  
  inline def apply(eventId: identifier, eventTypeName: identifier): DeleteEventRequest = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventRequest]
  }
  
  extension [Self <: DeleteEventRequest](x: Self) {
    
    inline def setDeleteAuditHistory(value: DeleteAuditHistory): Self = StObject.set(x, "deleteAuditHistory", value.asInstanceOf[js.Any])
    
    inline def setDeleteAuditHistoryUndefined: Self = StObject.set(x, "deleteAuditHistory", js.undefined)
    
    inline def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
  }
}
