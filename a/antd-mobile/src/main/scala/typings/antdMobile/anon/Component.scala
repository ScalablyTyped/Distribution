package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var Component: String
}
object Component {
  
  @scala.inline
  def apply(Component: String): Component = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
  }
}
