package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ComponentFactoryResolver")
@js.native
abstract class ComponentFactoryResolver () extends js.Object {
  
  /**
    * Retrieves the factory object that creates a component of the given type.
    * @param component The component type.
    */
  def resolveComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
}
/* static members */
@JSImport("@angular/core", "ComponentFactoryResolver")
@js.native
object ComponentFactoryResolver extends js.Object {
  
  var NULL: ComponentFactoryResolver = js.native
}
