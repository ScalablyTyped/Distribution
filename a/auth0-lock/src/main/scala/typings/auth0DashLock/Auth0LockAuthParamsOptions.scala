package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://auth0.com/docs/libraries/lock/v10/sending-authentication-parameters
trait Auth0LockAuthParamsOptions extends js.Object {
  var access_token: js.UndefOr[js.Any] = js.undefined
  var connection_scopes: js.UndefOr[js.Any] = js.undefined
  var device: js.UndefOr[js.Any] = js.undefined
  var nonce: js.UndefOr[js.Any] = js.undefined
  var protocol: js.UndefOr[js.Any] = js.undefined
  var request_id: js.UndefOr[js.Any] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Auth0LockAuthParamsOptions {
  @scala.inline
  def apply(
    access_token: js.Any = null,
    connection_scopes: js.Any = null,
    device: js.Any = null,
    nonce: js.Any = null,
    protocol: js.Any = null,
    request_id: js.Any = null,
    scope: String = null,
    state: String = null
  ): Auth0LockAuthParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (connection_scopes != null) __obj.updateDynamic("connection_scopes")(connection_scopes.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAuthParamsOptions]
  }
}

