package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterFromSnapshotMessage extends StObject {
  
  /**
    * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created. Valid for: Aurora DB clusters only
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsRdsMod.AvailabilityZones] = js.undefined
  
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0.  Currently, Backtrack is only supported for Aurora MySQL DB clusters.  Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).   Valid for: Aurora DB clusters only
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB cluster. The default is not to copy them. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBClusterIdentifier: String
  
  /**
    * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Valid for: Multi-AZ DB clusters only
    */
  var DBClusterInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default DB cluster parameter group for the specified engine is used. Constraints:   If supplied, must match the name of an existing default DB cluster parameter group.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB subnet group to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DB subnet group. Example: mydbsubnetgroup  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The database name for the restored DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection isn't enabled. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain. For more information, see  Kerberos Authentication in the Amazon RDS User Guide. Valid for: Aurora DB clusters only
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service. Valid for: Aurora DB clusters only
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list depend on the DB engine being used.  RDS for MySQL  Possible values are error, general, and slowquery.  RDS for PostgreSQL  Possible values are postgresql and upgrade.  Aurora MySQL  Possible values are audit, error, general, and slowquery.  Aurora PostgreSQL  Possible value is postgresql. For more information about exporting CloudWatch Logs for Amazon RDS, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide. For more information about exporting CloudWatch Logs for Amazon Aurora, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts. By default, mapping isn't enabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. Valid for: Aurora DB clusters only
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The database engine to use for the new DB cluster. Default: The same as source Constraint: Must be compatible with the engine of the source Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Engine: String
  
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster. For more information, see  CreateDBCluster. Valid for: Aurora DB clusters only
    */
  var EngineMode: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the database engine to use for the new DB cluster. To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for Aurora PostgreSQL, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for RDS for MySQL, use the following command:  aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for RDS for PostgreSQL, use the following command:  aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"   Aurora MySQL  See MySQL on Amazon RDS Versions in the Amazon Aurora User Guide.  Aurora PostgreSQL  See Amazon Aurora PostgreSQL releases and engine versions in the Amazon Aurora User Guide.  MySQL  See MySQL on Amazon RDS Versions in the Amazon RDS User Guide.   PostgreSQL  See Amazon RDS for PostgreSQL versions and extensions in the Amazon RDS User Guide.  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB instance in the Multi-AZ DB cluster. For information about valid Iops values, see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide. Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster snapshot. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN. When you don't specify a value for the KmsKeyId parameter, then the following occurs:   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier isn't encrypted, then the restored DB cluster isn't encrypted.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The network type of the DB cluster. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB cluster. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon Aurora User Guide.  Valid for: Aurora DB clusters only
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the option group to use for the restored DB cluster. DB clusters are associated with a default option group that can't be modified.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the new DB cluster accepts connections. Constraints: This value must be 1150-65535  Default: The same port as the original DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster is publicly accessible. When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses. That public access is not permitted if the security group assigned to the DB cluster doesn't permit it. When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a private IP address. Default: The default behavior varies depending on whether DBSubnetGroupName is specified. If DBSubnetGroupName isn't specified, and PubliclyAccessible isn't specified, the following applies:   If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is private.   If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.   If DBSubnetGroupName is specified, and PubliclyAccessible isn't specified, the following applies:   If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.   If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * For DB clusters in serverless DB engine mode, the scaling properties of the DB cluster. Valid for: Aurora DB clusters only
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.ScalingConfiguration] = js.undefined
  
  var ServerlessV2ScalingConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.ServerlessV2ScalingConfiguration] = js.undefined
  
  /**
    * The identifier for the DB snapshot or DB cluster snapshot to restore from. You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can use only the ARN to specify a DB snapshot. Constraints:   Must match the identifier of an existing Snapshot.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var SnapshotIdentifier: String
  
  /**
    * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster. Valid values: io1  When specified, a value for the Iops parameter is required. Default: io1  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to be assigned to the restored DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of VPC security groups that the new DB cluster will belong to. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object RestoreDBClusterFromSnapshotMessage {
  
  inline def apply(DBClusterIdentifier: String, Engine: String, SnapshotIdentifier: String): RestoreDBClusterFromSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotMessage]
  }
  
  extension [Self <: RestoreDBClusterFromSnapshotMessage](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBacktrackWindow(value: LongOptional): Self = StObject.set(x, "BacktrackWindow", value.asInstanceOf[js.Any])
    
    inline def setBacktrackWindowUndefined: Self = StObject.set(x, "BacktrackWindow", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterInstanceClass(value: String): Self = StObject.set(x, "DBClusterInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBClusterInstanceClassUndefined: Self = StObject.set(x, "DBClusterInstanceClass", js.undefined)
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleName(value: String): Self = StObject.set(x, "DomainIAMRoleName", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleNameUndefined: Self = StObject.set(x, "DomainIAMRoleName", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEnableCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnableCloudwatchLogsExports", js.undefined)
    
    inline def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnableCloudwatchLogsExports", js.Array(value*))
    
    inline def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineMode(value: String): Self = StObject.set(x, "EngineMode", value.asInstanceOf[js.Any])
    
    inline def setEngineModeUndefined: Self = StObject.set(x, "EngineMode", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setScalingConfiguration(value: ScalingConfiguration): Self = StObject.set(x, "ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigurationUndefined: Self = StObject.set(x, "ScalingConfiguration", js.undefined)
    
    inline def setServerlessV2ScalingConfiguration(value: ServerlessV2ScalingConfiguration): Self = StObject.set(x, "ServerlessV2ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerlessV2ScalingConfigurationUndefined: Self = StObject.set(x, "ServerlessV2ScalingConfiguration", js.undefined)
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
