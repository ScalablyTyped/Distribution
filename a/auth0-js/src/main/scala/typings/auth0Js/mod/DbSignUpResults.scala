package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbSignUpResults extends js.Object {
  /** user's email */
  var email: String
  /** if the user's email was verified */
  var emailVerified: Boolean
}

object DbSignUpResults {
  @scala.inline
  def apply(email: String, emailVerified: Boolean): DbSignUpResults = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DbSignUpResults]
  }
}

