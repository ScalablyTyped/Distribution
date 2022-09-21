package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentColorBgDefault extends StObject {
  
  var component: ColorBgDefault
  
  var global: js.Array[String]
}
object ComponentColorBgDefault {
  
  inline def apply(component: ColorBgDefault, global: js.Array[String]): ComponentColorBgDefault = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentColorBgDefault]
  }
  
  extension [Self <: ComponentColorBgDefault](x: Self) {
    
    inline def setComponent(value: ColorBgDefault): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
