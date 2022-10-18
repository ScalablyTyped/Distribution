package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsRequest extends StObject {
  
  /**
    * The primary Region of the endpoints associated with this account. For example "HomeRegion": "us-east-1".
    */
  var HomeRegion: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.HomeRegion] = js.undefined
  
  /**
    * The maximum number of results returned by the call.
    */
  var MaxResults: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * A value that will return a subset of the endpoints associated with this account. For example, "NamePrefix": "ABC" will return all endpoints with "ABC" in the name.
    */
  var NamePrefix: js.UndefOr[EndpointName] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
}
object ListEndpointsRequest {
  
  inline def apply(): ListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsRequest]
  }
  
  extension [Self <: ListEndpointsRequest](x: Self) {
    
    inline def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    
    inline def setMaxResults(value: LimitMax100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamePrefix(value: EndpointName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
