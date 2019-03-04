package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0UserProfile extends js.Object {
  var app_metadata: js.UndefOr[js.Any] = js.undefined
  var clientID: java.lang.String
  var created_at: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var email_verified: js.UndefOr[scala.Boolean] = js.undefined
  var family_name: js.UndefOr[java.lang.String] = js.undefined
  var gender: js.UndefOr[java.lang.String] = js.undefined
  var given_name: js.UndefOr[java.lang.String] = js.undefined
  var identities: js.Array[Auth0Identity]
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var nickname: java.lang.String
  var picture: java.lang.String
  var sub: java.lang.String
  var updated_at: java.lang.String
  var user_id: java.lang.String
  var user_metadata: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0UserProfile {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    created_at: java.lang.String,
    identities: js.Array[Auth0Identity],
    name: java.lang.String,
    nickname: java.lang.String,
    picture: java.lang.String,
    sub: java.lang.String,
    updated_at: java.lang.String,
    user_id: java.lang.String,
    app_metadata: js.Any = null,
    email: java.lang.String = null,
    email_verified: js.UndefOr[scala.Boolean] = js.undefined,
    family_name: java.lang.String = null,
    gender: java.lang.String = null,
    given_name: java.lang.String = null,
    locale: java.lang.String = null,
    user_metadata: js.Any = null,
    username: java.lang.String = null
  ): Auth0UserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID, created_at = created_at, identities = identities, name = name, nickname = nickname, picture = picture, sub = sub, updated_at = updated_at, user_id = user_id)
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Auth0UserProfile]
  }
}

