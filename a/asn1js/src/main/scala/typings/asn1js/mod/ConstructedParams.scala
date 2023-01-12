package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalConstructedValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined value, isIndefiniteForm */ trait ConstructedParams
  extends StObject
     with BaseBlockParams {
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[js.Array[ConstructedItem]] = js.undefined
}
object ConstructedParams {
  
  inline def apply(): ConstructedParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructedParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstructedParams] (val x: Self) extends AnyVal {
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
    
    inline def setValue(value: js.Array[ConstructedItem]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: ConstructedItem*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
