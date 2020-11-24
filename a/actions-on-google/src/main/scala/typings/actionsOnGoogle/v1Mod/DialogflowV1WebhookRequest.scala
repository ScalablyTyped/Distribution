package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1WebhookRequest extends js.Object {
  
  var id: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var originalRequest: js.UndefOr[DialogflowV1OriginalRequest] = js.native
  
  var result: js.UndefOr[DialogflowV1Result] = js.native
  
  var sessionId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[DialogflowV1Status] = js.native
  
  var timestamp: js.UndefOr[String] = js.native
  
  var timezone: js.UndefOr[String] = js.native
}
object DialogflowV1WebhookRequest {
  
  @scala.inline
  def apply(): DialogflowV1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1WebhookRequest]
  }
  
  @scala.inline
  implicit class DialogflowV1WebhookRequestOps[Self <: DialogflowV1WebhookRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: DialogflowV1OriginalRequest): Self = this.set("originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalRequest: Self = this.set("originalRequest", js.undefined)
    
    @scala.inline
    def setResult(value: DialogflowV1Result): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    
    @scala.inline
    def setStatus(value: DialogflowV1Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
