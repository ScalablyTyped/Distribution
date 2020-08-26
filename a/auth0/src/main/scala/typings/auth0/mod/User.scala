package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User[A, U] extends js.Object {
  var app_metadata: js.UndefOr[A] = js.native
  var blocked: js.UndefOr[Boolean] = js.native
  var created_at: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var email_verified: js.UndefOr[Boolean] = js.native
  var family_name: js.UndefOr[String] = js.native
  var given_name: js.UndefOr[String] = js.native
  var identities: js.UndefOr[js.Array[Identity]] = js.native
  var last_ip: js.UndefOr[String] = js.native
  var last_login: js.UndefOr[String] = js.native
  var last_password_reset: js.UndefOr[String] = js.native
  var logins_count: js.UndefOr[Double] = js.native
  var multifactor: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var nickname: js.UndefOr[String] = js.native
  var phone_number: js.UndefOr[String] = js.native
  var phone_verified: js.UndefOr[Boolean] = js.native
  var picture: js.UndefOr[String] = js.native
  var updated_at: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[String] = js.native
  var user_metadata: js.UndefOr[U] = js.native
  var username: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply[A, U](): User[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User[A, U]]
  }
  @scala.inline
  implicit class UserOps[Self <: User[_, _], A, U] (val x: Self with (User[A, U])) extends AnyVal {
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
    def setApp_metadata(value: A): Self = this.set("app_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_metadata: Self = this.set("app_metadata", js.undefined)
    @scala.inline
    def setBlocked(value: Boolean): Self = this.set("blocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocked: Self = this.set("blocked", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmail_verified(value: Boolean): Self = this.set("email_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail_verified: Self = this.set("email_verified", js.undefined)
    @scala.inline
    def setFamily_name(value: String): Self = this.set("family_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily_name: Self = this.set("family_name", js.undefined)
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = this.set("identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: js.Array[Identity]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentities: Self = this.set("identities", js.undefined)
    @scala.inline
    def setLast_ip(value: String): Self = this.set("last_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_ip: Self = this.set("last_ip", js.undefined)
    @scala.inline
    def setLast_login(value: String): Self = this.set("last_login", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_login: Self = this.set("last_login", js.undefined)
    @scala.inline
    def setLast_password_reset(value: String): Self = this.set("last_password_reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_password_reset: Self = this.set("last_password_reset", js.undefined)
    @scala.inline
    def setLogins_count(value: Double): Self = this.set("logins_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogins_count: Self = this.set("logins_count", js.undefined)
    @scala.inline
    def setMultifactorVarargs(value: String*): Self = this.set("multifactor", js.Array(value :_*))
    @scala.inline
    def setMultifactor(value: js.Array[String]): Self = this.set("multifactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultifactor: Self = this.set("multifactor", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    @scala.inline
    def setPhone_verified(value: Boolean): Self = this.set("phone_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone_verified: Self = this.set("phone_verified", js.undefined)
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
    @scala.inline
    def setUser_metadata(value: U): Self = this.set("user_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_metadata: Self = this.set("user_metadata", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

