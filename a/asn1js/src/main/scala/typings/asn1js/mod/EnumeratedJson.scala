package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asn1js.asn1js.IntegerJson */
trait EnumeratedJson extends StObject {
  
  var blockLength: Double
  
  var blockName: String
  
  var error: String
  
  var idBlock: LocalIdentificationBlockJson
  
  var lenBlock: LocalLengthBlockJson
  
  var name: String
  
  var optional: scala.Boolean
  
  var primitiveSchema: js.UndefOr[BaseBlockJson[LocalBaseBlockJson]] = js.undefined
  
  var valueBeforeDecode: String
  
  var valueBlock: LocalIntegerValueBlockJson
  
  var warnings: js.Array[String]
}
object EnumeratedJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    idBlock: LocalIdentificationBlockJson,
    lenBlock: LocalLengthBlockJson,
    name: String,
    optional: scala.Boolean,
    valueBeforeDecode: String,
    valueBlock: LocalIntegerValueBlockJson,
    warnings: js.Array[String]
  ): EnumeratedJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], idBlock = idBlock.asInstanceOf[js.Any], lenBlock = lenBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueBlock = valueBlock.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumeratedJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumeratedJson] (val x: Self) extends AnyVal {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIdBlock(value: LocalIdentificationBlockJson): Self = StObject.set(x, "idBlock", value.asInstanceOf[js.Any])
    
    inline def setLenBlock(value: LocalLengthBlockJson): Self = StObject.set(x, "lenBlock", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchema(value: BaseBlockJson[LocalBaseBlockJson]): Self = StObject.set(x, "primitiveSchema", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchemaUndefined: Self = StObject.set(x, "primitiveSchema", js.undefined)
    
    inline def setValueBeforeDecode(value: String): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBlock(value: LocalIntegerValueBlockJson): Self = StObject.set(x, "valueBlock", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
