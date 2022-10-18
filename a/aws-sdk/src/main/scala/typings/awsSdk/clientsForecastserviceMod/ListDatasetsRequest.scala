package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsRequest extends StObject {
  
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.MaxResults] = js.undefined
  
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
}
object ListDatasetsRequest {
  
  inline def apply(): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsRequest]
  }
  
  extension [Self <: ListDatasetsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
