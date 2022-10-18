package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnalyzersRequest extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The type of analyzer.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object ListAnalyzersRequest {
  
  inline def apply(): ListAnalyzersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnalyzersRequest]
  }
  
  extension [Self <: ListAnalyzersRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
