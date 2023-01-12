package typings.asn1js.mod

import typings.asn1js.anon.PartialILocalIdentificati
import typings.asn1js.anon.PartialILocalLengthBlock
import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent asn1js.asn1js.LocalBaseBlockParams */
/* Inlined parent asn1js.asn1js.LocalIdentificationBlockParams */
/* Inlined parent asn1js.asn1js.LocalLengthBlockParams */
/* Inlined parent std.Partial<asn1js.asn1js.IBaseBlock> */
trait BaseBlockParams extends StObject {
  
  var blockLength: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var idBlock: js.UndefOr[PartialILocalIdentificati] = js.undefined
  
  var lenBlock: js.UndefOr[PartialILocalLengthBlock] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  
  var primitiveSchema: js.UndefOr[BaseBlock[ValueBlock, ValueBlockJson]] = js.undefined
  
  var valueBeforeDecode: js.UndefOr[BufferSource] = js.undefined
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object BaseBlockParams {
  
  inline def apply(): BaseBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBlockParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseBlockParams] (val x: Self) extends AnyVal {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockLengthUndefined: Self = StObject.set(x, "blockLength", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIdBlock(value: PartialILocalIdentificati): Self = StObject.set(x, "idBlock", value.asInstanceOf[js.Any])
    
    inline def setIdBlockUndefined: Self = StObject.set(x, "idBlock", js.undefined)
    
    inline def setLenBlock(value: PartialILocalLengthBlock): Self = StObject.set(x, "lenBlock", value.asInstanceOf[js.Any])
    
    inline def setLenBlockUndefined: Self = StObject.set(x, "lenBlock", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setPrimitiveSchema(value: BaseBlock[ValueBlock, ValueBlockJson]): Self = StObject.set(x, "primitiveSchema", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchemaUndefined: Self = StObject.set(x, "primitiveSchema", js.undefined)
    
    inline def setValueBeforeDecode(value: BufferSource): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
