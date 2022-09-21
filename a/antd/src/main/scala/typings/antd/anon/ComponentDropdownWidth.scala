package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDropdownWidth extends StObject {
  
  var component: DropdownWidth
  
  var global: js.Array[String]
}
object ComponentDropdownWidth {
  
  inline def apply(component: DropdownWidth, global: js.Array[String]): ComponentDropdownWidth = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDropdownWidth]
  }
  
  extension [Self <: ComponentDropdownWidth](x: Self) {
    
    inline def setComponent(value: DropdownWidth): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
