package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockedForEntry extends js.Object {
  var identifier: String
  var ip: js.UndefOr[String] = js.undefined
}

object BlockedForEntry {
  @scala.inline
  def apply(identifier: String, ip: String = null): BlockedForEntry = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedForEntry]
  }
}

