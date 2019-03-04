package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumeMessageFields extends CommonMessageFields

object ConsumeMessageFields {
  @scala.inline
  def apply(
    deliveryTag: scala.Double,
    exchange: java.lang.String,
    redelivered: scala.Boolean,
    routingKey: java.lang.String
  ): ConsumeMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag, exchange = exchange, redelivered = redelivered, routingKey = routingKey)
  
    __obj.asInstanceOf[ConsumeMessageFields]
  }
}

