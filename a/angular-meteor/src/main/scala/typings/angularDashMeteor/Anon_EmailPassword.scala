package typings.angularDashMeteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailPassword extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var password: String
  var profile: js.UndefOr[js.Object] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_EmailPassword {
  @scala.inline
  def apply(password: String, email: String = null, profile: js.Object = null, username: String = null): Anon_EmailPassword = {
    val __obj = js.Dynamic.literal(password = password)
    if (email != null) __obj.updateDynamic("email")(email)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_EmailPassword]
  }
}

