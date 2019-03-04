package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryInfo extends js.Object {
  var consumerTag: java.lang.String
  var contentType: java.lang.String
  var deliveryTag: stdLib.Uint8Array
  var exchange: java.lang.String
  var queue: java.lang.String
  var redelivered: scala.Boolean
  var routingKey: java.lang.String
}

object DeliveryInfo {
  @scala.inline
  def apply(
    consumerTag: java.lang.String,
    contentType: java.lang.String,
    deliveryTag: stdLib.Uint8Array,
    exchange: java.lang.String,
    queue: java.lang.String,
    redelivered: scala.Boolean,
    routingKey: java.lang.String
  ): DeliveryInfo = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag, contentType = contentType, deliveryTag = deliveryTag, exchange = exchange, queue = queue, redelivered = redelivered, routingKey = routingKey)
  
    __obj.asInstanceOf[DeliveryInfo]
  }
}

