package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessage extends StObject {
  
  var basicCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCard] = js.undefined
  
  var card: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCard] = js.undefined
  
  var carouselSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.undefined
  
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  var linkOutSuggestion: js.UndefOr[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.undefined
  
  var listSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageListSelect] = js.undefined
  
  var payload: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  var platform: js.UndefOr[GoogleCloudDialogflowV2IntentMessagePlatform] = js.undefined
  
  var quickReplies: js.UndefOr[GoogleCloudDialogflowV2IntentMessageQuickReplies] = js.undefined
  
  var simpleResponses: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.undefined
  
  var suggestions: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSuggestions] = js.undefined
  
  var text: js.UndefOr[GoogleCloudDialogflowV2IntentMessageText] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessage {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessage]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicCard(value: GoogleCloudDialogflowV2IntentMessageBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    @scala.inline
    def setCard(value: GoogleCloudDialogflowV2IntentMessageCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setCarouselSelect(value: GoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLinkOutSuggestion(value: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    @scala.inline
    def setListSelect(value: GoogleCloudDialogflowV2IntentMessageListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    @scala.inline
    def setPayload(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPlatform(value: GoogleCloudDialogflowV2IntentMessagePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setQuickReplies(value: GoogleCloudDialogflowV2IntentMessageQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    @scala.inline
    def setSimpleResponses(value: GoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSuggestions(value: GoogleCloudDialogflowV2IntentMessageSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setText(value: GoogleCloudDialogflowV2IntentMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
