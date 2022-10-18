package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The name of the Access Control List associated with this cluster.
    */
  var ACLName: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ACLName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
    */
  var AvailabilityMode: js.UndefOr[AZStatus] = js.undefined
  
  /**
    * The cluster's configuration endpoint
    */
  var ClusterEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * A description of the cluster
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Redis engine patch version used by the cluster
    */
  var EnginePatchVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Redis engine version used by the cluster
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the KMS key used to encrypt the cluster
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. 
    */
  var MaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster's node type
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of shards in the cluster
    */
  var NumberOfShards: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the parameter group used by the cluster
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the parameter group used by the cluster, for example 'active' or 'applying'.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * A group of settings that are currently being applied.
    */
  var PendingUpdates: js.UndefOr[ClusterPendingUpdates] = js.undefined
  
  /**
    * A list of security groups used by the cluster
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
  
  /**
    * A list of shards that are members of the cluster.
    */
  var Shards: js.UndefOr[ShardList] = js.undefined
  
  /**
    * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the SNS notification topic
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * The SNS topic must be in Active status to receive notifications
    */
  var SnsTopicStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the cluster. For example, Available, Updating, Creating.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group used by the cluster
    */
  var SubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A flag to indicate if In-transit encryption is enabled
    */
  var TLSEnabled: js.UndefOr[BooleanOptional] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setACLName(value: ACLName): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
    
    inline def setACLNameUndefined: Self = StObject.set(x, "ACLName", js.undefined)
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityMode(value: AZStatus): Self = StObject.set(x, "AvailabilityMode", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityModeUndefined: Self = StObject.set(x, "AvailabilityMode", js.undefined)
    
    inline def setClusterEndpoint(value: Endpoint): Self = StObject.set(x, "ClusterEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClusterEndpointUndefined: Self = StObject.set(x, "ClusterEndpoint", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnginePatchVersion(value: String): Self = StObject.set(x, "EnginePatchVersion", value.asInstanceOf[js.Any])
    
    inline def setEnginePatchVersionUndefined: Self = StObject.set(x, "EnginePatchVersion", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMaintenanceWindow(value: String): Self = StObject.set(x, "MaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "MaintenanceWindow", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfShards(value: IntegerOptional): Self = StObject.set(x, "NumberOfShards", value.asInstanceOf[js.Any])
    
    inline def setNumberOfShardsUndefined: Self = StObject.set(x, "NumberOfShards", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    inline def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
    
    inline def setPendingUpdates(value: ClusterPendingUpdates): Self = StObject.set(x, "PendingUpdates", value.asInstanceOf[js.Any])
    
    inline def setPendingUpdatesUndefined: Self = StObject.set(x, "PendingUpdates", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupMembershipList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupMembership*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setShards(value: ShardList): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "Shards", js.undefined)
    
    inline def setShardsVarargs(value: Shard*): Self = StObject.set(x, "Shards", js.Array(value*))
    
    inline def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    inline def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    inline def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSnsTopicStatus(value: String): Self = StObject.set(x, "SnsTopicStatus", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicStatusUndefined: Self = StObject.set(x, "SnsTopicStatus", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupNameUndefined: Self = StObject.set(x, "SubnetGroupName", js.undefined)
    
    inline def setTLSEnabled(value: BooleanOptional): Self = StObject.set(x, "TLSEnabled", value.asInstanceOf[js.Any])
    
    inline def setTLSEnabledUndefined: Self = StObject.set(x, "TLSEnabled", js.undefined)
  }
}
