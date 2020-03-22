package typings.authmosphere.authenticationMiddlewareOptionsMod

import typings.authmosphere.getTokenInfoMod.GetTokenInfo
import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.tokenMod.Token
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationMiddlewareOptions extends js.Object {
  var getTokenInfo: js.UndefOr[GetTokenInfo[js.Object]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var onNotAuthenticatedHandler: js.UndefOr[
    typings.authmosphere.authenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
  ] = js.undefined
  var publicEndpoints: js.UndefOr[js.Array[String]] = js.undefined
  var tokenInfoEndpoint: String
}

object AuthenticationMiddlewareOptions {
  @scala.inline
  def apply(
    tokenInfoEndpoint: String,
    getTokenInfo: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => js.Promise[Token[js.Object]] = null,
    logger: Logger = null,
    onNotAuthenticatedHandler: (/* request */ Request_[ParamsDictionary], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* logger */ Logger) => Unit = null,
    publicEndpoints: js.Array[String] = null
  ): AuthenticationMiddlewareOptions = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    if (getTokenInfo != null) __obj.updateDynamic("getTokenInfo")(js.Any.fromFunction3(getTokenInfo))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (onNotAuthenticatedHandler != null) __obj.updateDynamic("onNotAuthenticatedHandler")(js.Any.fromFunction4(onNotAuthenticatedHandler))
    if (publicEndpoints != null) __obj.updateDynamic("publicEndpoints")(publicEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationMiddlewareOptions]
  }
}

