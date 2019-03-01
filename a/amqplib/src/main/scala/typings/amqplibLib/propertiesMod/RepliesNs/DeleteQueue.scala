package typings
package amqplibLib.propertiesMod.RepliesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueue extends js.Object {
  var messageCount: scala.Double
}

object DeleteQueue {
  @scala.inline
  def apply(messageCount: scala.Double): DeleteQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageCount")(messageCount)
    __obj.asInstanceOf[DeleteQueue]
  }
}

