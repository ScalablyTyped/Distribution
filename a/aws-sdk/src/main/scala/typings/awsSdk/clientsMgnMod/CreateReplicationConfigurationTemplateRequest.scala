package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationConfigurationTemplateRequest extends StObject {
  
  /**
    * Request to associate the default Application Migration Service Security group with the Replication Settings template.
    */
  var associateDefaultSecurityGroup: Boolean
  
  /**
    * Request to configure bandwidth throttling during Replication Settings template creation.
    */
  var bandwidthThrottling: PositiveInteger
  
  /**
    * Request to create Public IP during Replication Settings template creation.
    */
  var createPublicIP: Boolean
  
  /**
    * Request to configure data plane routing during Replication Settings template creation.
    */
  var dataPlaneRouting: ReplicationConfigurationDataPlaneRouting
  
  /**
    * Request to configure the default large staging disk EBS volume type during Replication Settings template creation.
    */
  var defaultLargeStagingDiskType: ReplicationConfigurationDefaultLargeStagingDiskType
  
  /**
    * Request to configure EBS encryption during Replication Settings template creation.
    */
  var ebsEncryption: ReplicationConfigurationEbsEncryption
  
  /**
    * Request to configure an EBS encryption key during Replication Settings template creation.
    */
  var ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Request to configure the Replication Server instance type during Replication Settings template creation.
    */
  var replicationServerInstanceType: EC2InstanceType
  
  /**
    * Request to configure the Replication Server Security group ID during Replication Settings template creation.
    */
  var replicationServersSecurityGroupsIDs: ReplicationServersSecurityGroupsIDs
  
  /**
    * Request to configure the Staging Area subnet ID during Replication Settings template creation.
    */
  var stagingAreaSubnetId: SubnetID
  
  /**
    * Request to configure Staging Area tags during Replication Settings template creation.
    */
  var stagingAreaTags: TagsMap
  
  /**
    * Request to configure tags during Replication Settings template creation.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Request to use Dedicated Replication Servers during Replication Settings template creation.
    */
  var useDedicatedReplicationServer: Boolean
}
object CreateReplicationConfigurationTemplateRequest {
  
  inline def apply(
    associateDefaultSecurityGroup: Boolean,
    bandwidthThrottling: PositiveInteger,
    createPublicIP: Boolean,
    dataPlaneRouting: ReplicationConfigurationDataPlaneRouting,
    defaultLargeStagingDiskType: ReplicationConfigurationDefaultLargeStagingDiskType,
    ebsEncryption: ReplicationConfigurationEbsEncryption,
    replicationServerInstanceType: EC2InstanceType,
    replicationServersSecurityGroupsIDs: ReplicationServersSecurityGroupsIDs,
    stagingAreaSubnetId: SubnetID,
    stagingAreaTags: TagsMap,
    useDedicatedReplicationServer: Boolean
  ): CreateReplicationConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(associateDefaultSecurityGroup = associateDefaultSecurityGroup.asInstanceOf[js.Any], bandwidthThrottling = bandwidthThrottling.asInstanceOf[js.Any], createPublicIP = createPublicIP.asInstanceOf[js.Any], dataPlaneRouting = dataPlaneRouting.asInstanceOf[js.Any], defaultLargeStagingDiskType = defaultLargeStagingDiskType.asInstanceOf[js.Any], ebsEncryption = ebsEncryption.asInstanceOf[js.Any], replicationServerInstanceType = replicationServerInstanceType.asInstanceOf[js.Any], replicationServersSecurityGroupsIDs = replicationServersSecurityGroupsIDs.asInstanceOf[js.Any], stagingAreaSubnetId = stagingAreaSubnetId.asInstanceOf[js.Any], stagingAreaTags = stagingAreaTags.asInstanceOf[js.Any], useDedicatedReplicationServer = useDedicatedReplicationServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationConfigurationTemplateRequest]
  }
  
  extension [Self <: CreateReplicationConfigurationTemplateRequest](x: Self) {
    
    inline def setAssociateDefaultSecurityGroup(value: Boolean): Self = StObject.set(x, "associateDefaultSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setBandwidthThrottling(value: PositiveInteger): Self = StObject.set(x, "bandwidthThrottling", value.asInstanceOf[js.Any])
    
    inline def setCreatePublicIP(value: Boolean): Self = StObject.set(x, "createPublicIP", value.asInstanceOf[js.Any])
    
    inline def setDataPlaneRouting(value: ReplicationConfigurationDataPlaneRouting): Self = StObject.set(x, "dataPlaneRouting", value.asInstanceOf[js.Any])
    
    inline def setDefaultLargeStagingDiskType(value: ReplicationConfigurationDefaultLargeStagingDiskType): Self = StObject.set(x, "defaultLargeStagingDiskType", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryption(value: ReplicationConfigurationEbsEncryption): Self = StObject.set(x, "ebsEncryption", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryptionKeyArn(value: ARN): Self = StObject.set(x, "ebsEncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryptionKeyArnUndefined: Self = StObject.set(x, "ebsEncryptionKeyArn", js.undefined)
    
    inline def setReplicationServerInstanceType(value: EC2InstanceType): Self = StObject.set(x, "replicationServerInstanceType", value.asInstanceOf[js.Any])
    
    inline def setReplicationServersSecurityGroupsIDs(value: ReplicationServersSecurityGroupsIDs): Self = StObject.set(x, "replicationServersSecurityGroupsIDs", value.asInstanceOf[js.Any])
    
    inline def setReplicationServersSecurityGroupsIDsVarargs(value: SecurityGroupID*): Self = StObject.set(x, "replicationServersSecurityGroupsIDs", js.Array(value*))
    
    inline def setStagingAreaSubnetId(value: SubnetID): Self = StObject.set(x, "stagingAreaSubnetId", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaTags(value: TagsMap): Self = StObject.set(x, "stagingAreaTags", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUseDedicatedReplicationServer(value: Boolean): Self = StObject.set(x, "useDedicatedReplicationServer", value.asInstanceOf[js.Any])
  }
}
