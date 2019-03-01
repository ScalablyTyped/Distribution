package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMessageFields extends js.Object {
  var deliveryTag: scala.Double
  var exchange: java.lang.String
  var redelivered: scala.Boolean
  var routingKey: java.lang.String
}

object CommonMessageFields {
  @scala.inline
  def apply(
    deliveryTag: scala.Double,
    exchange: java.lang.String,
    redelivered: scala.Boolean,
    routingKey: java.lang.String
  ): CommonMessageFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deliveryTag")(deliveryTag)
    __obj.updateDynamic("exchange")(exchange)
    __obj.updateDynamic("redelivered")(redelivered)
    __obj.updateDynamic("routingKey")(routingKey)
    __obj.asInstanceOf[CommonMessageFields]
  }
}

