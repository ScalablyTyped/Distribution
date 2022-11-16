package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBInstanceFromDBSnapshotMessage extends StObject {
  
  /**
    * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the maintenance window. If you restore an RDS Custom DB instance, you must disable this parameter.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Availability Zone (AZ) where the DB instance will be created. Default: A random, system-chosen Availability Zone. Constraint: You can't specify the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment. Example: us-east-1a 
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies where automated backups and manual snapshots are stored for the restored DB instance. Possible values are outposts (Amazon Web Services Outposts) and region (Amazon Web Services Region). The default is region. For more information, see Working with Amazon RDS on Amazon Web Services Outposts in the Amazon RDS User Guide.
    */
  var BackupTarget: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the restored DB instance to snapshots of the DB instance. In most cases, tags aren't copied by default. However, when you restore a DB instance from a DB snapshot, RDS checks whether you specify new tags. If yes, the new tags are added to the restored DB instance. If there are no new tags, RDS looks for the tags from the source DB instance for the DB snapshot, and then adds those tags to the restored DB instance. For more information, see  Copying tags to DB instance snapshots in the Amazon RDS User Guide.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The instance profile must meet the following requirements:   The profile must exist in your account.   The profile must have an IAM role that Amazon EC2 has permissions to assume.   The instance profile name and the associated IAM role name must start with the prefix AWSRDSCustom.   For the list of permissions required for the IAM role, see  Configure IAM and your VPC in the Amazon RDS User Guide. This setting is required for RDS Custom.
    */
  var CustomIamInstanceProfile: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the RDS for MySQL Multi-AZ DB cluster snapshot to restore from. For more information on Multi-AZ DB clusters, see  Multi-AZ deployments with two readable standby DB instances in the Amazon RDS User Guide. Constraints:   Must match the identifier of an existing Multi-AZ DB cluster snapshot.   Can't be specified when DBSnapshotIdentifier is specified.   Must be specified when DBSnapshotIdentifier isn't specified.   If you are restoring from a shared manual Multi-AZ DB cluster snapshot, the DBClusterSnapshotIdentifier must be the ARN of the shared snapshot.   Can't be the identifier of an Aurora DB cluster snapshot.   Can't be the identifier of an RDS for PostgreSQL Multi-AZ DB cluster snapshot.  
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Default: The same DBInstanceClass as the original DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the DB instance to create from the DB snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 numbers, letters, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var DBInstanceIdentifier: String
  
  /**
    * The database name for the restored DB instance. This parameter doesn't apply to the MySQL, PostgreSQL, or MariaDB engines. It also doesn't apply to RDS Custom DB instances.
    */
  var DBName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB parameter group to associate with this DB instance. If you don't specify a value for DBParameterGroupName, then RDS uses the default DBParameterGroup for the specified DB engine. This setting doesn't apply to RDS Custom. Constraints:   If supplied, must match the name of an existing DBParameterGroup.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the DB snapshot to restore from. Constraints:   Must match the identifier of an existing DBSnapshot.   Can't be specified when DBClusterSnapshotIdentifier is specified.   Must be specified when DBClusterSnapshotIdentifier isn't specified.   If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The DB subnet group name to use for the new instance. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mydbsubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see  Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specify the Active Directory directory ID to restore the DB instance in. The domain/ must be created prior to this operation. Currently, you can create only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory Domain. For more information, see  Kerberos Authentication in the Amazon RDS User Guide. This setting doesn't apply to RDS Custom.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service. This setting doesn't apply to RDS Custom.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide. This setting doesn't apply to RDS Custom.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance. A CoIP provides local or external connectivity to resources in your Outpost subnets through your on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from outside of its virtual private cloud (VPC) on your local network. This setting doesn't apply to RDS Custom. For more information about RDS on Outposts, see Working with Amazon RDS on Amazon Web Services Outposts in the Amazon RDS User Guide. For more information about CoIPs, see Customer-owned IP addresses in the Amazon Web Services Outposts User Guide.
    */
  var EnableCustomerOwnedIp: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide.  This setting doesn't apply to RDS Custom.
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The database engine to use for the new instance. This setting doesn't apply to RDS Custom. Default: The same as source Constraint: Must be compatible with the engine of the source. For example, you can restore a MariaDB 10.1 DB instance from a MySQL 5.6 snapshot. Valid Values:    mariadb     mysql     oracle-ee     oracle-ee-cdb     oracle-se2     oracle-se2-cdb     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the amount of provisioned IOPS for the DB instance, expressed in I/O operations per second. If this parameter isn't specified, the IOPS value is taken from the backup. If this parameter is set to 0, the new instance is converted to a non-PIOPS instance. The conversion takes additional time, though your DB instance is available for connections before the conversion starts. The provisioned IOPS value must follow the requirements for your database engine. For more information, see Amazon RDS Provisioned IOPS storage in the Amazon RDS User Guide.  Constraints: Must be an integer greater than 1000.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * License model information for the restored DB instance. This setting doesn't apply to RDS Custom. Default: Same as source. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. This setting doesn't apply to RDS Custom. Constraint: You can't specify the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The network type of the DB instance. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB instance. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon RDS User Guide. 
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the option group to be used for the restored DB instance. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance after it is associated with a DB instance. This setting doesn't apply to RDS Custom.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the database accepts connections. Default: The same port as the original DB instance Constraints: Value must be 1150-65535 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance. This setting doesn't apply to RDS Custom.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the storage throughput value for the DB instance. This setting doesn't apply to RDS Custom or Amazon Aurora.
    */
  var StorageThroughput: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the storage type to be associated with the DB instance. Valid values: gp2 | gp3 | io1 | standard  If you specify io1 or gp3, you must also include a value for the Iops parameter. Default: io1 if the Iops parameter is specified, otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption. This setting doesn't apply to RDS Custom.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the given ARN from the key store in order to access the device. This setting doesn't apply to RDS Custom.
    */
  var TdeCredentialPassword: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB instance class of the DB instance uses its default processor features. This setting doesn't apply to RDS Custom.
    */
  var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A list of EC2 VPC security groups to associate with this DB instance. Default: The default EC2 VPC security group for the DB subnet group's VPC.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object RestoreDBInstanceFromDBSnapshotMessage {
  
  inline def apply(DBInstanceIdentifier: String): RestoreDBInstanceFromDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBInstanceFromDBSnapshotMessage]
  }
  
  extension [Self <: RestoreDBInstanceFromDBSnapshotMessage](x: Self) {
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBackupTarget(value: String): Self = StObject.set(x, "BackupTarget", value.asInstanceOf[js.Any])
    
    inline def setBackupTargetUndefined: Self = StObject.set(x, "BackupTarget", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setCustomIamInstanceProfile(value: String): Self = StObject.set(x, "CustomIamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setCustomIamInstanceProfileUndefined: Self = StObject.set(x, "CustomIamInstanceProfile", js.undefined)
    
    inline def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DBClusterSnapshotIdentifier", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBName(value: String): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    inline def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
    inline def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotIdentifierUndefined: Self = StObject.set(x, "DBSnapshotIdentifier", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleName(value: String): Self = StObject.set(x, "DomainIAMRoleName", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleNameUndefined: Self = StObject.set(x, "DomainIAMRoleName", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEnableCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnableCloudwatchLogsExports", js.undefined)
    
    inline def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnableCloudwatchLogsExports", js.Array(value*))
    
    inline def setEnableCustomerOwnedIp(value: BooleanOptional): Self = StObject.set(x, "EnableCustomerOwnedIp", value.asInstanceOf[js.Any])
    
    inline def setEnableCustomerOwnedIpUndefined: Self = StObject.set(x, "EnableCustomerOwnedIp", js.undefined)
    
    inline def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProcessorFeatures(value: ProcessorFeatureList): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value*))
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setStorageThroughput(value: IntegerOptional): Self = StObject.set(x, "StorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setStorageThroughputUndefined: Self = StObject.set(x, "StorageThroughput", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTdeCredentialArn(value: String): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    inline def setTdeCredentialPassword(value: String): Self = StObject.set(x, "TdeCredentialPassword", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialPasswordUndefined: Self = StObject.set(x, "TdeCredentialPassword", js.undefined)
    
    inline def setUseDefaultProcessorFeatures(value: BooleanOptional): Self = StObject.set(x, "UseDefaultProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultProcessorFeaturesUndefined: Self = StObject.set(x, "UseDefaultProcessorFeatures", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
