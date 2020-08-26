package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Peer extends js.Object {
  /**
    * The IP address of the peer.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * An optional reason associated with the change in peer_status.
    */
  var cause: js.UndefOr[String] = js.native
  /**
    * The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.
    */
  var peer_status: String = js.native
  /**
    * The port of the peer.
    */
  var port: js.UndefOr[String] = js.native
  /**
    * The last known time the peer was contacted.
    */
  var time: js.UndefOr[String] = js.native
}

object Peer {
  @scala.inline
  def apply(peer_status: String): Peer = {
    val __obj = js.Dynamic.literal(peer_status = peer_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
  @scala.inline
  implicit class PeerOps[Self <: Peer] (val x: Self) extends AnyVal {
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
    def setPeer_status(value: String): Self = this.set("peer_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

