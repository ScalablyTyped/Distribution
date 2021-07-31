package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1WebhookResponse extends StObject {
  
  var contextOut: js.UndefOr[js.Array[DialogflowV1Context]] = js.undefined
  
  var data: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  var displayText: js.UndefOr[String] = js.undefined
  
  var followupEvent: js.UndefOr[DialogflowV1FollowupEvent] = js.undefined
  
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var speech: js.UndefOr[String] = js.undefined
}
object DialogflowV1WebhookResponse {
  
  @scala.inline
  def apply(): DialogflowV1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1WebhookResponse]
  }
  
  @scala.inline
  implicit class DialogflowV1WebhookResponseMutableBuilder[Self <: DialogflowV1WebhookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextOut(value: js.Array[DialogflowV1Context]): Self = StObject.set(x, "contextOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextOutUndefined: Self = StObject.set(x, "contextOut", js.undefined)
    
    @scala.inline
    def setContextOutVarargs(value: DialogflowV1Context*): Self = StObject.set(x, "contextOut", js.Array(value :_*))
    
    @scala.inline
    def setData(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    @scala.inline
    def setFollowupEvent(value: DialogflowV1FollowupEvent): Self = StObject.set(x, "followupEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupEventUndefined: Self = StObject.set(x, "followupEvent", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[DialogflowV1Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: DialogflowV1Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
