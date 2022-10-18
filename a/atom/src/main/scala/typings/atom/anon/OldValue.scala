package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue extends StObject {
  
  var newValue: Boolean
  
  var oldValue: js.UndefOr[Boolean] = js.undefined
}
object OldValue {
  
  inline def apply(newValue: Boolean): OldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue]
  }
  
  extension [Self <: OldValue](x: Self) {
    
    inline def setNewValue(value: Boolean): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Boolean): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
