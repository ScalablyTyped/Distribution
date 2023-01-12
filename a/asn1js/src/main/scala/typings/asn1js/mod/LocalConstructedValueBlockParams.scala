package typings.asn1js.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent asn1js.asn1js.ValueBlockParams */
/* Inlined parent std.Partial<asn1js.asn1js.ILocalConstructedValueBlock> */
trait LocalConstructedValueBlockParams extends StObject {
  
  var blockLength: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[js.Array[ConstructedItem]] = js.undefined
  
  var valueBeforeDecode: js.UndefOr[BufferSource] = js.undefined
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object LocalConstructedValueBlockParams {
  
  inline def apply(): LocalConstructedValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalConstructedValueBlockParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalConstructedValueBlockParams] (val x: Self) extends AnyVal {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockLengthUndefined: Self = StObject.set(x, "blockLength", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
    
    inline def setValue(value: js.Array[ConstructedItem]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecode(value: BufferSource): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: ConstructedItem*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
