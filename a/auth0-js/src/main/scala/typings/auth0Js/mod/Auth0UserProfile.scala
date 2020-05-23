package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0UserProfile extends js.Object {
  var app_metadata: js.UndefOr[js.Any] = js.undefined
  var clientID: String
  var created_at: String
  var email: js.UndefOr[String] = js.undefined
  var email_verified: js.UndefOr[Boolean] = js.undefined
  var family_name: js.UndefOr[String] = js.undefined
  var gender: js.UndefOr[String] = js.undefined
  var given_name: js.UndefOr[String] = js.undefined
  var identities: js.Array[Auth0Identity]
  var locale: js.UndefOr[String] = js.undefined
  var name: String
  var nickname: String
  var picture: String
  var sub: String
  var updated_at: String
  var user_id: String
  var user_metadata: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[String] = js.undefined
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
    user_id: String,
    app_metadata: js.Any = null,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    family_name: String = null,
    gender: String = null,
    given_name: String = null,
    locale: String = null,
    user_metadata: js.Any = null,
    username: String = null
  ): Auth0UserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified.get.asInstanceOf[js.Any])
    if (family_name != null) __obj.updateDynamic("family_name")(family_name.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (given_name != null) __obj.updateDynamic("given_name")(given_name.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0UserProfile]
  }
}

