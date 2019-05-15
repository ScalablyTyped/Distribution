package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserData extends UserData[AppMetadata, UserMetadata] {
  var blocked: js.UndefOr[scala.Boolean] = js.undefined
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var connection: js.UndefOr[java.lang.String] = js.undefined
  var verify_password: js.UndefOr[scala.Boolean] = js.undefined
  var verify_phone_number: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateUserData {
  @scala.inline
  def apply(
    app_metadata: AppMetadata = null,
    blocked: js.UndefOr[scala.Boolean] = js.undefined,
    client_id: java.lang.String = null,
    connection: java.lang.String = null,
    email: java.lang.String = null,
    email_verified: js.UndefOr[scala.Boolean] = js.undefined,
    family_name: java.lang.String = null,
    given_name: java.lang.String = null,
    name: java.lang.String = null,
    password: java.lang.String = null,
    phone_number: java.lang.String = null,
    phone_verified: js.UndefOr[scala.Boolean] = js.undefined,
    user_metadata: UserMetadata = null,
    username: java.lang.String = null,
    verify_email: js.UndefOr[scala.Boolean] = js.undefined,
    verify_password: js.UndefOr[scala.Boolean] = js.undefined,
    verify_phone_number: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateUserData = {
    val __obj = js.Dynamic.literal()
    if (app_metadata != null) __obj.updateDynamic("app_metadata")(app_metadata)
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (name != null) __obj.updateDynamic("name")(name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    if (username != null) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(verify_email)) __obj.updateDynamic("verify_email")(verify_email)
    if (!js.isUndefined(verify_password)) __obj.updateDynamic("verify_password")(verify_password)
    if (!js.isUndefined(verify_phone_number)) __obj.updateDynamic("verify_phone_number")(verify_phone_number)
    __obj.asInstanceOf[UpdateUserData]
  }
}

