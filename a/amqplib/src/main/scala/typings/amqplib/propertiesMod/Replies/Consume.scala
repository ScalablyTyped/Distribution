package typings.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consume extends js.Object {
  var consumerTag: String
}

object Consume {
  @scala.inline
  def apply(consumerTag: String): Consume = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Consume]
  }
}

