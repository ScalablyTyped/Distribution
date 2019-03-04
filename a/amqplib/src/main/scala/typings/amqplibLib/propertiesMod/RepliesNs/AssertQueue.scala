package typings
package amqplibLib.propertiesMod.RepliesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertQueue extends js.Object {
  var consumerCount: scala.Double
  var messageCount: scala.Double
  var queue: java.lang.String
}

object AssertQueue {
  @scala.inline
  def apply(consumerCount: scala.Double, messageCount: scala.Double, queue: java.lang.String): AssertQueue = {
    val __obj = js.Dynamic.literal(consumerCount = consumerCount, messageCount = messageCount, queue = queue)
  
    __obj.asInstanceOf[AssertQueue]
  }
}

