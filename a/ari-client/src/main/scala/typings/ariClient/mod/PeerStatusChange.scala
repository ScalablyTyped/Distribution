package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerStatusChange extends Event {
  /**
    * Endpoint.
    */
  var endpoint: Endpoint = js.native
  /**
    * Peer.
    */
  var peer: Peer = js.native
}

object PeerStatusChange {
  @scala.inline
  def apply(application: String, endpoint: Endpoint, peer: Peer, timestamp: Date, `type`: String): PeerStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStatusChange]
  }
  @scala.inline
  implicit class PeerStatusChangeOps[Self <: PeerStatusChange] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: Endpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeer(value: Peer): Self = this.set("peer", value.asInstanceOf[js.Any])
  }
  
}

