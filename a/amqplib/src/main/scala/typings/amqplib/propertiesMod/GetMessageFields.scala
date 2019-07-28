package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMessageFields extends CommonMessageFields {
  var messageCount: Double
}

object GetMessageFields {
  @scala.inline
  def apply(
    deliveryTag: Double,
    exchange: String,
    messageCount: Double,
    redelivered: Boolean,
    routingKey: String
  ): GetMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag, exchange = exchange, messageCount = messageCount, redelivered = redelivered, routingKey = routingKey)
  
    __obj.asInstanceOf[GetMessageFields]
  }
}

