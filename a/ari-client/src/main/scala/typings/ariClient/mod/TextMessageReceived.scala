package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMessageReceived
  extends StObject
     with Event {
  
  /**
    * Endpoint.
    */
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * Message.
    */
  var message: TextMessage
}
object TextMessageReceived {
  
  inline def apply(application: String, message: TextMessage, timestamp: js.Date, `type`: String): TextMessageReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessageReceived]
  }
  
  extension [Self <: TextMessageReceived](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setMessage(value: TextMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
