package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPluginsRequest extends StObject {
  
  /**
    * The maximum number of plugins that can be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListPluginsRequest {
  
  inline def apply(): ListPluginsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPluginsRequest]
  }
  
  extension [Self <: ListPluginsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
