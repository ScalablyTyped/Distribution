package typings.angular.angularMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControllerService extends js.Object {
  def apply[T](controllerConstructor: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def apply[T](controllerConstructor: js.Function1[/* repeated */ js.Any, T], locals: js.Any): T = js.native
  // Although the documentation doesn't state this, locals are optional
  def apply[T](controllerConstructor: Instantiable1[/* args (repeated) */ js.Any, T]): T = js.native
  def apply[T](controllerConstructor: Instantiable1[/* args (repeated) */ js.Any, T], locals: js.Any): T = js.native
  def apply[T](controllerName: String): T = js.native
  def apply[T](controllerName: String, locals: js.Any): T = js.native
}

