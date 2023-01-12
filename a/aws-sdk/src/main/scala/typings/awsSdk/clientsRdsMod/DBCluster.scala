package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCluster extends StObject {
  
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var ActivityStreamKinesisStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier used for encrypting messages in the database activity stream. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
    */
  var ActivityStreamKmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously.
    */
  var ActivityStreamMode: js.UndefOr[typings.awsSdk.clientsRdsMod.ActivityStreamMode] = js.undefined
  
  /**
    * The status of the database activity stream.
    */
  var ActivityStreamStatus: js.UndefOr[typings.awsSdk.clientsRdsMod.ActivityStreamStatus] = js.undefined
  
  /**
    * For all database engines except Amazon Aurora, AllocatedStorage specifies the allocated storage size in gibibytes (GiB). For Aurora, AllocatedStorage always returns 1, because Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Provides a list of the Amazon Web Services Identity and Access Management (IAM) roles that are associated with the DB cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other Amazon Web Services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined
  
  /**
    * A value that indicates that minor version patches are applied automatically. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time when a stopped DB cluster is restarted automatically.
    */
  var AutomaticRestartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsRdsMod.AvailabilityZones] = js.undefined
  
  /**
    * The number of change records stored for Backtrack.
    */
  var BacktrackConsumedChangeRecords: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster. Otherwise, backtracking is enabled.
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The current capacity of an Aurora Serverless v1 DB cluster. The capacity is 0 (zero) when the cluster is paused. For more information about Aurora Serverless v1, see Using Amazon Aurora Serverless v1 in the Amazon Aurora User Guide.
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If present, specifies the name of the character set that this cluster is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the clone group to which the DB cluster is associated.
    */
  var CloneGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies whether the DB cluster is a clone of a DB cluster owned by a different Amazon Web Services account.
    */
  var CrossAccountClone: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Identifies all custom endpoints associated with the cluster.
    */
  var CustomEndpoints: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the DB cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the compute and memory capacity class of the DB instance. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var DBClusterInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the list of instances that make up the DB cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined
  
  /**
    * Provides the list of option group memberships for this DB cluster.
    */
  var DBClusterOptionGroupMemberships: js.UndefOr[typings.awsSdk.clientsRdsMod.DBClusterOptionGroupMemberships] = js.undefined
  
  /**
    * Specifies the name of the DB cluster parameter group for the DB cluster.
    */
  var DBClusterParameterGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies information on the subnet group associated with the DB cluster, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the name of the initial database of this DB cluster that was provided at create time, if one was specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region-unique, immutable identifier for the DB cluster. This identifier is found in Amazon Web Services CloudTrail log entries whenever the KMS key for the DB cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Active Directory Domain membership records associated with the DB cluster.
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined
  
  /**
    * The earliest time to which a DB cluster can be backtracked.
    */
  var EarliestBacktrackTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of log types that this DB cluster is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon Aurora User Guide. 
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Specifies the connection endpoint for the primary instance of the DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster. For more information, see  CreateDBCluster.
    */
  var EngineMode: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global database. Because write forwarding takes time to enable, check the value of GlobalWriteForwardingStatus to confirm that the request has completed before using the write forwarding feature for this cluster.
    */
  var GlobalWriteForwardingRequested: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or is in the process of enabling it.
    */
  var GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus] = js.undefined
  
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the HTTP endpoint for an Aurora Serverless v1 DB cluster is enabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless v1 in the Amazon Aurora User Guide.
    */
  var HttpEndpointEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether the mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If StorageEncrypted is enabled, the Amazon Web Services KMS key identifier for the encrypted DB cluster. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains the master username for the DB cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the DB cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The network type of the DB instance. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB cluster. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon Aurora User Guide.  This setting is only for Aurora DB clusters.
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies that changes to the DB cluster are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[ClusterPendingModifiedValues] = js.undefined
  
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.undefined
  
  /**
    * True if Performance Insights is enabled for the DB cluster, and otherwise false. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for encryption of Performance Insights data. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:   7    month * 31, where month is a number of months from 1-23   731   For example, the following values are valid:   93 (3 months * 31)   341 (11 months * 31)   589 (19 months * 31)   731   This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod.
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the accessibility options for the DB instance. When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Contains one or more identifiers of the read replicas associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.undefined
  
  /**
    * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster. If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the identifier of the source DB cluster if this DB cluster is a read replica.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
  
  var ScalingConfigurationInfo: js.UndefOr[typings.awsSdk.clientsRdsMod.ScalingConfigurationInfo] = js.undefined
  
  var ServerlessV2ScalingConfiguration: js.UndefOr[ServerlessV2ScalingConfigurationInfo] = js.undefined
  
  /**
    * Specifies the current state of this DB cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The storage type associated with the DB cluster. This setting is only for non-Aurora Multi-AZ DB clusters.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  var TagList: js.UndefOr[typings.awsSdk.clientsRdsMod.TagList] = js.undefined
  
  /**
    * Provides a list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object DBCluster {
  
  inline def apply(): DBCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBCluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBCluster] (val x: Self) extends AnyVal {
    
    inline def setActivityStreamKinesisStreamName(value: String): Self = StObject.set(x, "ActivityStreamKinesisStreamName", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamKinesisStreamNameUndefined: Self = StObject.set(x, "ActivityStreamKinesisStreamName", js.undefined)
    
    inline def setActivityStreamKmsKeyId(value: String): Self = StObject.set(x, "ActivityStreamKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamKmsKeyIdUndefined: Self = StObject.set(x, "ActivityStreamKmsKeyId", js.undefined)
    
    inline def setActivityStreamMode(value: ActivityStreamMode): Self = StObject.set(x, "ActivityStreamMode", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamModeUndefined: Self = StObject.set(x, "ActivityStreamMode", js.undefined)
    
    inline def setActivityStreamStatus(value: ActivityStreamStatus): Self = StObject.set(x, "ActivityStreamStatus", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamStatusUndefined: Self = StObject.set(x, "ActivityStreamStatus", js.undefined)
    
    inline def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAssociatedRoles(value: DBClusterRoles): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    inline def setAssociatedRolesVarargs(value: DBClusterRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value*))
    
    inline def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAutomaticRestartTime(value: js.Date): Self = StObject.set(x, "AutomaticRestartTime", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRestartTimeUndefined: Self = StObject.set(x, "AutomaticRestartTime", js.undefined)
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBacktrackConsumedChangeRecords(value: LongOptional): Self = StObject.set(x, "BacktrackConsumedChangeRecords", value.asInstanceOf[js.Any])
    
    inline def setBacktrackConsumedChangeRecordsUndefined: Self = StObject.set(x, "BacktrackConsumedChangeRecords", js.undefined)
    
    inline def setBacktrackWindow(value: LongOptional): Self = StObject.set(x, "BacktrackWindow", value.asInstanceOf[js.Any])
    
    inline def setBacktrackWindowUndefined: Self = StObject.set(x, "BacktrackWindow", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCapacity(value: IntegerOptional): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
    
    inline def setCloneGroupId(value: String): Self = StObject.set(x, "CloneGroupId", value.asInstanceOf[js.Any])
    
    inline def setCloneGroupIdUndefined: Self = StObject.set(x, "CloneGroupId", js.undefined)
    
    inline def setClusterCreateTime(value: js.Date): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    inline def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setCrossAccountClone(value: BooleanOptional): Self = StObject.set(x, "CrossAccountClone", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountCloneUndefined: Self = StObject.set(x, "CrossAccountClone", js.undefined)
    
    inline def setCustomEndpoints(value: StringList): Self = StObject.set(x, "CustomEndpoints", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointsUndefined: Self = StObject.set(x, "CustomEndpoints", js.undefined)
    
    inline def setCustomEndpointsVarargs(value: String*): Self = StObject.set(x, "CustomEndpoints", js.Array(value*))
    
    inline def setDBClusterArn(value: String): Self = StObject.set(x, "DBClusterArn", value.asInstanceOf[js.Any])
    
    inline def setDBClusterArnUndefined: Self = StObject.set(x, "DBClusterArn", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setDBClusterInstanceClass(value: String): Self = StObject.set(x, "DBClusterInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBClusterInstanceClassUndefined: Self = StObject.set(x, "DBClusterInstanceClass", js.undefined)
    
    inline def setDBClusterMembers(value: DBClusterMemberList): Self = StObject.set(x, "DBClusterMembers", value.asInstanceOf[js.Any])
    
    inline def setDBClusterMembersUndefined: Self = StObject.set(x, "DBClusterMembers", js.undefined)
    
    inline def setDBClusterMembersVarargs(value: DBClusterMember*): Self = StObject.set(x, "DBClusterMembers", js.Array(value*))
    
    inline def setDBClusterOptionGroupMemberships(value: DBClusterOptionGroupMemberships): Self = StObject.set(x, "DBClusterOptionGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setDBClusterOptionGroupMembershipsUndefined: Self = StObject.set(x, "DBClusterOptionGroupMemberships", js.undefined)
    
    inline def setDBClusterOptionGroupMembershipsVarargs(value: DBClusterOptionGroupStatus*): Self = StObject.set(x, "DBClusterOptionGroupMemberships", js.Array(value*))
    
    inline def setDBClusterParameterGroup(value: String): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
    
    inline def setDBSubnetGroup(value: String): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDbClusterResourceId(value: String): Self = StObject.set(x, "DbClusterResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbClusterResourceIdUndefined: Self = StObject.set(x, "DbClusterResourceId", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDomainMemberships(value: DomainMembershipList): Self = StObject.set(x, "DomainMemberships", value.asInstanceOf[js.Any])
    
    inline def setDomainMembershipsUndefined: Self = StObject.set(x, "DomainMemberships", js.undefined)
    
    inline def setDomainMembershipsVarargs(value: DomainMembership*): Self = StObject.set(x, "DomainMemberships", js.Array(value*))
    
    inline def setEarliestBacktrackTime(value: js.Date): Self = StObject.set(x, "EarliestBacktrackTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestBacktrackTimeUndefined: Self = StObject.set(x, "EarliestBacktrackTime", js.undefined)
    
    inline def setEarliestRestorableTime(value: js.Date): Self = StObject.set(x, "EarliestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestRestorableTimeUndefined: Self = StObject.set(x, "EarliestRestorableTime", js.undefined)
    
    inline def setEnabledCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.undefined)
    
    inline def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.Array(value*))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineMode(value: String): Self = StObject.set(x, "EngineMode", value.asInstanceOf[js.Any])
    
    inline def setEngineModeUndefined: Self = StObject.set(x, "EngineMode", js.undefined)
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalWriteForwardingRequested(value: BooleanOptional): Self = StObject.set(x, "GlobalWriteForwardingRequested", value.asInstanceOf[js.Any])
    
    inline def setGlobalWriteForwardingRequestedUndefined: Self = StObject.set(x, "GlobalWriteForwardingRequested", js.undefined)
    
    inline def setGlobalWriteForwardingStatus(value: WriteForwardingStatus): Self = StObject.set(x, "GlobalWriteForwardingStatus", value.asInstanceOf[js.Any])
    
    inline def setGlobalWriteForwardingStatusUndefined: Self = StObject.set(x, "GlobalWriteForwardingStatus", js.undefined)
    
    inline def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    inline def setHttpEndpointEnabled(value: BooleanOptional): Self = StObject.set(x, "HttpEndpointEnabled", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointEnabledUndefined: Self = StObject.set(x, "HttpEndpointEnabled", js.undefined)
    
    inline def setIAMDatabaseAuthenticationEnabled(value: BooleanOptional): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLatestRestorableTime(value: js.Date): Self = StObject.set(x, "LatestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setLatestRestorableTimeUndefined: Self = StObject.set(x, "LatestRestorableTime", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    inline def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    inline def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setPendingModifiedValues(value: ClusterPendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setPercentProgress(value: String): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    inline def setPerformanceInsightsEnabled(value: BooleanOptional): Self = StObject.set(x, "PerformanceInsightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "PerformanceInsightsEnabled", js.undefined)
    
    inline def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    inline def setPerformanceInsightsRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setReadReplicaIdentifiers(value: ReadReplicaIdentifierList): Self = StObject.set(x, "ReadReplicaIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaIdentifiersUndefined: Self = StObject.set(x, "ReadReplicaIdentifiers", js.undefined)
    
    inline def setReadReplicaIdentifiersVarargs(value: String*): Self = StObject.set(x, "ReadReplicaIdentifiers", js.Array(value*))
    
    inline def setReaderEndpoint(value: String): Self = StObject.set(x, "ReaderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReaderEndpointUndefined: Self = StObject.set(x, "ReaderEndpoint", js.undefined)
    
    inline def setReplicationSourceIdentifier(value: String): Self = StObject.set(x, "ReplicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationSourceIdentifierUndefined: Self = StObject.set(x, "ReplicationSourceIdentifier", js.undefined)
    
    inline def setScalingConfigurationInfo(value: ScalingConfigurationInfo): Self = StObject.set(x, "ScalingConfigurationInfo", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigurationInfoUndefined: Self = StObject.set(x, "ScalingConfigurationInfo", js.undefined)
    
    inline def setServerlessV2ScalingConfiguration(value: ServerlessV2ScalingConfigurationInfo): Self = StObject.set(x, "ServerlessV2ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerlessV2ScalingConfigurationUndefined: Self = StObject.set(x, "ServerlessV2ScalingConfiguration", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value*))
  }
}
