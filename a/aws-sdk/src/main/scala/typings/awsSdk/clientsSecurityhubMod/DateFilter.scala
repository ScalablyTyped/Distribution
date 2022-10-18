package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFilter extends StObject {
  
  /**
    * A date range for the date filter.
    */
  var DateRange: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.DateRange] = js.undefined
  
  /**
    * An end date for the date filter.
    */
  var End: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A start date for the date filter.
    */
  var Start: js.UndefOr[NonEmptyString] = js.undefined
}
object DateFilter {
  
  inline def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  
  extension [Self <: DateFilter](x: Self) {
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "DateRange", js.undefined)
    
    inline def setEnd(value: NonEmptyString): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setStart(value: NonEmptyString): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
