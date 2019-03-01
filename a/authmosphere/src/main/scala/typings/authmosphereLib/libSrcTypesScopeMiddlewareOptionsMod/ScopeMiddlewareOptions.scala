package typings
package authmosphereLib.libSrcTypesScopeMiddlewareOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeMiddlewareOptions extends js.Object {
  var logger: js.UndefOr[authmosphereLib.libSrcTypesLoggerMod.Logger] = js.undefined
  var onAuthorizationFailedHandler: js.UndefOr[onAuthorizationFailedHandler] = js.undefined
  var precedenceOptions: js.UndefOr[authmosphereLib.libSrcTypesPrecedenceMod.PrecedenceOptions] = js.undefined
}

object ScopeMiddlewareOptions {
  @scala.inline
  def apply(
    logger: authmosphereLib.libSrcTypesLoggerMod.Logger = null,
    onAuthorizationFailedHandler: onAuthorizationFailedHandler = null,
    precedenceOptions: authmosphereLib.libSrcTypesPrecedenceMod.PrecedenceOptions = null
  ): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (onAuthorizationFailedHandler != null) __obj.updateDynamic("onAuthorizationFailedHandler")(onAuthorizationFailedHandler)
    if (precedenceOptions != null) __obj.updateDynamic("precedenceOptions")(precedenceOptions)
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
}

