package typings.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueue extends js.Object {
  var messageCount: Double
}

object DeleteQueue {
  @scala.inline
  def apply(messageCount: Double): DeleteQueue = {
    val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteQueue]
  }
}

