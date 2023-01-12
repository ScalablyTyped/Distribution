package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentImageHeight extends StObject {
  
  var component: ImageHeight
  
  var global: js.Array[String]
}
object ComponentImageHeight {
  
  inline def apply(component: ImageHeight, global: js.Array[String]): ComponentImageHeight = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentImageHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentImageHeight] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ImageHeight): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
