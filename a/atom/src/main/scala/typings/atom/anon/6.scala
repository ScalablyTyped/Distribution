package typings.atom.anon

import typings.atom.atomStrings.Bottom
import typings.atom.atomStrings.Left
import typings.atom.atomStrings.Right
import typings.atom.atomStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var newValue: Top | Right | Bottom | Left
  
  var oldValue: js.UndefOr[Top | Right | Bottom | Left] = js.undefined
}
object `6` {
  
  inline def apply(newValue: Top | Right | Bottom | Left): `6` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setNewValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
