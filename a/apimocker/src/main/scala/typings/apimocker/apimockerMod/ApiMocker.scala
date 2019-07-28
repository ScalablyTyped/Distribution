package typings.apimocker.apimockerMod

import typings.express.expressMod.Application
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiMocker extends js.Object {
  @JSName("express")
  var express_Original: Application = js.native
  var middlewares: js.Array[RequestHandler] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def express(req: Request, res: Response): js.Any = js.native
  def express(req: Request, res: ServerResponse): js.Any = js.native
  def express(req: IncomingMessage, res: Response): js.Any = js.native
  def express(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def loadConfigFile(): Unit = js.native
  def setConfigFile(file: String): ApiMocker = js.native
  /**
    * Set the route for express, in case it was not set yet
    */
  def setRoute(options: js.Any): Unit = js.native
  def setRoutes(webServices: js.Any): Unit = js.native
  /**
    * Start a new instance of API Mocker
    */
  def start(serverPort: String): ApiMocker = js.native
  def start(serverPort: String, callback: js.Function0[Unit]): ApiMocker = js.native
  def start(serverPort: Double): ApiMocker = js.native
  def start(serverPort: Double, callback: js.Function0[Unit]): ApiMocker = js.native
  /**
    * Stop the referenced instance of API Mocker
    */
  def stop(): ApiMocker = js.native
  def stop(callback: js.Function0[Unit]): ApiMocker = js.native
}

