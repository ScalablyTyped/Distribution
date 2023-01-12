package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTimeSeriesResponse extends StObject {
  
  /**
    * One or more time series summaries to list.
    */
  var TimeSeriesSummaries: typings.awsSdk.clientsIotsitewiseMod.TimeSeriesSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListTimeSeriesResponse {
  
  inline def apply(TimeSeriesSummaries: TimeSeriesSummaries): ListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal(TimeSeriesSummaries = TimeSeriesSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTimeSeriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTimeSeriesSummaries(value: TimeSeriesSummaries): Self = StObject.set(x, "TimeSeriesSummaries", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesSummariesVarargs(value: TimeSeriesSummary*): Self = StObject.set(x, "TimeSeriesSummaries", js.Array(value*))
  }
}
