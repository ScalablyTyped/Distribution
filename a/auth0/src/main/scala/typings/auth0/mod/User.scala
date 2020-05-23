package typings.auth0.mod

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
  var last_password_reset: js.UndefOr[String] = js.undefined
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
    last_password_reset: String = null,
    logins_count: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.get.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified.get.asInstanceOf[js.Any])
    if (family_name != null) __obj.updateDynamic("family_name")(family_name.asInstanceOf[js.Any])
    if (given_name != null) __obj.updateDynamic("given_name")(given_name.asInstanceOf[js.Any])
    if (identities != null) __obj.updateDynamic("identities")(identities.asInstanceOf[js.Any])
    if (last_ip != null) __obj.updateDynamic("last_ip")(last_ip.asInstanceOf[js.Any])
    if (last_login != null) __obj.updateDynamic("last_login")(last_login.asInstanceOf[js.Any])
    if (last_password_reset != null) __obj.updateDynamic("last_password_reset")(last_password_reset.asInstanceOf[js.Any])
    if (!js.isUndefined(logins_count)) __obj.updateDynamic("logins_count")(logins_count.get.asInstanceOf[js.Any])
    if (multifactor != null) __obj.updateDynamic("multifactor")(multifactor.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified.get.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User[A, U]]
  }
}

