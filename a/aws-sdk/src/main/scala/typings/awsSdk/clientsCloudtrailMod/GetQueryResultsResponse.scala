package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryResultsResponse extends StObject {
  
  /**
    * The error message returned if a query failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ErrorMessage] = js.undefined
  
  /**
    * A token you can use to get the next page of query results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Contains the individual event results of the query.
    */
  var QueryResultRows: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.QueryResultRows] = js.undefined
  
  /**
    * Shows the count of query results.
    */
  var QueryStatistics: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.QueryStatistics] = js.undefined
  
  /**
    * The status of the query. Values include QUEUED, RUNNING, FINISHED, FAILED, TIMED_OUT, or CANCELLED.
    */
  var QueryStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.QueryStatus] = js.undefined
}
object GetQueryResultsResponse {
  
  inline def apply(): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueryResultsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryResultRows(value: QueryResultRows): Self = StObject.set(x, "QueryResultRows", value.asInstanceOf[js.Any])
    
    inline def setQueryResultRowsUndefined: Self = StObject.set(x, "QueryResultRows", js.undefined)
    
    inline def setQueryResultRowsVarargs(value: QueryResultRow*): Self = StObject.set(x, "QueryResultRows", js.Array(value*))
    
    inline def setQueryStatistics(value: QueryStatistics): Self = StObject.set(x, "QueryStatistics", value.asInstanceOf[js.Any])
    
    inline def setQueryStatisticsUndefined: Self = StObject.set(x, "QueryStatistics", js.undefined)
    
    inline def setQueryStatus(value: QueryStatus): Self = StObject.set(x, "QueryStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryStatusUndefined: Self = StObject.set(x, "QueryStatus", js.undefined)
  }
}
