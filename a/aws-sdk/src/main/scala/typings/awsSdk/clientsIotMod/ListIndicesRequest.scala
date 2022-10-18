package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[QueryMaxResults] = js.undefined
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListIndicesRequest {
  
  inline def apply(): ListIndicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesRequest]
  }
  
  extension [Self <: ListIndicesRequest](x: Self) {
    
    inline def setMaxResults(value: QueryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
