package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMessageReceived extends Event {
  
  /**
    * Endpoint.
    */
  var endpoint: js.UndefOr[Endpoint] = js.native
  
  /**
    * Message.
    */
  var message: TextMessage = js.native
}
object TextMessageReceived {
  
  @scala.inline
  def apply(application: String, message: TextMessage, timestamp: Date, `type`: String): TextMessageReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessageReceived]
  }
  
  @scala.inline
  implicit class TextMessageReceivedMutableBuilder[Self <: TextMessageReceived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setMessage(value: TextMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
