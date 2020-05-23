package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @param role Role that the user switches to. */
trait Role extends js.Object {
  var role: String
}

object Role {
  @scala.inline
  def apply(role: String): Role = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
}

