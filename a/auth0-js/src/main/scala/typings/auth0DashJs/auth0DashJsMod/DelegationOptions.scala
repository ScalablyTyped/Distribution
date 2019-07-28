package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegationOptions extends js.Object {
  var api_type: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var grant_type: String
  var id_token: js.UndefOr[String] = js.undefined
  var refresh_token: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object DelegationOptions {
  @scala.inline
  def apply(
    grant_type: String,
    api_type: String = null,
    client_id: String = null,
    id_token: String = null,
    refresh_token: String = null,
    scope: String = null,
    target: String = null
  ): DelegationOptions = {
    val __obj = js.Dynamic.literal(grant_type = grant_type)
    if (api_type != null) __obj.updateDynamic("api_type")(api_type)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DelegationOptions]
  }
}

