package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://auth0.com/docs/libraries/lock/v10/sending-authentication-parameters
@js.native
trait Auth0LockAuthParamsOptions extends js.Object {
  var access_token: js.UndefOr[js.Any] = js.native
  var connection_scope: js.UndefOr[js.Any] = js.native
  var device: js.UndefOr[js.Any] = js.native
  var nonce: js.UndefOr[js.Any] = js.native
  var protocol: js.UndefOr[js.Any] = js.native
  var request_id: js.UndefOr[js.Any] = js.native
  var scope: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object Auth0LockAuthParamsOptions {
  @scala.inline
  def apply(): Auth0LockAuthParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockAuthParamsOptions]
  }
  @scala.inline
  implicit class Auth0LockAuthParamsOptionsOps[Self <: Auth0LockAuthParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess_token(value: js.Any): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setConnection_scope(value: js.Any): Self = this.set("connection_scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection_scope: Self = this.set("connection_scope", js.undefined)
    @scala.inline
    def setDevice(value: js.Any): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setNonce(value: js.Any): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setProtocol(value: js.Any): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRequest_id(value: js.Any): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_id: Self = this.set("request_id", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

