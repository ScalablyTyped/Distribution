package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMessageFields extends CommonMessageFields {
  var messageCount: scala.Double
}

object GetMessageFields {
  @scala.inline
  def apply(
    deliveryTag: scala.Double,
    exchange: java.lang.String,
    messageCount: scala.Double,
    redelivered: scala.Boolean,
    routingKey: java.lang.String
  ): GetMessageFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deliveryTag")(deliveryTag)
    __obj.updateDynamic("exchange")(exchange)
    __obj.updateDynamic("messageCount")(messageCount)
    __obj.updateDynamic("redelivered")(redelivered)
    __obj.updateDynamic("routingKey")(routingKey)
    __obj.asInstanceOf[GetMessageFields]
  }
}

