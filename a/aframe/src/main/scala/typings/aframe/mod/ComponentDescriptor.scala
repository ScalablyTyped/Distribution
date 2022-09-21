package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDescriptor[T /* <: Component[Any, System[Any]] */] extends StObject {
  
  var Component: ComponentConstructor[T]
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object ComponentDescriptor {
  
  inline def apply[T /* <: Component[Any, System[Any]] */](Component: ComponentConstructor[T]): ComponentDescriptor[T] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDescriptor[T]]
  }
  
  extension [Self <: ComponentDescriptor[?], T /* <: Component[Any, System[Any]] */](x: Self & ComponentDescriptor[T]) {
    
    inline def setComponent(value: ComponentConstructor[T]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
