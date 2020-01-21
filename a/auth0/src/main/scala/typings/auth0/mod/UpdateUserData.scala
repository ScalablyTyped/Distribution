package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserData extends UserData[AppMetadata, UserMetadata] {
  var client_id: js.UndefOr[String] = js.undefined
  var connection: js.UndefOr[String] = js.undefined
  var verify_password: js.UndefOr[Boolean] = js.undefined
  var verify_phone_number: js.UndefOr[Boolean] = js.undefined
}

object UpdateUserData {
  @scala.inline
  def apply(
    app_metadata: AppMetadata = null,
    blocked: js.UndefOr[Boolean] = js.undefined,
    client_id: String = null,
    connection: String = null,
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
    user_metadata: UserMetadata = null,
    username: String = null,
    verify_email: js.UndefOr[Boolean] = js.undefined,
    verify_password: js.UndefOr[Boolean] = js.undefined,
    verify_phone_number: js.UndefOr[Boolean] = js.undefined
  ): UpdateUserData = {
    val __obj = js.Dynamic.literal()
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified.asInstanceOf[js.Any])
    if (family_name != null) __obj.updateDynamic("family_name")(family_name.asInstanceOf[js.Any])
    if (given_name != null) __obj.updateDynamic("given_name")(given_name.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(verify_email)) __obj.updateDynamic("verify_email")(verify_email.asInstanceOf[js.Any])
    if (!js.isUndefined(verify_password)) __obj.updateDynamic("verify_password")(verify_password.asInstanceOf[js.Any])
    if (!js.isUndefined(verify_phone_number)) __obj.updateDynamic("verify_phone_number")(verify_phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserData]
  }
}

