package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMessage extends StObject {
  
  /**
    * The text of the message.
    */
  var body: String = js.native
  
  /**
    * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection
    * being used to send the message.
    */
  var from: String = js.native
  
  /**
    * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
    */
  var to: String = js.native
  
  /**
    * Technology specific key/value pairs (JSON object) associated with the message.
    */
  var variables: js.UndefOr[IndexableObject] = js.native
}
object TextMessage {
  
  @scala.inline
  def apply(body: String, from: String, to: String): TextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessage]
  }
  
  @scala.inline
  implicit class TextMessageMutableBuilder[Self <: TextMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: IndexableObject): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
