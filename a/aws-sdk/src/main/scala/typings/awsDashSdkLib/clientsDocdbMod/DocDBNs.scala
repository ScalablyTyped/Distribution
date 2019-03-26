package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/docdb", "DocDB")
@js.native
object DocDBNs extends js.Object {
  trait AddTagsToResourceMessage extends js.Object {
    /**
      * The Amazon DocumentDB resource that the tags are added to. This value is an Amazon Resource Name (ARN).
      */
    var ResourceName: String
    /**
      * The tags to be assigned to the Amazon DocumentDB resource. 
      */
    var Tags: TagList
  }
  
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    /**
      * The pending maintenance action to apply to this resource. Valid values: system-update, db-upgrade 
      */
    var ApplyAction: String
    /**
      * A value that specifies the type of opt-in request or undoes an opt-in request. An opt-in request of type immediate can't be undone. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
      */
    var OptInType: String
    /**
      * The Amazon Resource Name (ARN) of the resource that the pending maintenance action applies to.
      */
    var ResourceIdentifier: String
  }
  
  trait ApplyPendingMaintenanceActionResult extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
  }
  
  trait AvailabilityZone extends js.Object {
    /**
      * The name of the Availability Zone.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudwatchLogsExportConfiguration extends js.Object {
    /**
      * The list of log types to disable.
      */
    var DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined
    /**
      * The list of log types to enable.
      */
    var EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  }
  
  trait CopyDBClusterParameterGroupMessage extends js.Object {
    /**
      * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. Constraints:   Must specify a valid DB cluster parameter group.   If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter group identifier; for example, my-db-cluster-param-group, or a valid ARN.   If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter group ARN; for example, arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1.  
      */
    var SourceDBClusterParameterGroupIdentifier: String
    /**
      * The tags that are to be assigned to the parameter group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A description for the copied DB cluster parameter group.
      */
    var TargetDBClusterParameterGroupDescription: String
    /**
      * The identifier for the copied DB cluster parameter group. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-param-group1 
      */
    var TargetDBClusterParameterGroupIdentifier: String
  }
  
  trait CopyDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
  }
  
  trait CopyDBClusterSnapshotMessage extends js.Object {
    /**
      * Set to true to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false. The default is false.
      */
    var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The AWS KMS key ID for an encrypted DB cluster snapshot. The AWS KMS key ID is the Amazon Resource Name (ARN), AWS KMS key identifier, or the AWS KMS key alias for the AWS KMS encryption key.  If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new AWS KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the DB cluster snapshot is encrypted with the same AWS KMS key as the source DB cluster snapshot.  If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId.  To copy an encrypted DB cluster snapshot to another AWS Region, set KmsKeyId to the AWS KMS key ID that you want to use to encrypt the copy of the DB cluster snapshot in the destination Region. AWS KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one Region in another Region. If you copy an unencrypted DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot API action in the AWS Region that contains the source DB cluster snapshot to copy. You must use the PreSignedUrl parameter when copying an encrypted DB cluster snapshot from another AWS Region. The presigned URL must be a valid request for the CopyDBSClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The presigned URL request must contain the following parameter values:    KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the presigned URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:my-cluster-snapshot-20161115.  
      */
    var PreSignedUrl: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the DB cluster snapshot to copy. This parameter is not case sensitive. You can't copy an encrypted, shared DB cluster snapshot from one AWS Region to another. Constraints:   Must specify a valid system snapshot in the "available" state.   If the source snapshot is in the same AWS Region as the copy, specify a valid DB snapshot identifier.   If the source snapshot is in a different AWS Region than the copy, specify a valid DB cluster snapshot ARN.   Example: my-cluster-snapshot1 
      */
    var SourceDBClusterSnapshotIdentifier: String
    /**
      * The tags to be assigned to the DB cluster snapshot.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is not case sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot2 
      */
    var TargetDBClusterSnapshotIdentifier: String
  }
  
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
  }
  
  trait CreateDBClusterMessage extends js.Object {
    /**
      * A list of Amazon EC2 Availability Zones that instances in the DB cluster can be created in.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35.  
      */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster 
      */
    var DBClusterIdentifier: String
    /**
      *  The name of the DB cluster parameter group to associate with this DB cluster.
      */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A DB subnet group to associate with this DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
      */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
      */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
      * The name of the database engine to be used for this DB cluster. Valid values: docdb 
      */
    var Engine: String
    /**
      * The version number of the database engine to use.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The AWS KMS key identifier for an encrypted DB cluster. The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are creating a DB cluster using the same AWS account that owns the AWS KMS encryption key that is used to encrypt the new DB cluster, you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key. If an encryption key is not specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon DocumentDB uses the encryption key that is used to encrypt the source. Otherwise, Amazon DocumentDB uses your default encryption key.    If the StorageEncrypted parameter is true and ReplicationSourceIdentifier is not specified, Amazon DocumentDB uses your default encryption key.   AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. If you create a replica of an encrypted DB cluster in another AWS Region, you must set KmsKeyId to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the replica in that AWS Region.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
      */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
      * The name of the master user for the DB cluster. Constraints:   Must be from 1 to 16 letters or numbers.   The first character must be a letter.   Cannot be a reserved word for the chosen database engine.  
      */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
      * The port number on which the instances in the DB cluster accept connections.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
      */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
      * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether the DB cluster is encrypted.
      */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The tags to be assigned to the DB cluster.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A list of EC2 VPC security groups to associate with this DB cluster.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait CreateDBClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the DB cluster parameter group. Constraints:   Must match the name of an existing DBClusterParameterGroup.    This value is stored as a lowercase string. 
      */
    var DBClusterParameterGroupName: String
    /**
      * The DB cluster parameter group family name.
      */
    var DBParameterGroupFamily: String
    /**
      * The description for the DB cluster parameter group.
      */
    var Description: String
    /**
      * The tags to be assigned to the DB cluster parameter group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
  }
  
  trait CreateDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  trait CreateDBClusterSnapshotMessage extends js.Object {
    /**
      * The identifier of the DB cluster to create a snapshot for. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.   Example: my-cluster 
      */
    var DBClusterIdentifier: String
    /**
      * The identifier of the DB cluster snapshot. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot1 
      */
    var DBClusterSnapshotIdentifier: String
    /**
      * The tags to be assigned to the DB cluster snapshot.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
  }
  
  trait CreateDBInstanceMessage extends js.Object {
    /**
      * Indicates that minor engine upgrades are applied automatically to the DB instance during the maintenance window. Default: true 
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      *  The Amazon EC2 Availability Zone that the DB instance is created in. Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d   Constraint: The AvailabilityZone parameter can't be specified if the MultiAZ parameter is set to true. The specified Availability Zone must be in the same AWS Region as the current endpoint. 
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the DB cluster that the instance will belong to.
      */
    var DBClusterIdentifier: String
    /**
      * The compute and memory capacity of the DB instance; for example, db.m4.large. 
      */
    var DBInstanceClass: String
    /**
      * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
      */
    var DBInstanceIdentifier: String
    /**
      * The name of the database engine to be used for this instance. Valid value: docdb 
      */
    var Engine: String
    /**
      * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
      */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The tags to be assigned to the DB instance.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  trait CreateDBSubnetGroupMessage extends js.Object {
    /**
      * The description for the DB subnet group.
      */
    var DBSubnetGroupDescription: String
    /**
      * The name for the DB subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 letters, numbers, periods, underscores, spaces, or hyphens. Must not be default. Example: mySubnetgroup 
      */
    var DBSubnetGroupName: String
    /**
      * The Amazon EC2 subnet IDs for the DB subnet group.
      */
    var SubnetIds: SubnetIdentifierList
    /**
      * The tags to be assigned to the DB subnet group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
  }
  
  trait DBCluster extends js.Object {
    /**
      * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services on your behalf.
      */
    var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined
    /**
      * Provides the list of Amazon EC2 Availability Zones that instances in the DB cluster can be created in.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * Specifies the number of days for which automatic DB snapshots are retained.
      */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
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
      * Specifies the name of the DB cluster parameter group for the DB cluster.
      */
    var DBClusterParameterGroup: js.UndefOr[String] = js.undefined
    /**
      * Specifies information on the subnet group that is associated with the DB cluster, including the name, description, and subnets in the subnet group.
      */
    var DBSubnetGroup: js.UndefOr[String] = js.undefined
    /**
      * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
      */
    var DbClusterResourceId: js.UndefOr[String] = js.undefined
    /**
      * The earliest time to which a database can be restored with point-in-time restore.
      */
    var EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A list of log types that this DB cluster is configured to export to Amazon CloudWatch Logs.
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
      * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies the latest time to which a database can be restored with point-in-time restore.
      */
    var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Contains the master user name for the DB cluster.
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
      * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load balances connections across the Amazon DocumentDB replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Amazon DocumentDB distributes the connection requests among the Amazon DocumentDB replicas in the DB cluster. This functionality can help balance your read workload across multiple Amazon DocumentDB replicas in your DB cluster.  If a failover occurs, and the Amazon DocumentDB replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Amazon DocumentDB replicas in the cluster, you can then reconnect to the reader endpoint.
      */
    var ReaderEndpoint: js.UndefOr[String] = js.undefined
    /**
      * Specifies the current state of this DB cluster.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether the DB cluster is encrypted.
      */
    var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * Provides a list of virtual private cloud (VPC) security groups that the DB cluster belongs to.
      */
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
  }
  
  trait DBClusterMember extends js.Object {
    /**
      * Specifies the status of the DB cluster parameter group for this member of the DB cluster.
      */
    var DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined
    /**
      * Specifies the instance identifier for this member of the DB cluster.
      */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A value that is true if the cluster member is the primary instance for the DB cluster and false otherwise.
      */
    var IsClusterWriter: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. 
      */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DBClusterMessage extends js.Object {
    /**
      * A list of DB clusters.
      */
    var DBClusters: js.UndefOr[DBClusterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterParameterGroup extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the DB cluster parameter group.
      */
    var DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Provides the name of the DB cluster parameter group.
      */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
      */
    var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * Provides the customer-specified description for this DB cluster parameter group.
      */
    var Description: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterParameterGroupDetails extends js.Object {
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * Provides a list of parameters for the DB cluster parameter group.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  trait DBClusterParameterGroupNameMessage extends js.Object {
    /**
      * The name of a DB cluster parameter group. Constraints:   Must be from 1 to 255 letters or numbers.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.    This value is stored as a lowercase string. 
      */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterParameterGroupsMessage extends js.Object {
    /**
      * A list of DB cluster parameter groups.
      */
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterRole extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
      */
    var RoleArn: js.UndefOr[String] = js.undefined
    /**
      * Describes the state of association between the IAM role and the DB cluster. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the DB cluster and can be used to access other AWS services on your behalf.    PENDING - The IAM role ARN is being associated with the DB cluster.    INVALID - The IAM role ARN is associated with the DB cluster, but the DB cluster cannot assume the IAM role to access other AWS services on your behalf.  
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterSnapshot extends js.Object {
    /**
      * Provides the list of Amazon EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
      */
    var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
      */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the DB cluster snapshot.
      */
    var DBClusterSnapshotArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the identifier for the DB cluster snapshot.
      */
    var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the database engine.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * Provides the version of the database engine for this DB cluster snapshot.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Provides the master user name for the DB cluster snapshot.
      */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
      * Specifies the percentage of the estimated data that has been transferred.
      */
    var PercentProgress: js.UndefOr[Integer] = js.undefined
    /**
      * Specifies the port that the DB cluster was listening on at the time of the snapshot.
      */
    var Port: js.UndefOr[Integer] = js.undefined
    /**
      * Provides the time when the snapshot was taken, in UTC.
      */
    var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Provides the type of the DB cluster snapshot.
      */
    var SnapshotType: js.UndefOr[String] = js.undefined
    /**
      * If the DB cluster snapshot was copied from a source DB cluster snapshot, the ARN for the source DB cluster snapshot; otherwise, a null value.
      */
    var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the status of this DB cluster snapshot.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether the DB cluster snapshot is encrypted.
      */
    var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * Provides the virtual private cloud (VPC) ID that is associated with the DB cluster snapshot.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterSnapshotAttribute extends js.Object {
    /**
      * The name of the manual DB cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual DB cluster snapshot.
      */
    var AttributeName: js.UndefOr[String] = js.undefined
    /**
      * The values for the manual DB cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of all is in the list, then the manual DB cluster snapshot is public and available for any AWS account to copy or restore.
      */
    var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  trait DBClusterSnapshotAttributesResult extends js.Object {
    /**
      * The list of attributes and values for the DB cluster snapshot.
      */
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined
    /**
      * The identifier of the DB cluster snapshot that the attributes apply to.
      */
    var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait DBClusterSnapshotMessage extends js.Object {
    /**
      * Provides a list of DB cluster snapshots.
      */
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DBEngineVersion extends js.Object {
    /**
      * The description of the database engine.
      */
    var DBEngineDescription: js.UndefOr[String] = js.undefined
    /**
      * The description of the database engine version.
      */
    var DBEngineVersionDescription: js.UndefOr[String] = js.undefined
    /**
      * The name of the DB parameter group family for the database engine.
      */
    var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The name of the database engine.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version number of the database engine.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
      */
    var ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined
    /**
      * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
      */
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of engine versions that this database engine version can be upgraded to.
      */
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
  }
  
  trait DBEngineVersionMessage extends js.Object {
    /**
      * Detailed information about one or more DB engine versions.
      */
    var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DBInstance extends js.Object {
    /**
      * Indicates that minor version patches are applied automatically.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the name of the Availability Zone that the DB instance is located in.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * Specifies the number of days for which automatic DB snapshots are retained.
      */
    var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
    /**
      * Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of a DB cluster.
      */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the DB instance.
      */
    var DBInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * Contains the name of the compute and memory capacity class of the DB instance.
      */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * Contains a user-provided database identifier. This identifier is the unique key that identifies a DB instance.
      */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the current state of this database.
      */
    var DBInstanceStatus: js.UndefOr[String] = js.undefined
    /**
      * Specifies information on the subnet group that is associated with the DB instance, including the name, description, and subnets in the subnet group.
      */
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    /**
      * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
      */
    var DbiResourceId: js.UndefOr[String] = js.undefined
    /**
      * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
      */
    var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
      * Specifies the connection endpoint.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * Provides the name of the database engine to be used for this DB instance.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * Indicates the database engine version.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * Provides the date and time that the DB instance was created.
      */
    var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance. 
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies the latest time to which a database can be restored with point-in-time restore.
      */
    var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Specifies that changes to the DB instance are pending. This element is included only when changes are pending. Specific changes are identified by subelements.
      */
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined
    /**
      *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
      */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
      * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance.
      */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Specifies the availability options for the DB instance. A value of true specifies an internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
      */
    var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
    /**
      * The status of a read replica. If the instance is not a read replica, this is blank.
      */
    var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined
    /**
      * Specifies whether the DB instance is encrypted.
      */
    var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * Provides a list of VPC security group elements that the DB instance belongs to.
      */
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
  }
  
  trait DBInstanceMessage extends js.Object {
    /**
      * Detailed information about one or more DB instances. 
      */
    var DBInstances: js.UndefOr[DBInstanceList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DBInstanceStatusInfo extends js.Object {
    /**
      * Details of the error if there is an error for the instance. If the instance is not in an error state, this value is blank.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * A Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
      */
    var Normal: js.UndefOr[Boolean] = js.undefined
    /**
      * Status of the DB instance. For a StatusType of read replica, the values can be replicating, error, stopped, or terminated.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * This value is currently "read replication."
      */
    var StatusType: js.UndefOr[String] = js.undefined
  }
  
  trait DBSubnetGroup extends js.Object {
    /**
      * The Amazon Resource Identifier (ARN) for the DB subnet group.
      */
    var DBSubnetGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Provides the description of the DB subnet group.
      */
    var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The name of the DB subnet group.
      */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * Provides the status of the DB subnet group.
      */
    var SubnetGroupStatus: js.UndefOr[String] = js.undefined
    /**
      * Detailed information about one or more subnets within a DB subnet group.
      */
    var Subnets: js.UndefOr[SubnetList] = js.undefined
    /**
      * Provides the virtual private cloud (VPC) ID of the DB subnet group.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait DBSubnetGroupMessage extends js.Object {
    /**
      * Detailed information about one or more DB subnet groups.
      */
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DeleteDBClusterMessage extends js.Object {
    /**
      * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
      */
    var DBClusterIdentifier: String
    /**
      *  The DB cluster snapshot identifier of the new DB cluster snapshot created when SkipFinalSnapshot is set to false.    Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.   Constraints:   Must be from 1 to 255 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      *  Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If true is specified, no DB cluster snapshot is created. If false is specified, a DB cluster snapshot is created before the DB cluster is deleted.   If SkipFinalSnapshot is false, you must specify a FinalDBSnapshotIdentifier parameter.  Default: false 
      */
    var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the DB cluster parameter group. Constraints:   Must be the name of an existing DB cluster parameter group.   You can't delete a default DB cluster parameter group.   Cannot be associated with any DB clusters.  
      */
    var DBClusterParameterGroupName: String
  }
  
  trait DeleteDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  trait DeleteDBClusterSnapshotMessage extends js.Object {
    /**
      * The identifier of the DB cluster snapshot to delete. Constraints: Must be the name of an existing DB cluster snapshot in the available state.
      */
    var DBClusterSnapshotIdentifier: String
  }
  
  trait DeleteDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
  }
  
  trait DeleteDBInstanceMessage extends js.Object {
    /**
      * The DB instance identifier for the DB instance to be deleted. This parameter isn't case sensitive. Constraints:   Must match the name of an existing DB instance.  
      */
    var DBInstanceIdentifier: String
  }
  
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  trait DeleteDBSubnetGroupMessage extends js.Object {
    /**
      * The name of the database subnet group to delete.  You can't delete the default subnet group.  Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
      */
    var DBSubnetGroupName: String
  }
  
  trait DescribeDBClusterParameterGroupsMessage extends js.Object {
    /**
      * The name of a specific DB cluster parameter group to return details for. Constraints:   If provided, must match the name of an existing DBClusterParameterGroup.  
      */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeDBClusterParametersMessage extends js.Object {
    /**
      * The name of a specific DB cluster parameter group to return parameter details for. Constraints:   If provided, must match the name of an existing DBClusterParameterGroup.  
      */
    var DBClusterParameterGroupName: String
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      *  A value that indicates to return only parameters for a specific source. Parameter sources can be engine, service, or customer. 
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
    /**
      * The identifier for the DB cluster snapshot to describe the attributes for.
      */
    var DBClusterSnapshotIdentifier: String
  }
  
  trait DescribeDBClusterSnapshotAttributesResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
  }
  
  trait DescribeDBClusterSnapshotsMessage extends js.Object {
    /**
      * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used with the DBClusterSnapshotIdentifier parameter. This parameter is not case sensitive.  Constraints:   If provided, must match the identifier of an existing DBCluster.  
      */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A specific DB cluster snapshot identifier to describe. This parameter can't be used with the DBClusterIdentifier parameter. This value is stored as a lowercase string.  Constraints:   If provided, must match the identifier of an existing DBClusterSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
      */
    var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * Set to true to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and otherwise false. The default is false.
      */
    var IncludePublic: js.UndefOr[Boolean] = js.undefined
    /**
      * Set to true to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given permission to copy or restore, and otherwise false. The default is false.
      */
    var IncludeShared: js.UndefOr[Boolean] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The type of DB cluster snapshots to be returned. You can specify one of the following values:    automated - Return all DB cluster snapshots that Amazon DocumentDB has automatically created for your AWS account.    manual - Return all DB cluster snapshots that you have manually created for your AWS account.    shared - Return all manual DB cluster snapshots that have been shared to your AWS account.    public - Return all DB cluster snapshots that have been marked as public.   If you don't specify a SnapshotType value, then both automated and manual DB cluster snapshots are returned. You can include shared DB cluster snapshots with these results by setting the IncludeShared parameter to true. You can include public DB cluster snapshots with these results by setting the IncludePublic parameter to true. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
      */
    var SnapshotType: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeDBClustersMessage extends js.Object {
    /**
      * The user-provided DB cluster identifier. If this parameter is specified, information from only the specific DB cluster is returned. This parameter isn't case sensitive. Constraints:   If provided, must match an existing DBClusterIdentifier.  
      */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A filter that specifies one or more DB clusters to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list only includes information about the DB clusters identified by these ARNs.  
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeDBEngineVersionsMessage extends js.Object {
    /**
      * The name of a specific DB parameter group family to return details for. Constraints:   If provided, must match an existing DBParameterGroupFamily.  
      */
    var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * Indicates that only the default version of the specified engine or engine and major version combination is returned.
      */
    var DefaultOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * The database engine to return.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The database engine version to return. Example: 5.1.49 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * If this parameter is specified and the requested engine supports the CharacterSetName parameter for CreateDBInstance, the response includes a list of supported character sets for each engine version. 
      */
    var ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * If this parameter is specified and the requested engine supports the TimeZone parameter for CreateDBInstance, the response includes a list of supported time zones for each engine version. 
      */
    var ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeDBInstancesMessage extends js.Object {
    /**
      * The user-provided instance identifier. If this parameter is specified, information from only the specific DB instance is returned. This parameter isn't case sensitive. Constraints:   If provided, must match the identifier of an existing DBInstance.  
      */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A filter that specifies one or more DB instances to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list includes only the information about the DB instances that are associated with the DB clusters that are identified by these ARNs.    db-instance-id - Accepts DB instance identifiers and DB instance ARNs. The results list includes only the information about the DB instances that are identified by these ARNs.  
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeDBSubnetGroupsMessage extends js.Object {
    /**
      * The name of the DB subnet group to return details for.
      */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeEngineDefaultClusterParametersMessage extends js.Object {
    /**
      * The name of the DB cluster parameter group family to return the engine parameter information for.
      */
    var DBParameterGroupFamily: String
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeEngineDefaultClusterParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
  }
  
  trait DescribeEventCategoriesMessage extends js.Object {
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The type of source that is generating the events. Valid values: db-instance, db-parameter-group, db-security-group, db-snapshot 
      */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventsMessage extends js.Object {
    /**
      * The number of minutes to retrieve events for. Default: 60
      */
    var Duration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      *  The end of the time interval for which to retrieve events, specified in ISO 8601 format.  Example: 2009-07-08T18:00Z
      */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A list of event categories that trigger notifications for an event notification subscription.
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier of the event source for which events are returned. If not specified, then all sources are included in the response. Constraints:   If SourceIdentifier is provided, SourceType must also be provided.   If the source type is DBInstance, a DBInstanceIdentifier must be provided.   If the source type is DBSecurityGroup, a DBSecurityGroupName must be provided.   If the source type is DBParameterGroup, a DBParameterGroupName must be provided.   If the source type is DBSnapshot, a DBSnapshotIdentifier must be provided.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The event source to retrieve events for. If no value is specified, all events are returned.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
      *  The beginning of the time interval to retrieve events for, specified in ISO 8601 format.  Example: 2009-07-08T18:00Z
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
    /**
      * The DB instance class filter value. Specify this parameter to show only the available offerings that match the specified DB instance class.
      */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * The name of the engine to retrieve DB instance options for.
      */
    var Engine: String
    /**
      * The engine version filter value. Specify this parameter to show only the available offerings that match the specified engine version.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The license model filter value. Specify this parameter to show only the available offerings that match the specified license model.
      */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC offerings.
      */
    var Vpc: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    /**
      * A filter that specifies one or more resources to return pending maintenance actions for. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list includes only pending maintenance actions for the DB clusters identified by these ARNs.    db-instance-id - Accepts DB instance identifiers and DB instance ARNs. The results list includes only pending maintenance actions for the DB instances identified by these ARNs.  
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The ARN of a resource to return pending maintenance actions for.
      */
    var ResourceIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait Endpoint extends js.Object {
    /**
      * Specifies the DNS address of the DB instance.
      */
    var Address: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
      */
    var HostedZoneId: js.UndefOr[String] = js.undefined
    /**
      * Specifies the port that the database engine is listening on.
      */
    var Port: js.UndefOr[Integer] = js.undefined
  }
  
  trait EngineDefaults extends js.Object {
    /**
      * The name of the DB cluster parameter group family to return the engine parameter information for.
      */
    var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The parameters of a particular DB cluster parameter group family.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * Specifies the date and time of the event.
      */
    var Date: js.UndefOr[TStamp] = js.undefined
    /**
      * Specifies the category for the event.
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * Provides the text of this event.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the event.
      */
    var SourceArn: js.UndefOr[String] = js.undefined
    /**
      * Provides the identifier for the source of the event.
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the source type for this event.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
  }
  
  trait EventCategoriesMap extends js.Object {
    /**
      * The event categories for the specified source type.
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * The source type that the returned categories belong to.
      */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  trait EventCategoriesMessage extends js.Object {
    /**
      * A list of event category maps.
      */
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
  }
  
  trait EventsMessage extends js.Object {
    /**
      * Detailed information about one or more events. 
      */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait FailoverDBClusterMessage extends js.Object {
    /**
      * A DB cluster identifier to force a failover for. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
      */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Amazon DocumentDB replica in the DB cluster. For example, mydbcluster-replica1.
      */
    var TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  trait Filter extends js.Object {
    /**
      * The name of the filter. Filter names are case sensitive.
      */
    var Name: String
    /**
      * One or more filter values. Filter values are case sensitive.
      */
    var Values: FilterValueList
  }
  
  trait ListTagsForResourceMessage extends js.Object {
    /**
      * This parameter is not currently supported.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The Amazon DocumentDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
      */
    var ResourceName: String
  }
  
  trait ModifyDBClusterMessage extends js.Object {
    /**
      * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB cluster. If this parameter is set to false, changes to the DB cluster are applied during the next maintenance window. The ApplyImmediately parameter affects only the NewDBClusterIdentifier and MasterUserPassword values. If you set this parameter value to false, the changes to the NewDBClusterIdentifier and MasterUserPassword values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. Default: false 
      */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35.  
      */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB instance or DB cluster. The EnableLogTypes and DisableLogTypes arrays determine which logs are exported (or not exported) to CloudWatch Logs.
      */
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined
    /**
      * The DB cluster identifier for the cluster that is being modified. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
      */
    var DBClusterIdentifier: String
    /**
      * The name of the DB cluster parameter group to use for the DB cluster.
      */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The new password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
      */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
      * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster2 
      */
    var NewDBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The port number on which the DB cluster accepts connections. Constraints: Must be a value from 1150 to 65535.  Default: The same port as the original DB cluster.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
      */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
      * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait ModifyDBClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the DB cluster parameter group to modify.
      */
    var DBClusterParameterGroupName: String
    /**
      * A list of parameters in the DB cluster parameter group to modify.
      */
    var Parameters: ParametersList
  }
  
  trait ModifyDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  trait ModifyDBClusterSnapshotAttributeMessage extends js.Object {
    /**
      * The name of the DB cluster snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual DB cluster snapshot, set this value to restore.
      */
    var AttributeName: String
    /**
      * The identifier for the DB cluster snapshot to modify the attributes for.
      */
    var DBClusterSnapshotIdentifier: String
    /**
      * A list of DB cluster snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual DB cluster snapshot, set this list to include one or more AWS account IDs. To make the manual DB cluster snapshot restorable by any AWS account, set it to all. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want to be available to all AWS accounts.
      */
    var ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined
    /**
      * A list of DB cluster snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual DB cluster snapshot, set this list to include one or more AWS account identifiers. To remove authorization for any AWS account to copy or restore the DB cluster snapshot, set it to all . If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore a manual DB cluster snapshot.
      */
    var ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
  }
  
  trait ModifyDBInstanceMessage extends js.Object {
    /**
      * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB instance.   If this parameter is set to false, changes to the DB instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next reboot. Default: false 
      */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
      * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window. Changing this parameter doesn't result in an outage except in the following case, and the change is asynchronously applied as soon as possible. An outage results if this parameter is set to true during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled automatic patching for that engine version. 
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The new compute and memory capacity of the DB instance; for example, db.m4.large. Not all DB instance classes are available in all AWS Regions.  If you modify the DB instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is specified as true for this request.  Default: Uses existing setting.
      */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
      */
    var DBInstanceIdentifier: String
    /**
      *  The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier, an instance reboot occurs immediately if you set Apply Immediately to true. It occurs during the next maintenance window if you set Apply Immediately to false. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
      */
    var NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, changing this parameter causes a reboot of the DB instance. If you are moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure that pending changes are applied. Default: Uses existing setting. Format: ddd:hh24:mi-ddd:hh24:mi  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Must be at least 30 minutes.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
      */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  trait ModifyDBSubnetGroupMessage extends js.Object {
    /**
      * The description for the DB subnet group.
      */
    var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The name for the DB subnet group. This value is stored as a lowercase string. You can't modify the default subnet group.  Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
      */
    var DBSubnetGroupName: String
    /**
      * The Amazon EC2 subnet IDs for the DB subnet group.
      */
    var SubnetIds: SubnetIdentifierList
  }
  
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
  }
  
  trait OrderableDBInstanceOption extends js.Object {
    /**
      * A list of Availability Zones for a DB instance.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    /**
      * The DB instance class for a DB instance.
      */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * The engine type of a DB instance.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The engine version of a DB instance.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The license model for a DB instance.
      */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether a DB instance is in a virtual private cloud (VPC).
      */
    var Vpc: js.UndefOr[Boolean] = js.undefined
  }
  
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The options that are available for a particular orderable DB instance.
      */
    var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined
  }
  
  trait Parameter extends js.Object {
    /**
      * Specifies the valid range of values for the parameter.
      */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
      * Indicates when to apply parameter updates.
      */
    var ApplyMethod: js.UndefOr[ApplyMethod] = js.undefined
    /**
      * Specifies the engine-specific parameters type.
      */
    var ApplyType: js.UndefOr[String] = js.undefined
    /**
      * Specifies the valid data type for the parameter.
      */
    var DataType: js.UndefOr[String] = js.undefined
    /**
      * Provides a description of the parameter.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      *  Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
      */
    var IsModifiable: js.UndefOr[Boolean] = js.undefined
    /**
      * The earliest engine version to which the parameter can apply.
      */
    var MinimumEngineVersion: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the value of the parameter.
      */
    var ParameterValue: js.UndefOr[String] = js.undefined
    /**
      * Indicates the source of the parameter value.
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait PendingCloudwatchLogsExports extends js.Object {
    /**
      * Log types that are in the process of being enabled. After they are enabled, these log types are exported to Amazon CloudWatch Logs.
      */
    var LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined
    /**
      * Log types that are in the process of being deactivated. After they are deactivated, these log types aren't exported to CloudWatch Logs.
      */
    var LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined
  }
  
  trait PendingMaintenanceAction extends js.Object {
    /**
      * The type of pending maintenance action that is available for the resource.
      */
    var Action: js.UndefOr[String] = js.undefined
    /**
      * The date of the maintenance window when the action is applied. The maintenance action is applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
      */
    var AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined
    /**
      * The effective date when the pending maintenance action is applied to the resource.
      */
    var CurrentApplyDate: js.UndefOr[TStamp] = js.undefined
    /**
      * A description providing more detail about the maintenance action.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The date when the maintenance action is automatically applied. The maintenance action is applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
      */
    var ForcedApplyDate: js.UndefOr[TStamp] = js.undefined
    /**
      * Indicates the type of opt-in request that has been received for the resource.
      */
    var OptInStatus: js.UndefOr[String] = js.undefined
  }
  
  trait PendingMaintenanceActionsMessage extends js.Object {
    /**
      * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maintenance actions to be applied.
      */
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined
  }
  
  trait PendingModifiedValues extends js.Object {
    /**
      *  Contains the new AllocatedStorage size for the DB instance that will be applied or is currently being applied. 
      */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Specifies the pending number of days for which automated backups are retained.
      */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Specifies the identifier of the certificate authority (CA) certificate for the DB instance.
      */
    var CACertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      *  Contains the new DBInstanceClass for the DB instance that will be applied or is currently being applied. 
      */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
      *  Contains the new DBInstanceIdentifier for the DB instance that will be applied or is currently being applied. 
      */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The new DB subnet group for the DB instance. 
      */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * Indicates the database engine version.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
      */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The license model for the DB instance. Valid values: license-included, bring-your-own-license, general-public-license 
      */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
      * Contains the pending or currently in-progress change of the master credentials for the DB instance.
      */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
      * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
      */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A list of the log types whose configuration is still pending. These log types are in the process of being activated or deactivated.
      */
    var PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports] = js.undefined
    /**
      * Specifies the pending port for the DB instance.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Specifies the storage type to be associated with the DB instance.
      */
    var StorageType: js.UndefOr[String] = js.undefined
  }
  
  trait RebootDBInstanceMessage extends js.Object {
    /**
      * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
      */
    var DBInstanceIdentifier: String
    /**
      *  When true, the reboot is conducted through a Multi-AZ failover.  Constraint: You can't specify true if the instance is not configured for Multi-AZ.
      */
    var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  trait RemoveTagsFromResourceMessage extends js.Object {
    /**
      * The Amazon DocumentDB resource that the tags are removed from. This value is an Amazon Resource Name (ARN).
      */
    var ResourceName: String
    /**
      * The tag key (name) of the tag to be removed.
      */
    var TagKeys: KeyList
  }
  
  trait ResetDBClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the DB cluster parameter group to reset.
      */
    var DBClusterParameterGroupName: String
    /**
      * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this parameter if the ResetAllParameters parameter is set to true.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
    /**
      * A value that is set to true to reset all parameters in the DB cluster parameter group to their default values, and false otherwise. You can't use this parameter if there is a list of parameter names specified for the Parameters parameter.
      */
    var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ResourcePendingMaintenanceActions extends js.Object {
    /**
      * A list that provides details about the pending maintenance actions for the resource.
      */
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the resource that has pending maintenance actions.
      */
    var ResourceIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    /**
      * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-snapshot-id 
      */
    var DBClusterIdentifier: String
    /**
      * The name of the DB subnet group to use for the new DB cluster. Constraints: If provided, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
      */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
      */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
      * The database engine to use for the new DB cluster. Default: The same as source. Constraint: Must be compatible with the engine of the source.
      */
    var Engine: String
    /**
      * The version of the database engine to use for the new DB cluster.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster snapshot. The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new DB cluster, then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key. If you do not specify a value for the KmsKeyId parameter, then the following occurs:   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is encrypted, then the restored DB cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB cluster snapshot.   If the DB snapshot or the DB cluster snapshot in SnapshotIdentifier is not encrypted, then the restored DB cluster is not encrypted.  
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The port number on which the new DB cluster accepts connections. Constraints: Must be a value from 1150 to 65535. Default: The same port as the original DB cluster.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier for the DB snapshot or DB cluster snapshot to restore from. You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can use only the ARN to specify a DB snapshot. Constraints:   Must match the identifier of an existing snapshot.  
      */
    var SnapshotIdentifier: String
    /**
      * The tags to be assigned to the restored DB cluster.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  trait RestoreDBClusterToPointInTimeMessage extends js.Object {
    /**
      * The name of the new DB cluster to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var DBClusterIdentifier: String
    /**
      * The DB subnet group name to use for the new DB cluster. Constraints: If provided, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
      */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
      */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
      * The AWS KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster. The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new DB cluster, then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key. You can restore to a new DB cluster and encrypt the new DB cluster with an AWS KMS key that is different from the AWS KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the AWS KMS key identified by the KmsKeyId parameter. If you do not specify a value for the KmsKeyId parameter, then the following occurs:   If the DB cluster is encrypted, then the restored DB cluster is encrypted using the AWS KMS key that was used to encrypt the source DB cluster.   If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.   If DBClusterIdentifier refers to a DB cluster that is not encrypted, then the restore request is rejected.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The port number on which the new DB cluster accepts connections. Constraints: Must be a value from 1150 to 65535.  Default: The default port for the engine.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The date and time to restore the DB cluster to. Valid values: A time in Universal Coordinated Time (UTC) format. Constraints:   Must be before the latest restorable time for the DB instance.   Must be specified if the UseLatestRestorableTime parameter is not provided.   Cannot be specified if the UseLatestRestorableTime parameter is true.   Cannot be specified if the RestoreType parameter is copy-on-write.   Example: 2015-03-07T23:45:00Z 
      */
    var RestoreToTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The identifier of the source DB cluster from which to restore. Constraints:   Must match the identifier of an existing DBCluster.  
      */
    var SourceDBClusterIdentifier: String
    /**
      * The tags to be assigned to the restored DB cluster.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A value that is set to true to restore the DB cluster to the latest restorable backup time, and false otherwise.  Default: false  Constraints: Cannot be specified if the RestoreToTime parameter is provided.
      */
    var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of VPC security groups that the new DB cluster belongs to.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait RestoreDBClusterToPointInTimeResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  trait Subnet extends js.Object {
    /**
      * Specifies the Availability Zone for the subnet.
      */
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
      * Specifies the identifier of the subnet.
      */
    var SubnetIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the status of the subnet.
      */
    var SubnetStatus: js.UndefOr[String] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The required name of the tag. The string value can be from 1 to 128 Unicode characters in length and can't be prefixed with "aws:" or "rds:". The string can contain only the set of Unicode letters, digits, white space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      * The optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and can't be prefixed with "aws:" or "rds:". The string can contain only the set of Unicode letters, digits, white space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait TagListMessage extends js.Object {
    /**
      * A list of one or more tags.
      */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
      */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
      */
    def addTagsToResource(params: AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      params: AddTagsToResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a pending maintenance action to a resource (for example, to a DB instance).
      */
    def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def applyPendingMaintenanceAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplyPendingMaintenanceActionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a pending maintenance action to a resource (for example, to a DB instance).
      */
    def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def applyPendingMaintenanceAction(
      params: ApplyPendingMaintenanceActionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplyPendingMaintenanceActionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies the specified DB cluster parameter group.
      */
    def copyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies the specified DB cluster parameter group.
      */
    def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyDBClusterParameterGroup(
      params: CopyDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. To cancel the copy operation after it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.
      */
    def copyDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyDBClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. To cancel the copy operation after it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.
      */
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyDBClusterSnapshot(
      params: CopyDBClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon DocumentDB DB cluster.
      */
    def createDBCluster(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon DocumentDB DB cluster.
      */
    def createDBCluster(params: CreateDBClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBCluster(
      params: CreateDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster. A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after you create it. After you create a DB cluster parameter group, you must associate it with your DB cluster. For the new DB cluster parameter group and associated settings to take effect, you must then reboot the DB instances in the DB cluster without failover.  After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
      */
    def createDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster. A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after you create it. After you create a DB cluster parameter group, you must associate it with your DB cluster. For the new DB cluster parameter group and associated settings to take effect, you must then reboot the DB instances in the DB cluster without failover.  After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
      */
    def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBClusterParameterGroup(
      params: CreateDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot of a DB cluster. 
      */
    def createDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot of a DB cluster. 
      */
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBClusterSnapshot(
      params: CreateDBClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB instance.
      */
    def createDBInstance(): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB instance.
      */
    def createDBInstance(params: CreateDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBInstance(
      params: CreateDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
      */
    def createDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
      */
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDBSubnetGroup(
      params: CreateDBSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. 
      */
    def deleteDBCluster(): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. 
      */
    def deleteDBCluster(params: DeleteDBClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBCluster(
      params: DeleteDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters.
      */
    def deleteDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBClusterParameterGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters.
      */
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBClusterParameterGroup(
      params: DeleteDBClusterParameterGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
      */
    def deleteDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
      */
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBClusterSnapshot(
      params: DeleteDBClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned DB instance. 
      */
    def deleteDBInstance(): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned DB instance. 
      */
    def deleteDBInstance(params: DeleteDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBInstance(
      params: DeleteDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
      */
    def deleteDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBSubnetGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
      */
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDBSubnetGroup(
      params: DeleteDBSubnetGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list contains only the description of the specified DB cluster parameter group. 
      */
    def describeDBClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterParameterGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list contains only the description of the specified DB cluster parameter group. 
      */
    def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterParameterGroups(
      params: DescribeDBClusterParameterGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the detailed parameter list for a particular DB cluster parameter group.
      */
    def describeDBClusterParameters(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the detailed parameter list for a particular DB cluster parameter group.
      */
    def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterParameters(
      params: DescribeDBClusterParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
      */
    def describeDBClusterSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterSnapshotAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBClusterSnapshotAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
      */
    def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterSnapshotAttributes(
      params: DescribeDBClusterSnapshotAttributesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBClusterSnapshotAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about DB cluster snapshots. This API operation supports pagination.
      */
    def describeDBClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about DB cluster snapshots. This API operation supports pagination.
      */
    def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusterSnapshots(
      params: DescribeDBClusterSnapshotsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about provisioned Amazon DocumentDB DB clusters. This API operation supports pagination.
      */
    def describeDBClusters(): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about provisioned Amazon DocumentDB DB clusters. This API operation supports pagination.
      */
    def describeDBClusters(params: DescribeDBClustersMessage): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBClusters(
      params: DescribeDBClustersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available DB engines.
      */
    def describeDBEngineVersions(): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBEngineVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBEngineVersionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available DB engines.
      */
    def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBEngineVersions(
      params: DescribeDBEngineVersionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBEngineVersionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
      */
    def describeDBInstances(): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
      */
    def describeDBInstances(params: DescribeDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBInstances(
      params: DescribeDBInstancesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup.
      */
    def describeDBSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBSubnetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup.
      */
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDBSubnetGroups(
      params: DescribeDBSubnetGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the default engine and system parameter information for the cluster database engine.
      */
    def describeEngineDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEngineDefaultClusterParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultClusterParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the default engine and system parameter information for the cluster database engine.
      */
    def describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEngineDefaultClusterParameters(
      params: DescribeEngineDefaultClusterParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultClusterParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays a list of categories for all event source types, or, if specified, for a specified source type. 
      */
    def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventCategories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventCategoriesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays a list of categories for all event source types, or, if specified, for a specified source type. 
      */
    def describeEventCategories(params: DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventCategories(
      params: DescribeEventCategoriesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventCategoriesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. You can obtain events specific to a particular DB instance, DB security group, DB snapshot, or DB parameter group by providing the name as a parameter. By default, the events of the past hour are returned.
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. You can obtain events specific to a particular DB instance, DB security group, DB snapshot, or DB parameter group by providing the name as a parameter. By default, the events of the past hour are returned.
      */
    def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of orderable DB instance options for the specified engine.
      */
    def describeOrderableDBInstanceOptions(): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOrderableDBInstanceOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OrderableDBInstanceOptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of orderable DB instance options for the specified engine.
      */
    def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOrderableDBInstanceOptions(
      params: DescribeOrderableDBInstanceOptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OrderableDBInstanceOptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
      */
    def describePendingMaintenanceActions(): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePendingMaintenanceActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingMaintenanceActionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
      */
    def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePendingMaintenanceActions(
      params: DescribePendingMaintenanceActionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingMaintenanceActionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
      */
    def failoverDBCluster(): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def failoverDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FailoverDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
      */
    def failoverDBCluster(params: FailoverDBClusterMessage): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def failoverDBCluster(
      params: FailoverDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FailoverDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags on an Amazon DocumentDB resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags on an Amazon DocumentDB resource.
      */
    def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a setting for an Amazon DocumentDB DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
      */
    def modifyDBCluster(): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a setting for an Amazon DocumentDB DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
      */
    def modifyDBCluster(params: ModifyDBClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBCluster(
      params: ModifyDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or maintenance window before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
      */
    def modifyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or maintenance window before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
      */
    def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBClusterParameterGroup(
      params: ModifyDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case.
      */
    def modifyDBClusterSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBClusterSnapshotAttribute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterSnapshotAttributeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case.
      */
    def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBClusterSnapshotAttribute(
      params: ModifyDBClusterSnapshotAttributeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterSnapshotAttributeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
      */
    def modifyDBInstance(): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
      */
    def modifyDBInstance(params: ModifyDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBInstance(
      params: ModifyDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
      */
    def modifyDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
      */
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyDBSubnetGroup(
      params: ModifyDBSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain changes, or if you change the DB cluster parameter group that is associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting. 
      */
    def rebootDBInstance(): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain changes, or if you change the DB cluster parameter group that is associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting. 
      */
    def rebootDBInstance(params: RebootDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootDBInstance(
      params: RebootDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes metadata tags from an Amazon DocumentDB resource.
      */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes metadata tags from an Amazon DocumentDB resource.
      */
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      params: RemoveTagsFromResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters, submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance reboot.
      */
    def resetDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters, submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance reboot.
      */
    def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetDBClusterParameterGroup(
      params: ResetDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
      */
    def restoreDBClusterFromSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreDBClusterFromSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterFromSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
      */
    def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreDBClusterFromSnapshot(
      params: RestoreDBClusterFromSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterFromSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group. 
      */
    def restoreDBClusterToPointInTime(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreDBClusterToPointInTime(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterToPointInTimeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group. 
      */
    def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreDBClusterToPointInTime(
      params: RestoreDBClusterToPointInTimeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterToPointInTimeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the dBInstanceAvailable state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_dBInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_dBInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the dBInstanceAvailable state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_dBInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
      params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_dBInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
      params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the dBInstanceDeleted state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_dBInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_dBInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the dBInstanceDeleted state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_dBInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
      params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_dBInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
      params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpgradeTarget extends js.Object {
    /**
      * A value that indicates whether the target version is applied to any source DB instances that have AutoMinorVersionUpgrade set to true.
      */
    var AutoUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * The version of the database engine that a DB instance can be upgraded to.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the upgrade target database engine.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version number of the upgrade target database engine.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * A value that indicates whether a database engine is upgraded to a major version.
      */
    var IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  }
  
  trait VpcSecurityGroupMembership extends js.Object {
    /**
      * The status of the VPC security group.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The name of the VPC security group.
      */
    var VpcSecurityGroupId: js.UndefOr[String] = js.undefined
  }
  
  trait _ApplyMethod extends js.Object
  
  trait _SourceType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.immediate
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = _ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[String]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZones = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DBClusterList = js.Array[DBCluster]
  type DBClusterMemberList = js.Array[DBClusterMember]
  type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]
  type DBClusterRoles = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[DBClusterSnapshot]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type LogTypeList = js.Array[String]
  type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]
  type ParametersList = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`db-instance`
    - awsDashSdkLib.awsDashSdkLibStrings.`db-parameter-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`db-security-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`db-snapshot`
    - awsDashSdkLib.awsDashSdkLibStrings.`db-cluster`
    - awsDashSdkLib.awsDashSdkLibStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = stdLib.Date
  type TagList = js.Array[Tag]
  type ValidUpgradeTargetList = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-10-31`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

