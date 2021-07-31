package typings.angular.mod

import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControllerProvider
  extends StObject
     with IServiceProvider {
  
  def register(name: String, controllerConstructor: Function): Unit = js.native
  def register(name: String, dependencyAnnotatedConstructor: js.Array[js.Any]): Unit = js.native
}
