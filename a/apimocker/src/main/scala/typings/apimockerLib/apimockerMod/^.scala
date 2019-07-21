package typings
package apimockerLib.apimockerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apimocker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val middlewares: js.Array[expressLib.expressMod.RequestHandler] = js.native
  def createServer(): ApiMocker = js.native
  def createServer(options: ConfigOptions): ApiMocker = js.native
  def setConfigFile(file: java.lang.String): ApiMocker = js.native
  def start(serverPort: java.lang.String): ApiMocker = js.native
  def start(serverPort: java.lang.String, callback: js.Function0[scala.Unit]): ApiMocker = js.native
  def start(serverPort: scala.Double): ApiMocker = js.native
  def start(serverPort: scala.Double, callback: js.Function0[scala.Unit]): ApiMocker = js.native
  def stop(): ApiMocker = js.native
  def stop(callback: js.Function0[scala.Unit]): ApiMocker = js.native
}

