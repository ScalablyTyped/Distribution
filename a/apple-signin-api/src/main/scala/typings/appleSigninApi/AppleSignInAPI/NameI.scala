package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/namei
trait NameI extends js.Object {
  var firstName: String
  var lastName: String
}

object NameI {
  @scala.inline
  def apply(firstName: String, lastName: String): NameI = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameI]
  }
}

