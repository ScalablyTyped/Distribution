package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends DeliveryInfo {
  def acknowledge(all: scala.Boolean): scala.Unit
  def reject(requeue: scala.Boolean): scala.Unit
}

