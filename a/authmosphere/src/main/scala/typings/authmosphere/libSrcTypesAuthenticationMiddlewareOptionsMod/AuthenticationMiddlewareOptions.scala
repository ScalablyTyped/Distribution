package typings.authmosphere.libSrcTypesAuthenticationMiddlewareOptionsMod

import typings.authmosphere.libSrcTypesGetTokenInfoMod.GetTokenInfo
import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesTokenMod.Token
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationMiddlewareOptions extends js.Object {
  var getTokenInfo: js.UndefOr[GetTokenInfo[js.Object]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var onNotAuthenticatedHandler: js.UndefOr[
    typings.authmosphere.libSrcTypesAuthenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
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
    onNotAuthenticatedHandler: (/* request */ Request[ParamsDictionary], /* resonse */ Response, /* next */ NextFunction, /* logger */ Logger) => Unit = null,
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

