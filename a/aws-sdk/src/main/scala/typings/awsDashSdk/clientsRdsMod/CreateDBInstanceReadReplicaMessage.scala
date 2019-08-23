package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBInstanceReadReplicaMessage extends js.Object {
  /**
    * A value that indicates whether minor engine upgrades are applied automatically to the Read Replica during the maintenance window. Default: Inherits from the source DB instance
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The Availability Zone (AZ) where the Read Replica will be created. Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d 
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether to copy all tags from the Read Replica to snapshots of the Read Replica. By default, tags are not copied.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The compute and memory capacity of the Read Replica, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Default: Inherits from the source DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB instance. This parameter is stored as a lowercase string.
    */
  var DBInstanceIdentifier: String
  /**
    * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC. Constraints:   Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.   If supplied, must match the name of an existing DBSubnetGroup.   The specified DB subnet group must be in the same AWS Region in which the operation is running.   All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;   Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.   Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.     Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon RDS User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For information about the supported DB engines, see CreateDBInstance. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to enable Performance Insights for the Read Replica.  For more information, see Using Amazon Performance Insights in the Amazon RDS User Guide. 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB instance.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.  If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not have to specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the source DB instance.  If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region.  You can't create an encrypted Read Replica from an unencrypted DB instance. 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read Replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, go to To create an IAM role for Amazon RDS Enhanced Monitoring in the Amazon RDS User Guide. If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether the Read Replica is in a Multi-AZ deployment.  You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is independent of whether the source database is a Multi-AZ DB instance. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The option group the DB instance is associated with. If omitted, the option group associated with the source instance is used.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The port number that the DB instance uses for connections. Default: Inherits from the source DB instance Valid Values: 1150-65535 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The URL that contains a Signature Version 4 signed request for the CreateDBInstanceReadReplica API action in the source AWS Region that contains the source DB instance.  You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using the Amazon RDS API. You can specify the --source-region option instead of this parameter when you create an encrypted Read Replica from another AWS Region by using the AWS CLI.  The presigned URL must be a valid request for the CreateDBInstanceReadReplica API action that can be executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL request must contain the following parameter values:     DestinationRegion - The AWS Region that the encrypted Read Replica is created in. This AWS Region is the same one where the CreateDBInstanceReadReplica action is called that contains this presigned URL.  For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance in the us-east-2 AWS Region, then you call the CreateDBInstanceReadReplica action in the us-east-1 AWS Region and provide a presigned URL that contains a call to the CreateDBInstanceReadReplica action in the us-west-2 AWS Region. For this example, the DestinationRegion in the presigned URL must be set to the us-east-1 AWS Region.     KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the destination AWS Region. This is the same identifier for both the CreateDBInstanceReadReplica action that is called in the destination AWS Region, and the action contained in the presigned URL.     SourceDBInstanceIdentifier - The DB instance identifier for the encrypted DB instance to be replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region, then your SourceDBInstanceIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115.    To learn how to generate a Signature Version 4 signed request, see Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and Signature Version 4 Signing Process. If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, it is an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. When the DB instance is not publicly accessible, it is an internal instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can have up to five Read Replicas. Constraints:   Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.   Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.   For the limitations of Oracle Read Replicas, see Read Replica Limitations with Oracle in the Amazon RDS User Guide.   Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and higher for cross-region replication).   The specified DB instance must have automatic backups enabled, its backup retention period must be greater than 0.   If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance identifier.   If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance ARN. For more information, go to  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.  
    */
  var SourceDBInstanceIdentifier: String
  /**
    * The ID of the region that contains the source for the read replica.
    */
  var SourceRegion: js.UndefOr[String] = js.undefined
  /**
    * Specifies the storage type to be associated with the Read Replica.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.undefined
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
    */
  var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  A list of EC2 VPC security groups to associate with the Read Replica.   Default: The default EC2 VPC security group for the DB subnet group's VPC. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object CreateDBInstanceReadReplicaMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    SourceDBInstanceIdentifier: String,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    AvailabilityZone: String = null,
    CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
    DBInstanceClass: String = null,
    DBSubnetGroupName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
    EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    KmsKeyId: String = null,
    MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
    MonitoringRoleArn: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    OptionGroupName: String = null,
    PerformanceInsightsKMSKeyId: String = null,
    PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    PreSignedUrl: String = null,
    ProcessorFeatures: ProcessorFeatureList = null,
    PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
    SourceRegion: String = null,
    StorageType: String = null,
    Tags: TagList = null,
    UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): CreateDBInstanceReadReplicaMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier, SourceDBInstanceIdentifier = SourceDBInstanceIdentifier)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports)
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication)
    if (!js.isUndefined(EnablePerformanceInsights)) __obj.updateDynamic("EnablePerformanceInsights")(EnablePerformanceInsights)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(MonitoringInterval)) __obj.updateDynamic("MonitoringInterval")(MonitoringInterval)
    if (MonitoringRoleArn != null) __obj.updateDynamic("MonitoringRoleArn")(MonitoringRoleArn)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (PerformanceInsightsKMSKeyId != null) __obj.updateDynamic("PerformanceInsightsKMSKeyId")(PerformanceInsightsKMSKeyId)
    if (!js.isUndefined(PerformanceInsightsRetentionPeriod)) __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(PerformanceInsightsRetentionPeriod)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl)
    if (ProcessorFeatures != null) __obj.updateDynamic("ProcessorFeatures")(ProcessorFeatures)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(UseDefaultProcessorFeatures)) __obj.updateDynamic("UseDefaultProcessorFeatures")(UseDefaultProcessorFeatures)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[CreateDBInstanceReadReplicaMessage]
  }
}

