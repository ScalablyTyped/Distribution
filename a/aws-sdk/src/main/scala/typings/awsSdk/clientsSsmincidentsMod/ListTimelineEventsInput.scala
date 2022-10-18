package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTimelineEventsInput extends StObject {
  
  /**
    * Filters the timeline events based on the provided conditional values. You can filter timeline events using the following keys:    eventTime     eventType    Note the following when deciding how to use Filters:   If you don't specify a Filter, the response includes all timeline events.   If you specify more than one filter in a single request, the response returns timeline events that match all filters.   If you specify a filter with more than one value, the response returns timeline events that match any of the values provided.  
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
    */
  var incidentRecordArn: Arn
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Sort by the specified key value pair.
    */
  var sortBy: js.UndefOr[TimelineEventSort] = js.undefined
  
  /**
    * Sorts the order of timeline events by the value specified in the sortBy field.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object ListTimelineEventsInput {
  
  inline def apply(incidentRecordArn: Arn): ListTimelineEventsInput = {
    val __obj = js.Dynamic.literal(incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTimelineEventsInput]
  }
  
  extension [Self <: ListTimelineEventsInput](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: TimelineEventSort): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
