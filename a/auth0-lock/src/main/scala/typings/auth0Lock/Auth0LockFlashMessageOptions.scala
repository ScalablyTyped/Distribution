package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.error
import typings.auth0Lock.auth0LockStrings.success
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
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
}

