package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegationOptions extends js.Object {
  var api_type: js.UndefOr[java.lang.String] = js.undefined
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var grant_type: java.lang.String
  var id_token: js.UndefOr[java.lang.String] = js.undefined
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object DelegationOptions {
  @scala.inline
  def apply(
    grant_type: java.lang.String,
    api_type: java.lang.String = null,
    client_id: java.lang.String = null,
    id_token: java.lang.String = null,
    refresh_token: java.lang.String = null,
    scope: java.lang.String = null,
    target: java.lang.String = null
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

