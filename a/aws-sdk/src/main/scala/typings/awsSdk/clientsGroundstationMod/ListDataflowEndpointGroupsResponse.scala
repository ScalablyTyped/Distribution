package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataflowEndpointGroupsResponse extends StObject {
  
  /**
    * A list of dataflow endpoint groups.
    */
  var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.undefined
  
  /**
    * Next token returned in the response of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDataflowEndpointGroupsResponse {
  
  inline def apply(): ListDataflowEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
  }
  
  extension [Self <: ListDataflowEndpointGroupsResponse](x: Self) {
    
    inline def setDataflowEndpointGroupList(value: DataflowEndpointGroupList): Self = StObject.set(x, "dataflowEndpointGroupList", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointGroupListUndefined: Self = StObject.set(x, "dataflowEndpointGroupList", js.undefined)
    
    inline def setDataflowEndpointGroupListVarargs(value: DataflowEndpointListItem*): Self = StObject.set(x, "dataflowEndpointGroupList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
