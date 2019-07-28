package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMessageFields extends js.Object {
  var deliveryTag: Double
  var exchange: String
  var redelivered: Boolean
  var routingKey: String
}

object CommonMessageFields {
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): CommonMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag, exchange = exchange, redelivered = redelivered, routingKey = routingKey)
  
    __obj.asInstanceOf[CommonMessageFields]
  }
}

