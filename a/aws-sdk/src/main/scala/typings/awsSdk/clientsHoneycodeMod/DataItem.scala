package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataItem extends StObject {
  
  /**
    * The formatted value of the data. e.g. John Smith.
    */
  var formattedValue: js.UndefOr[FormattedValue] = js.undefined
  
  /**
    *  The overrideFormat is optional and is specified only if a particular row of data has a different format for the data than the default format defined on the screen or the table. 
    */
  var overrideFormat: js.UndefOr[Format] = js.undefined
  
  /**
    * The raw value of the data. e.g. jsmith@example.com
    */
  var rawValue: js.UndefOr[RawValue] = js.undefined
}
object DataItem {
  
  inline def apply(): DataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataItem]
  }
  
  extension [Self <: DataItem](x: Self) {
    
    inline def setFormattedValue(value: FormattedValue): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setOverrideFormat(value: Format): Self = StObject.set(x, "overrideFormat", value.asInstanceOf[js.Any])
    
    inline def setOverrideFormatUndefined: Self = StObject.set(x, "overrideFormat", js.undefined)
    
    inline def setRawValue(value: RawValue): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
  }
}
