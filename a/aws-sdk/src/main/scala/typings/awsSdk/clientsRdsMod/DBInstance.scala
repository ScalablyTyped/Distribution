package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstance extends StObject {
  
  /**
    * Indicates whether engine-native audit fields are included in the database activity stream.
    */
  var ActivityStreamEngineNativeAuditFieldsIncluded: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var ActivityStreamKinesisStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier used for encrypting messages in the database activity stream. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
    */
  var ActivityStreamKmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The mode of the database activity stream. Database events such as a change or access generate an activity stream event. RDS for Oracle always handles these events asynchronously.
    */
  var ActivityStreamMode: js.UndefOr[typings.awsSdk.clientsRdsMod.ActivityStreamMode] = js.undefined
  
  /**
    * The status of the policy state of the activity stream.
    */
  var ActivityStreamPolicyStatus: js.UndefOr[typings.awsSdk.clientsRdsMod.ActivityStreamPolicyStatus] = js.undefined
  
  /**
    * The status of the database activity stream.
    */
  var ActivityStreamStatus: js.UndefOr[typings.awsSdk.clientsRdsMod.ActivityStreamStatus] = js.undefined
  
  /**
    * Specifies the allocated storage size specified in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Web Services Identity and Access Management (IAM) roles associated with the DB instance.
    */
  var AssociatedRoles: js.UndefOr[DBInstanceRoles] = js.undefined
  
  /**
    * A value that indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time when a stopped DB instance is restarted automatically.
    */
  var AutomaticRestartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The automation mode of the RDS Custom DB instance: full or all paused. If full, the DB instance automates monitoring and instance recovery. If all paused, the instance pauses automation for the duration set by --resume-full-automation-mode-minutes.
    */
  var AutomationMode: js.UndefOr[typings.awsSdk.clientsRdsMod.AutomationMode] = js.undefined
  
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
    */
  var AwsBackupRecoveryPointArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies where automated backups and manual snapshots are stored: Amazon Web Services Outposts or the Amazon Web Services Region.
    */
  var BackupTarget: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the CA certificate for this DB instance. For more information, see Using SSL/TLS to encrypt a connection to a DB instance in the Amazon RDS User Guide and  Using SSL/TLS to encrypt a connection to a DB cluster in the Amazon Aurora User Guide.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the DB instance's server certificate.
    */
  var CertificateDetails: js.UndefOr[typings.awsSdk.clientsRdsMod.CertificateDetails] = js.undefined
  
  /**
    * If present, specifies the name of the character set that this instance is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see DBCluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The instance profile must meet the following requirements:   The profile must exist in your account.   The profile must have an IAM role that Amazon EC2 has permissions to assume.   The instance profile name and the associated IAM role name must start with the prefix AWSRDSCustom.   For the list of permissions required for the IAM role, see  Configure IAM and your VPC in the Amazon RDS User Guide.
    */
  var CustomIamInstanceProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a customer-owned IP address (CoIP) is enabled for an RDS on Outposts DB instance. A CoIP provides local or external connectivity to resources in your Outpost subnets through your on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from outside of its virtual private cloud (VPC) on your local network. For more information about RDS on Outposts, see Working with Amazon RDS on Amazon Web Services Outposts in the Amazon RDS User Guide. For more information about CoIPs, see Customer-owned IP addresses in the Amazon Web Services Outposts User Guide.
    */
  var CustomerOwnedIpEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The list of replicated automated backups associated with the DB instance.
    */
  var DBInstanceAutomatedBackupsReplications: js.UndefOr[DBInstanceAutomatedBackupsReplicationList] = js.undefined
  
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the current state of this database. For information about DB instance statuses, see Viewing DB instance status in the Amazon RDS User Guide. 
    */
  var DBInstanceStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance. Type: String  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance.
    */
  var DBName: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.undefined
  
  /**
    * A list of DB security group elements containing DBSecurityGroup.Name and DBSecurityGroup.Status subelements.
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined
  
  /**
    * Specifies information on the subnet group associated with the DB instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSubnetGroup] = js.undefined
  
  /**
    * The Oracle system ID (Oracle SID) for a container database (CDB). The Oracle SID is also the name of the CDB. This setting is valid for RDS Custom only.
    */
  var DBSystemId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Web Services Region-unique, immutable identifier for the DB instance. This identifier is found in Amazon Web Services CloudTrail log entries whenever the Amazon Web Services KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. For more information, see  Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Active Directory Domain membership records associated with the DB instance.
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined
  
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon RDS User Guide. 
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Specifies the connection endpoint.  The endpoint might not be shown for instances whose status is creating. 
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsRdsMod.Endpoint] = js.undefined
  
  /**
    * The name of the database engine to be used for this DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring metrics data for the DB instance.
    */
  var EnhancedMonitoringResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * True if mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. For a list of engine versions that support IAM database authentication, see IAM database authentication in the Amazon RDS User Guide and IAM database authentication in Aurora in the Amazon Aurora User Guide.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides the date and time the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If StorageEncrypted is true, the Amazon Web Services KMS key identifier for the encrypted DB instance. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * License model information for this DB instance. This setting doesn't apply to RDS Custom.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the listener connection endpoint for SQL Server Always On.
    */
  var ListenerEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * Contains the secret managed by RDS in Amazon Web Services Secrets Manager for the master user password. For more information, see Password management with Amazon Web Services Secrets Manager in the Amazon RDS User Guide. 
    */
  var MasterUserSecret: js.UndefOr[typings.awsSdk.clientsRdsMod.MasterUserSecret] = js.undefined
  
  /**
    * Contains the master username for the DB instance.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the DB instance is a Multi-AZ deployment. This setting doesn't apply to RDS Custom.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the NCHAR character set for the Oracle DB instance. This character set specifies the Unicode encoding for data stored in table columns of type NCHAR, NCLOB, or NVARCHAR2.
    */
  var NcharCharacterSetName: js.UndefOr[String] = js.undefined
  
  /**
    * The network type of the DB instance. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB instance. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon RDS User Guide and  Working with a DB instance in a VPC in the Amazon Aurora User Guide. 
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined
  
  /**
    * A value that specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.clientsRdsMod.PendingModifiedValues] = js.undefined
  
  /**
    * True if Performance Insights is enabled for the DB instance, and otherwise false.
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for encryption of Performance Insights data. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:   7    month * 31, where month is a number of months from 1-23   731   For example, the following values are valid:   93 (3 months * 31)   341 (11 months * 31)   589 (19 months * 31)   731  
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod.
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide.
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the accessibility options for the DB instance. When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica. For example, when you create an Aurora read replica of an RDS for MySQL DB instance, the Aurora MySQL DB cluster for the Aurora read replica is shown. This output doesn't contain information about cross-Region Aurora read replicas.  Currently, each RDS DB instance can have only one Aurora read replica. 
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.undefined
  
  /**
    * Contains one or more identifiers of the read replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.undefined
  
  /**
    * Contains the identifier of the source DB cluster if this DB instance is a read replica.
    */
  var ReadReplicaSourceDBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the identifier of the source DB instance if this DB instance is a read replica.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The open mode of an Oracle read replica. The default is open-read-only. For more information, see Working with Oracle Read Replicas for Amazon RDS in the Amazon RDS User Guide.  This attribute is only supported in RDS for Oracle. 
    */
  var ReplicaMode: js.UndefOr[typings.awsSdk.clientsRdsMod.ReplicaMode] = js.undefined
  
  /**
    * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation. The minimum value is 60 (default). The maximum value is 1,440.
    */
  var ResumeFullAutomationModeTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The status of a read replica. If the instance isn't a read replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined
  
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the storage throughput for the DB instance. This setting applies only to the gp3 storage type.
    */
  var StorageThroughput: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the storage type associated with the DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  var TagList: js.UndefOr[typings.awsSdk.clientsRdsMod.TagList] = js.undefined
  
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone of the DB instance. In most cases, the Timezone element is empty. Timezone content appears only for Microsoft SQL Server DB instances that were created with a time zone specified.
    */
  var Timezone: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object DBInstance {
  
  inline def apply(): DBInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBInstance] (val x: Self) extends AnyVal {
    
    inline def setActivityStreamEngineNativeAuditFieldsIncluded(value: BooleanOptional): Self = StObject.set(x, "ActivityStreamEngineNativeAuditFieldsIncluded", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamEngineNativeAuditFieldsIncludedUndefined: Self = StObject.set(x, "ActivityStreamEngineNativeAuditFieldsIncluded", js.undefined)
    
    inline def setActivityStreamKinesisStreamName(value: String): Self = StObject.set(x, "ActivityStreamKinesisStreamName", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamKinesisStreamNameUndefined: Self = StObject.set(x, "ActivityStreamKinesisStreamName", js.undefined)
    
    inline def setActivityStreamKmsKeyId(value: String): Self = StObject.set(x, "ActivityStreamKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamKmsKeyIdUndefined: Self = StObject.set(x, "ActivityStreamKmsKeyId", js.undefined)
    
    inline def setActivityStreamMode(value: ActivityStreamMode): Self = StObject.set(x, "ActivityStreamMode", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamModeUndefined: Self = StObject.set(x, "ActivityStreamMode", js.undefined)
    
    inline def setActivityStreamPolicyStatus(value: ActivityStreamPolicyStatus): Self = StObject.set(x, "ActivityStreamPolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamPolicyStatusUndefined: Self = StObject.set(x, "ActivityStreamPolicyStatus", js.undefined)
    
    inline def setActivityStreamStatus(value: ActivityStreamStatus): Self = StObject.set(x, "ActivityStreamStatus", value.asInstanceOf[js.Any])
    
    inline def setActivityStreamStatusUndefined: Self = StObject.set(x, "ActivityStreamStatus", js.undefined)
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAssociatedRoles(value: DBInstanceRoles): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    inline def setAssociatedRolesVarargs(value: DBInstanceRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value*))
    
    inline def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAutomaticRestartTime(value: js.Date): Self = StObject.set(x, "AutomaticRestartTime", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRestartTimeUndefined: Self = StObject.set(x, "AutomaticRestartTime", js.undefined)
    
    inline def setAutomationMode(value: AutomationMode): Self = StObject.set(x, "AutomationMode", value.asInstanceOf[js.Any])
    
    inline def setAutomationModeUndefined: Self = StObject.set(x, "AutomationMode", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setAwsBackupRecoveryPointArn(value: String): Self = StObject.set(x, "AwsBackupRecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setAwsBackupRecoveryPointArnUndefined: Self = StObject.set(x, "AwsBackupRecoveryPointArn", js.undefined)
    
    inline def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setBackupTarget(value: String): Self = StObject.set(x, "BackupTarget", value.asInstanceOf[js.Any])
    
    inline def setBackupTargetUndefined: Self = StObject.set(x, "BackupTarget", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setCertificateDetails(value: CertificateDetails): Self = StObject.set(x, "CertificateDetails", value.asInstanceOf[js.Any])
    
    inline def setCertificateDetailsUndefined: Self = StObject.set(x, "CertificateDetails", js.undefined)
    
    inline def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: Boolean): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setCustomIamInstanceProfile(value: String): Self = StObject.set(x, "CustomIamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setCustomIamInstanceProfileUndefined: Self = StObject.set(x, "CustomIamInstanceProfile", js.undefined)
    
    inline def setCustomerOwnedIpEnabled(value: BooleanOptional): Self = StObject.set(x, "CustomerOwnedIpEnabled", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpEnabledUndefined: Self = StObject.set(x, "CustomerOwnedIpEnabled", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setDBInstanceArn(value: String): Self = StObject.set(x, "DBInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceArnUndefined: Self = StObject.set(x, "DBInstanceArn", js.undefined)
    
    inline def setDBInstanceAutomatedBackupsReplications(value: DBInstanceAutomatedBackupsReplicationList): Self = StObject.set(x, "DBInstanceAutomatedBackupsReplications", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsReplicationsUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackupsReplications", js.undefined)
    
    inline def setDBInstanceAutomatedBackupsReplicationsVarargs(value: DBInstanceAutomatedBackupsReplication*): Self = StObject.set(x, "DBInstanceAutomatedBackupsReplications", js.Array(value*))
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDBInstanceStatus(value: String): Self = StObject.set(x, "DBInstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceStatusUndefined: Self = StObject.set(x, "DBInstanceStatus", js.undefined)
    
    inline def setDBName(value: String): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    inline def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    inline def setDBParameterGroups(value: DBParameterGroupStatusList): Self = StObject.set(x, "DBParameterGroups", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupsUndefined: Self = StObject.set(x, "DBParameterGroups", js.undefined)
    
    inline def setDBParameterGroupsVarargs(value: DBParameterGroupStatus*): Self = StObject.set(x, "DBParameterGroups", js.Array(value*))
    
    inline def setDBSecurityGroups(value: DBSecurityGroupMembershipList): Self = StObject.set(x, "DBSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupsUndefined: Self = StObject.set(x, "DBSecurityGroups", js.undefined)
    
    inline def setDBSecurityGroupsVarargs(value: DBSecurityGroupMembership*): Self = StObject.set(x, "DBSecurityGroups", js.Array(value*))
    
    inline def setDBSubnetGroup(value: DBSubnetGroup): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
    
    inline def setDBSystemId(value: String): Self = StObject.set(x, "DBSystemId", value.asInstanceOf[js.Any])
    
    inline def setDBSystemIdUndefined: Self = StObject.set(x, "DBSystemId", js.undefined)
    
    inline def setDbInstancePort(value: Integer): Self = StObject.set(x, "DbInstancePort", value.asInstanceOf[js.Any])
    
    inline def setDbInstancePortUndefined: Self = StObject.set(x, "DbInstancePort", js.undefined)
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    inline def setDeletionProtection(value: Boolean): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDomainMemberships(value: DomainMembershipList): Self = StObject.set(x, "DomainMemberships", value.asInstanceOf[js.Any])
    
    inline def setDomainMembershipsUndefined: Self = StObject.set(x, "DomainMemberships", js.undefined)
    
    inline def setDomainMembershipsVarargs(value: DomainMembership*): Self = StObject.set(x, "DomainMemberships", js.Array(value*))
    
    inline def setEnabledCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.undefined)
    
    inline def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.Array(value*))
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setEnhancedMonitoringResourceArn(value: String): Self = StObject.set(x, "EnhancedMonitoringResourceArn", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringResourceArnUndefined: Self = StObject.set(x, "EnhancedMonitoringResourceArn", js.undefined)
    
    inline def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setInstanceCreateTime(value: js.Date): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLatestRestorableTime(value: js.Date): Self = StObject.set(x, "LatestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setLatestRestorableTimeUndefined: Self = StObject.set(x, "LatestRestorableTime", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setListenerEndpoint(value: Endpoint): Self = StObject.set(x, "ListenerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setListenerEndpointUndefined: Self = StObject.set(x, "ListenerEndpoint", js.undefined)
    
    inline def setMasterUserSecret(value: MasterUserSecret): Self = StObject.set(x, "MasterUserSecret", value.asInstanceOf[js.Any])
    
    inline def setMasterUserSecretUndefined: Self = StObject.set(x, "MasterUserSecret", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setMaxAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "MaxAllocatedStorage", js.undefined)
    
    inline def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    inline def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setNcharCharacterSetName(value: String): Self = StObject.set(x, "NcharCharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setNcharCharacterSetNameUndefined: Self = StObject.set(x, "NcharCharacterSetName", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setOptionGroupMemberships(value: OptionGroupMembershipList): Self = StObject.set(x, "OptionGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupMembershipsUndefined: Self = StObject.set(x, "OptionGroupMemberships", js.undefined)
    
    inline def setOptionGroupMembershipsVarargs(value: OptionGroupMembership*): Self = StObject.set(x, "OptionGroupMemberships", js.Array(value*))
    
    inline def setPendingModifiedValues(value: PendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setPerformanceInsightsEnabled(value: BooleanOptional): Self = StObject.set(x, "PerformanceInsightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "PerformanceInsightsEnabled", js.undefined)
    
    inline def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    inline def setPerformanceInsightsRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", js.undefined)
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setProcessorFeatures(value: ProcessorFeatureList): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value*))
    
    inline def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    inline def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setReadReplicaDBClusterIdentifiers(value: ReadReplicaDBClusterIdentifierList): Self = StObject.set(x, "ReadReplicaDBClusterIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaDBClusterIdentifiersUndefined: Self = StObject.set(x, "ReadReplicaDBClusterIdentifiers", js.undefined)
    
    inline def setReadReplicaDBClusterIdentifiersVarargs(value: String*): Self = StObject.set(x, "ReadReplicaDBClusterIdentifiers", js.Array(value*))
    
    inline def setReadReplicaDBInstanceIdentifiers(value: ReadReplicaDBInstanceIdentifierList): Self = StObject.set(x, "ReadReplicaDBInstanceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaDBInstanceIdentifiersUndefined: Self = StObject.set(x, "ReadReplicaDBInstanceIdentifiers", js.undefined)
    
    inline def setReadReplicaDBInstanceIdentifiersVarargs(value: String*): Self = StObject.set(x, "ReadReplicaDBInstanceIdentifiers", js.Array(value*))
    
    inline def setReadReplicaSourceDBClusterIdentifier(value: String): Self = StObject.set(x, "ReadReplicaSourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaSourceDBClusterIdentifierUndefined: Self = StObject.set(x, "ReadReplicaSourceDBClusterIdentifier", js.undefined)
    
    inline def setReadReplicaSourceDBInstanceIdentifier(value: String): Self = StObject.set(x, "ReadReplicaSourceDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaSourceDBInstanceIdentifierUndefined: Self = StObject.set(x, "ReadReplicaSourceDBInstanceIdentifier", js.undefined)
    
    inline def setReplicaMode(value: ReplicaMode): Self = StObject.set(x, "ReplicaMode", value.asInstanceOf[js.Any])
    
    inline def setReplicaModeUndefined: Self = StObject.set(x, "ReplicaMode", js.undefined)
    
    inline def setResumeFullAutomationModeTime(value: js.Date): Self = StObject.set(x, "ResumeFullAutomationModeTime", value.asInstanceOf[js.Any])
    
    inline def setResumeFullAutomationModeTimeUndefined: Self = StObject.set(x, "ResumeFullAutomationModeTime", js.undefined)
    
    inline def setSecondaryAvailabilityZone(value: String): Self = StObject.set(x, "SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAvailabilityZoneUndefined: Self = StObject.set(x, "SecondaryAvailabilityZone", js.undefined)
    
    inline def setStatusInfos(value: DBInstanceStatusInfoList): Self = StObject.set(x, "StatusInfos", value.asInstanceOf[js.Any])
    
    inline def setStatusInfosUndefined: Self = StObject.set(x, "StatusInfos", js.undefined)
    
    inline def setStatusInfosVarargs(value: DBInstanceStatusInfo*): Self = StObject.set(x, "StatusInfos", js.Array(value*))
    
    inline def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    inline def setStorageThroughput(value: IntegerOptional): Self = StObject.set(x, "StorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setStorageThroughputUndefined: Self = StObject.set(x, "StorageThroughput", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
    
    inline def setTdeCredentialArn(value: String): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value*))
  }
}
