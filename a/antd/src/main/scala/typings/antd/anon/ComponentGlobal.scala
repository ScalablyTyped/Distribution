package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentGlobal extends StObject {
  
  var component: MiniContentHeight
  
  var global: js.Array[String]
}
object ComponentGlobal {
  
  inline def apply(component: MiniContentHeight, global: js.Array[String]): ComponentGlobal = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentGlobal]
  }
  
  extension [Self <: ComponentGlobal](x: Self) {
    
    inline def setComponent(value: MiniContentHeight): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
