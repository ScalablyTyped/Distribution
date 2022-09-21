package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColsValue extends StObject {
  
  var cols: js.Array[Any]
  
  var value: js.Array[Any]
}
object ColsValue {
  
  inline def apply(cols: js.Array[Any], value: js.Array[Any]): ColsValue = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColsValue]
  }
  
  extension [Self <: ColsValue](x: Self) {
    
    inline def setCols(value: js.Array[Any]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsVarargs(value: Any*): Self = StObject.set(x, "cols", js.Array(value*))
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
