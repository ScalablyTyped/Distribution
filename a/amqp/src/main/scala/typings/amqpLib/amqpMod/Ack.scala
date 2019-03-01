package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends DeliveryInfo {
  def acknowledge(all: scala.Boolean): scala.Unit
  def reject(requeue: scala.Boolean): scala.Unit
}

object Ack {
  @scala.inline
  def apply(
    acknowledge: js.Function1[scala.Boolean, scala.Unit],
    consumerTag: java.lang.String,
    contentType: java.lang.String,
    deliveryTag: stdLib.Uint8Array,
    exchange: java.lang.String,
    queue: java.lang.String,
    redelivered: scala.Boolean,
    reject: js.Function1[scala.Boolean, scala.Unit],
    routingKey: java.lang.String
  ): Ack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acknowledge")(acknowledge)
    __obj.updateDynamic("consumerTag")(consumerTag)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("deliveryTag")(deliveryTag)
    __obj.updateDynamic("exchange")(exchange)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("redelivered")(redelivered)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("routingKey")(routingKey)
    __obj.asInstanceOf[Ack]
  }
}

