package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBInstanceToPointInTimeMessage extends js.Object {
  /**
    * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the maintenance window.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The Availability Zone (AZ) where the DB instance will be created. Default: A random, system-chosen Availability Zone. Constraint: You can't specify the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment. Example: us-east-1a 
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default, tags are not copied.
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
    * The name of the DB parameter group to associate with this DB instance. If you do not specify a value for DBParameterGroupName, then the default DBParameterGroup for the specified DB engine is used. Constraints:   If supplied, must match the name of an existing DBParameterGroup.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The DB subnet group name to use for the new instance. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Specify the Active Directory directory ID to restore the DB instance in. The domain must be created prior to this operation. Currently, only Microsoft SQL Server and Oracle DB instances can be created in an Active Directory Domain.  For Microsoft SQL Server DB instances, Amazon RDS can use Windows Authentication to authenticate users that connect to the DB instance. For more information, see  Using Windows Authentication with an Amazon RDS DB Instance Running Microsoft SQL Server in the Amazon RDS User Guide. For Oracle DB instances, Amazon RDS can use Kerberos Authentication to authenticate users that connect to the DB instance. For more information, see  Using Kerberos Authentication with Amazon RDS for Oracle in the Amazon RDS User Guide.
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
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For information about the supported DB engines, see CreateDBInstance. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide. 
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
    * A value that indicates whether the DB instance is a Multi-AZ deployment. Constraint: You can't specify the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment.
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
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, it is an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. When the DB instance is not publicly accessible, it is an internal instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The date and time to restore from. Valid Values: Value must be a time in Universal Coordinated Time (UTC) format Constraints:   Must be before the latest restorable time for the DB instance   Can't be specified if the UseLatestRestorableTime parameter is enabled   Example: 2009-09-07T23:45:00Z 
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
    * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise gp2 
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
    * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
    */
  var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  A value that indicates whether the DB instance is restored from the latest backup time. By default, the DB instance is not restored from the latest backup time.  Constraints: Can't be specified if the RestoreTime parameter is provided.
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
  /**
    *  A list of EC2 VPC security groups to associate with this DB instance.   Default: The default EC2 VPC security group for the DB subnet group's VPC. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object RestoreDBInstanceToPointInTimeMessage {
  @scala.inline
  def apply(
    TargetDBInstanceIdentifier: String,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    AvailabilityZone: String = null,
    CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
    DBInstanceClass: String = null,
    DBName: String = null,
    DBParameterGroupName: String = null,
    DBSubnetGroupName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    Domain: String = null,
    DomainIAMRoleName: String = null,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
    Engine: String = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    LicenseModel: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    OptionGroupName: String = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    ProcessorFeatures: ProcessorFeatureList = null,
    PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
    RestoreTime: TStamp = null,
    SourceDBInstanceIdentifier: String = null,
    SourceDbiResourceId: String = null,
    StorageType: String = null,
    Tags: TagList = null,
    TdeCredentialArn: String = null,
    TdeCredentialPassword: String = null,
    UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined,
    UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): RestoreDBInstanceToPointInTimeMessage = {
    val __obj = js.Dynamic.literal(TargetDBInstanceIdentifier = TargetDBInstanceIdentifier)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (DBName != null) __obj.updateDynamic("DBName")(DBName)
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (DomainIAMRoleName != null) __obj.updateDynamic("DomainIAMRoleName")(DomainIAMRoleName)
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports)
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (ProcessorFeatures != null) __obj.updateDynamic("ProcessorFeatures")(ProcessorFeatures)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (RestoreTime != null) __obj.updateDynamic("RestoreTime")(RestoreTime)
    if (SourceDBInstanceIdentifier != null) __obj.updateDynamic("SourceDBInstanceIdentifier")(SourceDBInstanceIdentifier)
    if (SourceDbiResourceId != null) __obj.updateDynamic("SourceDbiResourceId")(SourceDbiResourceId)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn)
    if (TdeCredentialPassword != null) __obj.updateDynamic("TdeCredentialPassword")(TdeCredentialPassword)
    if (!js.isUndefined(UseDefaultProcessorFeatures)) __obj.updateDynamic("UseDefaultProcessorFeatures")(UseDefaultProcessorFeatures)
    if (!js.isUndefined(UseLatestRestorableTime)) __obj.updateDynamic("UseLatestRestorableTime")(UseLatestRestorableTime)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[RestoreDBInstanceToPointInTimeMessage]
  }
}

