package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodeInput extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  
  /**
    * The unique identifier of the member that owns this node. Applies only to Hyperledger Fabric.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier of the network for the node. Ethereum public networks have the following NetworkIds:    n-ethereum-mainnet     n-ethereum-rinkeby     n-ethereum-ropsten   
    */
  var NetworkId: ResourceIdString
  
  /**
    * The properties of a node configuration.
    */
  var NodeConfiguration: typings.awsSdk.clientsManagedblockchainMod.NodeConfiguration
  
  /**
    * Tags to assign to the node. Each tag consists of a key and optional value. When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an overall maximum of 50 tags added to each resource. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  var Tags: js.UndefOr[InputTagMap] = js.undefined
}
object CreateNodeInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestTokenString,
    NetworkId: ResourceIdString,
    NodeConfiguration: NodeConfiguration
  ): CreateNodeInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeConfiguration = NodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeInput]
  }
  
  extension [Self <: CreateNodeInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNodeConfiguration(value: NodeConfiguration): Self = StObject.set(x, "NodeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
