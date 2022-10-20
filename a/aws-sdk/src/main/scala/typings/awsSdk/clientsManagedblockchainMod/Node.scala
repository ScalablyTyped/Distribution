package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[ArnString] = js.undefined
  
  /**
    * The Availability Zone in which the node exists. Required for Ethereum nodes. 
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined
  
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Attributes of the blockchain framework being used.
    */
  var FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes] = js.undefined
  
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The instance type of the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the customer managed key in Key Management Service (KMS) that the node uses for encryption at rest. If the value of this parameter is "AWS Owned KMS Key", the node uses an Amazon Web Services owned KMS key for encryption. The node inherits this parameter from the member that it belongs to. For more information, see Encryption at Rest in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide. Applies only to Hyperledger Fabric.
    */
  var KmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on Managed Blockchain.
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined
  
  /**
    * The unique identifier of the member to which the node belongs. Applies only to Hyperledger Fabric.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier of the network that the node is on.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The state database that the node uses. Values are LevelDB or CouchDB. Applies only to Hyperledger Fabric.
    */
  var StateDB: js.UndefOr[StateDBType] = js.undefined
  
  /**
    * The status of the node.    CREATING - The Amazon Web Services account is in the process of creating a node.    AVAILABLE - The node has been created and can participate in the network.    UNHEALTHY - The node is impaired and might not function as expected. Amazon Managed Blockchain automatically finds nodes in this state and tries to recover them. If a node is recoverable, it returns to AVAILABLE. Otherwise, it moves to FAILED status.    CREATE_FAILED - The Amazon Web Services account attempted to create a node and creation failed.    UPDATING - The node is in the process of being updated.    DELETING - The node is in the process of being deleted.    DELETED - The node can no longer participate on the network.    FAILED - The node is no longer functional, cannot be recovered, and must be deleted.    INACCESSIBLE_ENCRYPTION_KEY - The node is impaired and might not function as expected because it cannot access the specified customer managed key in KMS for encryption at rest. Either the KMS key was disabled or deleted, or the grants on the key were revoked. The effect of disabling or deleting a key or of revoking a grant isn't immediate. It might take some time for the node resource to discover that the key is inaccessible. When a resource is in this state, we recommend deleting and recreating the resource.  
    */
  var Status: js.UndefOr[NodeStatus] = js.undefined
  
  /**
    * Tags assigned to the node. Each tag consists of a key and optional value. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  var Tags: js.UndefOr[OutputTagMap] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setArn(value: ArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAvailabilityZone(value: AvailabilityZoneString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setFrameworkAttributes(value: NodeFrameworkAttributes): Self = StObject.set(x, "FrameworkAttributes", value.asInstanceOf[js.Any])
    
    inline def setFrameworkAttributesUndefined: Self = StObject.set(x, "FrameworkAttributes", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceType(value: InstanceTypeString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    inline def setStateDB(value: StateDBType): Self = StObject.set(x, "StateDB", value.asInstanceOf[js.Any])
    
    inline def setStateDBUndefined: Self = StObject.set(x, "StateDB", js.undefined)
    
    inline def setStatus(value: NodeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: OutputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
