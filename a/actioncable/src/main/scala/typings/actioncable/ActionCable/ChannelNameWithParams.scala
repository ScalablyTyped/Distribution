package typings.actioncable.ActionCable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelNameWithParams
  extends /* key */ StringDictionary[js.Any] {
  var channel: String = js.native
}

object ChannelNameWithParams {
  @scala.inline
  def apply(channel: String): ChannelNameWithParams = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelNameWithParams]
  }
  @scala.inline
  implicit class ChannelNameWithParamsOps[Self <: ChannelNameWithParams] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}

