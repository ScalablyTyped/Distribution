package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralizedTimeJson
  extends StObject
     with UTCTimeJson {
  
  var millisecond: Double
}
object GeneralizedTimeJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    day: Double,
    error: String,
    hour: Double,
    idBlock: LocalIdentificationBlockJson,
    lenBlock: LocalLengthBlockJson,
    millisecond: Double,
    minute: Double,
    month: Double,
    name: String,
    optional: scala.Boolean,
    second: Double,
    valueBeforeDecode: String,
    valueBlock: LocalSimpleStringValueBlockJson,
    warnings: js.Array[String],
    year: Double
  ): GeneralizedTimeJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], idBlock = idBlock.asInstanceOf[js.Any], lenBlock = lenBlock.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueBlock = valueBlock.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralizedTimeJson]
  }
  
  extension [Self <: GeneralizedTimeJson](x: Self) {
    
    inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
  }
}
