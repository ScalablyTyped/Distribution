package typings.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeOptions extends js.Object {
  
  /**
    * Default: false
    *
    * Make it so that the AMQP server only delivers single messages at a time.
    * When you want the next message, call queue.shift()
    *
    * When false, you will receive messages as fast as they are emitted
    */
  var ack: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: undefined
    *
    * Will inject the routingKey into the payload received
    */
  var deliveryKeyInPayload: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * If set to true, only one subscriber is allowed at a time
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 1
    *
    * Will only send you N messages before you 'ack'.
    *
    * Setting to zero will widen that window to 'unlimited'. If this is set, queue.shift() should not be used
    */
  var prefetchCount: js.UndefOr[Double] = js.native
  
  /**
    * Default: undefined
    *
    * Will inject the routingKey into the payload received
    */
  var routingKeyInPayload: js.UndefOr[Boolean] = js.native
}
object SubscribeOptions {
  
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    
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
    def setAck(value: Boolean): Self = this.set("ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAck: Self = this.set("ack", js.undefined)
    
    @scala.inline
    def setDeliveryKeyInPayload(value: Boolean): Self = this.set("deliveryKeyInPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryKeyInPayload: Self = this.set("deliveryKeyInPayload", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setPrefetchCount(value: Double): Self = this.set("prefetchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefetchCount: Self = this.set("prefetchCount", js.undefined)
    
    @scala.inline
    def setRoutingKeyInPayload(value: Boolean): Self = this.set("routingKeyInPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingKeyInPayload: Self = this.set("routingKeyInPayload", js.undefined)
  }
}
