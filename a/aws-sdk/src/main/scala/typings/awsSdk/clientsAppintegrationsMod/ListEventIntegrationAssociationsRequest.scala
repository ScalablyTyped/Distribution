package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventIntegrationAssociationsRequest extends StObject {
  
  /**
    * The name of the event integration. 
    */
  var EventIntegrationName: Name
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.NextToken] = js.undefined
}
object ListEventIntegrationAssociationsRequest {
  
  inline def apply(EventIntegrationName: Name): ListEventIntegrationAssociationsRequest = {
    val __obj = js.Dynamic.literal(EventIntegrationName = EventIntegrationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventIntegrationAssociationsRequest]
  }
  
  extension [Self <: ListEventIntegrationAssociationsRequest](x: Self) {
    
    inline def setEventIntegrationName(value: Name): Self = StObject.set(x, "EventIntegrationName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
