package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEventRequest extends StObject {
  
  /**
    * Application-defined metadata to attach to the event sent to clients. The maximum length of the metadata is 1 KB total.
    */
  var attributes: js.UndefOr[EventAttributes] = js.undefined
  
  /**
    * Application-defined name of the event to send to clients.
    */
  var eventName: EventName
  
  /**
    * Identifier of the room to which the event will be sent. Currently this must be an ARN.
    */
  var roomIdentifier: RoomIdentifier
}
object SendEventRequest {
  
  inline def apply(eventName: EventName, roomIdentifier: RoomIdentifier): SendEventRequest = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], roomIdentifier = roomIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
  
  extension [Self <: SendEventRequest](x: Self) {
    
    inline def setAttributes(value: EventAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setEventName(value: EventName): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setRoomIdentifier(value: RoomIdentifier): Self = StObject.set(x, "roomIdentifier", value.asInstanceOf[js.Any])
  }
}
