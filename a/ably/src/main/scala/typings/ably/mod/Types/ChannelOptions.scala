package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOptions extends js.Object {
  var cipher: js.Any
}

object ChannelOptions {
  @scala.inline
  def apply(cipher: js.Any): ChannelOptions = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOptions]
  }
}

