package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentContentWidth extends StObject {
  
  var component: ContentWidth
  
  var global: js.Array[String]
}
object ComponentContentWidth {
  
  inline def apply(component: ContentWidth, global: js.Array[String]): ComponentContentWidth = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentContentWidth]
  }
  
  extension [Self <: ComponentContentWidth](x: Self) {
    
    inline def setComponent(value: ContentWidth): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
