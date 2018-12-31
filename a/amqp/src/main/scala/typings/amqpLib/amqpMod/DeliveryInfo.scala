package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryInfo extends js.Object {
  var consumerTag: java.lang.String
  var contentType: java.lang.String
  var deliveryTag: stdLib.Uint8Array
  var exchange: java.lang.String
  var queue: java.lang.String
  var redelivered: scala.Boolean
  var routingKey: java.lang.String
}

