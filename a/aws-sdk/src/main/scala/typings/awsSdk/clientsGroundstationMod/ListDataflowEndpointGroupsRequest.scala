package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataflowEndpointGroupsRequest extends StObject {
  
  /**
    * Maximum number of dataflow endpoint groups returned.
    */
  var maxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * Next token returned in the request of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDataflowEndpointGroupsRequest {
  
  inline def apply(): ListDataflowEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataflowEndpointGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataflowEndpointGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
