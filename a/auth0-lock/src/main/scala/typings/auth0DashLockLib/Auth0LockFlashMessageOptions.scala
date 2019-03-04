package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockFlashMessageOptions extends js.Object {
  var text: java.lang.String
  var `type`: auth0DashLockLib.auth0DashLockLibStrings.success | auth0DashLockLib.auth0DashLockLibStrings.error
}

object Auth0LockFlashMessageOptions {
  @scala.inline
  def apply(
    text: java.lang.String,
    `type`: auth0DashLockLib.auth0DashLockLibStrings.success | auth0DashLockLib.auth0DashLockLibStrings.error
  ): Auth0LockFlashMessageOptions = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
}

