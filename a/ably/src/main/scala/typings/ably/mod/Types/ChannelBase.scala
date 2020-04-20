package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelBase extends js.Object {
  var name: String
}

object ChannelBase {
  @scala.inline
  def apply(name: String): ChannelBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelBase]
  }
}

