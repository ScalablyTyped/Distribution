package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRegistration extends js.Object {
  var app: expressLib.expressMod.eNs.Application
  var bodyParserConfig: js.UndefOr[bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson | scala.Boolean] = js.undefined
  var cors: js.UndefOr[corsLib.corsMod.eNs.CorsOptions | scala.Boolean] = js.undefined
  var disableHealthCheck: js.UndefOr[scala.Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, js.Promise[_]]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object ServerRegistration {
  @scala.inline
  def apply(
    app: expressLib.expressMod.eNs.Application,
    bodyParserConfig: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson | scala.Boolean = null,
    cors: corsLib.corsMod.eNs.CorsOptions | scala.Boolean = null,
    disableHealthCheck: js.UndefOr[scala.Boolean] = js.undefined,
    onHealthCheck: js.Function1[/* req */ expressLib.expressMod.eNs.Request, js.Promise[_]] = null,
    path: java.lang.String = null
  ): ServerRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    if (bodyParserConfig != null) __obj.updateDynamic("bodyParserConfig")(bodyParserConfig.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck)
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(onHealthCheck)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ServerRegistration]
  }
}

