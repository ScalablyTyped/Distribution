package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWavesRequest extends StObject {
  
  /**
    * Waves list filters.
    */
  var filters: js.UndefOr[ListWavesRequestFilters] = js.undefined
  
  /**
    * Maximum results to return when listing waves.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * Request next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListWavesRequest {
  
  inline def apply(): ListWavesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWavesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWavesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ListWavesRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
