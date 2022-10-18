package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.Array[Name]
  
  var name: String
  
  var value: js.UndefOr[Any] = js.undefined
}
object Children {
  
  inline def apply(children: js.Array[Name], name: String): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: js.Array[Name]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Name*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
