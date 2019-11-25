package typings.amqplib.propertiesMod.Replies

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
    val __obj = js.Dynamic.literal(consumerCount = consumerCount.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssertQueue]
  }
}

