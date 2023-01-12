package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorsRequest extends StObject {
  
  /**
    * Specifies the maximum number of items that should be returned in the result set. The default for maxResults is 20 (for all paginated API operations).
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token for the next page of data.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListConnectorsRequest {
  
  inline def apply(): ListConnectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectorsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
