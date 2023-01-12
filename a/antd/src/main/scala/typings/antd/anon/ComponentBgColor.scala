package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBgColor extends StObject {
  
  var component: BgColor
  
  var global: js.Array[String]
}
object ComponentBgColor {
  
  inline def apply(component: BgColor, global: js.Array[String]): ComponentBgColor = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentBgColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentBgColor] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: BgColor): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
