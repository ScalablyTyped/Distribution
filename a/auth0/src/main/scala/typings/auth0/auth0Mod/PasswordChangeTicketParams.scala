package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordChangeTicketParams extends js.Object {
  var connection_id: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var includeEmailInRedirect: js.UndefOr[Boolean] = js.undefined
  var mark_email_as_verified: js.UndefOr[Boolean] = js.undefined
  var new_password: js.UndefOr[String] = js.undefined
  var result_url: js.UndefOr[String] = js.undefined
  var ttl_sec: js.UndefOr[Double] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object PasswordChangeTicketParams {
  @scala.inline
  def apply(
    connection_id: String = null,
    email: String = null,
    includeEmailInRedirect: js.UndefOr[Boolean] = js.undefined,
    mark_email_as_verified: js.UndefOr[Boolean] = js.undefined,
    new_password: String = null,
    result_url: String = null,
    ttl_sec: Int | Double = null,
    user_id: String = null
  ): PasswordChangeTicketParams = {
    val __obj = js.Dynamic.literal()
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(includeEmailInRedirect)) __obj.updateDynamic("includeEmailInRedirect")(includeEmailInRedirect)
    if (!js.isUndefined(mark_email_as_verified)) __obj.updateDynamic("mark_email_as_verified")(mark_email_as_verified)
    if (new_password != null) __obj.updateDynamic("new_password")(new_password)
    if (result_url != null) __obj.updateDynamic("result_url")(result_url)
    if (ttl_sec != null) __obj.updateDynamic("ttl_sec")(ttl_sec.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[PasswordChangeTicketParams]
  }
}

