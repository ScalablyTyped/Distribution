package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAuthOptions extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var autoParseHash: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[Auth0LockAuthParamsOptions] = js.undefined
  var redirect: js.UndefOr[Boolean] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var responseMode: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var sso: js.UndefOr[Boolean] = js.undefined
}

object Auth0LockAuthOptions {
  @scala.inline
  def apply(
    audience: String = null,
    autoParseHash: js.UndefOr[Boolean] = js.undefined,
    params: Auth0LockAuthParamsOptions = null,
    redirect: js.UndefOr[Boolean] = js.undefined,
    redirectUrl: String = null,
    responseMode: String = null,
    responseType: String = null,
    sso: js.UndefOr[Boolean] = js.undefined
  ): Auth0LockAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (!js.isUndefined(autoParseHash)) __obj.updateDynamic("autoParseHash")(autoParseHash)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (!js.isUndefined(sso)) __obj.updateDynamic("sso")(sso)
    __obj.asInstanceOf[Auth0LockAuthOptions]
  }
}

