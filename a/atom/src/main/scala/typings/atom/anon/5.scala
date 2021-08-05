package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var newValue: String | Null
  
  var oldValue: js.UndefOr[String | Null] = js.undefined
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(newValue = null)
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
