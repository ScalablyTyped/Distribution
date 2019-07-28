package typings.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var email_verified: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone_number: js.UndefOr[String] = js.undefined
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  var request_language: js.UndefOr[String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    phone_number: String = null,
    phone_verified: js.UndefOr[Boolean] = js.undefined,
    request_language: String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (!js.isUndefined(phone_verified)) __obj.updateDynamic("phone_verified")(phone_verified)
    if (request_language != null) __obj.updateDynamic("request_language")(request_language)
    __obj.asInstanceOf[Anon_Email]
  }
}

