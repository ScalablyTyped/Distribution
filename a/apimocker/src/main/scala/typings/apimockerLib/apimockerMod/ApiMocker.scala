package typings
package apimockerLib.apimockerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiMocker extends js.Object {
  @JSName("express")
  var express_Original: expressLib.expressMod.Application = js.native
  var middlewares: js.Array[expressLib.expressMod.RequestHandler] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def express(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def express(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def express(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def express(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  def loadConfigFile(): scala.Unit = js.native
  def setConfigFile(file: java.lang.String): ApiMocker = js.native
  /**
    * Set the route for express, in case it was not set yet
    */
  def setRoute(options: js.Any): scala.Unit = js.native
  def setRoutes(webServices: js.Any): scala.Unit = js.native
  /**
    * Start a new instance of API Mocker
    */
  def start(serverPort: java.lang.String): ApiMocker = js.native
  def start(serverPort: java.lang.String, callback: js.Function0[scala.Unit]): ApiMocker = js.native
  def start(serverPort: scala.Double): ApiMocker = js.native
  def start(serverPort: scala.Double, callback: js.Function0[scala.Unit]): ApiMocker = js.native
  /**
    * Stop the referenced instance of API Mocker
    */
  def stop(): ApiMocker = js.native
  def stop(callback: js.Function0[scala.Unit]): ApiMocker = js.native
}

