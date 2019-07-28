package typings.apimocker.apimockerMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apimocker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val middlewares: js.Array[RequestHandler] = js.native
  def createServer(): ApiMocker = js.native
  def createServer(options: ConfigOptions): ApiMocker = js.native
  def setConfigFile(file: String): ApiMocker = js.native
  def start(serverPort: String): ApiMocker = js.native
  def start(serverPort: String, callback: js.Function0[Unit]): ApiMocker = js.native
  def start(serverPort: Double): ApiMocker = js.native
  def start(serverPort: Double, callback: js.Function0[Unit]): ApiMocker = js.native
  def stop(): ApiMocker = js.native
  def stop(callback: js.Function0[Unit]): ApiMocker = js.native
}

