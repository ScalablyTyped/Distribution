package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsRequest extends StObject {
  
  /**
    * Filters the stream list to match the specified criterion.
    */
  var filterBy: js.UndefOr[StreamFilters] = js.undefined
  
  /**
    * Maximum number of streams to return. Default: 100.
    */
  var maxResults: js.UndefOr[MaxStreamResults] = js.undefined
  
  /**
    * The first stream to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStreamsRequest {
  
  inline def apply(): ListStreamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsRequest]
  }
  
  extension [Self <: ListStreamsRequest](x: Self) {
    
    inline def setFilterBy(value: StreamFilters): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setMaxResults(value: MaxStreamResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
