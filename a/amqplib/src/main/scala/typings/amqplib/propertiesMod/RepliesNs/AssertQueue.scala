package typings.amqplib.propertiesMod.RepliesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertQueue extends js.Object {
  var consumerCount: Double
  var messageCount: Double
  var queue: String
}

object AssertQueue {
  @scala.inline
  def apply(consumerCount: Double, messageCount: Double, queue: String): AssertQueue = {
    val __obj = js.Dynamic.literal(consumerCount = consumerCount, messageCount = messageCount, queue = queue)
  
    __obj.asInstanceOf[AssertQueue]
  }
}

