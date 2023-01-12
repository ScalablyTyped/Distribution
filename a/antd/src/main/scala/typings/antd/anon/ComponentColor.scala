package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentColor extends StObject {
  
  var component: Color
  
  var global: js.Array[String]
}
object ComponentColor {
  
  inline def apply(component: Color, global: js.Array[String]): ComponentColor = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentColor] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Color): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
