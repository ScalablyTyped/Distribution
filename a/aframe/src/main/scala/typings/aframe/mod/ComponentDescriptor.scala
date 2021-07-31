package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDescriptor[T /* <: Component[js.Any, System[js.Any]] */] extends StObject {
  
  var Component: ComponentConstructor[T]
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object ComponentDescriptor {
  
  @scala.inline
  def apply[T /* <: Component[js.Any, System[js.Any]] */](Component: ComponentConstructor[T]): ComponentDescriptor[T] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDescriptor[T]]
  }
  
  @scala.inline
  implicit class ComponentDescriptorMutableBuilder[Self <: ComponentDescriptor[?], T /* <: Component[js.Any, System[js.Any]] */] (val x: Self & ComponentDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentConstructor[T]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
