package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageProperties extends js.Object {
  
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
  implicit class MessagePropertiesOps[Self <: MessageProperties] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: MessagePropertyHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: js.Any): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setClusterId(value: js.Any): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: js.Any): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    
    @scala.inline
    def setContentType(value: js.Any): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: js.Any): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setDeliveryMode(value: js.Any): Self = this.set("deliveryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMode: Self = this.set("deliveryMode", js.undefined)
    
    @scala.inline
    def setExpiration(value: js.Any): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setMessageId(value: js.Any): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setPriority(value: js.Any): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReplyTo(value: js.Any): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserId(value: js.Any): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
