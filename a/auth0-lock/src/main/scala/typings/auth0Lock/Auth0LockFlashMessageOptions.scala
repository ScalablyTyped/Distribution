package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.error
import typings.auth0Lock.auth0LockStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockFlashMessageOptions extends js.Object {
  var text: String = js.native
  var `type`: success | error = js.native
}

object Auth0LockFlashMessageOptions {
  @scala.inline
  def apply(text: String, `type`: success | error): Auth0LockFlashMessageOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
  @scala.inline
  implicit class Auth0LockFlashMessageOptionsOps[Self <: Auth0LockFlashMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: success | error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

