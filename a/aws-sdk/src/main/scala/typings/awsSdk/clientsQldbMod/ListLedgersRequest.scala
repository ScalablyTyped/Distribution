package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLedgersRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single ListLedgers request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsQldbMod.MaxResults] = js.undefined
  
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListLedgers call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsQldbMod.NextToken] = js.undefined
}
object ListLedgersRequest {
  
  inline def apply(): ListLedgersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLedgersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLedgersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
