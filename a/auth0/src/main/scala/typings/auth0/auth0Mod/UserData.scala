package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData[A, U] extends js.Object {
  var app_metadata: js.UndefOr[A] = js.undefined
  var blocked: js.UndefOr[Boolean] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var email_verified: js.UndefOr[Boolean] = js.undefined
  var family_name: js.UndefOr[String] = js.undefined
  var given_name: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nickname: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var phone_number: js.UndefOr[String] = js.undefined
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  var picture: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
  var user_metadata: js.UndefOr[U] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var verify_email: js.UndefOr[Boolean] = js.undefined
}

object UserData {
  @scala.inline
  def apply[A, U](
    app_metadata: A = null,
    blocked: js.UndefOr[Boolean] = js.undefined,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    family_name: String = null,
    given_name: String = null,
    name: String = null,
    nickname: String = null,
    password: String = null,
    phone_number: String = null,
    phone_verified: js.UndefOr[Boolean] = js.undefined,
    picture: String = null,
    user_id: String = null,
    user_metadata: U = null,
    username: String = null,
    verify_email: js.UndefOr[Boolean] = js.undefined
  ): UserData[A, U] = {
    val __obj = js.Dynamic.literal()
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(verify_email)) __obj.updateDynamic("verify_email")(verify_email)
    __obj.asInstanceOf[UserData[A, U]]
  }
}

