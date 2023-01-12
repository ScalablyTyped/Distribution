package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent asn1js.asn1js.BaseBlockJson<asn1js.asn1js.LocalSimpleStringValueBlockJson> */
/* Inlined parent asn1js.asn1js.IUTCTime */
trait UTCTimeJson extends StObject {
  
  var blockLength: Double
  
  var blockName: String
  
  var day: Double
  
  var error: String
  
  var hour: Double
  
  var idBlock: LocalIdentificationBlockJson
  
  var lenBlock: LocalLengthBlockJson
  
  var minute: Double
  
  var month: Double
  
  var name: String
  
  var optional: scala.Boolean
  
  var primitiveSchema: js.UndefOr[BaseBlockJson[LocalBaseBlockJson]] = js.undefined
  
  var second: Double
  
  var valueBeforeDecode: String
  
  var valueBlock: LocalSimpleStringValueBlockJson
  
  var warnings: js.Array[String]
  
  var year: Double
}
object UTCTimeJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    day: Double,
    error: String,
    hour: Double,
    idBlock: LocalIdentificationBlockJson,
    lenBlock: LocalLengthBlockJson,
    minute: Double,
    month: Double,
    name: String,
    optional: scala.Boolean,
    second: Double,
    valueBeforeDecode: String,
    valueBlock: LocalSimpleStringValueBlockJson,
    warnings: js.Array[String],
    year: Double
  ): UTCTimeJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], idBlock = idBlock.asInstanceOf[js.Any], lenBlock = lenBlock.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueBlock = valueBlock.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[UTCTimeJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UTCTimeJson] (val x: Self) extends AnyVal {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setIdBlock(value: LocalIdentificationBlockJson): Self = StObject.set(x, "idBlock", value.asInstanceOf[js.Any])
    
    inline def setLenBlock(value: LocalLengthBlockJson): Self = StObject.set(x, "lenBlock", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchema(value: BaseBlockJson[LocalBaseBlockJson]): Self = StObject.set(x, "primitiveSchema", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveSchemaUndefined: Self = StObject.set(x, "primitiveSchema", js.undefined)
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecode(value: String): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBlock(value: LocalSimpleStringValueBlockJson): Self = StObject.set(x, "valueBlock", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
