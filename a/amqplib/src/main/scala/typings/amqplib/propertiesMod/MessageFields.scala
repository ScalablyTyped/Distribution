package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageFields extends CommonMessageFields {
  
  var consumerTag: js.UndefOr[String] = js.native
  
  var messageCount: js.UndefOr[Double] = js.native
}
object MessageFields {
  
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): MessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFields]
  }
  
  @scala.inline
  implicit class MessageFieldsOps[Self <: MessageFields] (val x: Self) extends AnyVal {
    
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
    def setConsumerTag(value: String): Self = this.set("consumerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerTag: Self = this.set("consumerTag", js.undefined)
    
    @scala.inline
    def setMessageCount(value: Double): Self = this.set("messageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageCount: Self = this.set("messageCount", js.undefined)
  }
}
