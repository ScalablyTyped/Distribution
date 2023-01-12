package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveMessageResult extends StObject {
  
  /**
    * A list of messages.
    */
  var Messages: js.UndefOr[MessageList] = js.undefined
}
object ReceiveMessageResult {
  
  inline def apply(): ReceiveMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveMessageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiveMessageResult] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: MessageList): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "Messages", js.Array(value*))
  }
}
