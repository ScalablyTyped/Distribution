package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRetrievalRule extends StObject {
  
  /**
    * The maximum number of bytes that can be retrieved in an hour. This field is required only if the value of the Strategy field is BytesPerHour. Your PUT operation will be rejected if the Strategy field is not set to BytesPerHour and you set this field.
    */
  var BytesPerHour: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The type of data retrieval policy to set. Valid values: BytesPerHour|FreeTier|None
    */
  var Strategy: js.UndefOr[String] = js.undefined
}
object DataRetrievalRule {
  
  inline def apply(): DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalRule]
  }
  
  extension [Self <: DataRetrievalRule](x: Self) {
    
    inline def setBytesPerHour(value: NullableLong): Self = StObject.set(x, "BytesPerHour", value.asInstanceOf[js.Any])
    
    inline def setBytesPerHourUndefined: Self = StObject.set(x, "BytesPerHour", js.undefined)
    
    inline def setStrategy(value: String): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
  }
}
