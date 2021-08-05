package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ComponentFactoryResolver")
@js.native
abstract class ComponentFactoryResolver () extends StObject {
  
  /**
    * Retrieves the factory object that creates a component of the given type.
    * @param component The component type.
    */
  def resolveComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
}
/* static members */
object ComponentFactoryResolver {
  
  @JSImport("@angular/core", "ComponentFactoryResolver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "ComponentFactoryResolver.NULL")
  @js.native
  def NULL: ComponentFactoryResolver = js.native
  inline def NULL_=(x: ComponentFactoryResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
}
