package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerStatusChange extends Event {
  /**
    * Endpoint.
    */
  var endpoint: Endpoint
  /**
    * Peer.
    */
  var peer: Peer
}

object PeerStatusChange {
  @scala.inline
  def apply(
    application: String,
    endpoint: Endpoint,
    peer: Peer,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): PeerStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStatusChange]
  }
}

