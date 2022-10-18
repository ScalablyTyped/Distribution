package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodesInput extends StObject {
  
  /**
    * The maximum number of nodes to list.
    */
  var MaxResults: js.UndefOr[NodeListMaxResults] = js.undefined
  
  /**
    * The unique identifier of the member who owns the nodes to list. Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier of the network for which to list nodes.
    */
  var NetworkId: ResourceIdString
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An optional status specifier. If provided, only nodes currently in this status are listed.
    */
  var Status: js.UndefOr[NodeStatus] = js.undefined
}
object ListNodesInput {
  
  inline def apply(NetworkId: ResourceIdString): ListNodesInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodesInput]
  }
  
  extension [Self <: ListNodesInput](x: Self) {
    
    inline def setMaxResults(value: NodeListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: NodeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
