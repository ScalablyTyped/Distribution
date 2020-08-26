package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlinkAccountsResponse extends js.Object {
  var access_token: js.UndefOr[String] = js.native
  var connection: String = js.native
  var isSocial: js.UndefOr[Boolean] = js.native
  var profileData: js.UndefOr[UnlinkAccountsResponseProfile] = js.native
  var provider: String = js.native
  var user_id: String = js.native
}

object UnlinkAccountsResponse {
  @scala.inline
  def apply(connection: String, provider: String, user_id: String): UnlinkAccountsResponse = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkAccountsResponse]
  }
  @scala.inline
  implicit class UnlinkAccountsResponseOps[Self <: UnlinkAccountsResponse] (val x: Self) extends AnyVal {
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setIsSocial(value: Boolean): Self = this.set("isSocial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSocial: Self = this.set("isSocial", js.undefined)
    @scala.inline
    def setProfileData(value: UnlinkAccountsResponseProfile): Self = this.set("profileData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileData: Self = this.set("profileData", js.undefined)
  }
  
}

