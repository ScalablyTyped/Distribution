package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHold extends Event {
  /**
    * The channel that initiated the hold event.
    */
  var channel: Channel = js.native
  /**
    * The music on hold class that the initiator requested.
    */
  var musicclass: js.UndefOr[String] = js.native
}

object ChannelHold {
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: Date, `type`: String): ChannelHold = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHold]
  }
  @scala.inline
  implicit class ChannelHoldOps[Self <: ChannelHold] (val x: Self) extends AnyVal {
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMusicclass(value: String): Self = this.set("musicclass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMusicclass: Self = this.set("musicclass", js.undefined)
  }
  
}

