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

