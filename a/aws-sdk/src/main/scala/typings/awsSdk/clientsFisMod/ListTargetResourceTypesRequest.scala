package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetResourceTypesRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[ListTargetResourceTypesMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListTargetResourceTypesRequest {
  
  inline def apply(): ListTargetResourceTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetResourceTypesRequest]
  }
  
  extension [Self <: ListTargetResourceTypesRequest](x: Self) {
    
    inline def setMaxResults(value: ListTargetResourceTypesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
