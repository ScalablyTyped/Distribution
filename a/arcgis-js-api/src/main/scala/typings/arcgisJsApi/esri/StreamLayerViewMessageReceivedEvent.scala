package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerViewMessageReceivedEvent extends StObject {
  
  var message: Any
}
object StreamLayerViewMessageReceivedEvent {
  
  inline def apply(message: Any): StreamLayerViewMessageReceivedEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewMessageReceivedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamLayerViewMessageReceivedEvent] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
