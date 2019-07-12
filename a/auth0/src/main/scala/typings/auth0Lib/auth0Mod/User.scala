package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User[A, U] extends js.Object {
  var app_metadata: js.UndefOr[A] = js.undefined
  var blocked: js.UndefOr[scala.Boolean] = js.undefined
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var email_verified: js.UndefOr[scala.Boolean] = js.undefined
  var family_name: js.UndefOr[java.lang.String] = js.undefined
  var given_name: js.UndefOr[java.lang.String] = js.undefined
  var identities: js.UndefOr[js.Array[Identity]] = js.undefined
  var last_ip: js.UndefOr[java.lang.String] = js.undefined
  var last_login: js.UndefOr[java.lang.String] = js.undefined
  var logins_count: js.UndefOr[scala.Double] = js.undefined
  var multifactor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  var phone_number: js.UndefOr[java.lang.String] = js.undefined
  var phone_verified: js.UndefOr[scala.Boolean] = js.undefined
  var picture: js.UndefOr[java.lang.String] = js.undefined
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  var user_id: js.UndefOr[java.lang.String] = js.undefined
  var user_metadata: js.UndefOr[U] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object User {
  @scala.inline
  def apply[A, U](
    app_metadata: A = null,
    blocked: js.UndefOr[scala.Boolean] = js.undefined,
    created_at: java.lang.String = null,
    email: java.lang.String = null,
    email_verified: js.UndefOr[scala.Boolean] = js.undefined,
    family_name: java.lang.String = null,
    given_name: java.lang.String = null,
    identities: js.Array[Identity] = null,
    last_ip: java.lang.String = null,
    last_login: java.lang.String = null,
    logins_count: scala.Int | scala.Double = null,
    multifactor: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    nickname: java.lang.String = null,
    phone_number: java.lang.String = null,
    phone_verified: js.UndefOr[scala.Boolean] = js.undefined,
    picture: java.lang.String = null,
    updated_at: java.lang.String = null,
    user_id: java.lang.String = null,
    user_metadata: U = null,
    username: java.lang.String = null
  ): User[A, U] = {
    val __obj = js.Dynamic.literal()
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (identities != null) __obj.updateDynamic("identities")(identities)
    if (last_ip != null) __obj.updateDynamic("last_ip")(last_ip)
    if (last_login != null) __obj.updateDynamic("last_login")(last_login)
    if (logins_count != null) __obj.updateDynamic("logins_count")(logins_count.asInstanceOf[js.Any])
    if (multifactor != null) __obj.updateDynamic("multifactor")(multifactor)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[User[A, U]]
  }
}

