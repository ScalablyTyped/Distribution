package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent asn1js.asn1js.LocalBaseBlockJson */
/* Inlined parent std.Omit<asn1js.asn1js.ILocalConstructedValueBlock, 'value'> */
trait LocalConstructedValueBlockJson extends StObject {
  
  var blockLength: Double
  
  var blockName: String
  
  var error: String
  
  var isIndefiniteForm: scala.Boolean
  
  var value: js.Array[LocalBaseBlockJson]
  
  var valueBeforeDecode: String
  
  var warnings: js.Array[String]
}
object LocalConstructedValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    isIndefiniteForm: scala.Boolean,
    value: js.Array[LocalBaseBlockJson],
    valueBeforeDecode: String,
    warnings: js.Array[String]
  ): LocalConstructedValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isIndefiniteForm = isIndefiniteForm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalConstructedValueBlockJson]
  }
  
  extension [Self <: LocalConstructedValueBlockJson](x: Self) {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[LocalBaseBlockJson]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecode(value: String): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: LocalBaseBlockJson*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
