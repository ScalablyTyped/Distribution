package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesResponse extends StObject {
  
  /**
    * The index names.
    */
  var indexNames: js.UndefOr[IndexNamesList] = js.undefined
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListIndicesResponse {
  
  inline def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  
  extension [Self <: ListIndicesResponse](x: Self) {
    
    inline def setIndexNames(value: IndexNamesList): Self = StObject.set(x, "indexNames", value.asInstanceOf[js.Any])
    
    inline def setIndexNamesUndefined: Self = StObject.set(x, "indexNames", js.undefined)
    
    inline def setIndexNamesVarargs(value: IndexName*): Self = StObject.set(x, "indexNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
