package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsteriskPing extends js.Object {
  /* Properties */
  var asterisk_id: String
  var ping: String
  var timestamp: String
}

object AsteriskPing {
  @scala.inline
  def apply(asterisk_id: String, ping: String, timestamp: String): AsteriskPing = {
    val __obj = js.Dynamic.literal(asterisk_id = asterisk_id.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsteriskPing]
  }
}

