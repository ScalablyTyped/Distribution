package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventAggregatesRequest extends StObject {
  
  /**
    * The only currently supported value is eventTypeCategory.
    */
  var aggregateField: eventAggregateField
  
  /**
    * Values to narrow the results returned.
    */
  var filter: js.UndefOr[EventFilter] = js.undefined
  
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[typings.awsSdk.clientsHealthMod.maxResults] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsHealthMod.nextToken] = js.undefined
}
object DescribeEventAggregatesRequest {
  
  inline def apply(aggregateField: eventAggregateField): DescribeEventAggregatesRequest = {
    val __obj = js.Dynamic.literal(aggregateField = aggregateField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventAggregatesRequest]
  }
  
  extension [Self <: DescribeEventAggregatesRequest](x: Self) {
    
    inline def setAggregateField(value: eventAggregateField): Self = StObject.set(x, "aggregateField", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: EventFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: maxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
