package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAggregateDiscoveredResourcesResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
  
  /**
    * Returns a list of ResourceIdentifiers objects.
    */
  var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.undefined
}
object ListAggregateDiscoveredResourcesResponse {
  
  inline def apply(): ListAggregateDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
  }
  
  extension [Self <: ListAggregateDiscoveredResourcesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceIdentifiers(value: DiscoveredResourceIdentifierList): Self = StObject.set(x, "ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifiersUndefined: Self = StObject.set(x, "ResourceIdentifiers", js.undefined)
    
    inline def setResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = StObject.set(x, "ResourceIdentifiers", js.Array(value*))
  }
}
