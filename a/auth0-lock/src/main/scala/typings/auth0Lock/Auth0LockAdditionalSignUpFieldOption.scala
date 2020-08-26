package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockAdditionalSignUpFieldOption extends js.Object {
  var label: String = js.native
  var value: String = js.native
}

object Auth0LockAdditionalSignUpFieldOption {
  @scala.inline
  def apply(label: String, value: String): Auth0LockAdditionalSignUpFieldOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSignUpFieldOption]
  }
  @scala.inline
  implicit class Auth0LockAdditionalSignUpFieldOptionOps[Self <: Auth0LockAdditionalSignUpFieldOption] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

