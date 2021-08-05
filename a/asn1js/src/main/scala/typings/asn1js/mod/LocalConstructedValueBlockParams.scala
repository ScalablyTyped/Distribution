package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalConstructedValueBlockParams
  extends StObject
     with LocalBaseBlockParams {
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[LocalValueBlock] = js.undefined
}
object LocalConstructedValueBlockParams {
  
  inline def apply(): LocalConstructedValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalConstructedValueBlockParams]
  }
  
  extension [Self <: LocalConstructedValueBlockParams](x: Self) {
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
    
    inline def setValue(value: LocalValueBlock): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
