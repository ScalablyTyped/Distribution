package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceServerActionsRequest extends StObject {
  
  /**
    * Filters to apply when listing source server post migration custom actions.
    */
  var filters: js.UndefOr[SourceServerActionsRequestFilters] = js.undefined
  
  /**
    * Maximum amount of items to return when listing source server post migration custom actions.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * Next token to use when listing source server post migration custom actions.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Source server ID.
    */
  var sourceServerID: SourceServerID
}
object ListSourceServerActionsRequest {
  
  inline def apply(sourceServerID: SourceServerID): ListSourceServerActionsRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSourceServerActionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceServerActionsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: SourceServerActionsRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
