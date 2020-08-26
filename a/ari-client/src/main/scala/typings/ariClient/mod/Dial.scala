package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dial extends Event {
  /**
    * The calling channel.
    */
  var caller: js.UndefOr[Channel] = js.native
  /**
    * Current status of the dialing attempt to the peer.
    */
  var dialstatus: String = js.native
  /**
    * The dial string for calling the peer channel.
    */
  var dialstring: js.UndefOr[String] = js.native
  /**
    * Forwarding target requested by the original dialed channel.
    */
  var forward: js.UndefOr[String] = js.native
  /**
    * Channel that the caller has been forwarded to.
    */
  var forwarded: js.UndefOr[Channel] = js.native
  /**
    * The dialed channel.
    */
  var peer: Channel = js.native
}

object Dial {
  @scala.inline
  def apply(application: String, dialstatus: String, peer: Channel, timestamp: Date, `type`: String): Dial = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], dialstatus = dialstatus.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dial]
  }
  @scala.inline
  implicit class DialOps[Self <: Dial] (val x: Self) extends AnyVal {
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
    def setDialstatus(value: String): Self = this.set("dialstatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeer(value: Channel): Self = this.set("peer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaller(value: Channel): Self = this.set("caller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    @scala.inline
    def setDialstring(value: String): Self = this.set("dialstring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialstring: Self = this.set("dialstring", js.undefined)
    @scala.inline
    def setForward(value: String): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    @scala.inline
    def setForwarded(value: Channel): Self = this.set("forwarded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwarded: Self = this.set("forwarded", js.undefined)
  }
  
}

