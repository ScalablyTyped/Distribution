package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceInputNameConfiguration extends StObject {
  
  /**
    * Indicates the delimiter character used between items in the data. 
    */
  var ComponentTimestampDelimiter: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ComponentTimestampDelimiter] = js.undefined
  
  /**
    * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-). 
    */
  var TimestampFormat: js.UndefOr[FileNameTimestampFormat] = js.undefined
}
object InferenceInputNameConfiguration {
  
  inline def apply(): InferenceInputNameConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceInputNameConfiguration]
  }
  
  extension [Self <: InferenceInputNameConfiguration](x: Self) {
    
    inline def setComponentTimestampDelimiter(value: ComponentTimestampDelimiter): Self = StObject.set(x, "ComponentTimestampDelimiter", value.asInstanceOf[js.Any])
    
    inline def setComponentTimestampDelimiterUndefined: Self = StObject.set(x, "ComponentTimestampDelimiter", js.undefined)
    
    inline def setTimestampFormat(value: FileNameTimestampFormat): Self = StObject.set(x, "TimestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "TimestampFormat", js.undefined)
  }
}
