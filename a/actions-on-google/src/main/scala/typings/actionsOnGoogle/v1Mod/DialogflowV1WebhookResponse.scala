package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1WebhookResponse extends js.Object {
  
  var contextOut: js.UndefOr[js.Array[DialogflowV1Context]] = js.native
  
  var data: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var displayText: js.UndefOr[String] = js.native
  
  var followupEvent: js.UndefOr[DialogflowV1FollowupEvent] = js.native
  
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var speech: js.UndefOr[String] = js.native
}
object DialogflowV1WebhookResponse {
  
  @scala.inline
  def apply(): DialogflowV1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1WebhookResponse]
  }
  
  @scala.inline
  implicit class DialogflowV1WebhookResponseOps[Self <: DialogflowV1WebhookResponse] (val x: Self) extends AnyVal {
    
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
    def setContextOutVarargs(value: DialogflowV1Context*): Self = this.set("contextOut", js.Array(value :_*))
    
    @scala.inline
    def setContextOut(value: js.Array[DialogflowV1Context]): Self = this.set("contextOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextOut: Self = this.set("contextOut", js.undefined)
    
    @scala.inline
    def setData(value: ApiClientObjectMap[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    
    @scala.inline
    def setFollowupEvent(value: DialogflowV1FollowupEvent): Self = this.set("followupEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowupEvent: Self = this.set("followupEvent", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: DialogflowV1Message*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[DialogflowV1Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSpeech(value: String): Self = this.set("speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeech: Self = this.set("speech", js.undefined)
  }
}
