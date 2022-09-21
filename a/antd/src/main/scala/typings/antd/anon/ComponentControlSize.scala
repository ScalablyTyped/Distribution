package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentControlSize extends StObject {
  
  var component: ControlSize
  
  var global: js.Array[String]
}
object ComponentControlSize {
  
  inline def apply(component: ControlSize, global: js.Array[String]): ComponentControlSize = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentControlSize]
  }
  
  extension [Self <: ComponentControlSize](x: Self) {
    
    inline def setComponent(value: ControlSize): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
