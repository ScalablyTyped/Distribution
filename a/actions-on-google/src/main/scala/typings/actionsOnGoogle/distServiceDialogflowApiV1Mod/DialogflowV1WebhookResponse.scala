package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1WebhookResponse extends StObject {
  
  var contextOut: js.UndefOr[js.Array[DialogflowV1Context]] = js.undefined
  
  var data: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var displayText: js.UndefOr[String] = js.undefined
  
  var followupEvent: js.UndefOr[DialogflowV1FollowupEvent] = js.undefined
  
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var speech: js.UndefOr[String] = js.undefined
}
object DialogflowV1WebhookResponse {
  
  inline def apply(): DialogflowV1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1WebhookResponse]
  }
  
  extension [Self <: DialogflowV1WebhookResponse](x: Self) {
    
    inline def setContextOut(value: js.Array[DialogflowV1Context]): Self = StObject.set(x, "contextOut", value.asInstanceOf[js.Any])
    
    inline def setContextOutUndefined: Self = StObject.set(x, "contextOut", js.undefined)
    
    inline def setContextOutVarargs(value: DialogflowV1Context*): Self = StObject.set(x, "contextOut", js.Array(value*))
    
    inline def setData(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setFollowupEvent(value: DialogflowV1FollowupEvent): Self = StObject.set(x, "followupEvent", value.asInstanceOf[js.Any])
    
    inline def setFollowupEventUndefined: Self = StObject.set(x, "followupEvent", js.undefined)
    
    inline def setMessages(value: js.Array[DialogflowV1Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: DialogflowV1Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    inline def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
