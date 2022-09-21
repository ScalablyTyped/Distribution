package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDropdownHeight extends StObject {
  
  var component: DropdownHeight
  
  var global: js.Array[String]
}
object ComponentDropdownHeight {
  
  inline def apply(component: DropdownHeight, global: js.Array[String]): ComponentDropdownHeight = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDropdownHeight]
  }
  
  extension [Self <: ComponentDropdownHeight](x: Self) {
    
    inline def setComponent(value: DropdownHeight): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
