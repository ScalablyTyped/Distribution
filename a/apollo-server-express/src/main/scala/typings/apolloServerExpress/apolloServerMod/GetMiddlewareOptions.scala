package typings.apolloServerExpress.apolloServerMod

import typings.bodyParser.mod.OptionsJson
import typings.cors.mod.CorsOptions
import typings.cors.mod.CorsOptionsDelegate
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMiddlewareOptions extends js.Object {
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.undefined
  var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate | Boolean] = js.undefined
  var disableHealthCheck: js.UndefOr[Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object GetMiddlewareOptions {
  @scala.inline
  def apply(
    bodyParserConfig: OptionsJson | Boolean = null,
    cors: CorsOptions | CorsOptionsDelegate | Boolean = null,
    disableHealthCheck: js.UndefOr[Boolean] = js.undefined,
    onHealthCheck: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_] = null,
    path: String = null
  ): GetMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyParserConfig != null) __obj.updateDynamic("bodyParserConfig")(bodyParserConfig.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck.get.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMiddlewareOptions]
  }
}

