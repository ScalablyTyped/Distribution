package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOptions extends js.Object {
  var cipher: js.Any
  var modes: ChannelModes
  var params: ChannelParams
}

object ChannelOptions {
  @scala.inline
  def apply(cipher: js.Any, modes: ChannelModes, params: ChannelParams): ChannelOptions = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOptions]
  }
}

