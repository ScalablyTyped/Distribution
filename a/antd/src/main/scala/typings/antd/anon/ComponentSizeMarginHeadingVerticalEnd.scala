package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSizeMarginHeadingVerticalEnd extends StObject {
  
  var component: SizeMarginHeadingVerticalEnd
  
  var global: js.Array[String]
}
object ComponentSizeMarginHeadingVerticalEnd {
  
  inline def apply(component: SizeMarginHeadingVerticalEnd, global: js.Array[String]): ComponentSizeMarginHeadingVerticalEnd = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSizeMarginHeadingVerticalEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentSizeMarginHeadingVerticalEnd] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: SizeMarginHeadingVerticalEnd): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
