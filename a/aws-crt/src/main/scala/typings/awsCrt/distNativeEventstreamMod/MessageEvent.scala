package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent extends StObject {
  
  /**
    * Event stream message received by the connection/stream.
    */
  var message: Message
}
object MessageEvent {
  
  inline def apply(message: Message): MessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
