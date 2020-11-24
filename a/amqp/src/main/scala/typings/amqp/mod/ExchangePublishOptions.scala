package typings.amqp.mod

import typings.amqp.amqpNumbers.`0`
import typings.amqp.amqpNumbers.`1`
import typings.amqp.amqpNumbers.`2`
import typings.amqp.amqpNumbers.`3`
import typings.amqp.amqpNumbers.`4`
import typings.amqp.amqpNumbers.`5`
import typings.amqp.amqpNumbers.`6`
import typings.amqp.amqpNumbers.`7`
import typings.amqp.amqpNumbers.`8`
import typings.amqp.amqpNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangePublishOptions extends js.Object {
  
  /**
    * Default: null
    *
    * Creating application id
    */
  var appId: js.UndefOr[String] = js.native
  
  /**
    * Default: null
    */
  var contentEncoding: js.UndefOr[String] = js.native
  
  /**
    * Default: 'application/octet-stream'
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Application correlation identifier
    */
  var correlationId: js.UndefOr[String] = js.native
  
  /**
    * 1: Non-persistent
    * 2: Persistent
    */
  var deliveryMode: js.UndefOr[`1` | `2`] = js.native
  
  /**
    * Default: null
    *
    * Message expiration specification -- ISO date string?
    */
  var expiration: js.UndefOr[String] = js.native
  
  /**
    * Default: {}
    *
    * Arbitrary application-specific message headers
    */
  var headers: js.UndefOr[js.Any] = js.native
  
  /**
    * Default: false
    *
    * This flag tells the server how to react if the message cannot be routed to a queue consumer immediately.
    *
    * If this flag is set, the server will return an undeliverable message with a Return method.
    *
    * If this flag is false, the server will queue the message, but with no guarantee that it will ever be consumed
    */
  var immediate: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * This flag tells the server how to react if the message cannot be routed to a queue.
    *
    * If this flag is set, the server will return an unroutable message with a Return method.
    *
    * If this flag is false, the server silently drops the message
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: null
    *
    * Application message identifier
    */
  var messageId: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  
  /**
    * Usually used to name a reply queue for a request message
    */
  var replyTo: js.UndefOr[String] = js.native
  
  /**
    * Default: null
    *
    * Message timestamp
    *
    * ISO date string?
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * Default: null
    *
    * Message type name
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Default: null
    *
    * Creating user id
    */
  var userId: js.UndefOr[String] = js.native
}
object ExchangePublishOptions {
  
  @scala.inline
  def apply(): ExchangePublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangePublishOptions]
  }
  
  @scala.inline
  implicit class ExchangePublishOptionsOps[Self <: ExchangePublishOptions] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setDeliveryMode(value: `1` | `2`): Self = this.set("deliveryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMode: Self = this.set("deliveryMode", js.undefined)
    
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setPriority(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
