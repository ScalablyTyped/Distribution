package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageProperties extends StObject {
  
  var appId: js.UndefOr[js.Any] = js.native
  
  var clusterId: js.UndefOr[js.Any] = js.native
  
  var contentEncoding: js.UndefOr[js.Any] = js.native
  
  var contentType: js.UndefOr[js.Any] = js.native
  
  var correlationId: js.UndefOr[js.Any] = js.native
  
  var deliveryMode: js.UndefOr[js.Any] = js.native
  
  var expiration: js.UndefOr[js.Any] = js.native
  
  var headers: MessagePropertyHeaders = js.native
  
  var messageId: js.UndefOr[js.Any] = js.native
  
  var priority: js.UndefOr[js.Any] = js.native
  
  var replyTo: js.UndefOr[js.Any] = js.native
  
  var timestamp: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[js.Any] = js.native
  
  var userId: js.UndefOr[js.Any] = js.native
}
object MessageProperties {
  
  @scala.inline
  def apply(headers: MessagePropertyHeaders): MessageProperties = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageProperties]
  }
  
  @scala.inline
  implicit class MessagePropertiesMutableBuilder[Self <: MessageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: js.Any): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setClusterId(value: js.Any): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: js.Any): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    @scala.inline
    def setContentType(value: js.Any): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: js.Any): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    @scala.inline
    def setDeliveryMode(value: js.Any): Self = StObject.set(x, "deliveryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryModeUndefined: Self = StObject.set(x, "deliveryMode", js.undefined)
    
    @scala.inline
    def setExpiration(value: js.Any): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setHeaders(value: MessagePropertyHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: js.Any): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setPriority(value: js.Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReplyTo(value: js.Any): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserId(value: js.Any): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
