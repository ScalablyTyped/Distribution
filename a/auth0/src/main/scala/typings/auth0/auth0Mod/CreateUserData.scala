package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserData extends UserData[AppMetadata, UserMetadata] {
  var connection: String
}

object CreateUserData {
  @scala.inline
  def apply(
    connection: String,
    app_metadata: AppMetadata = null,
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
    user_metadata: UserMetadata = null,
    username: String = null,
    verify_email: js.UndefOr[Boolean] = js.undefined
  ): CreateUserData = {
    val __obj = js.Dynamic.literal(connection = connection)
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata)
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
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    if (username != null) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(verify_email)) __obj.updateDynamic("verify_email")(verify_email)
    __obj.asInstanceOf[CreateUserData]
  }
}

