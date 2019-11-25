package typings.apolloDashServerDashExpress.distApolloServerMod

import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.cors.corsMod.CorsOptions
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMiddlewareOptions extends js.Object {
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.undefined
  var cors: js.UndefOr[CorsOptions | Boolean] = js.undefined
  var disableHealthCheck: js.UndefOr[Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary], js.Promise[_]]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object GetMiddlewareOptions {
  @scala.inline
  def apply(
    bodyParserConfig: OptionsJson | Boolean = null,
    cors: CorsOptions | Boolean = null,
    disableHealthCheck: js.UndefOr[Boolean] = js.undefined,
    onHealthCheck: /* req */ Request[ParamsDictionary] => js.Promise[_] = null,
    path: String = null
  ): GetMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyParserConfig != null) __obj.updateDynamic("bodyParserConfig")(bodyParserConfig.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMiddlewareOptions]
  }
}

