package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesRequest extends StObject {
  
  /**
    * The maximum number of results to include in each response (result page). It's used for a paginated request. If you don't specify MaxResults, the request retrieves all available results in a single response.
    */
  var MaxResults: js.UndefOr[ServiceMaxResults] = js.undefined
  
  /**
    * A token from a previous result page. Used for a paginated request. The request retrieves the next result page. All other parameter values must be identical to the ones specified in the initial request. If you don't specify NextToken, the request retrieves the first result page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListServicesRequest {
  
  inline def apply(): ListServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesRequest]
  }
  
  extension [Self <: ListServicesRequest](x: Self) {
    
    inline def setMaxResults(value: ServiceMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
