package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1Fulfillment extends StObject {
  
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.undefined
  
  var speech: js.UndefOr[String] = js.undefined
}
object DialogflowV1Fulfillment {
  
  inline def apply(): DialogflowV1Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Fulfillment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1Fulfillment] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[DialogflowV1Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: DialogflowV1Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    inline def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
