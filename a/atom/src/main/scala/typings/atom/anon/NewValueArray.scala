package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueArray extends StObject {
  
  var newValue: js.Array[String]
  
  var oldValue: js.UndefOr[js.Array[String]] = js.undefined
}
object NewValueArray {
  
  inline def apply(newValue: js.Array[String]): NewValueArray = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueArray]
  }
  
  extension [Self <: NewValueArray](x: Self) {
    
    inline def setNewValue(value: js.Array[String]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueVarargs(value: String*): Self = StObject.set(x, "newValue", js.Array(value*))
    
    inline def setOldValue(value: js.Array[String]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setOldValueVarargs(value: String*): Self = StObject.set(x, "oldValue", js.Array(value*))
  }
}
