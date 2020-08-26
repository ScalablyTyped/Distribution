package typings.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var alksAccount: String = js.native
  var alksRole: String = js.native
  var server: String = js.native
  var userid: String = js.native
}

object Account {
  @scala.inline
  def apply(alksAccount: String, alksRole: String, server: String, userid: String): Account = {
    val __obj = js.Dynamic.literal(alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setAlksAccount(value: String): Self = this.set("alksAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlksRole(value: String): Self = this.set("alksRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserid(value: String): Self = this.set("userid", value.asInstanceOf[js.Any])
  }
  
}

