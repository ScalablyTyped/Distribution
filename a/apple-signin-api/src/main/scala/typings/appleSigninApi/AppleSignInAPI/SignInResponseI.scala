package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/signinresponsei
trait SignInResponseI extends js.Object {
  var authorization: AuthorizationI
  var user: js.UndefOr[UserI] = js.undefined
}

object SignInResponseI {
  @scala.inline
  def apply(authorization: AuthorizationI, user: UserI = null): SignInResponseI = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInResponseI]
  }
}

