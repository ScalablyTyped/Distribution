package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(email: String = null, username: String = null): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Email]
  }
}

