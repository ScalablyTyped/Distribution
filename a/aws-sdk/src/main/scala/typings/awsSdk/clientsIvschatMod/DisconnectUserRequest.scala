package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectUserRequest extends StObject {
  
  /**
    * Reason for disconnecting the user.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  
  /**
    * Identifier of the room from which the user's clients should be disconnected. Currently this must be an ARN.
    */
  var roomIdentifier: RoomIdentifier
  
  /**
    * ID of the user (connection) to disconnect from the room.
    */
  var userId: UserID
}
object DisconnectUserRequest {
  
  inline def apply(roomIdentifier: RoomIdentifier, userId: UserID): DisconnectUserRequest = {
    val __obj = js.Dynamic.literal(roomIdentifier = roomIdentifier.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectUserRequest]
  }
  
  extension [Self <: DisconnectUserRequest](x: Self) {
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRoomIdentifier(value: RoomIdentifier): Self = StObject.set(x, "roomIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
