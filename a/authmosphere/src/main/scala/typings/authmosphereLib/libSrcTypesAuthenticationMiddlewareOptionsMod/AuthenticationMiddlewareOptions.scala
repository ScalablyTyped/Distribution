package typings
package authmosphereLib.libSrcTypesAuthenticationMiddlewareOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationMiddlewareOptions extends js.Object {
  var getTokenInfo: js.UndefOr[authmosphereLib.libSrcTypesGetTokenInfoMod.GetTokenInfo[js.Object]] = js.native
  var logger: js.UndefOr[authmosphereLib.libSrcTypesLoggerMod.Logger] = js.native
  var onNotAuthenticatedHandler: js.UndefOr[onNotAuthenticatedHandler] = js.native
  var publicEndpoints: js.UndefOr[js.Array[java.lang.String]] = js.native
  var tokenInfoEndpoint: java.lang.String = js.native
}

