package typings.authmosphere.libSrcTypesScopeMiddlewareOptionsMod

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesPrecedenceMod.PrecedenceOptions
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
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
    onAuthorizationFailedHandler: (/* request */ Request[ParamsDictionary], /* resonse */ Response, /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit = null,
    precedenceOptions: PrecedenceOptions = null
  ): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (onAuthorizationFailedHandler != null) __obj.updateDynamic("onAuthorizationFailedHandler")(js.Any.fromFunction5(onAuthorizationFailedHandler))
    if (precedenceOptions != null) __obj.updateDynamic("precedenceOptions")(precedenceOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
}

