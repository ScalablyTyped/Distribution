package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceParams extends StObject {
  
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[js.Array[LocalValueBlock]] = js.undefined
}
object ChoiceParams {
  
  inline def apply(): ChoiceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceParams]
  }
  
  extension [Self <: ChoiceParams](x: Self) {
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setValue(value: js.Array[LocalValueBlock]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: LocalValueBlock*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
