package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  /**
    * If the result of the previous Search request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of SearchRecord objects.
    */
  var Results: js.UndefOr[SearchResultsList] = js.undefined
}
object SearchResponse {
  
  inline def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResults(value: SearchResultsList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: SearchRecord*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
