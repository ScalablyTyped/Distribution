package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageTotalsResponse extends StObject {
  
  /**
    * The inclusive time period that the usage data applies to. Possible values are: MONTH_TO_DATE, for the current calendar month to date; and, PAST_30_DAYS, for the preceding 30 days.
    */
  var timeRange: js.UndefOr[TimeRange] = js.undefined
  
  /**
    * An array of objects that contains the results of the query. Each object contains the data for a specific usage metric.
    */
  var usageTotals: js.UndefOr[listOfUsageTotal] = js.undefined
}
object GetUsageTotalsResponse {
  
  inline def apply(): GetUsageTotalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageTotalsResponse]
  }
  
  extension [Self <: GetUsageTotalsResponse](x: Self) {
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    inline def setUsageTotals(value: listOfUsageTotal): Self = StObject.set(x, "usageTotals", value.asInstanceOf[js.Any])
    
    inline def setUsageTotalsUndefined: Self = StObject.set(x, "usageTotals", js.undefined)
    
    inline def setUsageTotalsVarargs(value: UsageTotal*): Self = StObject.set(x, "usageTotals", js.Array(value*))
  }
}
