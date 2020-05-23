package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dial extends Event {
  /* Properties */
  var caller: js.UndefOr[Channel] = js.undefined
  var dialstatus: String
  var dialstring: js.UndefOr[String] = js.undefined
  var forward: js.UndefOr[String] = js.undefined
  var forwarded: js.UndefOr[Channel] = js.undefined
  var peer: Channel
}

object Dial {
  @scala.inline
  def apply(
    application: String,
    dialstatus: String,
    peer: Channel,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null,
    caller: Channel = null,
    dialstring: String = null,
    forward: String = null,
    forwarded: Channel = null
  ): Dial = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], dialstatus = dialstatus.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (dialstring != null) __obj.updateDynamic("dialstring")(dialstring.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (forwarded != null) __obj.updateDynamic("forwarded")(forwarded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dial]
  }
}

