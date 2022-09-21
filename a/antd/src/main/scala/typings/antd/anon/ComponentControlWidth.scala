package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentControlWidth extends StObject {
  
  var component: ControlWidth
  
  var global: js.Array[String]
}
object ComponentControlWidth {
  
  inline def apply(component: ControlWidth, global: js.Array[String]): ComponentControlWidth = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentControlWidth]
  }
  
  extension [Self <: ComponentControlWidth](x: Self) {
    
    inline def setComponent(value: ControlWidth): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
