package typings.apolloDashServerDashExpress.distApolloServerMod

import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.cors.corsMod.CorsOptions
import typings.express.expressMod.Application
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRegistration extends js.Object {
  @JSName("app")
  var app_Original: Application = js.native
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.native
  var cors: js.UndefOr[CorsOptions | Boolean] = js.native
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request, js.Promise[_]]] = js.native
  var path: js.UndefOr[String] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary],
    res: Response
  ): js.Any = js.native
  def app(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary],
    res: ServerResponse
  ): js.Any = js.native
  def app(req: IncomingMessage, res: Response): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

