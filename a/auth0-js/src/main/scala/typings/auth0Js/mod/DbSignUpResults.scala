package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbSignUpResults extends js.Object {
  /** user's email */
  var email: String = js.native
  /** if the user's email was verified */
  var emailVerified: Boolean = js.native
}

object DbSignUpResults {
  @scala.inline
  def apply(email: String, emailVerified: Boolean): DbSignUpResults = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbSignUpResults]
  }
  @scala.inline
  implicit class DbSignUpResultsOps[Self <: DbSignUpResults] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
  }
  
}

