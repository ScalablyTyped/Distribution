package typings.angular.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControllerService extends StObject {
  
  def apply[T](controllerConstructor: js.Function1[/* repeated */ Any, T]): T = js.native
  def apply[T](controllerConstructor: js.Function1[/* repeated */ Any, T], locals: Any): T = js.native
  // Although the documentation doesn't state this, locals are optional
  def apply[T](controllerConstructor: Instantiable1[/* args (repeated) */ Any, T]): T = js.native
  def apply[T](controllerConstructor: Instantiable1[/* args (repeated) */ Any, T], locals: Any): T = js.native
  def apply[T](controllerName: String): T = js.native
  def apply[T](controllerName: String, locals: Any): T = js.native
}
