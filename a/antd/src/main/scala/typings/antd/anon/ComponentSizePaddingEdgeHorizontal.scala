package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSizePaddingEdgeHorizontal extends StObject {
  
  var component: SizePaddingEdgeHorizontal
  
  var global: js.Array[String]
}
object ComponentSizePaddingEdgeHorizontal {
  
  inline def apply(component: SizePaddingEdgeHorizontal, global: js.Array[String]): ComponentSizePaddingEdgeHorizontal = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSizePaddingEdgeHorizontal]
  }
  
  extension [Self <: ComponentSizePaddingEdgeHorizontal](x: Self) {
    
    inline def setComponent(value: SizePaddingEdgeHorizontal): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
