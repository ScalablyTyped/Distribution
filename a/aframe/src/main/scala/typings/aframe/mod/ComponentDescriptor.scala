package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDescriptor[T /* <: Component[_, System[_]] */] extends StObject {
  
  var Component: ComponentConstructor[T] = js.native
  
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
}
object ComponentDescriptor {
  
  @scala.inline
  def apply[T /* <: Component[_, System[_]] */](Component: ComponentConstructor[T]): ComponentDescriptor[T] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDescriptor[T]]
  }
  
  @scala.inline
  implicit class ComponentDescriptorMutableBuilder[Self <: ComponentDescriptor[_], T /* <: Component[_, System[_]] */] (val x: Self with ComponentDescriptor[T]) extends AnyVal {
    
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
