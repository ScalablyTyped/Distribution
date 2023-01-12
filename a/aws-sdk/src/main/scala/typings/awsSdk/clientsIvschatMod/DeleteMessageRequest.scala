package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageRequest extends StObject {
  
  /**
    * ID of the message to be deleted. This is the Id field in the received message (see  Message (Subscribe) in the Chat Messaging API).
    */
  var id: MessageID
  
  /**
    * Reason for deleting the message.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  
  /**
    * Identifier of the room where the message should be deleted. Currently this must be an ARN. 
    */
  var roomIdentifier: RoomIdentifier
}
object DeleteMessageRequest {
  
  inline def apply(id: MessageID, roomIdentifier: RoomIdentifier): DeleteMessageRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roomIdentifier = roomIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: MessageID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRoomIdentifier(value: RoomIdentifier): Self = StObject.set(x, "roomIdentifier", value.asInstanceOf[js.Any])
  }
}
