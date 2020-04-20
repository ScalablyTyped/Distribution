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
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageFields]
  }
}

