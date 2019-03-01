package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Office365UserProfile extends Auth0UserProfile {
  var tenantid: java.lang.String
  var upn: java.lang.String
}

object Office365UserProfile {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    created_at: java.lang.String,
    identities: js.Array[Auth0Identity],
    name: java.lang.String,
    nickname: java.lang.String,
    picture: java.lang.String,
    sub: java.lang.String,
    tenantid: java.lang.String,
    updated_at: java.lang.String,
    upn: java.lang.String,
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
  ): Office365UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("identities")(identities)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nickname")(nickname)
    __obj.updateDynamic("picture")(picture)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("tenantid")(tenantid)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("upn")(upn)
    __obj.updateDynamic("user_id")(user_id)
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Office365UserProfile]
  }
}

