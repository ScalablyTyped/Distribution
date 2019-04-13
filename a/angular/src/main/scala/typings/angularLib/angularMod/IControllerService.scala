package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControllerService extends js.Object {
  def apply[T](controllerConstructor: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def apply[T](controllerConstructor: js.Function1[/* repeated */ js.Any, T], locals: js.Any): T = js.native
  // Although the documentation doesn't state this, locals are optional
  def apply[T](controllerConstructor: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): T = js.native
  def apply[T](
    controllerConstructor: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T],
    locals: js.Any
  ): T = js.native
  def apply[T](controllerName: java.lang.String): T = js.native
  def apply[T](controllerName: java.lang.String, locals: js.Any): T = js.native
}

