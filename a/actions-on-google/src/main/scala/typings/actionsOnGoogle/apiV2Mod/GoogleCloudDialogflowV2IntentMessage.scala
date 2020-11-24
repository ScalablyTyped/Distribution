package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessage extends js.Object {
  
  var basicCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCard] = js.native
  
  var card: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCard] = js.native
  
  var carouselSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.native
  
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  
  var linkOutSuggestion: js.UndefOr[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.native
  
  var listSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageListSelect] = js.native
  
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var platform: js.UndefOr[GoogleCloudDialogflowV2IntentMessagePlatform] = js.native
  
  var quickReplies: js.UndefOr[GoogleCloudDialogflowV2IntentMessageQuickReplies] = js.native
  
  var simpleResponses: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.native
  
  var suggestions: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSuggestions] = js.native
  
  var text: js.UndefOr[GoogleCloudDialogflowV2IntentMessageText] = js.native
}
object GoogleCloudDialogflowV2IntentMessage {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessage]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageOps[Self <: GoogleCloudDialogflowV2IntentMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasicCard(value: GoogleCloudDialogflowV2IntentMessageBasicCard): Self = this.set("basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicCard: Self = this.set("basicCard", js.undefined)
    
    @scala.inline
    def setCard(value: GoogleCloudDialogflowV2IntentMessageCard): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setCarouselSelect(value: GoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = this.set("carouselSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarouselSelect: Self = this.set("carouselSelect", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLinkOutSuggestion(value: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = this.set("linkOutSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkOutSuggestion: Self = this.set("linkOutSuggestion", js.undefined)
    
    @scala.inline
    def setListSelect(value: GoogleCloudDialogflowV2IntentMessageListSelect): Self = this.set("listSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListSelect: Self = this.set("listSelect", js.undefined)
    
    @scala.inline
    def setPayload(value: ApiClientObjectMap[_]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPlatform(value: GoogleCloudDialogflowV2IntentMessagePlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setQuickReplies(value: GoogleCloudDialogflowV2IntentMessageQuickReplies): Self = this.set("quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickReplies: Self = this.set("quickReplies", js.undefined)
    
    @scala.inline
    def setSimpleResponses(value: GoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = this.set("simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleResponses: Self = this.set("simpleResponses", js.undefined)
    
    @scala.inline
    def setSuggestions(value: GoogleCloudDialogflowV2IntentMessageSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setText(value: GoogleCloudDialogflowV2IntentMessageText): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
