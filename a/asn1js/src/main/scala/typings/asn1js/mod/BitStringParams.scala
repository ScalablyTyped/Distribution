package typings.asn1js.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBitStringValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined value, isHexOnly, valueHex, isIndefiniteForm, unusedBits, isConstructed */ trait BitStringParams
  extends StObject
     with BaseBlockParams {
  
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  
  var unusedBits: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[js.Array[BitString]] = js.undefined
  
  var valueHex: js.UndefOr[BufferSource] = js.undefined
}
object BitStringParams {
  
  inline def apply(): BitStringParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitStringParams]
  }
  
  extension [Self <: BitStringParams](x: Self) {
    
    inline def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    inline def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
    
    inline def setUnusedBits(value: Double): Self = StObject.set(x, "unusedBits", value.asInstanceOf[js.Any])
    
    inline def setUnusedBitsUndefined: Self = StObject.set(x, "unusedBits", js.undefined)
    
    inline def setValue(value: js.Array[BitString]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: BitString*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
