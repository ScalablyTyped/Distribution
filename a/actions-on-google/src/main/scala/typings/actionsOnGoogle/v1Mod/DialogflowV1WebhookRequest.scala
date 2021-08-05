package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1WebhookRequest extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var originalRequest: js.UndefOr[DialogflowV1OriginalRequest] = js.undefined
  
  var result: js.UndefOr[DialogflowV1Result] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[DialogflowV1Status] = js.undefined
  
  var timestamp: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
}
object DialogflowV1WebhookRequest {
  
  inline def apply(): DialogflowV1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1WebhookRequest]
  }
  
  extension [Self <: DialogflowV1WebhookRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOriginalRequest(value: DialogflowV1OriginalRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setResult(value: DialogflowV1Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStatus(value: DialogflowV1Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
