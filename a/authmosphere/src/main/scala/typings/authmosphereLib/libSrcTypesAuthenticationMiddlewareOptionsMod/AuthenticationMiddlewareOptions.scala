package typings
package authmosphereLib.libSrcTypesAuthenticationMiddlewareOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationMiddlewareOptions extends js.Object {
  var getTokenInfo: js.UndefOr[authmosphereLib.libSrcTypesGetTokenInfoMod.GetTokenInfo[js.Object]] = js.undefined
  var logger: js.UndefOr[authmosphereLib.libSrcTypesLoggerMod.Logger] = js.undefined
  var onNotAuthenticatedHandler: js.UndefOr[onNotAuthenticatedHandler] = js.undefined
  var publicEndpoints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tokenInfoEndpoint: java.lang.String
}

object AuthenticationMiddlewareOptions {
  @scala.inline
  def apply(
    tokenInfoEndpoint: java.lang.String,
    getTokenInfo: authmosphereLib.libSrcTypesGetTokenInfoMod.GetTokenInfo[js.Object] = null,
    logger: authmosphereLib.libSrcTypesLoggerMod.Logger = null,
    onNotAuthenticatedHandler: onNotAuthenticatedHandler = null,
    publicEndpoints: js.Array[java.lang.String] = null
  ): AuthenticationMiddlewareOptions = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint)
    if (getTokenInfo != null) __obj.updateDynamic("getTokenInfo")(getTokenInfo)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (onNotAuthenticatedHandler != null) __obj.updateDynamic("onNotAuthenticatedHandler")(onNotAuthenticatedHandler)
    if (publicEndpoints != null) __obj.updateDynamic("publicEndpoints")(publicEndpoints)
    __obj.asInstanceOf[AuthenticationMiddlewareOptions]
  }
}

