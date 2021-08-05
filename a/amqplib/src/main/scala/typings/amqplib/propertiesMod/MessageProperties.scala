package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageProperties extends StObject {
  
  var appId: js.UndefOr[js.Any] = js.undefined
  
  var clusterId: js.UndefOr[js.Any] = js.undefined
  
  var contentEncoding: js.UndefOr[js.Any] = js.undefined
  
  var contentType: js.UndefOr[js.Any] = js.undefined
  
  var correlationId: js.UndefOr[js.Any] = js.undefined
  
  var deliveryMode: js.UndefOr[js.Any] = js.undefined
  
  var expiration: js.UndefOr[js.Any] = js.undefined
  
  var headers: MessagePropertyHeaders
  
  var messageId: js.UndefOr[js.Any] = js.undefined
  
  var priority: js.UndefOr[js.Any] = js.undefined
  
  var replyTo: js.UndefOr[js.Any] = js.undefined
  
  var timestamp: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[js.Any] = js.undefined
  
  var userId: js.UndefOr[js.Any] = js.undefined
}
object MessageProperties {
  
  inline def apply(headers: MessagePropertyHeaders): MessageProperties = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageProperties]
  }
  
  extension [Self <: MessageProperties](x: Self) {
    
    inline def setAppId(value: js.Any): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setClusterId(value: js.Any): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setContentEncoding(value: js.Any): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentType(value: js.Any): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCorrelationId(value: js.Any): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setDeliveryMode(value: js.Any): Self = StObject.set(x, "deliveryMode", value.asInstanceOf[js.Any])
    
    inline def setDeliveryModeUndefined: Self = StObject.set(x, "deliveryMode", js.undefined)
    
    inline def setExpiration(value: js.Any): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setHeaders(value: MessagePropertyHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: js.Any): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setPriority(value: js.Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReplyTo(value: js.Any): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserId(value: js.Any): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
