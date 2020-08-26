package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOptions extends js.Object {
  var cipher: js.Any = js.native
  var modes: ChannelModes = js.native
  var params: ChannelParams = js.native
}

object ChannelOptions {
  @scala.inline
  def apply(cipher: js.Any, modes: ChannelModes, params: ChannelParams): ChannelOptions = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOptions]
  }
  @scala.inline
  implicit class ChannelOptionsOps[Self <: ChannelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCipher(value: js.Any): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def setModesVarargs(value: ChannelMode*): Self = this.set("modes", js.Array(value :_*))
    @scala.inline
    def setModes(value: ChannelModes): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: ChannelParams): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

