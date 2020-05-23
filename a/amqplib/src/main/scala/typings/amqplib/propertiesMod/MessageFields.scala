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
    messageCount: js.UndefOr[Double] = js.undefined
  ): MessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    if (consumerTag != null) __obj.updateDynamic("consumerTag")(consumerTag.asInstanceOf[js.Any])
    if (!js.isUndefined(messageCount)) __obj.updateDynamic("messageCount")(messageCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFields]
  }
}

