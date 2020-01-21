package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(email: String = null, username: String = null): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

