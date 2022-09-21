package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentControlItemWidth extends StObject {
  
  var component: ControlItemWidth
  
  var global: js.Array[String]
}
object ComponentControlItemWidth {
  
  inline def apply(component: ControlItemWidth, global: js.Array[String]): ComponentControlItemWidth = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentControlItemWidth]
  }
  
  extension [Self <: ComponentControlItemWidth](x: Self) {
    
    inline def setComponent(value: ControlItemWidth): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
