package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsRequest extends StObject {
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The scope of the components to list. Default: PRIVATE 
    */
  var scope: js.UndefOr[ComponentVisibilityScope] = js.undefined
}
object ListComponentsRequest {
  
  inline def apply(): ListComponentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsRequest]
  }
  
  extension [Self <: ListComponentsRequest](x: Self) {
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setScope(value: ComponentVisibilityScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
