package typings.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurgeQueue extends js.Object {
  var messageCount: Double
}

object PurgeQueue {
  @scala.inline
  def apply(messageCount: Double): PurgeQueue = {
    val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PurgeQueue]
  }
}

