package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSegmentsRequest extends StObject {
  
  /**
    * The maximum number of results to include in the response. If you omit this, the default of 50 is used.
    */
  var maxResults: js.UndefOr[MaxSegments] = js.undefined
  
  /**
    * The token to use when requesting the next set of results. You received this token from a previous ListSegments operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListSegmentsRequest {
  
  inline def apply(): ListSegmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSegmentsRequest]
  }
  
  extension [Self <: ListSegmentsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxSegments): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
