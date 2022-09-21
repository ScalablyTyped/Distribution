package typings.awsSdk.appintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataIntegrationAssociationsRequest extends StObject {
  
  /**
    * A unique identifier for the DataIntegration.
    */
  var DataIntegrationIdentifier: Identifier
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appintegrationsMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appintegrationsMod.NextToken] = js.undefined
}
object ListDataIntegrationAssociationsRequest {
  
  inline def apply(DataIntegrationIdentifier: Identifier): ListDataIntegrationAssociationsRequest = {
    val __obj = js.Dynamic.literal(DataIntegrationIdentifier = DataIntegrationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataIntegrationAssociationsRequest]
  }
  
  extension [Self <: ListDataIntegrationAssociationsRequest](x: Self) {
    
    inline def setDataIntegrationIdentifier(value: Identifier): Self = StObject.set(x, "DataIntegrationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
