package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionDefinitionVersionsRequest extends StObject {
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
}
object ListSubscriptionDefinitionVersionsRequest {
  
  inline def apply(SubscriptionDefinitionId: string): ListSubscriptionDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionDefinitionVersionsRequest]
  }
  
  extension [Self <: ListSubscriptionDefinitionVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
