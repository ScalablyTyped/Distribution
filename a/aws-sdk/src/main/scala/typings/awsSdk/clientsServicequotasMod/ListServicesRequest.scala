package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, if any, make another call with the token returned from this call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsServicequotasMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicequotasMod.NextToken] = js.undefined
}
object ListServicesRequest {
  
  inline def apply(): ListServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesRequest]
  }
  
  extension [Self <: ListServicesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
