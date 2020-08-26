package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelUserevent extends Event {
  /**
    * A bridge that is signaled with the user event.
    */
  var bridge: js.UndefOr[Bridge] = js.native
  /**
    * A channel that is signaled with the user event.
    */
  var channel: js.UndefOr[Channel] = js.native
  /**
    * A endpoint that is signaled with the user event.
    */
  var endpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The name of the user event.
    */
  var eventname: String = js.native
  /**
    * Custom Userevent data.
    */
  var userevent: IndexableObject = js.native
}

object ChannelUserevent {
  @scala.inline
  def apply(
    application: String,
    eventname: String,
    timestamp: Date,
    `type`: String,
    userevent: IndexableObject
  ): ChannelUserevent = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventname = eventname.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userevent = userevent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUserevent]
  }
  @scala.inline
  implicit class ChannelUsereventOps[Self <: ChannelUserevent] (val x: Self) extends AnyVal {
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
    def setEventname(value: String): Self = this.set("eventname", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserevent(value: IndexableObject): Self = this.set("userevent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBridge(value: Bridge): Self = this.set("bridge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBridge: Self = this.set("bridge", js.undefined)
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
  }
  
}

