package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserData extends UserData[AppMetadata, UserMetadata] {
  var client_id: js.UndefOr[String] = js.native
  var connection: js.UndefOr[String] = js.native
  var verify_password: js.UndefOr[Boolean] = js.native
  var verify_phone_number: js.UndefOr[Boolean] = js.native
}

object UpdateUserData {
  @scala.inline
  def apply(): UpdateUserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserData]
  }
  @scala.inline
  implicit class UpdateUserDataOps[Self <: UpdateUserData] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setVerify_password(value: Boolean): Self = this.set("verify_password", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerify_password: Self = this.set("verify_password", js.undefined)
    @scala.inline
    def setVerify_phone_number(value: Boolean): Self = this.set("verify_phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerify_phone_number: Self = this.set("verify_phone_number", js.undefined)
  }
  
}

