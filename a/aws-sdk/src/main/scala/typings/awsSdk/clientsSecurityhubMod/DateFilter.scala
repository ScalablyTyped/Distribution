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
    * A timestamp that provides the end date for the date filter. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
    */
  var End: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A timestamp that provides the start date for the date filter. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
    */
  var Start: js.UndefOr[NonEmptyString] = js.undefined
}
object DateFilter {
  
  inline def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateFilter] (val x: Self) extends AnyVal {
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "DateRange", js.undefined)
    
    inline def setEnd(value: NonEmptyString): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setStart(value: NonEmptyString): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
