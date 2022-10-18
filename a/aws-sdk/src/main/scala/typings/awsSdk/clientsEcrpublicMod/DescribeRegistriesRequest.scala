package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegistriesRequest extends StObject {
  
  /**
    * The maximum number of repository results returned by DescribeRegistries in paginated output. When this parameter is used, DescribeRegistries only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeRegistries request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeRegistries returns up to 100 results and a nextToken value, if applicable.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeRegistries request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeRegistriesRequest {
  
  inline def apply(): DescribeRegistriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegistriesRequest]
  }
  
  extension [Self <: DescribeRegistriesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
