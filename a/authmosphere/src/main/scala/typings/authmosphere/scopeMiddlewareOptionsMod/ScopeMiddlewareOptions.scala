package typings.authmosphere.scopeMiddlewareOptionsMod

import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.precedenceMod.PrecedenceOptions
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeMiddlewareOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
  var onAuthorizationFailedHandler: js.UndefOr[typings.authmosphere.scopeMiddlewareOptionsMod.onAuthorizationFailedHandler] = js.undefined
  var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
}

object ScopeMiddlewareOptions {
  @scala.inline
  def apply(
    logger: Logger = null,
    onAuthorizationFailedHandler: (/* request */ Request_[ParamsDictionary], /* resonse */ Response_, /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit = null,
    precedenceOptions: PrecedenceOptions = null
  ): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (onAuthorizationFailedHandler != null) __obj.updateDynamic("onAuthorizationFailedHandler")(js.Any.fromFunction5(onAuthorizationFailedHandler))
    if (precedenceOptions != null) __obj.updateDynamic("precedenceOptions")(precedenceOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
}

