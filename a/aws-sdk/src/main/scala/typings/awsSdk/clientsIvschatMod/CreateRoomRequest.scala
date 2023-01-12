package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomRequest extends StObject {
  
  /**
    * Maximum number of characters in a single message. Messages are expected to be UTF-8 encoded and this limit applies specifically to rune/code-point count, not number of bytes. Default: 500.
    */
  var maximumMessageLength: js.UndefOr[RoomMaxMessageLength] = js.undefined
  
  /**
    * Maximum number of messages per second that can be sent to the room (by all clients). Default: 10. 
    */
  var maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond] = js.undefined
  
  /**
    * Configuration information for optional review of messages.
    */
  var messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined
  
  /**
    * Room name. The value does not need to be unique.
    */
  var name: js.UndefOr[RoomName] = js.undefined
  
  /**
    * Tags to attach to the resource. Array of maps, each of the form string:string (key:value). See Tagging AWS Resources for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has no constraints beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateRoomRequest {
  
  inline def apply(): CreateRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRoomRequest] (val x: Self) extends AnyVal {
    
    inline def setMaximumMessageLength(value: RoomMaxMessageLength): Self = StObject.set(x, "maximumMessageLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumMessageLengthUndefined: Self = StObject.set(x, "maximumMessageLength", js.undefined)
    
    inline def setMaximumMessageRatePerSecond(value: RoomMaxMessageRatePerSecond): Self = StObject.set(x, "maximumMessageRatePerSecond", value.asInstanceOf[js.Any])
    
    inline def setMaximumMessageRatePerSecondUndefined: Self = StObject.set(x, "maximumMessageRatePerSecond", js.undefined)
    
    inline def setMessageReviewHandler(value: MessageReviewHandler): Self = StObject.set(x, "messageReviewHandler", value.asInstanceOf[js.Any])
    
    inline def setMessageReviewHandlerUndefined: Self = StObject.set(x, "messageReviewHandler", js.undefined)
    
    inline def setName(value: RoomName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
