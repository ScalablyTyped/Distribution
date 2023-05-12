package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsRequest extends StObject {
  
  var filters: js.UndefOr[ListExportsRequestFilters] = js.undefined
  
  /**
    * List export request max results.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * List export request next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExportsRequest {
  
  inline def apply(): ListExportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ListExportsRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
