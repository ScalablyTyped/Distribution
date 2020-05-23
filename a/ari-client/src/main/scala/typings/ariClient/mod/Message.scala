package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var asterisk_id: js.UndefOr[String] = js.undefined
  /* Properties */
  var `type`: String
}

object Message {
  @scala.inline
  def apply(`type`: String, asterisk_id: String = null): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

