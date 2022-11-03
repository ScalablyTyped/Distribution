package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: `16`
  
  var element: `4`
  
  var layout: `32`
}
object Container {
  
  inline def apply(container: `16`, element: `4`, layout: `32`): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: `16`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setElement(value: `4`): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: `32`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
