package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNodeInput extends StObject {
  
  /**
    * The unique identifier of the member that owns this node. Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier of the network that the node is on. Ethereum public networks have the following NetworkIds:    n-ethereum-mainnet     n-ethereum-goerli     n-ethereum-rinkeby     n-ethereum-ropsten   
    */
  var NetworkId: ResourceIdString
  
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString
}
object DeleteNodeInput {
  
  inline def apply(NetworkId: ResourceIdString, NodeId: ResourceIdString): DeleteNodeInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNodeInput]
  }
  
  extension [Self <: DeleteNodeInput](x: Self) {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
