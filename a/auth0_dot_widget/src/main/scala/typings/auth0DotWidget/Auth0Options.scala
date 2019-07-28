package typings.auth0DotWidget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Options extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var connections: js.UndefOr[js.Array[String]] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var enableReturnUserExperience: js.UndefOr[Boolean] = js.undefined
  var extraParameters: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var request_id: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var showForgot: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showSignup: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var userPwdConnectionName: js.UndefOr[String] = js.undefined
  var username_style: js.UndefOr[String] = js.undefined
}

object Auth0Options {
  @scala.inline
  def apply(
    access_token: String = null,
    connections: js.Array[String] = null,
    container: String = null,
    enableReturnUserExperience: js.UndefOr[Boolean] = js.undefined,
    extraParameters: js.Any = null,
    icon: String = null,
    protocol: String = null,
    request_id: String = null,
    scope: String = null,
    showForgot: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showSignup: js.UndefOr[Boolean] = js.undefined,
    state: js.Any = null,
    userPwdConnectionName: String = null,
    username_style: String = null
  ): Auth0Options = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(enableReturnUserExperience)) __obj.updateDynamic("enableReturnUserExperience")(enableReturnUserExperience)
    if (extraParameters != null) __obj.updateDynamic("extraParameters")(extraParameters)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(showForgot)) __obj.updateDynamic("showForgot")(showForgot)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showSignup)) __obj.updateDynamic("showSignup")(showSignup)
    if (state != null) __obj.updateDynamic("state")(state)
    if (userPwdConnectionName != null) __obj.updateDynamic("userPwdConnectionName")(userPwdConnectionName)
    if (username_style != null) __obj.updateDynamic("username_style")(username_style)
    __obj.asInstanceOf[Auth0Options]
  }
}

