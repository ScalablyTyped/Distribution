package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueNumber extends StObject {
  
  var newValue: Double
  
  var oldValue: js.UndefOr[Double] = js.undefined
}
object NewValueNumber {
  
  inline def apply(newValue: Double): NewValueNumber = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueNumber]
  }
  
  extension [Self <: NewValueNumber](x: Self) {
    
    inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
