package typings.amqp.amqpMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends DeliveryInfo {
  def acknowledge(all: Boolean): Unit
  def reject(requeue: Boolean): Unit
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
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), consumerTag = consumerTag, contentType = contentType, deliveryTag = deliveryTag, exchange = exchange, queue = queue, redelivered = redelivered, reject = js.Any.fromFunction1(reject), routingKey = routingKey)
  
    __obj.asInstanceOf[Ack]
  }
}

