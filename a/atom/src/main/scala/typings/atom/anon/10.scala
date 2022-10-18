package typings.atom.anon

import typings.atom.atomStrings.atom
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var newValue: native | experimental | poll | atom
  
  var oldValue: js.UndefOr[native | experimental | poll | atom] = js.undefined
}
object `10` {
  
  inline def apply(newValue: native | experimental | poll | atom): `10` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setNewValue(value: native | experimental | poll | atom): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: native | experimental | poll | atom): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
