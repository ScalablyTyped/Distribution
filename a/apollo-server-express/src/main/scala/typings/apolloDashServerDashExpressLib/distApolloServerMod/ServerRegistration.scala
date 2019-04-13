package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRegistration extends js.Object {
  @JSName("app")
  var app_Original: expressLib.expressMod.Application = js.native
  var bodyParserConfig: js.UndefOr[bodyDashParserLib.bodyDashParserMod.OptionsJson | scala.Boolean] = js.native
  var cors: js.UndefOr[corsLib.corsMod.CorsOptions | scala.Boolean] = js.native
  var disableHealthCheck: js.UndefOr[scala.Boolean] = js.native
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.Request, js.Promise[_]]] = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def app(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
}

