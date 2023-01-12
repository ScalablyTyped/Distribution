package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOriginationNumbersRequest extends StObject {
  
  /**
    * The maximum number of origination numbers to return.
    */
  var MaxResults: js.UndefOr[MaxItemsListOriginationNumbers] = js.undefined
  
  /**
    * Token that the previous ListOriginationNumbers request returns.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
}
object ListOriginationNumbersRequest {
  
  inline def apply(): ListOriginationNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginationNumbersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOriginationNumbersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxItemsListOriginationNumbers): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
