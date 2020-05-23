package typings.angularMeteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var password: String
  var profile: js.UndefOr[js.Object] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Password {
  @scala.inline
  def apply(password: String, email: String = null, profile: js.Object = null, username: String = null): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

