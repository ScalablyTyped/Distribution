package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationConfigurationTemplateRequest extends StObject {
  
  /**
    * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration Template.
    */
  var associateDefaultSecurityGroup: Boolean
  
  /**
    * Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
    */
  var bandwidthThrottling: PositiveInteger
  
  /**
    * Whether to create a Public IP for the Recovery Instance by default.
    */
  var createPublicIP: Boolean
  
  /**
    * The data plane routing mechanism that will be used for replication.
    */
  var dataPlaneRouting: ReplicationConfigurationDataPlaneRouting
  
  /**
    * The Staging Disk EBS volume type to be used during replication.
    */
  var defaultLargeStagingDiskType: ReplicationConfigurationDefaultLargeStagingDiskType
  
  /**
    * The type of EBS encryption to be used during replication.
    */
  var ebsEncryption: ReplicationConfigurationEbsEncryption
  
  /**
    * The ARN of the EBS encryption key to be used during replication.
    */
  var ebsEncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The Point in time (PIT) policy to manage snapshots taken during replication.
    */
  var pitPolicy: PITPolicy
  
  /**
    * The instance type to be used for the replication server.
    */
  var replicationServerInstanceType: EC2InstanceType
  
  /**
    * The security group IDs that will be used by the replication server.
    */
  var replicationServersSecurityGroupsIDs: ReplicationServersSecurityGroupsIDs
  
  /**
    * The subnet to be used by the replication staging area.
    */
  var stagingAreaSubnetId: SubnetID
  
  /**
    * A set of tags to be associated with all resources created in the replication staging area: EC2 replication server, EBS volumes, EBS snapshots, etc.
    */
  var stagingAreaTags: TagsMap
  
  /**
    * A set of tags to be associated with the Replication Configuration Template resource.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Whether to use a dedicated Replication Server in the replication staging area.
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
    pitPolicy: PITPolicy,
    replicationServerInstanceType: EC2InstanceType,
    replicationServersSecurityGroupsIDs: ReplicationServersSecurityGroupsIDs,
    stagingAreaSubnetId: SubnetID,
    stagingAreaTags: TagsMap,
    useDedicatedReplicationServer: Boolean
  ): CreateReplicationConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(associateDefaultSecurityGroup = associateDefaultSecurityGroup.asInstanceOf[js.Any], bandwidthThrottling = bandwidthThrottling.asInstanceOf[js.Any], createPublicIP = createPublicIP.asInstanceOf[js.Any], dataPlaneRouting = dataPlaneRouting.asInstanceOf[js.Any], defaultLargeStagingDiskType = defaultLargeStagingDiskType.asInstanceOf[js.Any], ebsEncryption = ebsEncryption.asInstanceOf[js.Any], pitPolicy = pitPolicy.asInstanceOf[js.Any], replicationServerInstanceType = replicationServerInstanceType.asInstanceOf[js.Any], replicationServersSecurityGroupsIDs = replicationServersSecurityGroupsIDs.asInstanceOf[js.Any], stagingAreaSubnetId = stagingAreaSubnetId.asInstanceOf[js.Any], stagingAreaTags = stagingAreaTags.asInstanceOf[js.Any], useDedicatedReplicationServer = useDedicatedReplicationServer.asInstanceOf[js.Any])
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
    
    inline def setPitPolicy(value: PITPolicy): Self = StObject.set(x, "pitPolicy", value.asInstanceOf[js.Any])
    
    inline def setPitPolicyVarargs(value: PITPolicyRule*): Self = StObject.set(x, "pitPolicy", js.Array(value*))
    
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
