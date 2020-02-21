package typings.agSimpleBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscribeData extends js.Object {
  var channel: String
}

object UnsubscribeData {
  @scala.inline
  def apply(channel: String): UnsubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscribeData]
  }
}

