package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkAccountsResponseProfile extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var email_verified: js.UndefOr[Boolean] = js.undefined
  var family_name: js.UndefOr[String] = js.undefined
  var given_name: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone_number: js.UndefOr[String] = js.undefined
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object UnlinkAccountsResponseProfile {
  @scala.inline
  def apply(
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    family_name: String = null,
    given_name: String = null,
    name: String = null,
    phone_number: String = null,
    phone_verified: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): UnlinkAccountsResponseProfile = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (family_name != null) __obj.updateDynamic("family_name")(family_name)
    if (given_name != null) __obj.updateDynamic("given_name")(given_name)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UnlinkAccountsResponseProfile]
  }
}

