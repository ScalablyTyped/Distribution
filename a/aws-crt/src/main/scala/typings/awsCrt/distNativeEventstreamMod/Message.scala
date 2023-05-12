package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * Flags indicating additional boolean message properties
    */
  var flags: js.UndefOr[MessageFlags] = js.undefined
  
  /**
    * Message headers associated with this message
    */
  var headers: js.UndefOr[js.Array[Header]] = js.undefined
  
  /**
    * Actual message payload
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * Type of message this is
    */
  var `type`: MessageType
}
object Message {
  
  inline def apply(`type`: MessageType): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: MessageFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
