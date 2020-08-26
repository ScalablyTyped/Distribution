package typings.alksNode.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyData extends js.Object {
  var accessKey: String = js.native
  var alksAccount: String = js.native
  var alksRole: String = js.native
  var expires: Moment = js.native
  var secretKey: String = js.native
  var sessionTime: String = js.native
  var sessionToken: String = js.native
}

object KeyData {
  @scala.inline
  def apply(
    accessKey: String,
    alksAccount: String,
    alksRole: String,
    expires: Moment,
    secretKey: String,
    sessionTime: String,
    sessionToken: String
  ): KeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionTime = sessionTime.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyData]
  }
  @scala.inline
  implicit class KeyDataOps[Self <: KeyData] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlksAccount(value: String): Self = this.set("alksAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlksRole(value: String): Self = this.set("alksRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: Moment): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionTime(value: String): Self = this.set("sessionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
  }
  
}

