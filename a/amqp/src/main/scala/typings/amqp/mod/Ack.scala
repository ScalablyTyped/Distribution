package typings.amqp.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ack extends DeliveryInfo {
  
  def acknowledge(all: Boolean): Unit = js.native
  
  def reject(requeue: Boolean): Unit = js.native
}
object Ack {
  
  @scala.inline
  def apply(
    acknowledge: Boolean => Unit,
    consumerTag: String,
    contentType: String,
    deliveryTag: Uint8Array,
    exchange: String,
    queue: String,
    redelivered: Boolean,
    reject: Boolean => Unit,
    routingKey: String
  ): Ack = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
  
  @scala.inline
  implicit class AckOps[Self <: Ack] (val x: Self) extends AnyVal {
    
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
    def setAcknowledge(value: Boolean => Unit): Self = this.set("acknowledge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReject(value: Boolean => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
  }
}
