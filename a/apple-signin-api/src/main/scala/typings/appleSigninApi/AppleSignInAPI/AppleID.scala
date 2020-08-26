package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppleID extends js.Object {
  var auth: AuthI = js.native
}

object AppleID {
  @scala.inline
  def apply(auth: AuthI): AppleID = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppleID]
  }
  @scala.inline
  implicit class AppleIDOps[Self <: AppleID] (val x: Self) extends AnyVal {
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
    def setAuth(value: AuthI): Self = this.set("auth", value.asInstanceOf[js.Any])
  }
  
}

