package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppMonitorDataRequest extends StObject {
  
  /**
    * An array of structures that you can use to filter the results to those that match one or more sets of key-value pairs that you specify.
    */
  var Filters: js.UndefOr[QueryFilters] = js.undefined
  
  /**
    * The maximum number of results to return in one operation. 
    */
  var MaxResults: js.UndefOr[MaxQueryResults] = js.undefined
  
  /**
    * The name of the app monitor that collected the data that you want to retrieve.
    */
  var Name: AppMonitorName
  
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A structure that defines the time range that you want to retrieve results from.
    */
  var TimeRange: typings.awsSdk.clientsRumMod.TimeRange
}
object GetAppMonitorDataRequest {
  
  inline def apply(Name: AppMonitorName, TimeRange: TimeRange): GetAppMonitorDataRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TimeRange = TimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppMonitorDataRequest]
  }
  
  extension [Self <: GetAppMonitorDataRequest](x: Self) {
    
    inline def setFilters(value: QueryFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxQueryResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "TimeRange", value.asInstanceOf[js.Any])
  }
}
