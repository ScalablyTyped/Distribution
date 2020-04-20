package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppleID extends js.Object {
  var auth: AuthI
}

object AppleID {
  @scala.inline
  def apply(auth: AuthI): AppleID = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppleID]
  }
}

