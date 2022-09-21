package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentContentHeight extends StObject {
  
  var component: ContentHeight
  
  var global: js.Array[String]
}
object ComponentContentHeight {
  
  inline def apply(component: ContentHeight, global: js.Array[String]): ComponentContentHeight = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentContentHeight]
  }
  
  extension [Self <: ComponentContentHeight](x: Self) {
    
    inline def setComponent(value: ContentHeight): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
