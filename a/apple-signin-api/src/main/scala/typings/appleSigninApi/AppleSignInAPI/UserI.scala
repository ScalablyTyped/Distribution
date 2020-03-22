package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/useri
trait UserI extends js.Object {
  var email: String
  var name: NameI
}

object UserI {
  @scala.inline
  def apply(email: String, name: NameI): UserI = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserI]
  }
}

