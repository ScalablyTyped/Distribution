package typings.amqp.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryInfo extends js.Object {
  var consumerTag: String = js.native
  var contentType: String = js.native
  var deliveryTag: Uint8Array = js.native
  var exchange: String = js.native
  var queue: String = js.native
  var redelivered: Boolean = js.native
  var routingKey: String = js.native
}

object DeliveryInfo {
  @scala.inline
  def apply(
    consumerTag: String,
    contentType: String,
    deliveryTag: Uint8Array,
    exchange: String,
    queue: String,
    redelivered: Boolean,
    routingKey: String
  ): DeliveryInfo = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryInfo]
  }
  @scala.inline
  implicit class DeliveryInfoOps[Self <: DeliveryInfo] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryTag(value: Uint8Array): Self = this.set("deliveryTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedelivered(value: Boolean): Self = this.set("redelivered", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutingKey(value: String): Self = this.set("routingKey", value.asInstanceOf[js.Any])
  }
  
}

