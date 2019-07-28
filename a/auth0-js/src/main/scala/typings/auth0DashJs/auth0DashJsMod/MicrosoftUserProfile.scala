package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrosoftUserProfile extends Auth0UserProfile {
  var emails: js.UndefOr[js.Array[String]] = js.undefined
}

object MicrosoftUserProfile {
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
    user_id: String,
    app_metadata: js.Any = null,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    emails: js.Array[String] = null,
    family_name: String = null,
    gender: String = null,
    given_name: String = null,
    locale: String = null,
    user_metadata: js.Any = null,
    username: String = null
  ): MicrosoftUserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID, created_at = created_at, identities = identities, name = name, nickname = nickname, picture = picture, sub = sub, updated_at = updated_at, user_id = user_id)
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[MicrosoftUserProfile]
  }
}

