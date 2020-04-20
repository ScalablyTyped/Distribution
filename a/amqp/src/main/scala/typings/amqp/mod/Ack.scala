package typings.amqp.mod

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
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
}

