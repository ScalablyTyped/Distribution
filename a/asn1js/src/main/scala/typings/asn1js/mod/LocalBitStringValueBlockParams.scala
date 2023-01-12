package typings.asn1js.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent asn1js.asn1js.HexBlockParams */
/* Inlined parent asn1js.asn1js.LocalConstructedValueBlockParams */
/* Inlined parent std.Partial<asn1js.asn1js.ILocalBitStringValueBlock> */
trait LocalBitStringValueBlockParams extends StObject {
  
  var blockLength: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  
  var unusedBits: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[js.Array[BitString]] = js.undefined
  
  var valueBeforeDecode: js.UndefOr[BufferSource] = js.undefined
  
  var valueHex: js.UndefOr[BufferSource] = js.undefined
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object LocalBitStringValueBlockParams {
  
  inline def apply(): LocalBitStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBitStringValueBlockParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalBitStringValueBlockParams] (val x: Self) extends AnyVal {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockLengthUndefined: Self = StObject.set(x, "blockLength", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    inline def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
    
    inline def setUnusedBits(value: Double): Self = StObject.set(x, "unusedBits", value.asInstanceOf[js.Any])
    
    inline def setUnusedBitsUndefined: Self = StObject.set(x, "unusedBits", js.undefined)
    
    inline def setValue(value: js.Array[BitString]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecode(value: BufferSource): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: BitString*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
