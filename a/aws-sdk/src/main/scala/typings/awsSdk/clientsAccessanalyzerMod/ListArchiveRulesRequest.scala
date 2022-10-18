package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArchiveRulesRequest extends StObject {
  
  /**
    * The name of the analyzer to retrieve rules from.
    */
  var analyzerName: Name
  
  /**
    * The maximum number of results to return in the request.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListArchiveRulesRequest {
  
  inline def apply(analyzerName: Name): ListArchiveRulesRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchiveRulesRequest]
  }
  
  extension [Self <: ListArchiveRulesRequest](x: Self) {
    
    inline def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
