package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  /**
    * A date range unit for the date filter.
    */
  var Unit: js.UndefOr[DateRangeUnit] = js.undefined
  
  /**
    * A date range value for the date filter.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}
object DateRange {
  
  inline def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  
  extension [Self <: DateRange](x: Self) {
    
    inline def setUnit(value: DateRangeUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setValue(value: Integer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
