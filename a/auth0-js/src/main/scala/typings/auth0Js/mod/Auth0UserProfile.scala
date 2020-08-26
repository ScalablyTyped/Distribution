package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0UserProfile extends js.Object {
  var app_metadata: js.UndefOr[js.Any] = js.native
  var clientID: String = js.native
  var created_at: String = js.native
  var email: js.UndefOr[String] = js.native
  var email_verified: js.UndefOr[Boolean] = js.native
  var family_name: js.UndefOr[String] = js.native
  var gender: js.UndefOr[String] = js.native
  var given_name: js.UndefOr[String] = js.native
  var identities: js.Array[Auth0Identity] = js.native
  var locale: js.UndefOr[String] = js.native
  var name: String = js.native
  var nickname: String = js.native
  var picture: String = js.native
  var sub: String = js.native
  var updated_at: String = js.native
  var user_id: String = js.native
  var user_metadata: js.UndefOr[js.Any] = js.native
  var username: js.UndefOr[String] = js.native
}

object Auth0UserProfile {
  @scala.inline
  def apply(
    clientID: String,
    created_at: String,
    identities: js.Array[Auth0Identity],
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updated_at: String,
    user_id: String
  ): Auth0UserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0UserProfile]
  }
  @scala.inline
  implicit class Auth0UserProfileOps[Self <: Auth0UserProfile] (val x: Self) extends AnyVal {
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentitiesVarargs(value: Auth0Identity*): Self = this.set("identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: js.Array[Auth0Identity]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_metadata(value: js.Any): Self = this.set("app_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_metadata: Self = this.set("app_metadata", js.undefined)
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
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setUser_metadata(value: js.Any): Self = this.set("user_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_metadata: Self = this.set("user_metadata", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

