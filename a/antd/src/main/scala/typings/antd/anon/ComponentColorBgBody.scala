package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentColorBgBody extends StObject {
  
  var component: ColorBgBody
  
  var global: js.Array[String]
}
object ComponentColorBgBody {
  
  inline def apply(component: ColorBgBody, global: js.Array[String]): ComponentColorBgBody = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentColorBgBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentColorBgBody] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ColorBgBody): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
