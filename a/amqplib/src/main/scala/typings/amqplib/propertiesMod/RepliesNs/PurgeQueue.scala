package typings.amqplib.propertiesMod.RepliesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurgeQueue extends js.Object {
  var messageCount: Double
}

object PurgeQueue {
  @scala.inline
  def apply(messageCount: Double): PurgeQueue = {
    val __obj = js.Dynamic.literal(messageCount = messageCount)
  
    __obj.asInstanceOf[PurgeQueue]
  }
}

