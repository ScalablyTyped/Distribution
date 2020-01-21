package typings.angular.mod

import typings.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControllerProvider extends IServiceProvider {
  def allowGlobals(): Unit = js.native
  def register(name: String, controllerConstructor: Function): Unit = js.native
  def register(name: String, dependencyAnnotatedConstructor: js.Array[_]): Unit = js.native
}

