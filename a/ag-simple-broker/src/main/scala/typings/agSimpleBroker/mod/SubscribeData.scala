package typings.agSimpleBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeData extends js.Object {
  var channel: String
}

object SubscribeData {
  @scala.inline
  def apply(channel: String): SubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribeData]
  }
}

