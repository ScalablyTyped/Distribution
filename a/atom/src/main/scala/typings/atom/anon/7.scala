package typings.atom.anon

import typings.atom.atomStrings.auto
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.soft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var newValue: auto | soft | hard
  
  var oldValue: js.UndefOr[auto | soft | hard] = js.undefined
}
object `7` {
  
  inline def apply(newValue: auto | soft | hard): `7` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setNewValue(value: auto | soft | hard): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: auto | soft | hard): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
