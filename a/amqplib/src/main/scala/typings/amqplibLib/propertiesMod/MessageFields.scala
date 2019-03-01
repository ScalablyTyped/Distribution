package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFields extends CommonMessageFields {
  var consumerTag: js.UndefOr[java.lang.String] = js.undefined
  var messageCount: js.UndefOr[scala.Double] = js.undefined
}

object MessageFields {
  @scala.inline
  def apply(
    deliveryTag: scala.Double,
    exchange: java.lang.String,
    redelivered: scala.Boolean,
    routingKey: java.lang.String,
    consumerTag: java.lang.String = null,
    messageCount: scala.Int | scala.Double = null
  ): MessageFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deliveryTag")(deliveryTag)
    __obj.updateDynamic("exchange")(exchange)
    __obj.updateDynamic("redelivered")(redelivered)
    __obj.updateDynamic("routingKey")(routingKey)
    if (consumerTag != null) __obj.updateDynamic("consumerTag")(consumerTag)
    if (messageCount != null) __obj.updateDynamic("messageCount")(messageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFields]
  }
}

