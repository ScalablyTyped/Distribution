package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBCluster extends js.Object {
  /**
    *  AllocatedStorage always returns 1, because Neptune DB cluster storage size is not fixed, but instead automatically adjusts as needed.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined
  /**
    * Provides the list of EC2 Availability Zones that instances in the DB cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
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
  var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.undefined
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Provides the list of instances that make up the DB cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined
  /**
    * Provides the list of option group memberships for this DB cluster.
    */
  var DBClusterOptionGroupMemberships: js.UndefOr[DBClusterOptionGroupMemberships] = js.undefined
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
    * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined
  /**
    * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * Specifies the connection endpoint for the primary instance of the DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  /**
    * Provides the name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Contains the master username for the DB cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.undefined
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
    * Contains one or more identifiers of the Read Replicas associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.undefined
  /**
    * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the Read Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Neptune distributes the connection requests among the Read Replicas in the DB cluster. This functionality can help balance your read workload across multiple Read Replicas in your DB cluster. If a failover occurs, and the Read Replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Read Replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.undefined
  /**
    * Not supported by Neptune.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the current state of this DB cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides a list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}

object DBCluster {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    AssociatedRoles: DBClusterRoles = null,
    AvailabilityZones: AvailabilityZones = null,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    CharacterSetName: String = null,
    CloneGroupId: String = null,
    ClusterCreateTime: TStamp = null,
    DBClusterArn: String = null,
    DBClusterIdentifier: String = null,
    DBClusterMembers: DBClusterMemberList = null,
    DBClusterOptionGroupMemberships: DBClusterOptionGroupMemberships = null,
    DBClusterParameterGroup: String = null,
    DBSubnetGroup: String = null,
    DatabaseName: String = null,
    DbClusterResourceId: String = null,
    EarliestRestorableTime: TStamp = null,
    EnabledCloudwatchLogsExports: LogTypeList = null,
    Endpoint: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    HostedZoneId: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: String = null,
    LatestRestorableTime: TStamp = null,
    MasterUsername: String = null,
    MultiAZ: js.UndefOr[Boolean] = js.undefined,
    PercentProgress: String = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ReadReplicaIdentifiers: ReadReplicaIdentifierList = null,
    ReaderEndpoint: String = null,
    ReplicationSourceIdentifier: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): DBCluster = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (AssociatedRoles != null) __obj.updateDynamic("AssociatedRoles")(AssociatedRoles)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName)
    if (CloneGroupId != null) __obj.updateDynamic("CloneGroupId")(CloneGroupId)
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime)
    if (DBClusterArn != null) __obj.updateDynamic("DBClusterArn")(DBClusterArn)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (DBClusterMembers != null) __obj.updateDynamic("DBClusterMembers")(DBClusterMembers)
    if (DBClusterOptionGroupMemberships != null) __obj.updateDynamic("DBClusterOptionGroupMemberships")(DBClusterOptionGroupMemberships)
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup)
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (DbClusterResourceId != null) __obj.updateDynamic("DbClusterResourceId")(DbClusterResourceId)
    if (EarliestRestorableTime != null) __obj.updateDynamic("EarliestRestorableTime")(EarliestRestorableTime)
    if (EnabledCloudwatchLogsExports != null) __obj.updateDynamic("EnabledCloudwatchLogsExports")(EnabledCloudwatchLogsExports)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LatestRestorableTime != null) __obj.updateDynamic("LatestRestorableTime")(LatestRestorableTime)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ReadReplicaIdentifiers != null) __obj.updateDynamic("ReadReplicaIdentifiers")(ReadReplicaIdentifiers)
    if (ReaderEndpoint != null) __obj.updateDynamic("ReaderEndpoint")(ReaderEndpoint)
    if (ReplicationSourceIdentifier != null) __obj.updateDynamic("ReplicationSourceIdentifier")(ReplicationSourceIdentifier)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups)
    __obj.asInstanceOf[DBCluster]
  }
}

