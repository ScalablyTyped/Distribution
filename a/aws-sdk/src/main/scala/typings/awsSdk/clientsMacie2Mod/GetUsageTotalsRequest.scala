package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageTotalsRequest extends StObject {
  
  /**
    * The inclusive time period to retrieve the data for. Valid values are: MONTH_TO_DATE, for the current calendar month to date; and, PAST_30_DAYS, for the preceding 30 days. If you don't specify a value for this parameter, Amazon Macie provides aggregated usage data for the preceding 30 days.
    */
  var timeRange: js.UndefOr[string] = js.undefined
}
object GetUsageTotalsRequest {
  
  inline def apply(): GetUsageTotalsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageTotalsRequest]
  }
  
  extension [Self <: GetUsageTotalsRequest](x: Self) {
    
    inline def setTimeRange(value: string): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
  }
}
