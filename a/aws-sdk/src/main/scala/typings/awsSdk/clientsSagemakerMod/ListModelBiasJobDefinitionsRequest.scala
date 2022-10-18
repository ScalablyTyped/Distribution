package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelBiasJobDefinitionsRequest extends StObject {
  
  /**
    * A filter that returns only model bias jobs created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only model bias jobs created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of the endpoint to monitor for model bias.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
  
  /**
    * The maximum number of model bias jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * Filter for model bias jobs whose name contains a specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NameContains] = js.undefined
  
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Whether to sort results by the Name or CreationTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringJobDefinitionSortKey] = js.undefined
  
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
}
object ListModelBiasJobDefinitionsRequest {
  
  inline def apply(): ListModelBiasJobDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelBiasJobDefinitionsRequest]
  }
  
  extension [Self <: ListModelBiasJobDefinitionsRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: NameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: MonitoringJobDefinitionSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
