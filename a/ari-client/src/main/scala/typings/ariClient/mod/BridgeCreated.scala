package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeCreated extends Event {
  /* Properties */
  var bridge: Bridge
}

object BridgeCreated {
  @scala.inline
  def apply(application: String, bridge: Bridge, timestamp: Date, `type`: String, asterisk_id: String = null): BridgeCreated = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeCreated]
  }
}

