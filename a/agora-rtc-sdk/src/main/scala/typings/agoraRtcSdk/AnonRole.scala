package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @param role Role that the user switches to. */
trait AnonRole extends js.Object {
  var role: String
}

object AnonRole {
  @scala.inline
  def apply(role: String): AnonRole = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRole]
  }
}

