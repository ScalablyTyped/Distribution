package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: `4`
  
  var container: `40`
  
  var content: `16`
}
object Component {
  
  inline def apply(component: `4`, container: `40`, content: `16`): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: `4`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: `40`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContent(value: `16`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
