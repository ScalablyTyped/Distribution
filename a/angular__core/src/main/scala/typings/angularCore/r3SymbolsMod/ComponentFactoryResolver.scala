package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple registry that maps `Components` to generated `ComponentFactory` classes
  * that can be used to create instances of components.
  * Use to obtain the factory for a given component type,
  * then use the factory's `create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  * @publicApi
  */
trait ComponentFactoryResolver extends StObject {
  
  /**
    * Retrieves the factory object that creates a component of the given type.
    * @param component The component type.
    */
  def resolveComponentFactory[T](component: Type[T]): ComponentFactory[T]
}
object ComponentFactoryResolver {
  
  inline def apply(resolveComponentFactory: Type[js.Any] => ComponentFactory[js.Any]): ComponentFactoryResolver = {
    val __obj = js.Dynamic.literal(resolveComponentFactory = js.Any.fromFunction1(resolveComponentFactory))
    __obj.asInstanceOf[ComponentFactoryResolver]
  }
  
  extension [Self <: ComponentFactoryResolver](x: Self) {
    
    inline def setResolveComponentFactory(value: Type[js.Any] => ComponentFactory[js.Any]): Self = StObject.set(x, "resolveComponentFactory", js.Any.fromFunction1(value))
  }
}
