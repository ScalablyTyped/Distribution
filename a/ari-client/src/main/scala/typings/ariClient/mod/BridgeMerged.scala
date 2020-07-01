package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeMerged extends Event {
  /**
    * Bridge.
    */
  var bridge: Bridge
  /**
    * Bridge_from.
    */
  var bridge_from: Bridge
}

object BridgeMerged {
  @scala.inline
  def apply(
    application: String,
    bridge: Bridge,
    bridge_from: Bridge,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): BridgeMerged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], bridge_from = bridge_from.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeMerged]
  }
}

