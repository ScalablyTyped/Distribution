package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueriesRequest extends StObject {
  
  /**
    * Use with StartTime to bound a ListQueries request, and limit its results to only those queries run within a specified time period.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN (or the ID suffix of the ARN) of an event data store on which queries were run.
    */
  var EventDataStore: EventDataStoreArn
  
  /**
    * The maximum number of queries to show on a page.
    */
  var MaxResults: js.UndefOr[ListQueriesMaxResultsCount] = js.undefined
  
  /**
    * A token you can use to get the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The status of queries that you want to return in results. Valid values for QueryStatus include QUEUED, RUNNING, FINISHED, FAILED, TIMED_OUT, or CANCELLED.
    */
  var QueryStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.QueryStatus] = js.undefined
  
  /**
    * Use with EndTime to bound a ListQueries request, and limit its results to only those queries run within a specified time period.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object ListQueriesRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn): ListQueriesRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueriesRequest]
  }
  
  extension [Self <: ListQueriesRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListQueriesMaxResultsCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryStatus(value: QueryStatus): Self = StObject.set(x, "QueryStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryStatusUndefined: Self = StObject.set(x, "QueryStatus", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
