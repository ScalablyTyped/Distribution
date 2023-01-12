package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentListHeight extends StObject {
  
  var component: ListHeight
  
  var global: js.Array[String]
}
object ComponentListHeight {
  
  inline def apply(component: ListHeight, global: js.Array[String]): ComponentListHeight = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentListHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentListHeight] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ListHeight): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
