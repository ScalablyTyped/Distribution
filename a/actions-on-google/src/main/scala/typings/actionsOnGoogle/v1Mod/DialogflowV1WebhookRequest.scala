package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1WebhookRequest extends StObject {
  
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
  implicit class DialogflowV1WebhookRequestMutableBuilder[Self <: DialogflowV1WebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: DialogflowV1OriginalRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    @scala.inline
    def setResult(value: DialogflowV1Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setStatus(value: DialogflowV1Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
