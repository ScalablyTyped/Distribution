package typings.awsSdk.appintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataIntegrationsRequest extends StObject {
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appintegrationsMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appintegrationsMod.NextToken] = js.undefined
}
object ListDataIntegrationsRequest {
  
  inline def apply(): ListDataIntegrationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataIntegrationsRequest]
  }
  
  extension [Self <: ListDataIntegrationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
