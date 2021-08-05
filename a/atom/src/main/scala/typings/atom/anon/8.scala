package typings.atom.anon

import typings.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typings.atom.atomStrings.`tab and enter`
import typings.atom.atomStrings.enter
import typings.atom.atomStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var newValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  
  var oldValue: js.UndefOr[
    tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ] = js.undefined
}
object `8` {
  
  inline def apply(
    newValue: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ): `8` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setNewValue(
      value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
    ): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(
      value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
    ): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
