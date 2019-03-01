package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(email: java.lang.String = null, username: java.lang.String = null): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Email]
  }
}

