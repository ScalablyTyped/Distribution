package typings.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMDefinition extends StObject {
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var reserved: js.UndefOr[Boolean] = js.undefined
}
object DOMDefinition {
  
  inline def apply(): DOMDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMDefinition]
  }
  
  extension [Self <: DOMDefinition](x: Self) {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
  }
}
