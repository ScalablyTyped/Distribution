package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControllerProvider extends IServiceProvider {
  def allowGlobals(): scala.Unit = js.native
  def register(name: java.lang.String, controllerConstructor: angularLib.angularMod.Global.Function): scala.Unit = js.native
  def register(name: java.lang.String, dependencyAnnotatedConstructor: js.Array[_]): scala.Unit = js.native
}

