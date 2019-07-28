package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumeMessageFields extends CommonMessageFields

object ConsumeMessageFields {
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): ConsumeMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag, exchange = exchange, redelivered = redelivered, routingKey = routingKey)
  
    __obj.asInstanceOf[ConsumeMessageFields]
  }
}

