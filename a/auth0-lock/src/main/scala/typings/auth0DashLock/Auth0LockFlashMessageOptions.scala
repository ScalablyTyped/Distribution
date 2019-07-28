package typings.auth0DashLock

import typings.auth0DashLock.auth0DashLockStrings.error
import typings.auth0DashLock.auth0DashLockStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockFlashMessageOptions extends js.Object {
  var text: String
  var `type`: success | error
}

object Auth0LockFlashMessageOptions {
  @scala.inline
  def apply(text: String, `type`: success | error): Auth0LockFlashMessageOptions = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
}

