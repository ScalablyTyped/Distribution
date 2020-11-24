package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonMessageFields extends js.Object {
  
  var deliveryTag: Double = js.native
  
  var exchange: String = js.native
  
  var redelivered: Boolean = js.native
  
  var routingKey: String = js.native
}
object CommonMessageFields {
  
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): CommonMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMessageFields]
  }
  
  @scala.inline
  implicit class CommonMessageFieldsOps[Self <: CommonMessageFields] (val x: Self) extends AnyVal {
    
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
    def setDeliveryTag(value: Double): Self = this.set("deliveryTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedelivered(value: Boolean): Self = this.set("redelivered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingKey(value: String): Self = this.set("routingKey", value.asInstanceOf[js.Any])
  }
}
