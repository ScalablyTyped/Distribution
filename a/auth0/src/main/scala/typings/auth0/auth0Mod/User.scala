package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User[A, U] extends js.Object {
  var app_metadata: js.UndefOr[A] = js.undefined
  var blocked: js.UndefOr[Boolean] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var email_verified: js.UndefOr[Boolean] = js.undefined
  var family_name: js.UndefOr[String] = js.undefined
  var given_name: js.UndefOr[String] = js.undefined
  var identities: js.UndefOr[js.Array[Identity]] = js.undefined
  var last_ip: js.UndefOr[String] = js.undefined
  var last_login: js.UndefOr[String] = js.undefined
  var logins_count: js.UndefOr[Double] = js.undefined
  var multifactor: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nickname: js.UndefOr[String] = js.undefined
  var phone_number: js.UndefOr[String] = js.undefined
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  var picture: js.UndefOr[String] = js.undefined
  var updated_at: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
  var user_metadata: js.UndefOr[U] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply[A, U](
    app_metadata: A = null,
    blocked: js.UndefOr[Boolean] = js.undefined,
    created_at: String = null,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    family_name: String = null,
    given_name: String = null,
    identities: js.Array[Identity] = null,
    last_ip: String = null,
    last_login: String = null,
    logins_count: Int | Double = null,
    multifactor: js.Array[String] = null,
    name: String = null,
    nickname: String = null,
    phone_number: String = null,
    phone_verified: js.UndefOr[Boolean] = js.undefined,
    picture: String = null,
    updated_at: String = null,
    user_id: String = null,
    user_metadata: U = null,
    username: String = null
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

