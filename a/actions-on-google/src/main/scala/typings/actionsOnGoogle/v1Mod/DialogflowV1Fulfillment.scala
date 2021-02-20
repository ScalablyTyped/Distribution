package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Fulfillment extends StObject {
  
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.native
  
  var speech: js.UndefOr[String] = js.native
}
object DialogflowV1Fulfillment {
  
  @scala.inline
  def apply(): DialogflowV1Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Fulfillment]
  }
  
  @scala.inline
  implicit class DialogflowV1FulfillmentMutableBuilder[Self <: DialogflowV1Fulfillment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[DialogflowV1Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: DialogflowV1Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
