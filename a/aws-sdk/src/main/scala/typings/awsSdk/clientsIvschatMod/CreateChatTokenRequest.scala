package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChatTokenRequest extends StObject {
  
  /**
    * Application-provided attributes to encode into the token and attach to a chat session. Map keys and values can contain UTF-8 encoded text. The maximum length of this field is 1 KB total.
    */
  var attributes: js.UndefOr[ChatTokenAttributes] = js.undefined
  
  /**
    * Set of capabilities that the user is allowed to perform in the room. Default: None (the capability to view messages is implicitly included in all requests).
    */
  var capabilities: js.UndefOr[ChatTokenCapabilities] = js.undefined
  
  /**
    * Identifier of the room that the client is trying to access. Currently this must be an ARN. 
    */
  var roomIdentifier: RoomIdentifier
  
  /**
    * Session duration (in minutes), after which the session expires. Default: 60 (1 hour).
    */
  var sessionDurationInMinutes: js.UndefOr[SessionDurationInMinutes] = js.undefined
  
  /**
    * Application-provided ID that uniquely identifies the user associated with this token. This can be any UTF-8 encoded text.
    */
  var userId: UserID
}
object CreateChatTokenRequest {
  
  inline def apply(roomIdentifier: RoomIdentifier, userId: UserID): CreateChatTokenRequest = {
    val __obj = js.Dynamic.literal(roomIdentifier = roomIdentifier.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChatTokenRequest]
  }
  
  extension [Self <: CreateChatTokenRequest](x: Self) {
    
    inline def setAttributes(value: ChatTokenAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCapabilities(value: ChatTokenCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: ChatTokenCapability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setRoomIdentifier(value: RoomIdentifier): Self = StObject.set(x, "roomIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationInMinutes(value: SessionDurationInMinutes): Self = StObject.set(x, "sessionDurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationInMinutesUndefined: Self = StObject.set(x, "sessionDurationInMinutes", js.undefined)
    
    inline def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
