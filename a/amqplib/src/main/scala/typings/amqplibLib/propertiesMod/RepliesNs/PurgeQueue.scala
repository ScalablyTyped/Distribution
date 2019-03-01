package typings
package amqplibLib.propertiesMod.RepliesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurgeQueue extends js.Object {
  var messageCount: scala.Double
}

object PurgeQueue {
  @scala.inline
  def apply(messageCount: scala.Double): PurgeQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageCount")(messageCount)
    __obj.asInstanceOf[PurgeQueue]
  }
}

