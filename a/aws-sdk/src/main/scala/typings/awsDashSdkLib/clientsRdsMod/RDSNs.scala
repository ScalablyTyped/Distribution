package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/rds", "RDS")
@js.native
object RDSNs extends js.Object {
  
  trait AccountAttributesMessage extends js.Object {
    /**
         * A list of AccountQuota objects. Within this list, each quota has a name, a count of usage toward the quota maximum, and a maximum value for the quota.
         */
    var AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
  }
  
  
  trait AccountQuota extends js.Object {
    /**
         * The name of the Amazon RDS quota for this AWS account.
         */
    var AccountQuotaName: js.UndefOr[String] = js.undefined
    /**
         * The maximum allowed value for the quota.
         */
    var Max: js.UndefOr[Long] = js.undefined
    /**
         * The amount currently used toward the quota maximum.
         */
    var Used: js.UndefOr[Long] = js.undefined
  }
  
  
  trait AddRoleToDBClusterMessage extends js.Object {
    /**
         * The name of the DB cluster to associate the IAM role with.
         */
    var DBClusterIdentifier: String
    /**
         * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example arn:aws:iam::123456789012:role/AuroraAccessRole.
         */
    var RoleArn: String
  }
  
  
  trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
    /**
         * The identifier of the event source to be added. Constraints:   If the source type is a DB instance, then a DBInstanceIdentifier must be supplied.   If the source type is a DB security group, a DBSecurityGroupName must be supplied.   If the source type is a DB parameter group, a DBParameterGroupName must be supplied.   If the source type is a DB snapshot, a DBSnapshotIdentifier must be supplied.  
         */
    var SourceIdentifier: String
    /**
         * The name of the RDS event notification subscription you want to add a source identifier to.
         */
    var SubscriptionName: String
  }
  
  
  trait AddSourceIdentifierToSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  
  trait AddTagsToResourceMessage extends js.Object {
    /**
         * The Amazon RDS resource that the tags are added to. This value is an Amazon Resource Name (ARN). For information about creating an ARN, see  Constructing an RDS Amazon Resource Name (ARN).
         */
    var ResourceName: String
    /**
         * The tags to be assigned to the Amazon RDS resource.
         */
    var Tags: TagList
  }
  
  
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    /**
         * The pending maintenance action to apply to this resource. Valid values: system-update, db-upgrade 
         */
    var ApplyAction: String
    /**
         * A value that specifies the type of opt-in request, or undoes an opt-in request. An opt-in request of type immediate can't be undone. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
         */
    var OptInType: String
    /**
         * The RDS Amazon Resource Name (ARN) of the resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an RDS Amazon Resource Name (ARN).
         */
    var ResourceIdentifier: String
  }
  
  
  trait ApplyPendingMaintenanceActionResult extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
  }
  
  
  trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
    /**
         * The IP range to authorize.
         */
    var CIDRIP: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB security group to add authorization to.
         */
    var DBSecurityGroupName: String
    /**
         *  Id of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
         */
    var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
    /**
         *  Name of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
         */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
         *  AWS account number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
         */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  }
  
  
  trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
  }
  
  
  trait AvailabilityZone extends js.Object {
    /**
         * The name of the Availability Zone.
         */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  
  trait AvailableProcessorFeature extends js.Object {
    /**
         * The allowed values for the processor feature of the DB instance class.
         */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
         * The default value for the processor feature of the DB instance class.
         */
    var DefaultValue: js.UndefOr[String] = js.undefined
    /**
         * The name of the processor feature. Valid names are coreCount and threadsPerCore.
         */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  
  trait BacktrackDBClusterMessage extends js.Object {
    /**
         * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information about ISO 8601, see the ISO8601 Wikipedia page.   If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the nearest possible consistent time for the DB cluster.  Constraints:   Must contain a valid ISO 8601 timestamp.   Can't contain a timestamp set in the future.   Example: 2017-07-08T18:00Z 
         */
    var BacktrackTo: TStamp
    /**
         * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
         */
    var DBClusterIdentifier: String
    /**
         * A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise, an error occurs when binary logging is enabled.
         */
    var Force: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * If BacktrackTo is set to a timestamp earlier than the earliest backtrack time, this value backtracks the DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
         */
    var UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  
  trait Certificate extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the certificate.
         */
    var CertificateArn: js.UndefOr[String] = js.undefined
    /**
         * The unique key that identifies a certificate.
         */
    var CertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The type of the certificate.
         */
    var CertificateType: js.UndefOr[String] = js.undefined
    /**
         * The thumbprint of the certificate.
         */
    var Thumbprint: js.UndefOr[String] = js.undefined
    /**
         * The starting date from which the certificate is valid.
         */
    var ValidFrom: js.UndefOr[TStamp] = js.undefined
    /**
         * The final date that the certificate continues to be valid.
         */
    var ValidTill: js.UndefOr[TStamp] = js.undefined
  }
  
  
  trait CertificateMessage extends js.Object {
    /**
         * The list of Certificate objects for the AWS account.
         */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeCertificates request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait CharacterSet extends js.Object {
    /**
         * The description of the character set.
         */
    var CharacterSetDescription: js.UndefOr[String] = js.undefined
    /**
         * The name of the character set.
         */
    var CharacterSetName: js.UndefOr[String] = js.undefined
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
         * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon Aurora User Guide.  Constraints:   Must specify a valid DB cluster parameter group.   If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter group identifier, for example my-db-cluster-param-group, or a valid ARN.   If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter group ARN, for example arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1.  
         */
    var SourceDBClusterParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A description for the copied DB cluster parameter group.
         */
    var TargetDBClusterParameterGroupDescription: String
    /**
         * The identifier for the copied DB cluster parameter group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster-param-group1 
         */
    var TargetDBClusterParameterGroupIdentifier: String
  }
  
  
  trait CopyDBClusterParameterGroupResult extends js.Object {
    var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
  }
  
  
  trait CopyDBClusterSnapshotMessage extends js.Object {
    /**
         * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false. The default is false.
         */
    var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.  If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source DB cluster snapshot.  If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId.  To copy an encrypted DB cluster snapshot to another AWS Region, you must set KmsKeyId to the KMS key ID you want to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. If you copy an unencrypted DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot API action in the AWS Region that contains the source DB cluster snapshot to copy. The PreSignedUrl parameter must be used when copying an encrypted DB cluster snapshot from another AWS Region. The pre-signed URL must be a valid request for the CopyDBSClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
         */
    var PreSignedUrl: js.UndefOr[String] = js.undefined
    /**
         * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive. You can't copy an encrypted, shared DB cluster snapshot from one AWS Region to another. Constraints:   Must specify a valid system snapshot in the "available" state.   If the source snapshot is in the same AWS Region as the copy, specify a valid DB snapshot identifier.   If the source snapshot is in a different AWS Region than the copy, specify a valid DB cluster snapshot ARN. For more information, go to  Copying Snapshots Across AWS Regions in the Amazon Aurora User Guide.    Example: my-cluster-snapshot1 
         */
    var SourceDBClusterSnapshotIdentifier: String
    /**
         * The ID of the region that contains the snapshot to be copied.
         */
    var SourceRegion: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is not case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot2 
         */
    var TargetDBClusterSnapshotIdentifier: String
  }
  
  
  trait CopyDBClusterSnapshotResult extends js.Object {
    var DBClusterSnapshot: js.UndefOr[DBClusterSnapshot] = js.undefined
  }
  
  
  trait CopyDBParameterGroupMessage extends js.Object {
    /**
         *  The identifier or ARN for the source DB parameter group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.  Constraints:   Must specify a valid DB parameter group.   Must specify a valid DB parameter group identifier, for example my-db-param-group, or a valid ARN.  
         */
    var SourceDBParameterGroupIdentifier: String
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A description for the copied DB parameter group.
         */
    var TargetDBParameterGroupDescription: String
    /**
         * The identifier for the copied DB parameter group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-db-parameter-group 
         */
    var TargetDBParameterGroupIdentifier: String
  }
  
  
  trait CopyDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
  }
  
  
  trait CopyDBSnapshotMessage extends js.Object {
    /**
         * True to copy all tags from the source DB snapshot to the target DB snapshot, and otherwise false. The default is false.
         */
    var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.  If you copy an encrypted DB snapshot from your AWS account, you can specify a value for this parameter to encrypt the copy with a new KMS encryption key. If you don't specify a value for this parameter, then the copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.  If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for this parameter.  If you specify this parameter when you copy an unencrypted snapshot, the copy is encrypted.  If you copy an encrypted snapshot to a different AWS Region, then you must specify a KMS key for the destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. 
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The name of an option group to associate with the copy of the snapshot. Specify this option if you are copying a snapshot from one AWS Region to another, and your DB instance uses a nondefault option group. If your source DB instance uses Transparent Data Encryption for Oracle or Microsoft SQL Server, you must specify this option when copying across AWS Regions. For more information, see Option Group Considerations in the Amazon RDS User Guide. 
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The URL that contains a Signature Version 4 signed request for the CopyDBSnapshot API action in the source AWS Region that contains the source DB snapshot to copy.  You must specify this parameter when you copy an encrypted DB snapshot from another AWS Region by using the Amazon RDS API. You can specify the --source-region option instead of this parameter when you copy an encrypted DB snapshot from another AWS Region by using the AWS CLI.  The presigned URL must be a valid request for the CopyDBSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB snapshot to be copied. The presigned URL request must contain the following parameter values:     DestinationRegion - The AWS Region that the encrypted DB snapshot is copied to. This AWS Region is the same one where the CopyDBSnapshot action is called that contains this presigned URL.  For example, if you copy an encrypted DB snapshot from the us-west-2 AWS Region to the us-east-1 AWS Region, then you call the CopyDBSnapshot action in the us-east-1 AWS Region and provide a presigned URL that contains a call to the CopyDBSnapshot action in the us-west-2 AWS Region. For this example, the DestinationRegion in the presigned URL must be set to the us-east-1 AWS Region.     KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB snapshot in the destination AWS Region. This is the same identifier for both the CopyDBSnapshot action that is called in the destination AWS Region, and the action contained in the presigned URL.     SourceDBSnapshotIdentifier - The DB snapshot identifier for the encrypted snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB snapshot from the us-west-2 AWS Region, then your SourceDBSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115.    To learn how to generate a Signature Version 4 signed request, see Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and Signature Version 4 Signing Process. If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
         */
    var PreSignedUrl: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the source DB snapshot. If the source snapshot is in the same AWS Region as the copy, specify a valid DB snapshot identifier. For example, you might specify rds:mysql-instance1-snapshot-20130805.  If the source snapshot is in a different AWS Region than the copy, specify a valid DB snapshot ARN. For example, you might specify arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805.  If you are copying from a shared manual DB snapshot, this parameter must be the Amazon Resource Name (ARN) of the shared DB snapshot.  If you are copying an encrypted snapshot this parameter must be in the ARN format for the source AWS Region, and must match the SourceDBSnapshotIdentifier in the PreSignedUrl parameter.  Constraints:   Must specify a valid system snapshot in the "available" state.   Example: rds:mydb-2012-04-02-00-01  Example: arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805 
         */
    var SourceDBSnapshotIdentifier: String
    /**
         * The ID of the region that contains the snapshot to be copied.
         */
    var SourceRegion: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The identifier for the copy of the snapshot.  Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-db-snapshot 
         */
    var TargetDBSnapshotIdentifier: String
  }
  
  
  trait CopyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
  }
  
  
  trait CopyOptionGroupMessage extends js.Object {
    /**
         * The identifier or ARN for the source option group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.  Constraints:   Must specify a valid option group.   If the source option group is in the same AWS Region as the copy, specify a valid option group identifier, for example my-option-group, or a valid ARN.   If the source option group is in a different AWS Region than the copy, specify a valid option group ARN, for example arn:aws:rds:us-west-2:123456789012:og:special-options.  
         */
    var SourceOptionGroupIdentifier: String
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The description for the copied option group.
         */
    var TargetOptionGroupDescription: String
    /**
         * The identifier for the copied option group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-option-group 
         */
    var TargetOptionGroupIdentifier: String
  }
  
  
  trait CopyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup] = js.undefined
  }
  
  
  trait CreateDBClusterEndpointMessage extends js.Object {
    /**
         * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
         */
    var DBClusterEndpointIdentifier: String
    /**
         * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
         */
    var DBClusterIdentifier: String
    /**
         * The type of the endpoint. One of: READER, ANY. 
         */
    var EndpointType: String
    /**
         * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
         */
    var ExcludedMembers: js.UndefOr[StringList] = js.undefined
    /**
         * List of DB instance identifiers that are part of the custom endpoint group.
         */
    var StaticMembers: js.UndefOr[StringList] = js.undefined
  }
  
  
  trait CreateDBClusterMessage extends js.Object {
    /**
         * A list of EC2 Availability Zones that instances in the DB cluster can be created in. For information on AWS Regions and Availability Zones, see Choosing the Regions and Availability Zones in the Amazon Aurora User Guide. 
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
         * The target backtrack window, in seconds. To disable backtracking, set this value to 0.  Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
         */
    var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
    /**
         * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
         */
    var CharacterSetName: js.UndefOr[String] = js.undefined
    /**
         * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
         */
    var DBClusterIdentifier: String
    /**
         *  The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, default.aurora5.6 is used.  Constraints:   If supplied, must match the name of an existing DB cluster parameter group.  
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * A DB subnet group to associate with this DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon RDS will not create a database in the DB cluster you are creating.
         */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the database engine to be used for this DB cluster. Valid Values: aurora (for MySQL 5.6-compatible Aurora), aurora-mysql (for MySQL 5.7-compatible Aurora), and aurora-postgresql 
         */
    var Engine: String
    /**
         * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, or global.
         */
    var EngineMode: js.UndefOr[String] = js.undefined
    /**
         * The version number of the database engine to use.  Aurora MySQL  Example: 5.6.10a, 5.7.12   Aurora PostgreSQL  Example: 9.6.3 
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         *  The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster. 
         */
    var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier for an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If an encryption key is not specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon RDS will use the encryption key used to encrypt the source. Otherwise, Amazon RDS will use your default encryption key.    If the StorageEncrypted parameter is true and ReplicationSourceIdentifier is not specified, then Amazon RDS will use your default encryption key.   AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set KmsKeyId to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the Read Replica in that AWS Region.
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
         */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
         * The name of the master user for the DB cluster. Constraints:   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
         */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
         * A value that indicates that the DB cluster should be associated with the specified option group. Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the instances in the DB cluster accept connections.  Default: 3306 if engine is set as aurora or 5432 if set to aurora-postgresql. 
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * A URL that contains a Signature Version 4 signed request for the CreateDBCluster action to be called in the source AWS Region where the DB cluster is replicated from. You only need to specify PreSignedUrl when you are performing cross-region replication from an encrypted DB cluster. The pre-signed URL must be a valid request for the CreateDBCluster API action that can be executed in the source AWS Region that contains the encrypted DB cluster to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster in the destination AWS Region. This should refer to the same KMS key for both the CreateDBCluster action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that Aurora Read Replica will be created in.    ReplicationSourceIdentifier - The DB cluster identifier for the encrypted DB cluster to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster from the us-west-2 AWS Region, then your ReplicationSourceIdentifier would look like Example: arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
         */
    var PreSignedUrl: js.UndefOr[String] = js.undefined
    /**
         * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
         * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
         */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read Replica.
         */
    var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * For DB clusters in serverless DB engine mode, the scaling properties of the DB cluster.
         */
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined
    /**
         * The ID of the region that contains the source for the read replica.
         */
    var SourceRegion: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether the DB cluster is encrypted.
         */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A list of EC2 VPC security groups to associate with this DB cluster.
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait CreateDBClusterParameterGroupMessage extends js.Object {
    /**
         * The name of the DB cluster parameter group. Constraints:   Must match the name of an existing DB cluster parameter group.    This value is stored as a lowercase string. 
         */
    var DBClusterParameterGroupName: String
    /**
         * The DB cluster parameter group family name. A DB cluster parameter group can be associated with one and only one DB cluster parameter group family, and can be applied only to a DB cluster running a database engine and engine version compatible with that DB cluster parameter group family.  Aurora MySQL  Example: aurora5.6, aurora-mysql5.7   Aurora PostgreSQL  Example: aurora-postgresql9.6 
         */
    var DBParameterGroupFamily: String
    /**
         * The description for the DB cluster parameter group.
         */
    var Description: String
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
         * The identifier of the DB cluster to create a snapshot for. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.   Example: my-cluster1 
         */
    var DBClusterIdentifier: String
    /**
         * The identifier of the DB cluster snapshot. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1-snapshot1 
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
         * The amount of storage (in gibibytes) to allocate for the DB instance. Type: Integer  Amazon Aurora  Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases, though you are only charged for the space that you use in an Aurora cluster volume.  MySQL  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 16384.   Provisioned IOPS storage (io1): Must be an integer from 100 to 16384.   Magnetic storage (standard): Must be an integer from 5 to 3072.    MariaDB  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 16384.   Provisioned IOPS storage (io1): Must be an integer from 100 to 16384.   Magnetic storage (standard): Must be an integer from 5 to 3072.    PostgreSQL  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 16384.   Provisioned IOPS storage (io1): Must be an integer from 100 to 16384.   Magnetic storage (standard): Must be an integer from 5 to 3072.    Oracle  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 32768.   Provisioned IOPS storage (io1): Must be an integer from 100 to 32768.   Magnetic storage (standard): Must be an integer from 10 to 3072.    SQL Server  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2):   Enterprise and Standard editions: Must be an integer from 200 to 16384.   Web and Express editions: Must be an integer from 20 to 16384.     Provisioned IOPS storage (io1):   Enterprise and Standard editions: Must be an integer from 200 to 16384.   Web and Express editions: Must be an integer from 100 to 16384.     Magnetic storage (standard):   Enterprise and Standard editions: Must be an integer from 200 to 1024.   Web and Express editions: Must be an integer from 20 to 1024.    
         */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Indicates that minor engine upgrades are applied automatically to the DB instance during the maintenance window. Default: true 
         */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  The EC2 Availability Zone that the DB instance is created in. For information on AWS Regions and Availability Zones, see Regions and Availability Zones.  Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d   Constraint: The AvailabilityZone parameter can't be specified if the MultiAZ parameter is set to true. The specified Availability Zone must be in the same AWS Region as the current endpoint. 
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * The number of days for which automated backups are retained. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups.  Amazon Aurora  Not applicable. The retention period for automated backups is managed by the DB cluster. For more information, see CreateDBCluster. Default: 1 Constraints:   Must be a value from 0 to 35   Can't be set to 0 if the DB instance is a source to Read Replicas  
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.  Amazon Aurora  Not applicable. The character set is managed by the DB cluster. For more information, see CreateDBCluster.
         */
    var CharacterSetName: js.UndefOr[String] = js.undefined
    /**
         * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is false.
         */
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The identifier of the DB cluster that the instance will belong to. For information on creating a DB cluster, see CreateDBCluster. Type: String
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide. 
         */
    var DBInstanceClass: String
    /**
         * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
         */
    var DBInstanceIdentifier: String
    /**
         * The meaning of this parameter differs according to the database engine you use. Type: String  MySQL  The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine    MariaDB  The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine    PostgreSQL  The name of the database to create when the DB instance is created. If this parameter is not specified, the default "postgres" database is created in the DB instance. Constraints:   Must contain 1 to 63 letters, numbers, or underscores.   Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).   Can't be a word reserved by the specified database engine    Oracle  The Oracle System ID (SID) of the created DB instance. If you specify null, the default value ORCL is used. You can't specify the string NULL, or any other reserved word, for DBName.  Default: ORCL  Constraints:   Can't be longer than 8 characters    SQL Server  Not applicable. Must be null.  Amazon Aurora  The name of the database to create when the primary instance of the DB cluster is created. If this parameter is not specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine  
         */
    var DBName: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default DBParameterGroup for the specified engine is used. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * A list of DB security groups to associate with this DB instance. Default: The default DB security group for the database engine.
         */
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined
    /**
         * A DB subnet group to associate with this DB instance. If there is no DB subnet group, then it is a non-VPC DB instance.
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. For more information, see  Deleting a DB Instance. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specify the Active Directory Domain to create the instance in.
         */
    var Domain: js.UndefOr[String] = js.undefined
    /**
         * Specify the name of the IAM role to be used when making API calls to the Directory Service.
         */
    var DomainIAMRoleName: js.UndefOr[String] = js.undefined
    /**
         * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon Relational Database Service User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false.  You can enable IAM database authentication for the following database engines:  Amazon Aurora  Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information, see CreateDBCluster.  MySQL    For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * True to enable Performance Insights for the DB instance, and otherwise false.  For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
         */
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the database engine to be used for this instance.  Not every database engine is available for every AWS Region.  Valid Values:     aurora (for MySQL 5.6-compatible Aurora)    aurora-mysql (for MySQL 5.7-compatible Aurora)    aurora-postgresql     mariadb     mysql     oracle-ee     oracle-se2     oracle-se1     oracle-se     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
         */
    var Engine: String
    /**
         * The version number of the database engine to use. For a list of valid engine versions, call DescribeDBEngineVersions. The following are the database engines and links to information about the major and minor versions that are available with Amazon RDS. Not every database engine is available for every AWS Region.  Amazon Aurora  Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB cluster. For more information, see CreateDBCluster.  MariaDB  See MariaDB on Amazon RDS Versions in the Amazon RDS User Guide.   Microsoft SQL Server  See Version and Feature Support on Amazon RDS in the Amazon RDS User Guide.   MySQL  See MySQL on Amazon RDS Versions in the Amazon RDS User Guide.   Oracle  See Oracle Database Engine Release Notes in the Amazon RDS User Guide.   PostgreSQL  See Supported PostgreSQL Database Versions in the Amazon RDS User Guide. 
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB instance. For information about valid Iops values, see see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide.  Constraints: Must be a multiple between 1 and 50 of the storage amount for the DB instance. 
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The AWS KMS key identifier for an encrypted DB instance. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.  Amazon Aurora  Not applicable. The KMS key identifier is managed by the DB cluster. For more information, see CreateDBCluster. If the StorageEncrypted parameter is true, and you do not specify a value for the KmsKeyId parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * License model information for this DB instance.  Valid values: license-included | bring-your-own-license | general-public-license 
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Amazon Aurora  Not applicable. The password for the master user is managed by the DB cluster. For more information, see CreateDBCluster.  MariaDB  Constraints: Must contain from 8 to 41 characters.  Microsoft SQL Server  Constraints: Must contain from 8 to 128 characters.  MySQL  Constraints: Must contain from 8 to 41 characters.  Oracle  Constraints: Must contain from 8 to 30 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.
         */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
         * The name for the master user.  Amazon Aurora  Not applicable. The name for the master user is managed by the DB cluster. For more information, see CreateDBCluster.   MariaDB  Constraints:   Required for MariaDB.   Must be 1 to 16 letters or numbers.   Can't be a reserved word for the chosen database engine.    Microsoft SQL Server  Constraints:   Required for SQL Server.   Must be 1 to 128 letters or numbers.   The first character must be a letter.   Can't be a reserved word for the chosen database engine.    MySQL  Constraints:   Required for MySQL.   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.    Oracle  Constraints:   Required for Oracle.   Must be 1 to 30 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.    PostgreSQL  Constraints:   Required for PostgreSQL.   Must be 1 to 63 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
         */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
         * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
         */
    var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, go to Setting Up and Enabling Enhanced Monitoring in the Amazon RDS User Guide. If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
         */
    var MonitoringRoleArn: js.UndefOr[String] = js.undefined
    /**
         * A value that specifies whether the DB instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the MultiAZ parameter is set to true.
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Indicates that the DB instance should be associated with the specified option group. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
         */
    var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
    /**
         * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
         */
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The port number on which the database accepts connections.  MySQL   Default: 3306   Valid Values: 1150-65535  Type: Integer  MariaDB   Default: 3306   Valid Values: 1150-65535  Type: Integer  PostgreSQL   Default: 5432   Valid Values: 1150-65535  Type: Integer  Oracle   Default: 1521   Valid Values: 1150-65535   SQL Server   Default: 1433   Valid Values: 1150-65535 except for 1434, 3389, 47001, 49152, and 49152 through 49156.   Amazon Aurora   Default: 3306   Valid Values: 1150-65535  Type: Integer
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         *  The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter. For more information, see The Backup Window in the Amazon RDS User Guide.   Amazon Aurora  Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more information, see CreateDBCluster.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Instance Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
         * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more information, see Amazon RDS Maintenance Window.   Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
         */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide.  Default: 1 Valid Values: 0 - 15
         */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. Default: The default behavior varies depending on whether DBSubnetGroupName is specified. If DBSubnetGroupName is not specified, and PubliclyAccessible is not specified, the following applies:   If the default VPC in the target region doesn’t have an Internet gateway attached to it, the DB instance is private.   If the default VPC in the target region has an Internet gateway attached to it, the DB instance is public.   If DBSubnetGroupName is specified, and PubliclyAccessible is not specified, the following applies:   If the subnets are part of a VPC that doesn’t have an Internet gateway attached to it, the DB instance is private.   If the subnets are part of a VPC that has an Internet gateway attached to it, the DB instance is public.  
         */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specifies whether the DB instance is encrypted.  Amazon Aurora  Not applicable. The encryption for DB instances is managed by the DB cluster. For more information, see CreateDBCluster. Default: false
         */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise standard 
         */
    var StorageType: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The ARN from the key store with which to associate the instance for TDE encryption.
         */
    var TdeCredentialArn: js.UndefOr[String] = js.undefined
    /**
         * The password for the given ARN from the key store in order to access the device.
         */
    var TdeCredentialPassword: js.UndefOr[String] = js.undefined
    /**
         * The time zone of the DB instance. The time zone parameter is currently supported only by Microsoft SQL Server. 
         */
    var Timezone: js.UndefOr[String] = js.undefined
    /**
         * A list of Amazon EC2 VPC security groups to associate with this DB instance.  Amazon Aurora  Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more information, see CreateDBCluster. Default: The default EC2 VPC security group for the DB subnet group's VPC.
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait CreateDBInstanceReadReplicaMessage extends js.Object {
    /**
         * Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance window. Default: Inherits from the source DB instance
         */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The Amazon EC2 Availability Zone that the Read Replica is created in. Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d 
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The default is false.
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
         * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. For more information, see  Deleting a DB Instance. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon RDS User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. You can enable IAM database authentication for the following database engines   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora MySQL 5.6 or higher   Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * True to enable Performance Insights for the read replica, and otherwise false.  For more information, see Using Amazon Performance Insights in the Amazon RDS User Guide. 
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
         * Specifies whether the Read Replica is in a Multi-AZ deployment.  You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is independent of whether the source database is a Multi-AZ DB instance. 
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The option group the DB instance is associated with. If omitted, the default option group for the engine specified is used.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
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
         * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
         */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can have up to five Read Replicas. Constraints:   Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.   Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.   Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and higher for cross-region replication).   The specified DB instance must have automatic backups enabled, its backup retention period must be greater than 0.   If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance identifier.   If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance ARN. For more information, go to  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.  
         */
    var SourceDBInstanceIdentifier: String
    /**
         * The ID of the region that contains the source for the read replica.
         */
    var SourceRegion: js.UndefOr[String] = js.undefined
    /**
         * Specifies the storage type to be associated with the Read Replica.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise standard 
         */
    var StorageType: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A value that specifies that the DB instance class of the DB instance uses its default processor features.
         */
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  A list of EC2 VPC security groups to associate with the Read Replica.   Default: The default EC2 VPC security group for the DB subnet group's VPC. 
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait CreateDBInstanceReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait CreateDBParameterGroupMessage extends js.Object {
    /**
         * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter group family, and can be applied only to a DB instance running a database engine and engine version compatible with that DB parameter group family. To list all of the available parameter group families, use the following command:  aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"   The output contains duplicates. 
         */
    var DBParameterGroupFamily: String
    /**
         * The name of the DB parameter group. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens    This value is stored as a lowercase string. 
         */
    var DBParameterGroupName: String
    /**
         * The description for the DB parameter group.
         */
    var Description: String
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateDBParameterGroupResult extends js.Object {
    var DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
  }
  
  
  trait CreateDBSecurityGroupMessage extends js.Object {
    /**
         * The description for the DB security group.
         */
    var DBSecurityGroupDescription: String
    /**
         * The name for the DB security group. This value is stored as a lowercase string. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"   Example: mysecuritygroup 
         */
    var DBSecurityGroupName: String
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateDBSecurityGroupResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
  }
  
  
  trait CreateDBSnapshotMessage extends js.Object {
    /**
         * The identifier of the DB instance that you want to create the snapshot of. Constraints:   Must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: String
    /**
         * The identifier for the DB snapshot. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
         */
    var DBSnapshotIdentifier: String
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
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
         * The EC2 Subnet IDs for the DB subnet group.
         */
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
  }
  
  
  trait CreateEventSubscriptionMessage extends js.Object {
    /**
         *  A Boolean value; set to true to activate the subscription, set to false to create the subscription but not active it. 
         */
    var Enabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action. 
         */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
         */
    var SnsTopicArn: String
    /**
         * The list of identifiers of the event sources for which events are returned. If not specified, then all sources are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens. Constraints:   If SourceIds are supplied, SourceType must also be provided.   If the source type is a DB instance, then a DBInstanceIdentifier must be supplied.   If the source type is a DB security group, a DBSecurityGroupName must be supplied.   If the source type is a DB parameter group, a DBParameterGroupName must be supplied.   If the source type is a DB snapshot, a DBSnapshotIdentifier must be supplied.  
         */
    var SourceIds: js.UndefOr[SourceIdsList] = js.undefined
    /**
         * The type of source that is generating the events. For example, if you want to be notified of events generated by a DB instance, you would set this parameter to db-instance. if this value is not specified, all events are returned. Valid values: db-instance | db-cluster | db-parameter-group | db-security-group | db-snapshot | db-cluster-snapshot 
         */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
         * The name of the subscription. Constraints: The name must be less than 255 characters.
         */
    var SubscriptionName: String
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  
  trait CreateGlobalClusterMessage extends js.Object {
    /**
         *  The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will not create a database in the global database cluster you are creating. 
         */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
         *  The deletion protection setting for the new global database. The global database can't be deleted when this value is set to true. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Provides the name of the database engine to be used for this DB cluster.
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * The engine version of the Aurora global database.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The cluster identifier of the new global database cluster.
         */
    var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. 
         */
    var SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  The storage encryption setting for the new global database cluster. 
         */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  
  trait CreateGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
  }
  
  
  trait CreateOptionGroupMessage extends js.Object {
    /**
         * Specifies the name of the engine that this option group should be associated with.
         */
    var EngineName: String
    /**
         * Specifies the major version of the engine that this option group should be associated with.
         */
    var MajorEngineVersion: String
    /**
         * The description of the option group.
         */
    var OptionGroupDescription: String
    /**
         * Specifies the name of the option group to be created. Constraints:   Must be 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: myoptiongroup 
         */
    var OptionGroupName: String
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup] = js.undefined
  }
  
  
  trait DBCluster extends js.Object {
    /**
         * For all database engines except Amazon Aurora, AllocatedStorage specifies the allocated storage size in gibibytes (GiB). For Aurora, AllocatedStorage always returns 1, because Aurora DB cluster storage size is not fixed, but instead automatically adjusts as needed.
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
         * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.
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
    var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
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
         * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when this value is set to true. 
         */
    var DeletionProtection: js.UndefOr[Boolean] = js.undefined
    /**
         * The earliest time to which a DB cluster can be backtracked.
         */
    var EarliestBacktrackTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The earliest time to which a database can be restored with point-in-time restore.
         */
    var EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined
    /**
         * A list of log types that this DB cluster is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon Aurora User Guide. 
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
         * The DB engine mode of the DB cluster, either provisioned, serverless, or parallelquery.
         */
    var EngineMode: js.UndefOr[String] = js.undefined
    /**
         * Indicates the database engine version.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
         */
    var HostedZoneId: js.UndefOr[String] = js.undefined
    /**
         *  HTTP endpoint functionality is in beta for Aurora Serverless and is subject to change.  Value that is true if the HTTP endpoint for an Aurora Serverless DB cluster is enabled and false otherwise. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.
         */
    var HttpEndpointEnabled: js.UndefOr[Boolean] = js.undefined
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
         * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster.  If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
         */
    var ReaderEndpoint: js.UndefOr[String] = js.undefined
    /**
         * Contains the identifier of the source DB cluster if this DB cluster is a Read Replica.
         */
    var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
    var ScalingConfigurationInfo: js.UndefOr[ScalingConfigurationInfo] = js.undefined
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
  
  
  trait DBClusterBacktrack extends js.Object {
    /**
         * Contains the backtrack identifier.
         */
    var BacktrackIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The timestamp of the time at which the backtrack was requested.
         */
    var BacktrackRequestCreationTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The timestamp of the time to which the DB cluster was backtracked.
         */
    var BacktrackTo: js.UndefOr[TStamp] = js.undefined
    /**
         * The timestamp of the time from which the DB cluster was backtracked.
         */
    var BacktrackedFrom: js.UndefOr[TStamp] = js.undefined
    /**
         * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The status of the backtrack. This property returns one of the following values:    applying - The backtrack is currently being applied to or rolled back from the DB cluster.    completed - The backtrack has successfully been applied to or rolled back from the DB cluster.    failed - An error occurred while the backtrack was applied to or rolled back from the DB cluster.    pending - The backtrack is currently pending application to or rollback from the DB cluster.  
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterBacktrackMessage extends js.Object {
    /**
         * Contains a list of backtracks for the user.
         */
    var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.undefined
    /**
         * A pagination token that can be used in a subsequent DescribeDBClusterBacktracks request.
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterCapacityInfo extends js.Object {
    /**
         * The current capacity of the DB cluster.
         */
    var CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster. 
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A value that specifies the capacity that the DB cluster scales to next.
         */
    var PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The number of seconds before a call to ModifyCurrentDBClusterCapacity times out.
         */
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
         */
    var TimeoutAction: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterEndpoint extends js.Object {
    /**
         * The type associated with a custom endpoint. One of: READER, ANY.
         */
    var CustomEndpointType: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the endpoint.
         */
    var DBClusterEndpointArn: js.UndefOr[String] = js.undefined
    /**
         * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
         */
    var DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
         */
    var DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The DNS address of the endpoint.
         */
    var Endpoint: js.UndefOr[String] = js.undefined
    /**
         * The type of the endpoint. One of: READER, WRITER, CUSTOM.
         */
    var EndpointType: js.UndefOr[String] = js.undefined
    /**
         * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
         */
    var ExcludedMembers: js.UndefOr[StringList] = js.undefined
    /**
         * List of DB instance identifiers that are part of the custom endpoint group.
         */
    var StaticMembers: js.UndefOr[StringList] = js.undefined
    /**
         * The current status of the endpoint. One of: creating, available, deleting, modifying.
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterEndpointMessage extends js.Object {
    /**
         * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
         */
    var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
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
         * Value that is true if the cluster member is the primary instance for the DB cluster and false otherwise.
         */
    var IsClusterWriter: js.UndefOr[Boolean] = js.undefined
    /**
         * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. 
         */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DBClusterMessage extends js.Object {
    /**
         * Contains a list of DB clusters for the user.
         */
    var DBClusters: js.UndefOr[DBClusterList] = js.undefined
    /**
         * A pagination token that can be used in a subsequent DescribeDBClusters request.
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterOptionGroupStatus extends js.Object {
    /**
         * Specifies the name of the DB cluster option group.
         */
    var DBClusterOptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * Specifies the status of the DB cluster option group.
         */
    var Status: js.UndefOr[String] = js.undefined
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
         *  An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * Provides a list of parameters for the DB cluster parameter group.
         */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  
  trait DBClusterParameterGroupNameMessage extends js.Object {
    /**
         * The name of the DB cluster parameter group. Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens    This value is stored as a lowercase string. 
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterParameterGroupsMessage extends js.Object {
    /**
         * A list of DB cluster parameter groups.
         */
    var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterRole extends js.Object {
    var FeatureName: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
         */
    var RoleArn: js.UndefOr[String] = js.undefined
    /**
         * Describes the state of association between the IAM role and the DB cluster. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB cluster and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB cluster.    INVALID - the IAM role ARN is associated with the DB cluster, but the DB cluster is unable to assume the IAM role in order to access other AWS services on your behalf.  
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterSnapshot extends js.Object {
    /**
         * Specifies the allocated storage size in gibibytes (GiB).
         */
    var AllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
         * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
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
         * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
         */
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * Provides the license model information for this DB cluster snapshot.
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * Provides the master username for the DB cluster snapshot.
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
         * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
         */
    var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
         * Provides the type of the DB cluster snapshot.
         */
    var SnapshotType: js.UndefOr[String] = js.undefined
    /**
         * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the source DB cluster snapshot, otherwise, a null value.
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
         * Provides the VPC ID associated with the DB cluster snapshot.
         */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterSnapshotAttribute extends js.Object {
    /**
         * The name of the manual DB cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual DB cluster snapshot. For more information, see the ModifyDBClusterSnapshotAttribute API action.
         */
    var AttributeName: js.UndefOr[String] = js.undefined
    /**
         * The value(s) for the manual DB cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of all is in the list, then the manual DB cluster snapshot is public and available for any AWS account to copy or restore.
         */
    var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  
  trait DBClusterSnapshotAttributesResult extends js.Object {
    /**
         * The list of attributes and values for the manual DB cluster snapshot.
         */
    var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined
    /**
         * The identifier of the manual DB cluster snapshot that the attributes apply to.
         */
    var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBClusterSnapshotMessage extends js.Object {
    /**
         * Provides a list of DB cluster snapshots for the user.
         */
    var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
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
         *  The default character set for new instances of this engine version, if the CharacterSetName parameter of the CreateDBInstance API is not specified. 
         */
    var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined
    /**
         * The name of the database engine.
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * The version number of the database engine.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The types of logs that the database engine has available for export to CloudWatch Logs.
         */
    var ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined
    /**
         *  A list of the character sets supported by this engine for the CharacterSetName parameter of the CreateDBInstance action. 
         */
    var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
    /**
         * A list of the supported DB engine modes.
         */
    var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
    /**
         * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action. 
         */
    var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined
    /**
         * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
         */
    var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether the database engine version supports read replicas.
         */
    var SupportsReadReplica: js.UndefOr[Boolean] = js.undefined
    /**
         * A list of engine versions that this database engine version can be upgraded to.
         */
    var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
  }
  
  
  trait DBEngineVersionMessage extends js.Object {
    /**
         *  A list of DBEngineVersion elements. 
         */
    var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBInstance extends js.Object {
    /**
         * Specifies the allocated storage size specified in gibibytes.
         */
    var AllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
         * Indicates that minor version patches are applied automatically.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the name of the Availability Zone the DB instance is located in.
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * Specifies the number of days for which automatic DB snapshots are retained.
         */
    var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
    /**
         * The identifier of the CA certificate for this DB instance.
         */
    var CACertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
         * If present, specifies the name of the character set that this instance is associated with.
         */
    var CharacterSetName: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
         */
    var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined
    /**
         * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
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
         * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
         */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * Specifies the current state of this database.
         */
    var DBInstanceStatus: js.UndefOr[String] = js.undefined
    /**
         * The meaning of this parameter differs according to the database engine you use. For example, this value returns MySQL, MariaDB, or PostgreSQL information when returning values from CreateDBInstanceReadReplica since Read Replicas are only supported for these engines.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance. Type: String  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance.
         */
    var DBName: js.UndefOr[String] = js.undefined
    /**
         * Provides the list of DB parameter groups applied to this DB instance.
         */
    var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.undefined
    /**
         *  Provides List of DB security group elements containing only DBSecurityGroup.Name and DBSecurityGroup.Status subelements. 
         */
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined
    /**
         * Specifies information on the subnet group associated with the DB instance, including the name, description, and subnets in the subnet group.
         */
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    /**
         * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
         */
    var DbInstancePort: js.UndefOr[Integer] = js.undefined
    /**
         * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
         */
    var DbiResourceId: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when this value is set to true. For more information, see  Deleting a DB Instance. 
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
         * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring metrics data for the DB instance.
         */
    var EnhancedMonitoringResourceArn: js.UndefOr[String] = js.undefined
    /**
         * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.  
         */
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Provides the date and time the DB instance was created.
         */
    var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
         * Specifies the Provisioned IOPS (I/O operations per second) value.
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance. 
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * Specifies the latest time to which a database can be restored with point-in-time restore.
         */
    var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
    /**
         * License model information for this DB instance.
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * Specifies the listener connection endpoint for SQL Server Always On.
         */
    var ListenerEndpoint: js.UndefOr[Endpoint] = js.undefined
    /**
         * Contains the master username for the DB instance.
         */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
         * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
         */
    var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
         */
    var MonitoringRoleArn: js.UndefOr[String] = js.undefined
    /**
         * Specifies if the DB instance is a Multi-AZ deployment.
         */
    var MultiAZ: js.UndefOr[Boolean] = js.undefined
    /**
         * Provides the list of option group memberships for this DB instance.
         */
    var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined
    /**
         * Specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
         */
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined
    /**
         * True if Performance Insights is enabled for the DB instance, and otherwise false.
         */
    var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
         */
    var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
    /**
         * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
         */
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
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
         * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
         */
    var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
    /**
         * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a Read Replica. For example, when you create an Aurora Read Replica of an RDS MySQL DB instance, the Aurora MySQL DB cluster for the Aurora Read Replica is shown. This output does not contain information about cross region Aurora Read Replicas.  Currently, each RDS DB instance can have only one Aurora Read Replica. 
         */
    var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.undefined
    /**
         * Contains one or more identifiers of the Read Replicas associated with this DB instance.
         */
    var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.undefined
    /**
         * Contains the identifier of the source DB instance if this DB instance is a Read Replica.
         */
    var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
         */
    var SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * The status of a Read Replica. If the instance is not a Read Replica, this is blank.
         */
    var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined
    /**
         * Specifies whether the DB instance is encrypted.
         */
    var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the storage type associated with DB instance.
         */
    var StorageType: js.UndefOr[String] = js.undefined
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
  
  
  trait DBInstanceAutomatedBackup extends js.Object {
    /**
         * Specifies the allocated storage size in gibibytes (GiB).
         */
    var AllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
         * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability Zones, see Regions and Availability Zones.
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the automated backup.
         */
    var DBInstanceArn: js.UndefOr[String] = js.undefined
    /**
         * The customer id of the instance that is/was associated with the automated backup. 
         */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
         */
    var DbiResourceId: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether the automated backup is encrypted.
         */
    var Encrypted: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of the database engine for this automated backup.
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * The version of the database engine for the automated backup.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
         */
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Provides the date and time that the DB instance was created. 
         */
    var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The IOPS (I/O operations per second) value for the automated backup. 
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. 
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * License model information for the automated backup.
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * The license model of an automated backup.
         */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
         * The option group the automated backup is associated with. If omitted, the default option group for the engine specified is used.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number that the automated backup used for connections. Default: Inherits from the source DB instance Valid Values: 1150-65535 
         */
    var Port: js.UndefOr[Integer] = js.undefined
    /**
         * The AWS Region associated with the automated backup.
         */
    var Region: js.UndefOr[String] = js.undefined
    /**
         * Earliest and latest time an instance can be restored to.
         */
    var RestoreWindow: js.UndefOr[RestoreWindow] = js.undefined
    /**
         * Provides a list of status information for an automated backup:    active - automated backups for current instances    retained - automated backups for deleted instances    creating - automated backups that are waiting for the first automated snapshot to be available.  
         */
    var Status: js.UndefOr[String] = js.undefined
    /**
         * Specifies the storage type associated with the automated backup.
         */
    var StorageType: js.UndefOr[String] = js.undefined
    /**
         * The ARN from the key store with which the automated backup is associated for TDE encryption.
         */
    var TdeCredentialArn: js.UndefOr[String] = js.undefined
    /**
         * The time zone of the automated backup. In most cases, the Timezone element is empty. Timezone content appears only for Microsoft SQL Server DB instances that were created with a time zone specified.
         */
    var Timezone: js.UndefOr[String] = js.undefined
    /**
         * Provides the VPC ID associated with the DB instance
         */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBInstanceAutomatedBackupMessage extends js.Object {
    /**
         *  A list of DBInstanceAutomatedBackup instances. 
         */
    var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBInstanceMessage extends js.Object {
    /**
         *  A list of DBInstance instances. 
         */
    var DBInstances: js.UndefOr[DBInstanceList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBInstanceStatusInfo extends js.Object {
    /**
         * Details of the error if there is an error for the instance. If the instance is not in an error state, this value is blank.
         */
    var Message: js.UndefOr[String] = js.undefined
    /**
         * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
         */
    var Normal: js.UndefOr[Boolean] = js.undefined
    /**
         * Status of the DB instance. For a StatusType of read replica, the values can be replicating, replication stop point set, replication stop point reached, error, stopped, or terminated.
         */
    var Status: js.UndefOr[String] = js.undefined
    /**
         * This value is currently "read replication."
         */
    var StatusType: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBParameterGroup extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the DB parameter group.
         */
    var DBParameterGroupArn: js.UndefOr[String] = js.undefined
    /**
         * Provides the name of the DB parameter group family that this DB parameter group is compatible with.
         */
    var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
         * Provides the name of the DB parameter group.
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * Provides the customer-specified description for this DB parameter group.
         */
    var Description: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBParameterGroupDetails extends js.Object {
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  A list of Parameter values. 
         */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  
  trait DBParameterGroupNameMessage extends js.Object {
    /**
         * Provides the name of the DB parameter group.
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBParameterGroupStatus extends js.Object {
    /**
         * The name of the DP parameter group.
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * The status of parameter updates.
         */
    var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBParameterGroupsMessage extends js.Object {
    /**
         *  A list of DBParameterGroup instances. 
         */
    var DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSecurityGroup extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the DB security group.
         */
    var DBSecurityGroupArn: js.UndefOr[String] = js.undefined
    /**
         * Provides the description of the DB security group.
         */
    var DBSecurityGroupDescription: js.UndefOr[String] = js.undefined
    /**
         * Specifies the name of the DB security group.
         */
    var DBSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
         *  Contains a list of EC2SecurityGroup elements. 
         */
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
    /**
         *  Contains a list of IPRange elements. 
         */
    var IPRanges: js.UndefOr[IPRangeList] = js.undefined
    /**
         * Provides the AWS ID of the owner of a specific DB security group.
         */
    var OwnerId: js.UndefOr[String] = js.undefined
    /**
         * Provides the VpcId of the DB security group.
         */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSecurityGroupMembership extends js.Object {
    /**
         * The name of the DB security group.
         */
    var DBSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
         * The status of the DB security group.
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSecurityGroupMessage extends js.Object {
    /**
         *  A list of DBSecurityGroup instances. 
         */
    var DBSecurityGroups: js.UndefOr[DBSecurityGroups] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSnapshot extends js.Object {
    /**
         * Specifies the allocated storage size in gibibytes (GiB).
         */
    var AllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
         * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
         */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the DB snapshot.
         */
    var DBSnapshotArn: js.UndefOr[String] = js.undefined
    /**
         * Specifies the identifier for the DB snapshot.
         */
    var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
         */
    var DbiResourceId: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether the DB snapshot is encrypted.
         */
    var Encrypted: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the name of the database engine.
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * Specifies the version of the database engine.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
         */
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
         */
    var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
         * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         *  If Encrypted is true, the AWS KMS key identifier for the encrypted DB snapshot. 
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * License model information for the restored DB instance.
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * Provides the master username for the DB snapshot.
         */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
         * Provides the option group name for the DB snapshot.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The percentage of the estimated data that has been transferred.
         */
    var PercentProgress: js.UndefOr[Integer] = js.undefined
    /**
         * Specifies the port that the database engine was listening on at the time of the snapshot.
         */
    var Port: js.UndefOr[Integer] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the DB snapshot was created.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
         */
    var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
         * Provides the type of the DB snapshot.
         */
    var SnapshotType: js.UndefOr[String] = js.undefined
    /**
         * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of cross-customer or cross-region copy.
         */
    var SourceDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The AWS Region that the DB snapshot was created in or copied from.
         */
    var SourceRegion: js.UndefOr[String] = js.undefined
    /**
         * Specifies the status of this DB snapshot.
         */
    var Status: js.UndefOr[String] = js.undefined
    /**
         * Specifies the storage type associated with DB snapshot.
         */
    var StorageType: js.UndefOr[String] = js.undefined
    /**
         * The ARN from the key store with which to associate the instance for TDE encryption.
         */
    var TdeCredentialArn: js.UndefOr[String] = js.undefined
    /**
         * The time zone of the DB snapshot. In most cases, the Timezone element is empty. Timezone content appears only for snapshots taken from Microsoft SQL Server DB instances that were created with a time zone specified. 
         */
    var Timezone: js.UndefOr[String] = js.undefined
    /**
         * Provides the VPC ID associated with the DB snapshot.
         */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSnapshotAttribute extends js.Object {
    /**
         * The name of the manual DB snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual DB cluster snapshot. For more information, see the ModifyDBSnapshotAttribute API action.
         */
    var AttributeName: js.UndefOr[String] = js.undefined
    /**
         * The value or values for the manual DB snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of all is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
         */
    var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  
  trait DBSnapshotAttributesResult extends js.Object {
    /**
         * The list of attributes and values for the manual DB snapshot.
         */
    var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.undefined
    /**
         * The identifier of the manual DB snapshot that the attributes apply to.
         */
    var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSnapshotMessage extends js.Object {
    /**
         *  A list of DBSnapshot instances. 
         */
    var DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSubnetGroup extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the DB subnet group.
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
         *  Contains a list of Subnet elements. 
         */
    var Subnets: js.UndefOr[SubnetList] = js.undefined
    /**
         * Provides the VpcId of the DB subnet group.
         */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DBSubnetGroupMessage extends js.Object {
    /**
         *  A list of DBSubnetGroup instances. 
         */
    var DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DeleteDBClusterEndpointMessage extends js.Object {
    /**
         * The identifier associated with the custom endpoint. This parameter is stored as a lowercase string.
         */
    var DBClusterEndpointIdentifier: String
  }
  
  
  trait DeleteDBClusterMessage extends js.Object {
    /**
         * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
         */
    var DBClusterIdentifier: String
    /**
         *  The DB cluster snapshot identifier of the new DB cluster snapshot created when SkipFinalSnapshot is set to false.    Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.   Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
         */
    var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If true is specified, no DB cluster snapshot is created. If false is specified, a DB cluster snapshot is created before the DB cluster is deleted.   You must specify a FinalDBSnapshotIdentifier parameter if SkipFinalSnapshot is false.  Default: false 
         */
    var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait DeleteDBClusterParameterGroupMessage extends js.Object {
    /**
         * The name of the DB cluster parameter group. Constraints:   Must be the name of an existing DB cluster parameter group.   You can't delete a default DB cluster parameter group.   Can't be associated with any DB clusters.  
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
  
  
  trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
    /**
         * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
         */
    var DbiResourceId: String
  }
  
  
  trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
    var DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup] = js.undefined
  }
  
  
  trait DeleteDBInstanceMessage extends js.Object {
    /**
         * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive. Constraints:   Must match the name of an existing DB instance.  
         */
    var DBInstanceIdentifier: String
    /**
         * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This parameter isn't case-sensitive. This parameter defaults to true.
         */
    var DeleteAutomatedBackups: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  The DBSnapshotIdentifier of the new DB snapshot created when SkipFinalSnapshot is set to false.   Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.  Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Can't be specified when deleting a Read Replica.  
         */
    var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  A value that indicates whether a final DB snapshot is created before the DB instance is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB instance is deleted.  When a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. Specify true when deleting a Read Replica.  The FinalDBSnapshotIdentifier parameter must be specified if SkipFinalSnapshot is false.  Default: false 
         */
    var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait DeleteDBParameterGroupMessage extends js.Object {
    /**
         * The name of the DB parameter group. Constraints:   Must be the name of an existing DB parameter group   You can't delete a default DB parameter group   Can't be associated with any DB instances  
         */
    var DBParameterGroupName: String
  }
  
  
  trait DeleteDBSecurityGroupMessage extends js.Object {
    /**
         * The name of the DB security group to delete.  You can't delete the default DB security group.  Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"  
         */
    var DBSecurityGroupName: String
  }
  
  
  trait DeleteDBSnapshotMessage extends js.Object {
    /**
         * The DB snapshot identifier. Constraints: Must be the name of an existing DB snapshot in the available state.
         */
    var DBSnapshotIdentifier: String
  }
  
  
  trait DeleteDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
  }
  
  
  trait DeleteDBSubnetGroupMessage extends js.Object {
    /**
         * The name of the database subnet group to delete.  You can't delete the default subnet group.  Constraints: Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
         */
    var DBSubnetGroupName: String
  }
  
  
  trait DeleteEventSubscriptionMessage extends js.Object {
    /**
         * The name of the RDS event notification subscription you want to delete.
         */
    var SubscriptionName: String
  }
  
  
  trait DeleteEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  
  trait DeleteGlobalClusterMessage extends js.Object {
    /**
         *  The cluster identifier of the global database cluster being deleted. 
         */
    var GlobalClusterIdentifier: String
  }
  
  
  trait DeleteGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
  }
  
  
  trait DeleteOptionGroupMessage extends js.Object {
    /**
         * The name of the option group to be deleted.  You can't delete default option groups. 
         */
    var OptionGroupName: String
  }
  
  
  trait DescribeAccountAttributesMessage extends js.Object
  
  
  trait DescribeCertificatesMessage extends js.Object {
    /**
         * The user-supplied certificate identifier. If this parameter is specified, information for only the identified certificate is returned. This parameter isn't case-sensitive. Constraints:   Must match an existing CertificateIdentifier.  
         */
    var CertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeCertificates request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBClusterBacktracksMessage extends js.Object {
    /**
         * If specified, this value is the backtrack identifier of the backtrack to be described. Constraints:   Must contain a valid universally unique identifier (UUID). For more information about UUIDs, see A Universally Unique Identifier (UUID) URN Namespace.   Example: 123e4567-e89b-12d3-a456-426655440000 
         */
    var BacktrackIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The DB cluster identifier of the DB cluster to be described. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
         */
    var DBClusterIdentifier: String
    /**
         * A filter that specifies one or more DB clusters to describe. Supported filters include the following:    db-cluster-backtrack-id - Accepts backtrack identifiers. The results list includes information about only the backtracks identified by these identifiers.    db-cluster-backtrack-status - Accepts any of the following backtrack status values:    applying     completed     failed     pending    The results list includes information about only the backtracks identified by these values. For more information about backtrack status values, see DBClusterBacktrack.  
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterBacktracks request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBClusterEndpointsMessage extends js.Object {
    /**
         * The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
         */
    var DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as name-value pairs, in the format Name=endpoint_type,Values=endpoint_type1,endpoint_type2,.... Name can be one of: db-cluster-endpoint-type, db-cluster-endpoint-custom-type, db-cluster-endpoint-id, db-cluster-endpoint-status. Values for the  db-cluster-endpoint-type filter can be one or more of: reader, writer, custom. Values for the db-cluster-endpoint-custom-type filter can be one or more of: reader, any. Values for the db-cluster-endpoint-status filter can be one or more of: available, creating, deleting, modifying. 
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBClusterParameterGroupsMessage extends js.Object {
    /**
         * The name of a specific DB cluster parameter group to return details for. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBClusterParametersMessage extends js.Object {
    /**
         * The name of a specific DB cluster parameter group to return parameter details for. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
         */
    var DBClusterParameterGroupName: String
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
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
         * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in conjunction with the DBClusterSnapshotIdentifier parameter. This parameter is not case-sensitive.  Constraints:   If supplied, must match the identifier of an existing DBCluster.  
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the DBClusterIdentifier parameter. This value is stored as a lowercase string.  Constraints:   If supplied, must match the identifier of an existing DBClusterSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
         */
    var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * True to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account, and otherwise false. The default is false. The default is false. You can share a manual DB cluster snapshot as public by using the ModifyDBClusterSnapshotAttribute API action.
         */
    var IncludePublic: js.UndefOr[Boolean] = js.undefined
    /**
         * True to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given permission to copy or restore, and otherwise false. The default is false. You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the ModifyDBClusterSnapshotAttribute API action.
         */
    var IncludeShared: js.UndefOr[Boolean] = js.undefined
    /**
         * An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The type of DB cluster snapshots to be returned. You can specify one of the following values:    automated - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my AWS account.    manual - Return all DB cluster snapshots that have been taken by my AWS account.    shared - Return all manual DB cluster snapshots that have been shared to my AWS account.    public - Return all DB cluster snapshots that have been marked as public.   If you don't specify a SnapshotType value, then both automated and manual DB cluster snapshots are returned. You can include shared DB cluster snapshots with these results by setting the IncludeShared parameter to true. You can include public DB cluster snapshots with these results by setting the IncludePublic parameter to true. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
         */
    var SnapshotType: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeDBClustersMessage extends js.Object {
    /**
         * The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB cluster is returned. This parameter isn't case-sensitive. Constraints:   If supplied, must match an existing DBClusterIdentifier.  
         */
    var DBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A filter that specifies one or more DB clusters to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include information about the DB clusters identified by these ARNs.  
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * An optional pagination token provided by a previous DescribeDBClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBEngineVersionsMessage extends js.Object {
    /**
         * The name of a specific DB parameter group family to return details for. Constraints:   If supplied, must match an existing DBParameterGroupFamily.  
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
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so that the following results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBInstanceAutomatedBackupsMessage extends js.Object {
    /**
         * (Optional) The user-supplied instance identifier. If this parameter is specified, it must match the identifier of an existing DB instance. It returns information from the specific DB instance' automated backup. This parameter isn't case-sensitive. 
         */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The resource ID of the DB instance that is the source of the automated backup. This parameter isn't case-sensitive. 
         */
    var DbiResourceId: js.UndefOr[String] = js.undefined
    /**
         * A filter that specifies which resources to return based on status. Supported filters are the following:    status     active - automated backups for current instances    retained - automated backups for deleted instances    creating - automated backups that are waiting for the first automated snapshot to be available      db-instance-id - Accepts DB instance identifiers and Amazon Resource Names (ARNs) for DB instances. The results list includes only information about the DB instance automated backupss identified by these ARNs.    dbi-resource-id - Accepts DB instance resource identifiers and DB Amazon Resource Names (ARNs) for DB instances. The results list includes only information about the DB instance resources identified by these ARNs.   Returns all resources by default. The status for each resource is specified in the response.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * The pagination token provided in the previous request. If this parameter is specified the response includes only records beyond the marker, up to MaxRecords.
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBInstancesMessage extends js.Object {
    /**
         * The user-supplied instance identifier. If this parameter is specified, information from only the specific DB instance is returned. This parameter isn't case-sensitive. Constraints:   If supplied, must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A filter that specifies one or more DB instances to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include information about the DB instances associated with the DB clusters identified by these ARNs.    db-instance-id - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs). The results list will only include information about the DB instances identified by these ARNs.  
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBInstances request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBLogFilesDetails extends js.Object {
    /**
         * A POSIX timestamp when the last log entry was written.
         */
    var LastWritten: js.UndefOr[Long] = js.undefined
    /**
         * The name of the log file for the specified DB instance.
         */
    var LogFileName: js.UndefOr[String] = js.undefined
    /**
         * The size, in bytes, of the log file for the specified DB instance.
         */
    var Size: js.UndefOr[Long] = js.undefined
  }
  
  
  trait DescribeDBLogFilesMessage extends js.Object {
    /**
         * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: String
    /**
         * Filters the available log files for files written since the specified date, in POSIX timestamp format with milliseconds.
         */
    var FileLastWritten: js.UndefOr[Long] = js.undefined
    /**
         * Filters the available log files for files larger than the specified size.
         */
    var FileSize: js.UndefOr[Long] = js.undefined
    /**
         * Filters the available log files for log file names that contain the specified string.
         */
    var FilenameContains: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * The pagination token provided in the previous request. If this parameter is specified the response includes only records beyond the marker, up to MaxRecords.
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBLogFilesResponse extends js.Object {
    /**
         * The DB log files returned.
         */
    var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined
    /**
         * A pagination token that can be used in a subsequent DescribeDBLogFiles request.
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeDBParameterGroupsMessage extends js.Object {
    /**
         * The name of a specific DB parameter group to return details for. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBParametersMessage extends js.Object {
    /**
         * The name of a specific DB parameter group to return details for. Constraints:   If supplied, must match the name of an existing DBParameterGroup.  
         */
    var DBParameterGroupName: String
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The parameter types to return. Default: All parameter types returned Valid Values: user | system | engine-default 
         */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeDBSecurityGroupsMessage extends js.Object {
    /**
         * The name of the DB security group to return details for.
         */
    var DBSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBSecurityGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeDBSnapshotAttributesMessage extends js.Object {
    /**
         * The identifier for the DB snapshot to describe the attributes for.
         */
    var DBSnapshotIdentifier: String
  }
  
  
  trait DescribeDBSnapshotAttributesResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
  }
  
  
  trait DescribeDBSnapshotsMessage extends js.Object {
    /**
         * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter can't be used in conjunction with DBSnapshotIdentifier. This parameter is not case-sensitive.  Constraints:   If supplied, must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  A specific DB snapshot identifier to describe. This parameter can't be used in conjunction with DBInstanceIdentifier. This value is stored as a lowercase string.  Constraints:   If supplied, must match the identifier of an existing DBSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
         */
    var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A specific DB resource ID to describe.
         */
    var DbiResourceId: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * True to include manual DB snapshots that are public and can be copied or restored by any AWS account, and otherwise false. The default is false. You can share a manual DB snapshot as public by using the ModifyDBSnapshotAttribute API.
         */
    var IncludePublic: js.UndefOr[Boolean] = js.undefined
    /**
         * True to include shared manual DB snapshots from other AWS accounts that this AWS account has been given permission to copy or restore, and otherwise false. The default is false. You can give an AWS account permission to restore a manual DB snapshot from another AWS account by using the ModifyDBSnapshotAttribute API action.
         */
    var IncludeShared: js.UndefOr[Boolean] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeDBSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The type of snapshots to be returned. You can specify one of the following values:    automated - Return all DB snapshots that have been automatically taken by Amazon RDS for my AWS account.    manual - Return all DB snapshots that have been taken by my AWS account.    shared - Return all manual DB snapshots that have been shared to my AWS account.    public - Return all DB snapshots that have been marked as public.   If you don't specify a SnapshotType value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not included in the returned results by default. You can include shared snapshots with these results by setting the IncludeShared parameter to true. You can include public snapshots with these results by setting the IncludePublic parameter to true. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
         */
    var SnapshotType: js.UndefOr[String] = js.undefined
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
         *  An optional pagination token provided by a previous DescribeDBSubnetGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeEngineDefaultClusterParametersMessage extends js.Object {
    /**
         * The name of the DB cluster parameter group family to return engine parameter information for.
         */
    var DBParameterGroupFamily: String
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeEngineDefaultClusterParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeEngineDefaultClusterParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
  }
  
  
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    /**
         * The name of the DB parameter group family.
         */
    var DBParameterGroupFamily: String
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeEngineDefaultParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
  }
  
  
  trait DescribeEventCategoriesMessage extends js.Object {
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * The type of source that is generating the events. Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
         */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeEventSubscriptionsMessage extends js.Object {
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The name of the RDS event notification subscription you want to describe.
         */
    var SubscriptionName: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeEventsMessage extends js.Object {
    /**
         * The number of minutes to retrieve events for. Default: 60
         */
    var Duration: js.UndefOr[IntegerOptional] = js.undefined
    /**
         *  The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z
         */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
         * A list of event categories that trigger notifications for a event notification subscription.
         */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeEvents request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The identifier of the event source for which events are returned. If not specified, then all sources are included in the response. Constraints:   If SourceIdentifier is supplied, SourceType must also be provided.   If the source type is DBInstance, then a DBInstanceIdentifier must be supplied.   If the source type is DBSecurityGroup, a DBSecurityGroupName must be supplied.   If the source type is DBParameterGroup, a DBParameterGroupName must be supplied.   If the source type is DBSnapshot, a DBSnapshotIdentifier must be supplied.   Can't end with a hyphen or contain two consecutive hyphens.  
         */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The event source to retrieve events for. If no value is specified, all events are returned.
         */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
         *  The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z
         */
    var StartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  
  trait DescribeGlobalClustersMessage extends js.Object {
    /**
         * A filter that specifies one or more global DB clusters to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include information about the DB clusters identified by these ARNs.  
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB cluster is returned. This parameter isn't case-sensitive.  Constraints:   If supplied, must match an existing DBClusterIdentifier.  
         */
    var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeGlobalClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeOptionGroupOptionsMessage extends js.Object {
    /**
         * A required parameter. Options available for the given engine name are described.
         */
    var EngineName: String
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * If specified, filters the results to include only options for the specified major engine version.
         */
    var MajorEngineVersion: js.UndefOr[String] = js.undefined
    /**
         * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait DescribeOptionGroupsMessage extends js.Object {
    /**
         * Filters the list of option groups to only include groups associated with a specific database engine.
         */
    var EngineName: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * Filters the list of option groups to only include groups associated with a specific database engine version. If specified, then EngineName must also be specified.
         */
    var MajorEngineVersion: js.UndefOr[String] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeOptionGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The name of the option group to describe. Can't be supplied together with EngineName or MajorEngineVersion.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
    /**
         * The DB instance class filter value. Specify this parameter to show only the available offerings matching the specified DB instance class.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * The name of the engine to retrieve DB instance options for.
         */
    var Engine: String
    /**
         * The engine version filter value. Specify this parameter to show only the available offerings matching the specified engine version.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * The license model filter value. Specify this parameter to show only the available offerings matching the specified license model.
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The VPC filter value. Specify this parameter to show only the available VPC or non-VPC offerings.
         */
    var Vpc: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    /**
         * A filter that specifies one or more resources to return pending maintenance actions for. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include pending maintenance actions for the DB clusters identified by these ARNs.    db-instance-id - Accepts DB instance identifiers and DB instance ARNs. The results list will only include pending maintenance actions for the DB instances identified by these ARNs.  
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The ARN of a resource to return pending maintenance actions for.
         */
    var ResourceIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeReservedDBInstancesMessage extends js.Object {
    /**
         * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified DB instances class.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for this duration. Valid Values: 1 | 3 | 31536000 | 94608000 
         */
    var Duration: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so that the following results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The Multi-AZ filter value. Specify this parameter to show only those reservations matching the specified Multi-AZ parameter.
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The offering type filter value. Specify this parameter to show only the available offerings matching the specified offering type. Valid Values: "Partial Upfront" | "All Upfront" | "No Upfront"  
         */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
         * The product description filter value. Specify this parameter to show only those reservations matching the specified product description.
         */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
         * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that matches the specified reservation ID.
         */
    var ReservedDBInstanceId: js.UndefOr[String] = js.undefined
    /**
         * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the specified offering identifier.
         */
    var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeReservedDBInstancesOfferingsMessage extends js.Object {
    /**
         * The DB instance class filter value. Specify this parameter to show only the available offerings matching the specified DB instance class.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * Duration filter value, specified in years or seconds. Specify this parameter to show only reservations for this duration. Valid Values: 1 | 3 | 31536000 | 94608000 
         */
    var Duration: js.UndefOr[String] = js.undefined
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so that the following results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The Multi-AZ filter value. Specify this parameter to show only the available offerings matching the specified Multi-AZ parameter.
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The offering type filter value. Specify this parameter to show only the available offerings matching the specified offering type. Valid Values: "Partial Upfront" | "All Upfront" | "No Upfront"  
         */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
         * Product description filter value. Specify this parameter to show only the available offerings that contain the specified product description.  The results show offerings that partially match the filter value. 
         */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
         * The offering identifier filter value. Specify this parameter to show only the available offering that matches the specified reservation identifier. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
         */
    var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeSourceRegionsMessage extends js.Object {
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * An optional pagination token provided by a previous DescribeSourceRegions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
         */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The source AWS Region name. For example, us-east-1. Constraints:   Must specify a valid AWS Region name.  
         */
    var RegionName: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeValidDBInstanceModificationsMessage extends js.Object {
    /**
         * The customer identifier or the ARN of your DB instance. 
         */
    var DBInstanceIdentifier: String
  }
  
  
  trait DescribeValidDBInstanceModificationsResult extends js.Object {
    var ValidDBInstanceModificationsMessage: js.UndefOr[ValidDBInstanceModificationsMessage] = js.undefined
  }
  
  
  trait DomainMembership extends js.Object {
    /**
         * The identifier of the Active Directory Domain.
         */
    var Domain: js.UndefOr[String] = js.undefined
    /**
         * The fully qualified domain name of the Active Directory Domain.
         */
    var FQDN: js.UndefOr[String] = js.undefined
    /**
         * The name of the IAM role to be used when making API calls to the Directory Service.
         */
    var IAMRoleName: js.UndefOr[String] = js.undefined
    /**
         * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait DoubleRange extends js.Object {
    /**
         * The minimum value in the range.
         */
    var From: js.UndefOr[Double] = js.undefined
    /**
         * The maximum value in the range.
         */
    var To: js.UndefOr[Double] = js.undefined
  }
  
  
  trait DownloadDBLogFilePortionDetails extends js.Object {
    /**
         * Boolean value that if true, indicates there is more data to be downloaded.
         */
    var AdditionalDataPending: js.UndefOr[Boolean] = js.undefined
    /**
         * Entries from the specified log file.
         */
    var LogFileData: js.UndefOr[String] = js.undefined
    /**
         * A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait DownloadDBLogFilePortionMessage extends js.Object {
    /**
         * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: String
    /**
         * The name of the log file to be downloaded.
         */
    var LogFileName: String
    /**
         * The pagination token provided in the previous request or "0". If the Marker parameter is specified the response includes only records beyond the marker until the end of the file or up to NumberOfLines.
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * The number of lines to download. If the number of lines specified results in a file over 1 MB in size, the file is truncated at 1 MB in size. If the NumberOfLines parameter is specified, then the block of lines returned can be from the beginning or the end of the log file, depending on the value of the Marker parameter.   If neither Marker or NumberOfLines are specified, the entire log file is returned up to a maximum of 10000 lines, starting with the most recent log entries first.   If NumberOfLines is specified and Marker is not specified, then the most recent lines from the end of the log file are returned.   If Marker is specified as "0", then the specified number of lines from the beginning of the log file are returned.   You can download the log file in blocks of lines by specifying the size of the block using the NumberOfLines parameter, and by specifying a value of "0" for the Marker parameter in your first request. Include the Marker value returned in the response as the Marker value for the next request, continuing until the AdditionalDataPending response element returns false.  
         */
    var NumberOfLines: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait EC2SecurityGroup extends js.Object {
    /**
         * Specifies the id of the EC2 security group.
         */
    var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
    /**
         * Specifies the name of the EC2 security group.
         */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
         *  Specifies the AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
         */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    /**
         * Provides the status of the EC2 security group. Status can be "authorizing", "authorized", "revoking", and "revoked".
         */
    var Status: js.UndefOr[String] = js.undefined
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
         * Specifies the name of the DB parameter group family that the engine default parameters apply to.
         */
    var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
         *  An optional pagination token provided by a previous EngineDefaults request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * Contains a list of engine default parameters.
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
         * The event categories for the specified source type
         */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
         * The source type that the returned categories belong to
         */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  
  trait EventCategoriesMessage extends js.Object {
    /**
         * A list of EventCategoriesMap data types.
         */
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
  }
  
  
  trait EventSubscription extends js.Object {
    /**
         * The RDS event notification subscription Id.
         */
    var CustSubscriptionId: js.UndefOr[String] = js.undefined
    /**
         * The AWS customer account associated with the RDS event notification subscription.
         */
    var CustomerAwsId: js.UndefOr[String] = js.undefined
    /**
         * A Boolean value indicating if the subscription is enabled. True indicates the subscription is enabled.
         */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
         * A list of event categories for the RDS event notification subscription.
         */
    var EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the event subscription.
         */
    var EventSubscriptionArn: js.UndefOr[String] = js.undefined
    /**
         * The topic ARN of the RDS event notification subscription.
         */
    var SnsTopicArn: js.UndefOr[String] = js.undefined
    /**
         * A list of source IDs for the RDS event notification subscription.
         */
    var SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined
    /**
         * The source type for the RDS event notification subscription.
         */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
         * The status of the RDS event notification subscription. Constraints: Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist The status "no-permission" indicates that RDS no longer has permission to post to the SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
         */
    var Status: js.UndefOr[String] = js.undefined
    /**
         * The time the RDS event notification subscription was created.
         */
    var SubscriptionCreationTime: js.UndefOr[String] = js.undefined
  }
  
  
  trait EventSubscriptionsMessage extends js.Object {
    /**
         * A list of EventSubscriptions data types.
         */
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait EventsMessage extends js.Object {
    /**
         *  A list of Event instances. 
         */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
         *  An optional pagination token provided by a previous Events request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait FailoverDBClusterMessage extends js.Object {
    /**
         * A DB cluster identifier to force a failover for. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
         */
    var DBClusterIdentifier: String
    /**
         * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Aurora Replica in the DB cluster. For example, mydbcluster-replica1.
         */
    var TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait FailoverDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  
  trait Filter extends js.Object {
    /**
         * The name of the filter. Filter names are case-sensitive.
         */
    var Name: String
    /**
         * One or more filter values. Filter values are case-sensitive.
         */
    var Values: FilterValueList
  }
  
  
  trait GlobalCluster extends js.Object {
    /**
         *  The default database name within the new global database cluster. 
         */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
         *  The deletion protection setting for the new global database cluster. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  The Aurora database engine used by the global database cluster. 
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * Indicates the database engine version.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the global database cluster.
         */
    var GlobalClusterArn: js.UndefOr[String] = js.undefined
    /**
         *  Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a global database cluster. 
         */
    var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item. 
         */
    var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.undefined
    /**
         *  The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed. 
         */
    var GlobalClusterResourceId: js.UndefOr[String] = js.undefined
    /**
         * Specifies the current state of this global database cluster.
         */
    var Status: js.UndefOr[String] = js.undefined
    /**
         *  The storage encryption setting for the global database cluster. 
         */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  
  trait GlobalClusterMember extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) for each Aurora cluster. 
         */
    var DBClusterArn: js.UndefOr[String] = js.undefined
    /**
         *  Specifies whether the Aurora cluster is the primary cluster (that is, has read-write capability) for the Aurora global database with which it is associated. 
         */
    var IsWriter: js.UndefOr[Boolean] = js.undefined
    /**
         *  The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the Aurora global database. 
         */
    var Readers: js.UndefOr[ReadersArnList] = js.undefined
  }
  
  
  trait GlobalClustersMessage extends js.Object {
    /**
         *  The list of global clusters returned by this request. 
         */
    var GlobalClusters: js.UndefOr[GlobalClusterList] = js.undefined
    /**
         *  An optional pagination token provided by a previous DescribeGlobalClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  
  trait IPRange extends js.Object {
    /**
         * Specifies the IP range.
         */
    var CIDRIP: js.UndefOr[String] = js.undefined
    /**
         * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListTagsForResourceMessage extends js.Object {
    /**
         * This parameter is not currently supported.
         */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
         * The Amazon RDS resource with tags to be listed. This value is an Amazon Resource Name (ARN). For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.
         */
    var ResourceName: String
  }
  
  
  trait MinimumEngineVersionPerAllowedValue extends js.Object {
    /**
         * The allowed value for an option setting.
         */
    var AllowedValue: js.UndefOr[String] = js.undefined
    /**
         * The minimum DB engine version required for the allowed value.
         */
    var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  }
  
  
  trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
    /**
         * The DB cluster capacity. Constraints:   Value must be 2, 4, 8, 16, 32, 64, 128, or 256.  
         */
    var Capacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DB cluster.  
         */
    var DBClusterIdentifier: String
    /**
         * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling before enforcing the timeout action. The default is 300.   Value must be from 10 through 600.  
         */
    var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange, the default, sets the capacity to the specified value as soon as possible.  RollbackCapacityChange ignores the capacity change if a scaling point is not found in the timeout period.
         */
    var TimeoutAction: js.UndefOr[String] = js.undefined
  }
  
  
  trait ModifyDBClusterEndpointMessage extends js.Object {
    /**
         * The identifier of the endpoint to modify. This parameter is stored as a lowercase string.
         */
    var DBClusterEndpointIdentifier: String
    /**
         * The type of the endpoint. One of: READER, ANY. 
         */
    var EndpointType: js.UndefOr[String] = js.undefined
    /**
         * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
         */
    var ExcludedMembers: js.UndefOr[StringList] = js.undefined
    /**
         * List of DB instance identifiers that are part of the custom endpoint group.
         */
    var StaticMembers: js.UndefOr[StringList] = js.undefined
  }
  
  
  trait ModifyDBClusterMessage extends js.Object {
    /**
         * A value that specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB cluster. If this parameter is set to false, changes to the DB cluster are applied during the next maintenance window. The ApplyImmediately parameter only affects the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values. If you set the ApplyImmediately parameter value to false, then changes to the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. Default: false 
         */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
         * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
         */
    var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
    /**
         * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB cluster.
         */
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined
    /**
         * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
         */
    var DBClusterIdentifier: String
    /**
         * The name of the DB cluster parameter group to use for the DB cluster.
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when this value is set to true. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  HTTP endpoint functionality is in beta for Aurora Serverless and is subject to change.  A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the HTTP endpoint is disabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.
         */
    var EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true. For a list of valid engine versions, see CreateDBCluster, or call DescribeDBEngineVersions.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The new password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
         */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
         * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
         */
    var NewDBClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * A value that indicates that the DB cluster should be associated with the specified option group. Changing this parameter doesn't result in an outage except in the following case, and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. If the parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new connections are rejected but existing connections are not interrupted.  Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
         * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
         */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
         * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in serverless DB engine mode.
         */
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined
    /**
         * A list of VPC security groups that the DB cluster will belong to.
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
         * A list of DB cluster snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual DB cluster snapshot, set this list to include one or more AWS account IDs, or all to make the manual DB cluster snapshot restorable by any AWS account. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts.
         */
    var ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined
    /**
         * A list of DB cluster snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual DB cluster snapshot, set this list to include one or more AWS account identifiers, or all to remove authorization for any AWS account to copy or restore the DB cluster snapshot. If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore a manual DB cluster snapshot.
         */
    var ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  
  trait ModifyDBClusterSnapshotAttributeResult extends js.Object {
    var DBClusterSnapshotAttributesResult: js.UndefOr[DBClusterSnapshotAttributesResult] = js.undefined
  }
  
  
  trait ModifyDBInstanceMessage extends js.Object {
    /**
         * The new amount of storage (in gibibytes) to allocate for the DB instance.  For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10% greater than the current value.  For the valid values for allocated storage for each engine, see CreateDBInstance. 
         */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a different major version than the DB instance's current version.
         */
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB instance.   If this parameter is set to false, changes to the DB instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next call to RebootDBInstance, or the next failure reboot. Review the table of parameters in Modifying a DB Instance and Using the Apply Immediately Parameter in the Amazon RDS User Guide. to see the impact that setting ApplyImmediately to true or false has for each modified parameter and to determine when the changes are applied.  Default: false 
         */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
         *  Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window. Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously applied as soon as possible. An outage will result if this parameter is set to true during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine version. 
         */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The number of days to retain automated backups. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups. Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a non-zero value to 0. These changes are applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. If you change the parameter from one non-zero value to another non-zero value, the change is asynchronously applied as soon as possible.  Amazon Aurora  Not applicable. The retention period for automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Default: Uses existing setting Constraints:   Must be a value from 0 to 35   Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6 or later   Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5   Can't be set to 0 if the DB instance is a source to Read Replicas  
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Indicates the certificate that needs to be associated with the instance.
         */
    var CACertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance.
         */
    var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined
    /**
         * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is false.
         */
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The new compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  If you modify the DB instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is specified as true for this request.  Default: Uses existing setting
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: String
    /**
         * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the parameter changes will NOT be applied during the next maintenance window. Default: Uses existing setting Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the database accepts connections. The value of the DBPortNumber parameter must not match any of the port values specified for options in the option group for the DB instance. Your database will restart when you change the DBPortNumber value regardless of the value of the ApplyImmediately parameter.  MySQL   Default: 3306   Valid Values: 1150-65535   MariaDB   Default: 3306   Valid Values: 1150-65535   PostgreSQL   Default: 5432   Valid Values: 1150-65535  Type: Integer  Oracle   Default: 1521   Valid Values: 1150-65535   SQL Server   Default: 1433   Valid Values: 1150-65535 except for 1434, 3389, 47001, 49152, and 49152 through 49156.   Amazon Aurora   Default: 3306   Valid Values: 1150-65535 
         */
    var DBPortNumber: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage and the change is asynchronously applied as soon as possible. Constraints:   If supplied, must match existing DBSecurityGroups.  
         */
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined
    /**
         * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB instance into a VPC. For more information, see Updating the VPC for a DB Instance in the Amazon RDS User Guide.  Changing the subnet group causes an outage during the change. The change is applied during the next maintenance window, unless you specify true for the ApplyImmediately parameter.  Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetGroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when this value is set to true. For more information, see  Deleting a DB Instance. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The Active Directory Domain to move the instance to. Specify none to remove the instance from its current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL Server instance can be created in a Active Directory Domain. 
         */
    var Domain: js.UndefOr[String] = js.undefined
    /**
         * The name of the IAM role to use when making API calls to the Directory Service.
         */
    var DomainIAMRoleName: js.UndefOr[String] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. You can enable IAM database authentication for the following database engines  Amazon Aurora  Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information, see ModifyDBCluster.  MySQL    For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * True to enable Performance Insights for the DB instance, and otherwise false. For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
         */
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  The version number of the database engine to upgrade to. Changing this parameter results in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request.  For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the default for that DB parameter group family. For information about valid engine versions, see CreateDBInstance, or call DescribeDBEngineVersions.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.  Changing this setting doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. If you are migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change in storage type to take effect.  If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24 hours, but the process can take up to several days in some cases. During the migration, the DB instance is available for use, but might experience performance degradation. While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the instance.  Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10% greater than the current value.  Default: Uses existing setting
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * The new password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. Between the time of the request and the completion of the request, the MasterUserPassword element exists in the PendingModifiedValues element of the operation response.   Amazon Aurora  Not applicable. The password for the master user is managed by the DB cluster. For more information, see ModifyDBCluster.  Default: Uses existing setting  MariaDB  Constraints: Must contain from 8 to 41 characters.  Microsoft SQL Server  Constraints: Must contain from 8 to 128 characters.  MySQL  Constraints: Must contain from 8 to 41 characters.  Oracle  Constraints: Must contain from 8 to 30 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.  Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary instance user if the password is lost. This includes restoring privileges that might have been accidentally revoked.  
         */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
         * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
         */
    var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, go to To create an IAM role for Amazon RDS Enhanced Monitoring in the Amazon RDS User Guide.  If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
         */
    var MonitoringRoleArn: js.UndefOr[String] = js.undefined
    /**
         * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. 
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier, an instance reboot will occur immediately if you set Apply Immediately to true, or will occur during the next maintenance window if Apply Immediately to false. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
         */
    var NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  Indicates that the DB instance should be associated with the specified option group. Changing this parameter doesn't result in an outage except in the following case and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. If the parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new connections are rejected but existing connections are not interrupted.  Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
         */
    var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
    /**
         * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
         */
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         *  The daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod parameter. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.   Amazon Aurora  Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   Must be in the format hh24:mi-hh24:mi   Must be in Universal Time Coordinated (UTC)   Must not conflict with the preferred maintenance window   Must be at least 30 minutes  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
         * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, then changing this parameter will cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
         */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide.  Default: 1 Valid Values: 0 - 15
         */
    var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to True to make the DB instance Internet-facing with a publicly resolvable DNS name, which resolves to a public IP address. Set to False to make the DB instance internal with a DNS name that resolves to a private IP address.   PubliclyAccessible only applies to DB instances in a VPC. The DB instance must be part of a public subnet and PubliclyAccessible must be true in order for it to be publicly accessible.  Changes to the PubliclyAccessible parameter are applied immediately regardless of the value of the ApplyImmediately parameter. Default: false
         */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specifies the storage type to be associated with the DB instance.  If you specify Provisioned IOPS (io1), you must also include a value for the Iops parameter.  If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24 hours, but the process can take up to several days in some cases. During the migration, the DB instance is available for use, but might experience performance degradation. While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the instance.   Valid values: standard | gp2 | io1  Default: io1 if the Iops parameter is specified, otherwise standard 
         */
    var StorageType: js.UndefOr[String] = js.undefined
    /**
         * The ARN from the key store with which to associate the instance for TDE encryption.
         */
    var TdeCredentialArn: js.UndefOr[String] = js.undefined
    /**
         * The password for the given ARN from the key store in order to access the device.
         */
    var TdeCredentialPassword: js.UndefOr[String] = js.undefined
    /**
         * A value that specifies that the DB instance class of the DB instance uses its default processor features.
         */
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon as possible.  Amazon Aurora  Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   If supplied, must match existing VpcSecurityGroupIds.  
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait ModifyDBParameterGroupMessage extends js.Object {
    /**
         * The name of the DB parameter group. Constraints:   If supplied, must match the name of an existing DBParameterGroup.  
         */
    var DBParameterGroupName: String
    /**
         * An array of parameter names, values, and the apply method for the parameter update. At least one parameter name, value, and apply method must be supplied; subsequent arguments are optional. A maximum of 20 parameters can be modified in a single request. Valid Values (for the application method): immediate | pending-reboot   You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when you reboot the DB instance without failover. 
         */
    var Parameters: ParametersList
  }
  
  
  trait ModifyDBSnapshotAttributeMessage extends js.Object {
    /**
         * The name of the DB snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to restore.
         */
    var AttributeName: String
    /**
         * The identifier for the DB snapshot to modify the attributes for.
         */
    var DBSnapshotIdentifier: String
    /**
         * A list of DB snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS account IDs, or all to make the manual DB snapshot restorable by any AWS account. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts.
         */
    var ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined
    /**
         * A list of DB snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS account identifiers, or all to remove authorization for any AWS account to copy or restore the DB snapshot. If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore the manual DB snapshot.
         */
    var ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  
  trait ModifyDBSnapshotAttributeResult extends js.Object {
    var DBSnapshotAttributesResult: js.UndefOr[DBSnapshotAttributesResult] = js.undefined
  }
  
  
  trait ModifyDBSnapshotMessage extends js.Object {
    /**
         * The identifier of the DB snapshot to modify.
         */
    var DBSnapshotIdentifier: String
    /**
         * The engine version to upgrade the DB snapshot to.  The following are the database engines and engine versions that are available when you upgrade a DB snapshot.   MySQL     5.5.46 (supported for 5.1 DB snapshots)    Oracle     12.1.0.2.v8 (supported for 12.1.0.1 DB snapshots)    11.2.0.4.v12 (supported for 11.2.0.2 DB snapshots)    11.2.0.4.v11 (supported for 11.2.0.3 DB snapshots)  
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The option group to identify with the upgraded DB snapshot.  You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply when upgrading a DB snapshot as when upgrading a DB instance. For more information, see Option Group Considerations in the Amazon RDS User Guide. 
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
  }
  
  
  trait ModifyDBSnapshotResult extends js.Object {
    var DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
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
         * The EC2 subnet IDs for the DB subnet group.
         */
    var SubnetIds: SubnetIdentifierList
  }
  
  
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
  }
  
  
  trait ModifyEventSubscriptionMessage extends js.Object {
    /**
         *  A Boolean value; set to true to activate the subscription. 
         */
    var Enabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action. 
         */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
         */
    var SnsTopicArn: js.UndefOr[String] = js.undefined
    /**
         * The type of source that is generating the events. For example, if you want to be notified of events generated by a DB instance, you would set this parameter to db-instance. if this value is not specified, all events are returned. Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
         */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
         * The name of the RDS event notification subscription.
         */
    var SubscriptionName: String
  }
  
  
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  
  trait ModifyGlobalClusterMessage extends js.Object {
    /**
         *  Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be deleted when this value is set to true. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  The DB cluster identifier for the global cluster being modified. This parameter is not case-sensitive.  Constraints:   Must match the identifier of an existing global database cluster.  
         */
    var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  The new cluster identifier for the global database cluster when modifying a global database cluster. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
         */
    var NewGlobalClusterIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait ModifyGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
  }
  
  
  trait ModifyOptionGroupMessage extends js.Object {
    /**
         * Indicates whether the changes should be applied immediately, or during the next maintenance window for each instance associated with the option group.
         */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of the option group to be modified. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
         */
    var OptionGroupName: String
    /**
         * Options in this list are added to the option group or, if already present, the specified configuration is used to update the existing configuration.
         */
    var OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined
    /**
         * Options in this list are removed from the option group.
         */
    var OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined
  }
  
  
  trait ModifyOptionGroupResult extends js.Object {
    var OptionGroup: js.UndefOr[OptionGroup] = js.undefined
  }
  
  
  trait Option extends js.Object {
    /**
         * If the option requires access to a port, then this DB security group allows access to the port.
         */
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined
    /**
         * The description of the option.
         */
    var OptionDescription: js.UndefOr[String] = js.undefined
    /**
         * The name of the option.
         */
    var OptionName: js.UndefOr[String] = js.undefined
    /**
         * The option settings for this option.
         */
    var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined
    /**
         * The version of the option.
         */
    var OptionVersion: js.UndefOr[String] = js.undefined
    /**
         * Indicate if this option is permanent.
         */
    var Permanent: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicate if this option is persistent.
         */
    var Persistent: js.UndefOr[Boolean] = js.undefined
    /**
         * If required, the port configured for this option to use.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * If the option requires access to a port, then this VPC security group allows access to the port.
         */
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
  }
  
  
  trait OptionConfiguration extends js.Object {
    /**
         * A list of DBSecurityGroupMemebrship name strings used for this option.
         */
    var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined
    /**
         * The configuration of options to include in a group.
         */
    var OptionName: String
    /**
         * The option settings to include in an option group.
         */
    var OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined
    /**
         * The version for the option.
         */
    var OptionVersion: js.UndefOr[String] = js.undefined
    /**
         * The optional port for the option.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * A list of VpcSecurityGroupMemebrship name strings used for this option.
         */
    var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait OptionGroup extends js.Object {
    /**
         * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value true indicates the option group can be applied to both VPC and non-VPC instances. 
         */
    var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates the name of the engine that this option group can be applied to.
         */
    var EngineName: js.UndefOr[String] = js.undefined
    /**
         * Indicates the major engine version associated with this option group.
         */
    var MajorEngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the option group.
         */
    var OptionGroupArn: js.UndefOr[String] = js.undefined
    /**
         * Provides a description of the option group.
         */
    var OptionGroupDescription: js.UndefOr[String] = js.undefined
    /**
         * Specifies the name of the option group.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates what options are available in the option group.
         */
    var Options: js.UndefOr[OptionsList] = js.undefined
    /**
         * If AllowsVpcAndNonVpcInstanceMemberships is false, this field is blank. If AllowsVpcAndNonVpcInstanceMemberships is true and this field is blank, then this option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only be applied to instances that are in the VPC indicated by this field. 
         */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  
  trait OptionGroupMembership extends js.Object {
    /**
         * The name of the option group that the instance belongs to.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The status of the DB instance's option group membership. Valid values are: in-sync, pending-apply, pending-removal, pending-maintenance-apply, pending-maintenance-removal, applying, removing, and failed. 
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait OptionGroupOption extends js.Object {
    /**
         * If the option requires a port, specifies the default port for the option.
         */
    var DefaultPort: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The description of the option.
         */
    var Description: js.UndefOr[String] = js.undefined
    /**
         * The name of the engine that this option can be applied to.
         */
    var EngineName: js.UndefOr[String] = js.undefined
    /**
         * Indicates the major engine version that the option is available for.
         */
    var MajorEngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The minimum required engine version for the option to be applied.
         */
    var MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The name of the option.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The option settings that are available (and the default value) for each option in an option group.
         */
    var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.undefined
    /**
         * The versions that are available for the option.
         */
    var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.undefined
    /**
         * The options that conflict with this option.
         */
    var OptionsConflictsWith: js.UndefOr[OptionsConflictsWith] = js.undefined
    /**
         * The options that are prerequisites for this option.
         */
    var OptionsDependedOn: js.UndefOr[OptionsDependedOn] = js.undefined
    /**
         * Permanent options can never be removed from an option group. An option group containing a permanent option can't be removed from a DB instance.
         */
    var Permanent: js.UndefOr[Boolean] = js.undefined
    /**
         * Persistent options can't be removed from an option group while DB instances are associated with the option group. If you disassociate all DB instances from the option group, your can remove the persistent option from the option group.
         */
    var Persistent: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies whether the option requires a port.
         */
    var PortRequired: js.UndefOr[Boolean] = js.undefined
    /**
         * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB instance later. 
         */
    var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
         * If true, you can change the option to an earlier version of the option. This only applies to options that have different versions available. 
         */
    var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * If true, you can only use this option with a DB instance that is in a VPC. 
         */
    var VpcOnly: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait OptionGroupOptionSetting extends js.Object {
    /**
         * Indicates the acceptable values for the option group option.
         */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
         * The DB engine specific parameter type for the option group option.
         */
    var ApplyType: js.UndefOr[String] = js.undefined
    /**
         * The default value for the option group option.
         */
    var DefaultValue: js.UndefOr[String] = js.undefined
    /**
         * Boolean value where true indicates that this option group option can be changed from the default value.
         */
    var IsModifiable: js.UndefOr[Boolean] = js.undefined
    /**
         * Boolean value where true indicates that a value must be specified for this option setting of the option group option.
         */
    var IsRequired: js.UndefOr[Boolean] = js.undefined
    /**
         * The minimum DB engine version required for the corresponding allowed value for this option setting.
         */
    var MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.undefined
    /**
         * The description of the option group option.
         */
    var SettingDescription: js.UndefOr[String] = js.undefined
    /**
         * The name of the option group option.
         */
    var SettingName: js.UndefOr[String] = js.undefined
  }
  
  
  trait OptionGroupOptionsMessage extends js.Object {
    /**
         * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
         */
    var Marker: js.UndefOr[String] = js.undefined
    var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined
  }
  
  
  trait OptionGroups extends js.Object {
    /**
         * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * List of option groups.
         */
    var OptionGroupsList: js.UndefOr[OptionGroupsList] = js.undefined
  }
  
  
  trait OptionSetting extends js.Object {
    /**
         * The allowed values of the option setting.
         */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
         * The DB engine specific parameter type.
         */
    var ApplyType: js.UndefOr[String] = js.undefined
    /**
         * The data type of the option setting.
         */
    var DataType: js.UndefOr[String] = js.undefined
    /**
         * The default value of the option setting.
         */
    var DefaultValue: js.UndefOr[String] = js.undefined
    /**
         * The description of the option setting.
         */
    var Description: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the option setting is part of a collection.
         */
    var IsCollection: js.UndefOr[Boolean] = js.undefined
    /**
         * A Boolean value that, when true, indicates the option setting can be modified from the default.
         */
    var IsModifiable: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of the option that has settings that you can set.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The current value of the option setting.
         */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  
  trait OptionVersion extends js.Object {
    /**
         * True if the version is the default version of the option, and otherwise false.
         */
    var IsDefault: js.UndefOr[Boolean] = js.undefined
    /**
         * The version of the option.
         */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  
  trait OrderableDBInstanceOption extends js.Object {
    /**
         * A list of Availability Zones for a DB instance.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    /**
         * A list of the available processor features for the DB instance class of a DB instance.
         */
    var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
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
         * Maximum total provisioned IOPS for a DB instance.
         */
    var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Maximum provisioned IOPS per GiB for a DB instance.
         */
    var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
    /**
         * Maximum storage size for a DB instance.
         */
    var MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Minimum total provisioned IOPS for a DB instance.
         */
    var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Minimum provisioned IOPS per GiB for a DB instance.
         */
    var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
    /**
         * Minimum storage size for a DB instance.
         */
    var MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Indicates whether a DB instance is Multi-AZ capable.
         */
    var MultiAZCapable: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether a DB instance can have a Read Replica.
         */
    var ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates the storage type for a DB instance.
         */
    var StorageType: js.UndefOr[String] = js.undefined
    /**
         * A list of the supported DB engine modes.
         */
    var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
    /**
         * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
         */
    var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether a DB instance supports IAM database authentication.
         */
    var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether a DB instance supports provisioned IOPS.
         */
    var SupportsIops: js.UndefOr[Boolean] = js.undefined
    /**
         * True if a DB instance supports Performance Insights, otherwise false.
         */
    var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether a DB instance supports encrypted storage.
         */
    var SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether a DB instance is in a VPC.
         */
    var Vpc: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    /**
         *  An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * An OrderableDBInstanceOption structure containing information about orderable options for the DB instance.
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
         * Specifies the engine specific parameters type.
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
    /**
         * The valid DB engine modes.
         */
    var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  }
  
  
  trait PendingCloudwatchLogsExports extends js.Object {
    /**
         * Log types that are in the process of being enabled. After they are enabled, these log types are exported to CloudWatch Logs.
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
         * The effective date when the pending maintenance action is applied to the resource. This date takes into account opt-in requests received from the ApplyPendingMaintenanceAction API, the AutoAppliedAfterDate, and the ForcedApplyDate. This value is blank if an opt-in request has not been received and nothing has been specified as AutoAppliedAfterDate or ForcedApplyDate.
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
         *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * A list of the pending maintenance actions for the resource.
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
         * Specifies the identifier of the CA certificate for the DB instance.
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
         * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
         */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
         * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    var PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports] = js.undefined
    /**
         * Specifies the pending port for the DB instance.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * Specifies the storage type to be associated with the DB instance.
         */
    var StorageType: js.UndefOr[String] = js.undefined
  }
  
  
  trait ProcessorFeature extends js.Object {
    /**
         * The name of the processor feature. Valid names are coreCount and threadsPerCore.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The value of a processor feature name.
         */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  
  trait PromoteReadReplicaDBClusterMessage extends js.Object {
    /**
         * The identifier of the DB cluster Read Replica to promote. This parameter is not case-sensitive.  Constraints:   Must match the identifier of an existing DBCluster Read Replica.   Example: my-cluster-replica1 
         */
    var DBClusterIdentifier: String
  }
  
  
  trait PromoteReadReplicaDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  
  trait PromoteReadReplicaMessage extends js.Object {
    /**
         * The number of days to retain automated backups. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups. Default: 1 Constraints:   Must be a value from 0 to 8  
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing Read Replica DB instance.   Example: mydbinstance 
         */
    var DBInstanceIdentifier: String
    /**
         *  The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.   The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  }
  
  
  trait PromoteReadReplicaResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
    /**
         * The number of instances to reserve. Default: 1 
         */
    var DBInstanceCount: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * Customer-specified identifier to track this reservation. Example: myreservationID
         */
    var ReservedDBInstanceId: js.UndefOr[String] = js.undefined
    /**
         * The ID of the Reserved DB instance offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
         */
    var ReservedDBInstancesOfferingId: String
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
    var ReservedDBInstance: js.UndefOr[ReservedDBInstance] = js.undefined
  }
  
  
  trait Range extends js.Object {
    /**
         * The minimum value in the range.
         */
    var From: js.UndefOr[Integer] = js.undefined
    /**
         * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000... 
         */
    var Step: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The maximum value in the range.
         */
    var To: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait RebootDBInstanceMessage extends js.Object {
    /**
         * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
         */
    var DBInstanceIdentifier: String
    /**
         *  When true, the reboot is conducted through a MultiAZ failover.  Constraint: You can't specify true if the instance is not configured for MultiAZ.
         */
    var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait RecurringCharge extends js.Object {
    /**
         * The amount of the recurring charge.
         */
    var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
    /**
         * The frequency of the recurring charge.
         */
    var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
  }
  
  
  trait RemoveFromGlobalClusterMessage extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster. 
         */
    var DbClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  The cluster identifier to detach from the Aurora global database cluster. 
         */
    var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait RemoveFromGlobalClusterResult extends js.Object {
    var GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
  }
  
  
  trait RemoveRoleFromDBClusterMessage extends js.Object {
    /**
         * The name of the DB cluster to disassociate the IAM role from.
         */
    var DBClusterIdentifier: String
    /**
         * The Amazon Resource Name (ARN) of the IAM role to disassociate from the Aurora DB cluster, for example arn:aws:iam::123456789012:role/AuroraAccessRole.
         */
    var RoleArn: String
  }
  
  
  trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
    /**
         *  The source identifier to be removed from the subscription, such as the DB instance identifier for a DB instance or the name of a security group. 
         */
    var SourceIdentifier: String
    /**
         * The name of the RDS event notification subscription you want to remove a source identifier from.
         */
    var SubscriptionName: String
  }
  
  
  trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  
  trait RemoveTagsFromResourceMessage extends js.Object {
    /**
         * The Amazon RDS resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide. 
         */
    var ResourceName: String
    /**
         * The tag key (name) of the tag to be removed.
         */
    var TagKeys: KeyList
  }
  
  
  trait ReservedDBInstance extends js.Object {
    /**
         * The currency code for the reserved DB instance.
         */
    var CurrencyCode: js.UndefOr[String] = js.undefined
    /**
         * The DB instance class for the reserved DB instance.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * The number of reserved DB instances.
         */
    var DBInstanceCount: js.UndefOr[Integer] = js.undefined
    /**
         * The duration of the reservation in seconds.
         */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
         * The fixed price charged for this reserved DB instance.
         */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
         * Indicates if the reservation applies to Multi-AZ deployments.
         */
    var MultiAZ: js.UndefOr[Boolean] = js.undefined
    /**
         * The offering type of this reserved DB instance.
         */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
         * The description of the reserved DB instance.
         */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
         * The recurring price charged to run this reserved DB instance.
         */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the reserved DB instance.
         */
    var ReservedDBInstanceArn: js.UndefOr[String] = js.undefined
    /**
         * The unique identifier for the reservation.
         */
    var ReservedDBInstanceId: js.UndefOr[String] = js.undefined
    /**
         * The offering identifier.
         */
    var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
    /**
         * The time the reservation started.
         */
    var StartTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The state of the reserved DB instance.
         */
    var State: js.UndefOr[String] = js.undefined
    /**
         * The hourly price charged for this reserved DB instance.
         */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  
  trait ReservedDBInstanceMessage extends js.Object {
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * A list of reserved DB instances.
         */
    var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined
  }
  
  
  trait ReservedDBInstancesOffering extends js.Object {
    /**
         * The currency code for the reserved DB instance offering.
         */
    var CurrencyCode: js.UndefOr[String] = js.undefined
    /**
         * The DB instance class for the reserved DB instance.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * The duration of the offering in seconds.
         */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
         * The fixed price charged for this offering.
         */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
         * Indicates if the offering applies to Multi-AZ deployments.
         */
    var MultiAZ: js.UndefOr[Boolean] = js.undefined
    /**
         * The offering type.
         */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
         * The database engine used by the offering.
         */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
         * The recurring price charged to run this reserved DB instance.
         */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
         * The offering identifier.
         */
    var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
    /**
         * The hourly price charged for this offering.
         */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  
  trait ReservedDBInstancesOfferingMessage extends js.Object {
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * A list of reserved DB instance offerings.
         */
    var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined
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
  
  
  trait ResetDBParameterGroupMessage extends js.Object {
    /**
         * The name of the DB parameter group. Constraints:   Must match the name of an existing DBParameterGroup.  
         */
    var DBParameterGroupName: String
    /**
         * To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  MySQL  Valid Values (for Apply method): immediate | pending-reboot  You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when DB instance reboots.  MariaDB  Valid Values (for Apply method): immediate | pending-reboot  You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters, and changes are applied when DB instance reboots.  Oracle  Valid Values (for Apply method): pending-reboot 
         */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
    /**
         *  Specifies whether (true) or not (false) to reset all parameters in the DB parameter group to default values.  Default: true 
         */
    var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait ResourcePendingMaintenanceActions extends js.Object {
    /**
         * A list that provides details about the pending maintenance actions for the resource.
         */
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined
    /**
         * The ARN of the resource that has pending maintenance actions.
         */
    var ResourceIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait RestoreDBClusterFromS3Message extends js.Object {
    /**
         * A list of EC2 Availability Zones that instances in the restored DB cluster can be created in.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
         * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
         */
    var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
    /**
         * The number of days for which automated backups of the restored DB cluster are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * A value that indicates that the restored DB cluster should be associated with the specified CharacterSet.
         */
    var CharacterSetName: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB cluster to create from the source data in the Amazon S3 bucket. This parameter is isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
         */
    var DBClusterIdentifier: String
    /**
         * The name of the DB cluster parameter group to associate with the restored DB cluster. If this argument is omitted, default.aurora5.6 is used.  Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * A DB subnet group to associate with the restored DB cluster. Constraints: If supplied, must match the name of an existing DBSubnetGroup.  Example: mySubnetgroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * The database name for the restored DB cluster.
         */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the database engine to be used for the restored DB cluster. Valid Values: aurora, aurora-postgresql 
         */
    var Engine: String
    /**
         * The version number of the database engine to use.  Aurora MySQL  Example: 5.6.10a   Aurora PostgreSQL  Example: 9.6.3 
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier for an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KM encryption key. If the StorageEncrypted parameter is true, and you do not specify a value for the KmsKeyId parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
         */
    var MasterUserPassword: String
    /**
         * The name of the master user for the restored DB cluster. Constraints:   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
         */
    var MasterUsername: String
    /**
         * A value that indicates that the restored DB cluster should be associated with the specified option group. Permanent options can't be removed from an option group. An option group can't be removed from a DB cluster once it is associated with a DB cluster.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the instances in the restored DB cluster accept connections.  Default: 3306 
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
         * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
         */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
         * The name of the Amazon S3 bucket that contains the data used to create the Amazon Aurora DB cluster.
         */
    var S3BucketName: String
    /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon RDS to access the Amazon S3 bucket on your behalf.
         */
    var S3IngestionRoleArn: String
    /**
         * The prefix for all of the file names that contain the data used to create the Amazon Aurora DB cluster. If you do not specify a SourceS3Prefix value, then the Amazon Aurora DB cluster is created by using all of the files in the Amazon S3 bucket.
         */
    var S3Prefix: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the database engine that was backed up to create the files stored in the Amazon S3 bucket.  Valid values: mysql 
         */
    var SourceEngine: String
    /**
         * The version of the database that the backup files were created from. MySQL version 5.5 and 5.6 are supported.  Example: 5.6.22 
         */
    var SourceEngineVersion: String
    /**
         * Specifies whether the restored DB cluster is encrypted.
         */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A list of EC2 VPC security groups to associate with the restored DB cluster.
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait RestoreDBClusterFromS3Result extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  
  trait RestoreDBClusterFromSnapshotMessage extends js.Object {
    /**
         * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
         * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
         */
    var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
    /**
         * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
         */
    var DBClusterIdentifier: String
    /**
         * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default DB cluster parameter group for the specified engine is used. Constraints:   If supplied, must match the name of an existing default DB cluster parameter group.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB subnet group to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DB subnet group. Example: mySubnetgroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * The database name for the restored DB cluster.
         */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon Aurora User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The database engine to use for the new DB cluster. Default: The same as source Constraint: Must be compatible with the engine of the source
         */
    var Engine: String
    /**
         * The DB engine mode of the DB cluster, either provisioned, serverless, or parallelquery.
         */
    var EngineMode: js.UndefOr[String] = js.undefined
    /**
         * The version of the database engine to use for the new DB cluster.
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster snapshot. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If you don't specify a value for the KmsKeyId parameter, then the following occurs:   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is not encrypted, then the restored DB cluster is not encrypted.  
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The name of the option group to use for the restored DB cluster.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the new DB cluster accepts connections. Constraints: This value must be 1150-65535  Default: The same port as the original DB cluster.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * For DB clusters in serverless DB engine mode, the scaling properties of the DB cluster.
         */
    var ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined
    /**
         * The identifier for the DB snapshot or DB cluster snapshot to restore from. You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can use only the ARN to specify a DB snapshot. Constraints:   Must match the identifier of an existing Snapshot.  
         */
    var SnapshotIdentifier: String
    /**
         * The tags to be assigned to the restored DB cluster.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A list of VPC security groups that the new DB cluster will belong to.
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait RestoreDBClusterFromSnapshotResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  
  trait RestoreDBClusterToPointInTimeMessage extends js.Object {
    /**
         * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
         */
    var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
    /**
         * The name of the new DB cluster to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
         */
    var DBClusterIdentifier: String
    /**
         * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default DB cluster parameter group for the specified engine is used. Constraints:   If supplied, must match the name of an existing DB cluster parameter group.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
         */
    var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * The DB subnet group name to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The AWS KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the KmsKeyId parameter. If you don't specify a value for the KmsKeyId parameter, then the following occurs:   If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the source DB cluster.   If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.   If DBClusterIdentifier refers to a DB cluster that is not encrypted, then the restore request is rejected.
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The name of the option group for the new DB cluster.
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the new DB cluster accepts connections. Constraints: A value from 1150-65535.  Default: The default port for the engine.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The date and time to restore the DB cluster to. Valid Values: Value must be a time in Universal Coordinated Time (UTC) format Constraints:   Must be before the latest restorable time for the DB instance   Must be specified if UseLatestRestorableTime parameter is not provided   Can't be specified if UseLatestRestorableTime parameter is true   Can't be specified if RestoreType parameter is copy-on-write    Example: 2015-03-07T23:45:00Z 
         */
    var RestoreToTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The type of restore to be performed. You can specify one of the following values:    full-copy - The new DB cluster is restored as a full copy of the source DB cluster.    copy-on-write - The new DB cluster is restored as a clone of the source DB cluster.   Constraints: You can't specify copy-on-write if the engine version of the source DB cluster is earlier than 1.11. If you don't specify a RestoreType value, then the new DB cluster is restored as a full copy of the source DB cluster.
         */
    var RestoreType: js.UndefOr[String] = js.undefined
    /**
         * The identifier of the source DB cluster from which to restore. Constraints:   Must match the identifier of an existing DBCluster.  
         */
    var SourceDBClusterIdentifier: String
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A value that is set to true to restore the DB cluster to the latest restorable backup time, and false otherwise.  Default: false  Constraints: Can't be specified if RestoreToTime parameter is provided.
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
  
  
  trait RestoreDBInstanceFromDBSnapshotMessage extends js.Object {
    /**
         * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The EC2 Availability Zone that the DB instance is created in. Default: A random, system-chosen Availability Zone. Constraint: You can't specify the AvailabilityZone parameter if the MultiAZ parameter is set to true. Example: us-east-1a 
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * True to copy all tags from the restored DB instance to snapshots of the DB instance, and otherwise false. The default is false.
         */
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The compute and memory capacity of the Amazon RDS DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Default: The same DBInstanceClass as the original DB instance.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * Name of the DB instance to create from the DB snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 numbers, letters, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
         */
    var DBInstanceIdentifier: String
    /**
         * The database name for the restored DB instance.  This parameter doesn't apply to the MySQL, PostgreSQL, or MariaDB engines. 
         */
    var DBName: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default DBParameterGroup for the specified engine is used. Constraints:   If supplied, must match the name of an existing DBParameterGroup.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the DB snapshot to restore from. Constraints:   Must match the identifier of an existing DBSnapshot.   If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  
         */
    var DBSnapshotIdentifier: String
    /**
         * The DB subnet group name to use for the new instance. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. For more information, see  Deleting a DB Instance. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specify the Active Directory Domain to restore the instance in.
         */
    var Domain: js.UndefOr[String] = js.undefined
    /**
         * Specify the name of the IAM role to be used when making API calls to the Directory Service.
         */
    var DomainIAMRoleName: js.UndefOr[String] = js.undefined
    /**
         * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. You can enable IAM database authentication for the following database engines   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The database engine to use for the new instance. Default: The same as source Constraint: Must be compatible with the engine of the source. For example, you can restore a MariaDB 10.1 DB instance from a MySQL 5.6 snapshot. Valid Values:    mariadb     mysql     oracle-ee     oracle-se2     oracle-se1     oracle-se     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * Specifies the amount of provisioned IOPS for the DB instance, expressed in I/O operations per second. If this parameter is not specified, the IOPS value is taken from the backup. If this parameter is set to 0, the new instance is converted to a non-PIOPS instance. The conversion takes additional time, though your DB instance is available for connections before the conversion starts.  The provisioned IOPS value must follow the requirements for your database engine. For more information, see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide.  Constraints: Must be an integer greater than 1000.
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * License model information for the restored DB instance. Default: Same as source.  Valid values: license-included | bring-your-own-license | general-public-license 
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * Specifies if the DB instance is a Multi-AZ deployment. Constraint: You can't specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the option group to be used for the restored DB instance. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the database accepts connections. Default: The same port as the original DB instance Constraints: Value must be 1150-65535 
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
         */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise standard 
         */
    var StorageType: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The ARN from the key store with which to associate the instance for TDE encryption.
         */
    var TdeCredentialArn: js.UndefOr[String] = js.undefined
    /**
         * The password for the given ARN from the key store in order to access the device.
         */
    var TdeCredentialPassword: js.UndefOr[String] = js.undefined
    /**
         * A value that specifies that the DB instance class of the DB instance uses its default processor features.
         */
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  A list of EC2 VPC security groups to associate with this DB instance.   Default: The default EC2 VPC security group for the DB subnet group's VPC. 
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait RestoreDBInstanceFromS3Message extends js.Object {
    /**
         * The amount of storage (in gigabytes) to allocate initially for the DB instance. Follow the allocation rules specified in CreateDBInstance.   Be sure to allocate enough memory for your new DB instance so that the restore operation can succeed. You can also allocate additional memory for future growth.  
         */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * True to indicate that minor engine upgrades are applied automatically to the DB instance during the maintenance window, and otherwise false.  Default: true 
         */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The Availability Zone that the DB instance is created in. For information about AWS Regions and Availability Zones, see Regions and Availability Zones in the Amazon RDS User Guide.  Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.   Example: us-east-1d  Constraint: The AvailabilityZone parameter can't be specified if the MultiAZ parameter is set to true. The specified Availability Zone must be in the same AWS Region as the current endpoint. 
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * The number of days for which automated backups are retained. Setting this parameter to a positive number enables backups. For more information, see CreateDBInstance. 
         */
    var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false.  Default: false. 
         */
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Importing from Amazon S3 is not supported on the db.t2.micro DB instance class. 
         */
    var DBInstanceClass: String
    /**
         * The DB instance identifier. This parameter is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
         */
    var DBInstanceIdentifier: String
    /**
         * The name of the database to create when the DB instance is created. Follow the naming rules specified in CreateDBInstance. 
         */
    var DBName: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default parameter group for the specified engine is used. 
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * A list of DB security groups to associate with this DB instance. Default: The default DB security group for the database engine.
         */
    var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined
    /**
         * A DB subnet group to associate with this DB instance.
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. For more information, see  Deleting a DB Instance. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false.  Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * True to enable Performance Insights for the DB instance, and otherwise false.  For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
         */
    var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the database engine to be used for this instance.  Valid Values: mysql 
         */
    var Engine: String
    /**
         * The version number of the database engine to use. Choose the latest minor version of your database engine. For information about engine versions, see CreateDBInstance, or call DescribeDBEngineVersions. 
         */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
         * The amount of Provisioned IOPS (input/output operations per second) to allocate initially for the DB instance. For information about valid Iops values, see see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide. 
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The AWS KMS key identifier for an encrypted DB instance.  The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.  If the StorageEncrypted parameter is true, and you do not specify a value for the KmsKeyId parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. 
         */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
         * The license model for this DB instance. Use general-public-license. 
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Constraints: Must contain from 8 to 41 characters.
         */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
         * The name for the master user.  Constraints:    Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
         */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
         * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0.  If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0.  Valid Values: 0, 1, 5, 10, 15, 30, 60  Default: 0 
         */
    var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, see Setting Up and Enabling Enhanced Monitoring in the Amazon RDS User Guide.  If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value. 
         */
    var MonitoringRoleArn: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether the DB instance is a Multi-AZ deployment. If MultiAZ is set to true, you can't set the AvailabilityZone parameter. 
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the option group to associate with this DB instance. If this argument is omitted, the default option group for the specified engine is used. 
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. 
         */
    var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
    /**
         * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
         */
    var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The port number on which the database accepts connections.  Type: Integer  Valid Values: 1150-65535  Default: 3306 
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The time range each day during which automated backups are created if automated backups are enabled. For more information, see The Backup Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
         */
    var PreferredBackupWindow: js.UndefOr[String] = js.undefined
    /**
         * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more information, see Amazon RDS Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format ddd:hh24:mi-ddd:hh24:mi.   Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred backup window.   Must be at least 30 minutes.  
         */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
         */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of your Amazon S3 bucket that contains your database backup file. 
         */
    var S3BucketName: String
    /**
         * An AWS Identity and Access Management (IAM) role to allow Amazon RDS to access your Amazon S3 bucket. 
         */
    var S3IngestionRoleArn: String
    /**
         * The prefix of your Amazon S3 bucket. 
         */
    var S3Prefix: js.UndefOr[String] = js.undefined
    /**
         * The name of the engine of your source database.  Valid Values: mysql 
         */
    var SourceEngine: String
    /**
         * The engine version of your source database.  Valid Values: 5.6 
         */
    var SourceEngineVersion: String
    /**
         * Specifies whether the new DB instance is encrypted or not. 
         */
    var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1  If you specify io1, you must also include a value for the Iops parameter.  Default: io1 if the Iops parameter is specified; otherwise standard 
         */
    var StorageType: js.UndefOr[String] = js.undefined
    /**
         * A list of tags to associate with this DB instance. For more information, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * A value that specifies that the DB instance class of the DB instance uses its default processor features.
         */
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * A list of VPC security groups to associate with this DB instance. 
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait RestoreDBInstanceFromS3Result extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait RestoreDBInstanceToPointInTimeMessage extends js.Object {
    /**
         * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The EC2 Availability Zone that the DB instance is created in. Default: A random, system-chosen Availability Zone. Constraint: You can't specify the AvailabilityZone parameter if the MultiAZ parameter is set to true. Example: us-east-1a 
         */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * True to copy all tags from the restored DB instance to snapshots of the DB instance, and otherwise false. The default is false.
         */
    var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The compute and memory capacity of the Amazon RDS DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Default: The same DBInstanceClass as the original DB instance.
         */
    var DBInstanceClass: js.UndefOr[String] = js.undefined
    /**
         * The database name for the restored DB instance.  This parameter is not used for the MySQL or MariaDB engines. 
         */
    var DBName: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default DBParameterGroup for the specified engine is used. Constraints:   If supplied, must match the name of an existing DBParameterGroup.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
         */
    var DBParameterGroupName: js.UndefOr[String] = js.undefined
    /**
         * The DB subnet group name to use for the new instance. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
         */
    var DBSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
         * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to true. The default is false. For more information, see  Deleting a DB Instance. 
         */
    var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * Specify the Active Directory Domain to restore the instance in.
         */
    var Domain: js.UndefOr[String] = js.undefined
    /**
         * Specify the name of the IAM role to be used when making API calls to the Directory Service.
         */
    var DomainIAMRoleName: js.UndefOr[String] = js.undefined
    /**
         * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide.
         */
    var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
    /**
         * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. You can enable IAM database authentication for the following database engines   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Default: false 
         */
    var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The database engine to use for the new instance. Default: The same as source Constraint: Must be compatible with the engine of the source Valid Values:    mariadb     mysql     oracle-ee     oracle-se2     oracle-se1     oracle-se     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
         */
    var Engine: js.UndefOr[String] = js.undefined
    /**
         * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB instance. Constraints: Must be an integer greater than 1000.  SQL Server  Setting the IOPS value for the SQL Server database engine is not supported.
         */
    var Iops: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * License model information for the restored DB instance. Default: Same as source.  Valid values: license-included | bring-your-own-license | general-public-license 
         */
    var LicenseModel: js.UndefOr[String] = js.undefined
    /**
         * Specifies if the DB instance is a Multi-AZ deployment. Constraint: You can't specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
         */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The name of the option group to be used for the restored DB instance. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
         */
    var OptionGroupName: js.UndefOr[String] = js.undefined
    /**
         * The port number on which the database accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB instance.
         */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
         */
    var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
    /**
         * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
         */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The date and time to restore from. Valid Values: Value must be a time in Universal Coordinated Time (UTC) format Constraints:   Must be before the latest restorable time for the DB instance   Can't be specified if UseLatestRestorableTime parameter is true   Example: 2009-09-07T23:45:00Z 
         */
    var RestoreTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The identifier of the source DB instance from which to restore. Constraints:   Must match the identifier of an existing DB instance.  
         */
    var SourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The resource ID of the source DB instance from which to restore.
         */
    var SourceDbiResourceId: js.UndefOr[String] = js.undefined
    /**
         * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise standard 
         */
    var StorageType: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * The name of the new DB instance to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
         */
    var TargetDBInstanceIdentifier: String
    /**
         * The ARN from the key store with which to associate the instance for TDE encryption.
         */
    var TdeCredentialArn: js.UndefOr[String] = js.undefined
    /**
         * The password for the given ARN from the key store in order to access the device.
         */
    var TdeCredentialPassword: js.UndefOr[String] = js.undefined
    /**
         * A value that specifies that the DB instance class of the DB instance uses its default processor features.
         */
    var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
    /**
         *  Specifies whether (true) or not (false) the DB instance is restored from the latest backup time.  Default: false  Constraints: Can't be specified if RestoreTime parameter is provided.
         */
    var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
    /**
         *  A list of EC2 VPC security groups to associate with this DB instance.   Default: The default EC2 VPC security group for the DB subnet group's VPC. 
         */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  
  trait RestoreDBInstanceToPointInTimeResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait RestoreWindow extends js.Object {
    /**
         * The earliest time you can restore an instance to.
         */
    var EarliestTime: js.UndefOr[TStamp] = js.undefined
    /**
         * The latest time you can restore an instance to.
         */
    var LatestTime: js.UndefOr[TStamp] = js.undefined
  }
  
  
  trait RevokeDBSecurityGroupIngressMessage extends js.Object {
    /**
         *  The IP range to revoke access from. Must be a valid CIDR range. If CIDRIP is specified, EC2SecurityGroupName, EC2SecurityGroupId and EC2SecurityGroupOwnerId can't be provided. 
         */
    var CIDRIP: js.UndefOr[String] = js.undefined
    /**
         * The name of the DB security group to revoke ingress from.
         */
    var DBSecurityGroupName: String
    /**
         *  The id of the EC2 security group to revoke access from. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
         */
    var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
    /**
         *  The name of the EC2 security group to revoke access from. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
         */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
         *  The AWS Account Number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
         */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  }
  
  
  trait RevokeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
  }
  
  
  trait ScalingConfiguration extends js.Object {
    /**
         * A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in serverless DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).  If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.  
         */
    var AutoPause: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The maximum capacity for an Aurora DB cluster in serverless DB engine mode. Valid capacity values are 2, 4, 8, 16, 32, 64, 128, and 256. The maximum capacity must be greater than or equal to the minimum capacity.
         */
    var MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The minimum capacity for an Aurora DB cluster in serverless DB engine mode. Valid capacity values are 2, 4, 8, 16, 32, 64, 128, and 256. The minimum capacity must be less than or equal to the maximum capacity.
         */
    var MinCapacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The time, in seconds, before an Aurora DB cluster in serverless mode is paused.
         */
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  
  trait ScalingConfigurationInfo extends js.Object {
    /**
         * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. 
         */
    var AutoPause: js.UndefOr[BooleanOptional] = js.undefined
    /**
         * The maximum capacity for an Aurora DB cluster in serverless DB engine mode.
         */
    var MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The maximum capacity for the Aurora DB cluster in serverless DB engine mode.
         */
    var MinCapacity: js.UndefOr[IntegerOptional] = js.undefined
    /**
         * The remaining amount of time, in seconds, before the Aurora DB cluster in serverless mode is paused. A DB cluster can be paused only when it's idle (it has no connections).
         */
    var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  @js.native
  class Signer () extends js.Object {
    /**
         * A signer object can be used to generate an auth token to a database.
         */
    def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
    /**
         * Generate an auth token to a database.
         */
    def getAuthToken(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions): java.lang.String = js.native
    /**
         * Generate an auth token to a database.
         */
    def getAuthToken(
      options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* token */ java.lang.String, 
          scala.Unit
        ]
    ): scala.Unit = js.native
  }
  
  
  trait SourceRegion extends js.Object {
    /**
         * The endpoint for the source AWS Region endpoint.
         */
    var Endpoint: js.UndefOr[String] = js.undefined
    /**
         * The name of the source AWS Region.
         */
    var RegionName: js.UndefOr[String] = js.undefined
    /**
         * The status of the source AWS Region.
         */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  
  trait SourceRegionMessage extends js.Object {
    /**
         *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
         */
    var Marker: js.UndefOr[String] = js.undefined
    /**
         * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a Read Replica or a DB snapshot from.
         */
    var SourceRegions: js.UndefOr[SourceRegionList] = js.undefined
  }
  
  
  trait StartDBClusterMessage extends js.Object {
    /**
         * The DB cluster identifier of the Amazon Aurora DB cluster to be started. This parameter is stored as a lowercase string.
         */
    var DBClusterIdentifier: String
  }
  
  
  trait StartDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  
  trait StartDBInstanceMessage extends js.Object {
    /**
         *  The user-supplied instance identifier. 
         */
    var DBInstanceIdentifier: String
  }
  
  
  trait StartDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait StopDBClusterMessage extends js.Object {
    /**
         * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase string.
         */
    var DBClusterIdentifier: String
  }
  
  
  trait StopDBClusterResult extends js.Object {
    var DBCluster: js.UndefOr[DBCluster] = js.undefined
  }
  
  
  trait StopDBInstanceMessage extends js.Object {
    /**
         *  The user-supplied instance identifier. 
         */
    var DBInstanceIdentifier: String
    /**
         *  The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped. 
         */
    var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  }
  
  
  trait StopDBInstanceResult extends js.Object {
    var DBInstance: js.UndefOr[DBInstance] = js.undefined
  }
  
  
  trait Subnet extends js.Object {
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
         * A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length and can't be prefixed with "aws:" or "rds:". The string can only contain only the set of Unicode letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
         */
    var Key: js.UndefOr[String] = js.undefined
    /**
         * A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and can't be prefixed with "aws:" or "rds:". The string can only contain only the set of Unicode letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
         */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  
  trait TagListMessage extends js.Object {
    /**
         * List of tags returned by the ListTagsForResource operation.
         */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait Timezone extends js.Object {
    /**
         * The name of the time zone.
         */
    var TimezoneName: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Associates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.
       */
    def addRoleToDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.
       */
    def addRoleToDBCluster(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.
       */
    def addRoleToDBCluster(params: AddRoleToDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.
       */
    def addRoleToDBCluster(
      params: AddRoleToDBClusterMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a source identifier to an existing RDS event notification subscription.
       */
    def addSourceIdentifierToSubscription(): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a source identifier to an existing RDS event notification subscription.
       */
    def addSourceIdentifierToSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddSourceIdentifierToSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a source identifier to an existing RDS event notification subscription.
       */
    def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a source identifier to an existing RDS event notification subscription.
       */
    def addSourceIdentifierToSubscription(
      params: AddSourceIdentifierToSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddSourceIdentifierToSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
       */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
       */
    def addTagsToResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
       */
    def addTagsToResource(params: AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
       */
    def addTagsToResource(
      params: AddTagsToResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies a pending maintenance action to a resource (for example, to a DB instance).
       */
    def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies a pending maintenance action to a resource (for example, to a DB instance).
       */
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
    /**
       * Applies a pending maintenance action to a resource (for example, to a DB instance).
       */
    def applyPendingMaintenanceAction(
      params: ApplyPendingMaintenanceActionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplyPendingMaintenanceActionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def authorizeDBSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def authorizeDBSecurityGroupIngress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeDBSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def authorizeDBSecurityGroupIngress(
      params: AuthorizeDBSecurityGroupIngressMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeDBSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide. 
       */
    def backtrackDBCluster(): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide. 
       */
    def backtrackDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterBacktrack, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide. 
       */
    def backtrackDBCluster(params: BacktrackDBClusterMessage): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide. 
       */
    def backtrackDBCluster(
      params: BacktrackDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterBacktrack, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB cluster parameter group.
       */
    def copyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB cluster parameter group.
       */
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
    /**
       * Copies the specified DB cluster parameter group.
       */
    def copyDBClusterParameterGroup(
      params: CopyDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def copyDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def copyDBClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def copyDBClusterSnapshot(
      params: CopyDBClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB parameter group.
       */
    def copyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB parameter group.
       */
    def copyDBParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB parameter group.
       */
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB parameter group.
       */
    def copyDBParameterGroup(
      params: CopyDBParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
       */
    def copyDBSnapshot(): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
       */
    def copyDBSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
       */
    def copyDBSnapshot(params: CopyDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
       */
    def copyDBSnapshot(
      params: CopyDBSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified option group.
       */
    def copyOptionGroup(): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified option group.
       */
    def copyOptionGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyOptionGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified option group.
       */
    def copyOptionGroup(params: CopyOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the specified option group.
       */
    def copyOptionGroup(
      params: CopyOptionGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyOptionGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBCluster(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBCluster(params: CreateDBClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBCluster(
      params: CreateDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
       */
    def createDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
       */
    def createDBClusterEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpoint, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
       */
    def createDBClusterEndpoint(params: CreateDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
       */
    def createDBClusterEndpoint(
      params: CreateDBClusterEndpointMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpoint, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterParameterGroup(
      params: CreateDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
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
    /**
       * Creates a new DB instance.
       */
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
    /**
       * Creates a new DB instance.
       */
    def createDBInstance(
      params: CreateDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, or PostgreSQL. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
       */
    def createDBInstanceReadReplica(): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, or PostgreSQL. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
       */
    def createDBInstanceReadReplica(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBInstanceReadReplicaResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, or PostgreSQL. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
       */
    def createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, or PostgreSQL. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
       */
    def createDBInstanceReadReplica(
      params: CreateDBInstanceReadReplicaMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBInstanceReadReplicaResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def createDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def createDBParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def createDBParameterGroup(params: CreateDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def createDBParameterGroup(
      params: CreateDBParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
       */
    def createDBSecurityGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
       */
    def createDBSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSecurityGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
       */
    def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
       */
    def createDBSecurityGroup(
      params: CreateDBSecurityGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSecurityGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a DBSnapshot. The source DBInstance must be in "available" state.
       */
    def createDBSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a DBSnapshot. The source DBInstance must be in "available" state.
       */
    def createDBSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a DBSnapshot. The source DBInstance must be in "available" state.
       */
    def createDBSnapshot(params: CreateDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a DBSnapshot. The source DBInstance must be in "available" state.
       */
    def createDBSnapshot(
      params: CreateDBSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def createDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def createDBSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def createDBSubnetGroup(
      params: CreateDBSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
       */
    def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
       */
    def createEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
       */
    def createEventSubscription(params: CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
       */
    def createEventSubscription(
      params: CreateEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database. 
       */
    def createGlobalCluster(): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database. 
       */
    def createGlobalCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database. 
       */
    def createGlobalCluster(params: CreateGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database. 
       */
    def createGlobalCluster(
      params: CreateGlobalClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new option group. You can create up to 20 option groups.
       */
    def createOptionGroup(): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new option group. You can create up to 20 option groups.
       */
    def createOptionGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOptionGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new option group. You can create up to 20 option groups.
       */
    def createOptionGroup(params: CreateOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new option group. You can create up to 20 option groups.
       */
    def createOptionGroup(
      params: CreateOptionGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOptionGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBCluster(): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBCluster(params: DeleteDBClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBCluster(
      params: DeleteDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
       */
    def deleteDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
       */
    def deleteDBClusterEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpoint, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
       */
    def deleteDBClusterEndpoint(params: DeleteDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
       */
    def deleteDBClusterEndpoint(
      params: DeleteDBClusterEndpointMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpoint, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterParameterGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterParameterGroup(
      params: DeleteDBClusterParameterGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def deleteDBClusterSnapshot(
      params: DeleteDBClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
       */
    def deleteDBInstance(): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
       */
    def deleteDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
       */
    def deleteDBInstance(params: DeleteDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
       */
    def deleteDBInstance(
      params: DeleteDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
       */
    def deleteDBInstanceAutomatedBackup(): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
       */
    def deleteDBInstanceAutomatedBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBInstanceAutomatedBackupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
       */
    def deleteDBInstanceAutomatedBackup(params: DeleteDBInstanceAutomatedBackupMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
       */
    def deleteDBInstanceAutomatedBackup(
      params: DeleteDBInstanceAutomatedBackupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBInstanceAutomatedBackupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
       */
    def deleteDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
       */
    def deleteDBParameterGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
       */
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
       */
    def deleteDBParameterGroup(
      params: DeleteDBParameterGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
       */
    def deleteDBSecurityGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
       */
    def deleteDBSecurityGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
       */
    def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
       */
    def deleteDBSecurityGroup(
      params: DeleteDBSecurityGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
       */
    def deleteDBSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
       */
    def deleteDBSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
       */
    def deleteDBSnapshot(params: DeleteDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
       */
    def deleteDBSnapshot(
      params: DeleteDBSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
       */
    def deleteDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
       */
    def deleteDBSubnetGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
       */
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
       */
    def deleteDBSubnetGroup(
      params: DeleteDBSubnetGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an RDS event notification subscription.
       */
    def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an RDS event notification subscription.
       */
    def deleteEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an RDS event notification subscription.
       */
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an RDS event notification subscription.
       */
    def deleteEventSubscription(
      params: DeleteEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first. 
       */
    def deleteGlobalCluster(): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first. 
       */
    def deleteGlobalCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first. 
       */
    def deleteGlobalCluster(params: DeleteGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first. 
       */
    def deleteGlobalCluster(
      params: DeleteGlobalClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing option group.
       */
    def deleteOptionGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing option group.
       */
    def deleteOptionGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing option group.
       */
    def deleteOptionGroup(params: DeleteOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing option group.
       */
    def deleteOptionGroup(
      params: DeleteOptionGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
       */
    def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
       */
    def describeAccountAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AccountAttributesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
       */
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
       */
    def describeAccountAttributes(
      params: DescribeAccountAttributesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AccountAttributesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
       */
    def describeCertificates(): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
       */
    def describeCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CertificateMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
       */
    def describeCertificates(params: DescribeCertificatesMessage): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
       */
    def describeCertificates(
      params: DescribeCertificatesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CertificateMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterBacktracks(): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterBacktracks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterBacktrackMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterBacktracks(params: DescribeDBClusterBacktracksMessage): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterBacktracks(
      params: DescribeDBClusterBacktracksMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterBacktrackMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about endpoints for an Amazon Aurora DB cluster.
       */
    def describeDBClusterEndpoints(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about endpoints for an Amazon Aurora DB cluster.
       */
    def describeDBClusterEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpointMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about endpoints for an Amazon Aurora DB cluster.
       */
    def describeDBClusterEndpoints(params: DescribeDBClusterEndpointsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about endpoints for an Amazon Aurora DB cluster.
       */
    def describeDBClusterEndpoints(
      params: DescribeDBClusterEndpointsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpointMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameterGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameterGroups(
      params: DescribeDBClusterParameterGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameters(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterParameters(
      params: DescribeDBClusterParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
       */
    def describeDBClusterSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
       */
    def describeDBClusterSnapshotAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBClusterSnapshotAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
       */
    def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
       */
    def describeDBClusterSnapshotAttributes(
      params: DescribeDBClusterSnapshotAttributesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBClusterSnapshotAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusterSnapshots(
      params: DescribeDBClusterSnapshotsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusters(): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeDBClusters(params: DescribeDBClustersMessage): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
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
    /**
       * Returns a list of the available DB engines.
       */
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
    /**
       * Returns a list of the available DB engines.
       */
    def describeDBEngineVersions(
      params: DescribeDBEngineVersionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBEngineVersionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
       */
    def describeDBInstanceAutomatedBackups(): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
       */
    def describeDBInstanceAutomatedBackups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceAutomatedBackupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
       */
    def describeDBInstanceAutomatedBackups(params: DescribeDBInstanceAutomatedBackupsMessage): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
       */
    def describeDBInstanceAutomatedBackups(
      params: DescribeDBInstanceAutomatedBackupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceAutomatedBackupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned RDS instances. This API supports pagination.
       */
    def describeDBInstances(): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned RDS instances. This API supports pagination.
       */
    def describeDBInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned RDS instances. This API supports pagination.
       */
    def describeDBInstances(params: DescribeDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about provisioned RDS instances. This API supports pagination.
       */
    def describeDBInstances(
      params: DescribeDBInstancesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB log files for the DB instance.
       */
    def describeDBLogFiles(): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB log files for the DB instance.
       */
    def describeDBLogFiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBLogFilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB log files for the DB instance.
       */
    def describeDBLogFiles(params: DescribeDBLogFilesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB log files for the DB instance.
       */
    def describeDBLogFiles(
      params: DescribeDBLogFilesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBLogFilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
       */
    def describeDBParameterGroups(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
       */
    def describeDBParameterGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
       */
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
       */
    def describeDBParameterGroups(
      params: DescribeDBParameterGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB parameter group.
       */
    def describeDBParameters(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB parameter group.
       */
    def describeDBParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB parameter group.
       */
    def describeDBParameters(params: DescribeDBParametersMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the detailed parameter list for a particular DB parameter group.
       */
    def describeDBParameters(
      params: DescribeDBParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
       */
    def describeDBSecurityGroups(): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
       */
    def describeDBSecurityGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSecurityGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
       */
    def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
       */
    def describeDBSecurityGroups(
      params: DescribeDBSecurityGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSecurityGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
       */
    def describeDBSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
       */
    def describeDBSnapshotAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBSnapshotAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
       */
    def describeDBSnapshotAttributes(params: DescribeDBSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
       */
    def describeDBSnapshotAttributes(
      params: DescribeDBSnapshotAttributesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDBSnapshotAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB snapshots. This API action supports pagination.
       */
    def describeDBSnapshots(): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB snapshots. This API action supports pagination.
       */
    def describeDBSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB snapshots. This API action supports pagination.
       */
    def describeDBSnapshots(params: DescribeDBSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about DB snapshots. This API action supports pagination.
       */
    def describeDBSnapshots(
      params: DescribeDBSnapshotsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def describeDBSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def describeDBSubnetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
       */
    def describeDBSubnetGroups(
      params: DescribeDBSubnetGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeEngineDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeEngineDefaultClusterParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultClusterParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeEngineDefaultClusterParameters(
      params: DescribeEngineDefaultClusterParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultClusterParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the specified database engine.
       */
    def describeEngineDefaultParameters(): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the specified database engine.
       */
    def describeEngineDefaultParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the specified database engine.
       */
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the default engine and system parameter information for the specified database engine.
       */
    def describeEngineDefaultParameters(
      params: DescribeEngineDefaultParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
       */
    def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
       */
    def describeEventCategories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventCategoriesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
       */
    def describeEventCategories(params: DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
       */
    def describeEventCategories(
      params: DescribeEventCategoriesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventCategoriesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
       */
    def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
       */
    def describeEventSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSubscriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
       */
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
       */
    def describeEventSubscriptions(
      params: DescribeEventSubscriptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSubscriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
       */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
       */
    def describeEvents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
       */
    def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
       */
    def describeEvents(
      params: DescribeEventsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeGlobalClusters(): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeGlobalClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GlobalClustersMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeGlobalClusters(params: DescribeGlobalClustersMessage): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def describeGlobalClusters(
      params: DescribeGlobalClustersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GlobalClustersMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all available options.
       */
    def describeOptionGroupOptions(): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all available options.
       */
    def describeOptionGroupOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OptionGroupOptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all available options.
       */
    def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes all available options.
       */
    def describeOptionGroupOptions(
      params: DescribeOptionGroupOptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OptionGroupOptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available option groups.
       */
    def describeOptionGroups(): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available option groups.
       */
    def describeOptionGroups(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ OptionGroups, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available option groups.
       */
    def describeOptionGroups(params: DescribeOptionGroupsMessage): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available option groups.
       */
    def describeOptionGroups(
      params: DescribeOptionGroupsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ OptionGroups, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of orderable DB instance options for the specified engine.
       */
    def describeOrderableDBInstanceOptions(): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of orderable DB instance options for the specified engine.
       */
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
    /**
       * Returns a list of orderable DB instance options for the specified engine.
       */
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
    /**
       * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
       */
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
    /**
       * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
       */
    def describePendingMaintenanceActions(
      params: DescribePendingMaintenanceActionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingMaintenanceActionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
       */
    def describeReservedDBInstances(): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
       */
    def describeReservedDBInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedDBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
       */
    def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
       */
    def describeReservedDBInstances(
      params: DescribeReservedDBInstancesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedDBInstanceMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists available reserved DB instance offerings.
       */
    def describeReservedDBInstancesOfferings(): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists available reserved DB instance offerings.
       */
    def describeReservedDBInstancesOfferings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedDBInstancesOfferingMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists available reserved DB instance offerings.
       */
    def describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists available reserved DB instance offerings.
       */
    def describeReservedDBInstancesOfferings(
      params: DescribeReservedDBInstancesOfferingsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedDBInstancesOfferingMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
       */
    def describeSourceRegions(): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
       */
    def describeSourceRegions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SourceRegionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
       */
    def describeSourceRegions(params: DescribeSourceRegionsMessage): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
       */
    def describeSourceRegions(
      params: DescribeSourceRegionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SourceRegionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
       */
    def describeValidDBInstanceModifications(): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
       */
    def describeValidDBInstanceModifications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeValidDBInstanceModificationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
       */
    def describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
       */
    def describeValidDBInstanceModifications(
      params: DescribeValidDBInstanceModificationsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeValidDBInstanceModificationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads all or a portion of the specified log file, up to 1 MB in size.
       */
    def downloadDBLogFilePortion(): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads all or a portion of the specified log file, up to 1 MB in size.
       */
    def downloadDBLogFilePortion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DownloadDBLogFilePortionDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads all or a portion of the specified log file, up to 1 MB in size.
       */
    def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads all or a portion of the specified log file, up to 1 MB in size.
       */
    def downloadDBLogFilePortion(
      params: DownloadDBLogFilePortionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DownloadDBLogFilePortionDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def failoverDBCluster(): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def failoverDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FailoverDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def failoverDBCluster(params: FailoverDBClusterMessage): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def failoverDBCluster(
      params: FailoverDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FailoverDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
       */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
       */
    def listTagsForResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
       */
    def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
       */
    def listTagsForResource(
      params: ListTagsForResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide. 
       */
    def modifyCurrentDBClusterCapacity(): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide. 
       */
    def modifyCurrentDBClusterCapacity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterCapacityInfo, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide. 
       */
    def modifyCurrentDBClusterCapacity(params: ModifyCurrentDBClusterCapacityMessage): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide. 
       */
    def modifyCurrentDBClusterCapacity(
      params: ModifyCurrentDBClusterCapacityMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterCapacityInfo, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyDBCluster(): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyDBCluster(params: ModifyDBClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyDBCluster(
      params: ModifyDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
       */
    def modifyDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
       */
    def modifyDBClusterEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpoint, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
       */
    def modifyDBClusterEndpoint(params: ModifyDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
       */
    def modifyDBClusterEndpoint(
      params: ModifyDBClusterEndpointMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterEndpoint, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
       */
    def modifyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
       */
    def modifyDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
       */
    def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
       */
    def modifyDBClusterParameterGroup(
      params: ModifyDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
       */
    def modifyDBClusterSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
       */
    def modifyDBClusterSnapshotAttribute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterSnapshotAttributeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
       */
    def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
       */
    def modifyDBClusterSnapshotAttribute(
      params: ModifyDBClusterSnapshotAttributeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBClusterSnapshotAttributeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
       */
    def modifyDBInstance(): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
       */
    def modifyDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
       */
    def modifyDBInstance(params: ModifyDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
       */
    def modifyDBInstance(
      params: ModifyDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def modifyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def modifyDBParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
       */
    def modifyDBParameterGroup(
      params: ModifyDBParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
       */
    def modifyDBSnapshot(): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
       */
    def modifyDBSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
       */
    def modifyDBSnapshot(params: ModifyDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
       */
    def modifyDBSnapshot(
      params: ModifyDBSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
       */
    def modifyDBSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
       */
    def modifyDBSnapshotAttribute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSnapshotAttributeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
       */
    def modifyDBSnapshotAttribute(params: ModifyDBSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
       */
    def modifyDBSnapshotAttribute(
      params: ModifyDBSnapshotAttributeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSnapshotAttributeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def modifyDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def modifyDBSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
       */
    def modifyDBSubnetGroup(
      params: ModifyDBSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyDBSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
       */
    def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
       */
    def modifyEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
       */
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
       */
    def modifyEventSubscription(
      params: ModifyEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyGlobalCluster(): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyGlobalCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyGlobalCluster(params: ModifyGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def modifyGlobalCluster(
      params: ModifyGlobalClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing option group.
       */
    def modifyOptionGroup(): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing option group.
       */
    def modifyOptionGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyOptionGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing option group.
       */
    def modifyOptionGroup(params: ModifyOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies an existing option group.
       */
    def modifyOptionGroup(
      params: ModifyOptionGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyOptionGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
       */
    def promoteReadReplica(): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
       */
    def promoteReadReplica(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PromoteReadReplicaResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
       */
    def promoteReadReplica(params: PromoteReadReplicaMessage): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
       */
    def promoteReadReplica(
      params: PromoteReadReplicaMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PromoteReadReplicaResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB cluster to a standalone DB cluster.
       */
    def promoteReadReplicaDBCluster(): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB cluster to a standalone DB cluster.
       */
    def promoteReadReplicaDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PromoteReadReplicaDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB cluster to a standalone DB cluster.
       */
    def promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Promotes a Read Replica DB cluster to a standalone DB cluster.
       */
    def promoteReadReplicaDBCluster(
      params: PromoteReadReplicaDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PromoteReadReplicaDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Purchases a reserved DB instance offering.
       */
    def purchaseReservedDBInstancesOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Purchases a reserved DB instance offering.
       */
    def purchaseReservedDBInstancesOffering(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedDBInstancesOfferingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Purchases a reserved DB instance offering.
       */
    def purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Purchases a reserved DB instance offering.
       */
    def purchaseReservedDBInstancesOffering(
      params: PurchaseReservedDBInstancesOfferingMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedDBInstancesOfferingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
       */
    def rebootDBInstance(): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
       */
    def rebootDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
       */
    def rebootDBInstance(params: RebootDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
       */
    def rebootDBInstance(
      params: RebootDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region. 
       */
    def removeFromGlobalCluster(): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region. 
       */
    def removeFromGlobalCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveFromGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region. 
       */
    def removeFromGlobalCluster(params: RemoveFromGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region. 
       */
    def removeFromGlobalCluster(
      params: RemoveFromGlobalClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveFromGlobalClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.
       */
    def removeRoleFromDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.
       */
    def removeRoleFromDBCluster(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.
       */
    def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates an Identity and Access Management (IAM) role from an Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.
       */
    def removeRoleFromDBCluster(
      params: RemoveRoleFromDBClusterMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a source identifier from an existing RDS event notification subscription.
       */
    def removeSourceIdentifierFromSubscription(): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a source identifier from an existing RDS event notification subscription.
       */
    def removeSourceIdentifierFromSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveSourceIdentifierFromSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a source identifier from an existing RDS event notification subscription.
       */
    def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a source identifier from an existing RDS event notification subscription.
       */
    def removeSourceIdentifierFromSubscription(
      params: RemoveSourceIdentifierFromSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveSourceIdentifierFromSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
       */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
       */
    def removeTagsFromResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
       */
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
       */
    def removeTagsFromResource(
      params: RemoveTagsFromResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def resetDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def resetDBClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def resetDBClusterParameterGroup(
      params: ResetDBClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
       */
    def resetDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
       */
    def resetDBParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
       */
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
       */
    def resetDBParameterGroup(
      params: ResetDBParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.
       */
    def restoreDBClusterFromS3(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.
       */
    def restoreDBClusterFromS3(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterFromS3Result, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.
       */
    def restoreDBClusterFromS3(params: RestoreDBClusterFromS3Message): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.
       */
    def restoreDBClusterFromS3(
      params: RestoreDBClusterFromS3Message,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterFromS3Result, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterFromSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterFromSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterFromSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterFromSnapshot(
      params: RestoreDBClusterFromSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterFromSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterToPointInTime(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterToPointInTime(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterToPointInTimeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
       */
    def restoreDBClusterToPointInTime(
      params: RestoreDBClusterToPointInTimeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBClusterToPointInTimeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
       */
    def restoreDBInstanceFromDBSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
       */
    def restoreDBInstanceFromDBSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBInstanceFromDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
       */
    def restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
       */
    def restoreDBInstanceFromDBSnapshot(
      params: RestoreDBInstanceFromDBSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBInstanceFromDBSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
       */
    def restoreDBInstanceFromS3(): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
       */
    def restoreDBInstanceFromS3(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBInstanceFromS3Result, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
       */
    def restoreDBInstanceFromS3(params: RestoreDBInstanceFromS3Message): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
       */
    def restoreDBInstanceFromS3(
      params: RestoreDBInstanceFromS3Message,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBInstanceFromS3Result, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
       */
    def restoreDBInstanceToPointInTime(): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
       */
    def restoreDBInstanceToPointInTime(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBInstanceToPointInTimeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
       */
    def restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
       */
    def restoreDBInstanceToPointInTime(
      params: RestoreDBInstanceToPointInTimeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreDBInstanceToPointInTimeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
       */
    def revokeDBSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
       */
    def revokeDBSecurityGroupIngress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeDBSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
       */
    def revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
       */
    def revokeDBSecurityGroupIngress(
      params: RevokeDBSecurityGroupIngressMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeDBSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def startDBCluster(): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def startDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def startDBCluster(params: StartDBClusterMessage): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def startDBCluster(
      params: StartDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
       */
    def startDBInstance(): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
       */
    def startDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
       */
    def startDBInstance(params: StartDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
       */
    def startDBInstance(
      params: StartDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def stopDBCluster(): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def stopDBCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def stopDBCluster(params: StopDBClusterMessage): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
       */
    def stopDBCluster(
      params: StopDBClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDBClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
       */
    def stopDBInstance(): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
       */
    def stopDBInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
       */
    def stopDBInstance(params: StopDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
       */
    def stopDBInstance(
      params: StopDBInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDBInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
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
       * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
      params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
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
       * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
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
       * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
      params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
       */
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
    /**
       * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
      params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
      params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
      params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_dBSnapshotDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
      params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DBSnapshotMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  
  
  trait ValidDBInstanceModificationsMessage extends js.Object {
    /**
         * Valid storage options for your DB instance. 
         */
    var Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined
    /**
         * Valid processor features for your DB instance. 
         */
    var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
  }
  
  
  trait ValidStorageOptions extends js.Object {
    /**
         * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that provisioned IOPS can be between 3 and 10 times storage. 
         */
    var IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined
    /**
         * The valid range of provisioned IOPS. For example, 1000-20000. 
         */
    var ProvisionedIops: js.UndefOr[RangeList] = js.undefined
    /**
         * The valid range of storage in gibibytes. For example, 100 to 16384. 
         */
    var StorageSize: js.UndefOr[RangeList] = js.undefined
    /**
         * The valid storage types for your DB instance. For example, gp2, io1. 
         */
    var StorageType: js.UndefOr[String] = js.undefined
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
  
  val TypesNs: this.type = js.native
  @JSName("Signer")
  @js.native
  object SignerNs extends js.Object {
    
    trait SignerOptions extends js.Object {
      var credentials: js.UndefOr[
            awsDashSdkLib.libCredentialsMod.Credentials | awsDashSdkLib.libCredentialsMod.CredentialsOptions
          ] = js.undefined
      var hostname: js.UndefOr[java.lang.String] = js.undefined
      var port: js.UndefOr[scala.Double] = js.undefined
      var region: js.UndefOr[java.lang.String] = js.undefined
      var username: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
  type AccountQuotaList = js.Array[AccountQuota]
  type ApplyMethod = awsDashSdkLib.awsDashSdkLibStrings.immediate | awsDashSdkLib.awsDashSdkLibStrings.`pending-reboot` | java.lang.String
  type AttributeValueList = js.Array[String]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZones = js.Array[String]
  type AvailableProcessorFeatureList = js.Array[AvailableProcessorFeature]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[Certificate]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DBClusterBacktrackList = js.Array[DBClusterBacktrack]
  type DBClusterEndpointList = js.Array[DBClusterEndpoint]
  type DBClusterList = js.Array[DBCluster]
  type DBClusterMemberList = js.Array[DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]
  type DBClusterRoles = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[DBClusterSnapshot]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceAutomatedBackupList = js.Array[DBInstanceAutomatedBackup]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[String]
  type DBSecurityGroups = js.Array[DBSecurityGroup]
  type DBSnapshotAttributeList = js.Array[DBSnapshotAttribute]
  type DBSnapshotList = js.Array[DBSnapshot]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[DescribeDBLogFilesDetails]
  type DomainMembershipList = js.Array[DomainMembership]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type DoubleRangeList = js.Array[DoubleRange]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EngineModeList = js.Array[String]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type GlobalClusterList = js.Array[GlobalCluster]
  type GlobalClusterMemberList = js.Array[GlobalClusterMember]
  type IPRangeList = js.Array[IPRange]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type LogTypeList = js.Array[String]
  type Long = scala.Double
  type LongOptional = scala.Double
  type MinimumEngineVersionPerAllowedValueList = js.Array[MinimumEngineVersionPerAllowedValue]
  type OptionConfigurationList = js.Array[OptionConfiguration]
  type OptionGroupMembershipList = js.Array[OptionGroupMembership]
  type OptionGroupOptionSettingsList = js.Array[OptionGroupOptionSetting]
  type OptionGroupOptionVersionsList = js.Array[OptionVersion]
  type OptionGroupOptionsList = js.Array[OptionGroupOption]
  type OptionGroupsList = js.Array[OptionGroup]
  type OptionNamesList = js.Array[String]
  type OptionSettingConfigurationList = js.Array[OptionSetting]
  type OptionSettingsList = js.Array[OptionSetting]
  type OptionsConflictsWith = js.Array[String]
  type OptionsDependedOn = js.Array[String]
  type OptionsList = js.Array[Option]
  type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]
  type ParametersList = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  type ProcessorFeatureList = js.Array[ProcessorFeature]
  type RangeList = js.Array[Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[String]
  type ReadReplicaIdentifierList = js.Array[String]
  type ReadersArnList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedDBInstanceList = js.Array[ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[String]
  type SourceRegionList = js.Array[SourceRegion]
  type SourceType = awsDashSdkLib.awsDashSdkLibStrings.`db-instance` | awsDashSdkLib.awsDashSdkLibStrings.`db-parameter-group` | awsDashSdkLib.awsDashSdkLibStrings.`db-security-group` | awsDashSdkLib.awsDashSdkLibStrings.`db-snapshot` | awsDashSdkLib.awsDashSdkLibStrings.`db-cluster` | awsDashSdkLib.awsDashSdkLibStrings.`db-cluster-snapshot` | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedCharacterSetsList = js.Array[CharacterSet]
  type SupportedTimezonesList = js.Array[Timezone]
  type TStamp = stdLib.Date
  type TagList = js.Array[Tag]
  type ValidStorageOptionsList = js.Array[ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2013-01-10` | awsDashSdkLib.awsDashSdkLibStrings.`2013-02-12` | awsDashSdkLib.awsDashSdkLibStrings.`2013-09-09` | awsDashSdkLib.awsDashSdkLibStrings.`2014-09-01` | awsDashSdkLib.awsDashSdkLibStrings.`2014-10-31` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

