package typings
package amqplibLib.propertiesMod.RepliesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consume extends js.Object {
  var consumerTag: java.lang.String
}

object Consume {
  @scala.inline
  def apply(consumerTag: java.lang.String): Consume = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag)
  
    __obj.asInstanceOf[Consume]
  }
}

