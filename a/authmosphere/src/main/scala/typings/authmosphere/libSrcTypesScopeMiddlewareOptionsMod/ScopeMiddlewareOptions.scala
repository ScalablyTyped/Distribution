package typings.authmosphere.libSrcTypesScopeMiddlewareOptionsMod

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesPrecedenceMod.PrecedenceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeMiddlewareOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
  var onAuthorizationFailedHandler: js.UndefOr[
    typings.authmosphere.libSrcTypesScopeMiddlewareOptionsMod.onAuthorizationFailedHandler
  ] = js.undefined
  var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
}

object ScopeMiddlewareOptions {
  @scala.inline
  def apply(
    logger: Logger = null,
    onAuthorizationFailedHandler: onAuthorizationFailedHandler = null,
    precedenceOptions: PrecedenceOptions = null
  ): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (onAuthorizationFailedHandler != null) __obj.updateDynamic("onAuthorizationFailedHandler")(onAuthorizationFailedHandler)
    if (precedenceOptions != null) __obj.updateDynamic("precedenceOptions")(precedenceOptions)
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
}

