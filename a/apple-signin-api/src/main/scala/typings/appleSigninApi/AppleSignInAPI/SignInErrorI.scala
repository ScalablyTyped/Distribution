package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/signinerrori
trait SignInErrorI extends js.Object {
  var error: String
}

object SignInErrorI {
  @scala.inline
  def apply(error: String): SignInErrorI = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInErrorI]
  }
}

