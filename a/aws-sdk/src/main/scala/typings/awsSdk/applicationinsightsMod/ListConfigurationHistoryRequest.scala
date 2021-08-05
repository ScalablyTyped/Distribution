package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationHistoryRequest extends StObject {
  
  /**
    * The end time of the event.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.undefined
  
  /**
    * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
    */
  var EventStatus: js.UndefOr[ConfigurationEventStatus] = js.undefined
  
  /**
    *  The maximum number of results returned by ListConfigurationHistory in paginated output. When this parameter is used, ListConfigurationHistory returns only MaxResults in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another ListConfigurationHistory request with the returned NextToken value. If this parameter is not used, then ListConfigurationHistory returns all results. 
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.undefined
  
  /**
    * The NextToken value returned from a previous paginated ListConfigurationHistory request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Resource group to which the application belongs. 
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.undefined
  
  /**
    * The start time of the event. 
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.undefined
}
object ListConfigurationHistoryRequest {
  
  inline def apply(): ListConfigurationHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationHistoryRequest]
  }
  
  extension [Self <: ListConfigurationHistoryRequest](x: Self) {
    
    inline def setEndTime(value: EndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEventStatus(value: ConfigurationEventStatus): Self = StObject.set(x, "EventStatus", value.asInstanceOf[js.Any])
    
    inline def setEventStatusUndefined: Self = StObject.set(x, "EventStatus", js.undefined)
    
    inline def setMaxResults(value: MaxEntities): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
    
    inline def setStartTime(value: StartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
