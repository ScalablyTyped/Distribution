package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryResultsRequest extends StObject {
  
  /**
    * The ARN (or ID suffix of the ARN) of the event data store against which the query was run.
    */
  var EventDataStore: EventDataStoreArn
  
  /**
    * The maximum number of query results to display on a single page.
    */
  var MaxQueryResults: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.MaxQueryResults] = js.undefined
  
  /**
    * A token you can use to get the next page of query results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the query for which you want to get results.
    */
  var QueryId: UUID
}
object GetQueryResultsRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn, QueryId: UUID): GetQueryResultsRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsRequest]
  }
  
  extension [Self <: GetQueryResultsRequest](x: Self) {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
    
    inline def setMaxQueryResults(value: MaxQueryResults): Self = StObject.set(x, "MaxQueryResults", value.asInstanceOf[js.Any])
    
    inline def setMaxQueryResultsUndefined: Self = StObject.set(x, "MaxQueryResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
