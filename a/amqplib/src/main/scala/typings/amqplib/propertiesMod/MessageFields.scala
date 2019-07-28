package typings.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFields extends CommonMessageFields {
  var consumerTag: js.UndefOr[String] = js.undefined
  var messageCount: js.UndefOr[Double] = js.undefined
}

object MessageFields {
  @scala.inline
  def apply(
    deliveryTag: Double,
    exchange: String,
    redelivered: Boolean,
    routingKey: String,
    consumerTag: String = null,
    messageCount: Int | Double = null
  ): MessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag, exchange = exchange, redelivered = redelivered, routingKey = routingKey)
    if (consumerTag != null) __obj.updateDynamic("consumerTag")(consumerTag)
    if (messageCount != null) __obj.updateDynamic("messageCount")(messageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFields]
  }
}

