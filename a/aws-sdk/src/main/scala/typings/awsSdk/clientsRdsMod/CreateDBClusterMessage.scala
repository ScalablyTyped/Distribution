package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterMessage extends StObject {
  
  /**
    * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster. This setting is required to create a Multi-AZ DB cluster. Valid for: Multi-AZ DB clusters only
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the maintenance window. By default, minor engine upgrades are applied automatically. Valid for: Multi-AZ DB clusters only
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A list of Availability Zones (AZs) where DB instances in the DB cluster can be created. For information on Amazon Web Services Regions and Availability Zones, see Choosing the Regions and Availability Zones in the Amazon Aurora User Guide. Valid for: Aurora DB clusters only
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsRdsMod.AvailabilityZones] = js.undefined
  
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).   Valid for: Aurora MySQL DB clusters only
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The number of days for which automated backups are retained. Default: 1 Constraints:   Must be a value from 1 to 35   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates that the DB cluster should be associated with the specified CharacterSet. Valid for: Aurora DB clusters only
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default is not to copy them. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBClusterIdentifier: String
  
  /**
    * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance classes and availability for your engine, see DB instance class in the Amazon RDS User Guide. This setting is required to create a Multi-AZ DB cluster. Valid for: Multi-AZ DB clusters only
    */
  var DBClusterInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then the default DB cluster parameter group for the specified DB engine and version is used. Constraints:   If supplied, must match the name of an existing DB cluster parameter group.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A DB subnet group to associate with this DB cluster. This setting is required to create a Multi-AZ DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mydbsubnetgroup  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't create a database in the DB cluster you are creating. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection isn't enabled. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Active Directory directory ID to create the DB cluster in. For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that connect to the DB cluster. For more information, see Kerberos authentication in the Amazon Aurora User Guide. Valid for: Aurora DB clusters only
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service. Valid for: Aurora DB clusters only
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on the DB engine being used.  RDS for MySQL  Possible values are error, general, and slowquery.  RDS for PostgreSQL  Possible values are postgresql and upgrade.  Aurora MySQL  Possible values are audit, error, general, and slowquery.  Aurora PostgreSQL  Possible value is postgresql. For more information about exporting CloudWatch Logs for Amazon RDS, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide. For more information about exporting CloudWatch Logs for Amazon Aurora, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an Aurora global database (GlobalCluster). By default, write operations are not allowed on Aurora DB clusters that are secondary clusters in an Aurora global database. You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value is used immediately if the primary is demoted by the FailoverGlobalCluster API operation, but it does nothing until then. Valid for: Aurora DB clusters only
    */
  var EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By default, the HTTP endpoint is disabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless v1 in the Amazon Aurora User Guide. Valid for: Aurora DB clusters only
    */
  var EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts. By default, mapping isn't enabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. Valid for: Aurora DB clusters only
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to turn on Performance Insights for the DB cluster. For more information, see  Using Amazon Performance Insights in the Amazon RDS User Guide. Valid for: Multi-AZ DB clusters only
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the database engine to be used for this DB cluster. Valid Values:    aurora (for MySQL 5.6-compatible Aurora)    aurora-mysql (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)    aurora-postgresql     mysql     postgres    Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Engine: String
  
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster. The parallelquery engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions, and version 2.09 and higher 2.x versions. The global engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and global engine mode isn't required for any 2.x versions. The multimaster engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a. The serverless engine mode only applies for Aurora Serverless v1 DB clusters. For Aurora PostgreSQL, the global engine mode isn't required, and both the parallelquery and the multimaster engine modes currently aren't supported. Limitations and requirements apply to some DB engine modes. For more information, see the following sections in the Amazon Aurora User Guide:    Limitations of Aurora Serverless v1     Requirements for Aurora Serverless v2     Limitations of Parallel Query     Limitations of Aurora Global Databases     Limitations of Multi-Master Clusters    Valid for: Aurora DB clusters only
    */
  var EngineMode: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the database engine to use. To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for Aurora PostgreSQL, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for RDS for MySQL, use the following command:  aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for RDS for PostgreSQL, use the following command:  aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"   Aurora MySQL  For information, see MySQL on Amazon RDS Versions in the Amazon Aurora User Guide.  Aurora PostgreSQL  For information, see Amazon Aurora PostgreSQL releases and engine versions in the Amazon Aurora User Guide.  MySQL  For information, see MySQL on Amazon RDS Versions in the Amazon RDS User Guide.  PostgreSQL  For information, see Amazon RDS for PostgreSQL versions and extensions in the Amazon RDS User Guide. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster. Valid for: Aurora DB clusters only
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB instance in the Multi-AZ DB cluster. For information about valid Iops values, see Amazon RDS Provisioned IOPS storage to improve performance in the Amazon RDS User Guide. This setting is required to create a Multi-AZ DB cluster. Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster. Valid for: Multi-AZ DB clusters only
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for an encrypted DB cluster. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN. When a KMS key isn't specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon RDS will use the KMS key used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.   If the StorageEncrypted parameter is enabled and ReplicationSourceIdentifier isn't specified, then Amazon RDS will use your default KMS key.   There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region. If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must set KmsKeyId to a KMS key identifier that is valid in the destination Amazon Web Services Region. This KMS key is used to encrypt the read replica in that Amazon Web Services Region. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the master user for the DB cluster. Constraints:   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60  Valid for: Multi-AZ DB clusters only
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs. An example is arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, see Setting up and enabling Enhanced Monitoring in the Amazon RDS User Guide. If MonitoringInterval is set to a value other than 0, supply a MonitoringRoleArn value. Valid for: Multi-AZ DB clusters only
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The network type of the DB cluster. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB cluster. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon Aurora User Guide.  Valid for: Aurora DB clusters only
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates that the DB cluster should be associated with the specified option group. DB clusters are associated with a default option group that can't be modified.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for encryption of Performance Insights data. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. If you don't specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region. Valid for: Multi-AZ DB clusters only
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:   7    month * 31, where month is a number of months from 1-23   731   For example, the following values are valid:   93 (3 months * 31)   341 (11 months * 31)   589 (19 months * 31)   731   If you specify a retention period such as 94, which isn't a valid value, RDS issues an error. Valid for: Multi-AZ DB clusters only
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The port number on which the instances in the DB cluster accept connections.  RDS for MySQL and Aurora MySQL  Default: 3306  Valid values: 1150-65535   RDS for PostgreSQL and Aurora PostgreSQL  Default: 5432  Valid values: 1150-65535  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL that contains a Signature Version 4 signed request for the CreateDBCluster operation to be called in the source Amazon Web Services Region where the DB cluster is replicated from. Specify PreSignedUrl only when you are performing cross-Region replication from an encrypted DB cluster. The presigned URL must be a valid request for the CreateDBCluster API operation that can run in the source Amazon Web Services Region that contains the encrypted DB cluster to copy. The presigned URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the KMS key to use to encrypt the copy of the DB cluster in the destination Amazon Web Services Region. This should refer to the same KMS key for both the CreateDBCluster operation that is called in the destination Amazon Web Services Region, and the operation contained in the presigned URL.    DestinationRegion - The name of the Amazon Web Services Region that Aurora read replica will be created in.    ReplicationSourceIdentifier - The DB cluster identifier for the encrypted DB cluster to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web Services Region, then your ReplicationSourceIdentifier would look like Example: arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (Amazon Web Services Signature Version 4) and  Signature Version 4 Signing Process.  If you are using an Amazon Web Services SDK tool or the CLI, you can specify SourceRegion (or --source-region for the CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a presigned URL that is a valid request for the operation that can run in the source Amazon Web Services Region.  Valid for: Aurora DB clusters onlyIf you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region. To view the time blocks available, see  Backup window in the Amazon Aurora User Guide. Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide. Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster is publicly accessible. When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it. When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a private IP address. Default: The default behavior varies depending on whether DBSubnetGroupName is specified. If DBSubnetGroupName isn't specified, and PubliclyAccessible isn't specified, the following applies:   If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is private.   If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.   If DBSubnetGroupName is specified, and PubliclyAccessible isn't specified, the following applies:   If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.   If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.   Valid for: Multi-AZ DB clusters only
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read replica. Valid for: Aurora DB clusters only
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * For DB clusters in serverless DB engine mode, the scaling properties of the DB cluster. Valid for: Aurora DB clusters only
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.ScalingConfiguration] = js.undefined
  
  var ServerlessV2ScalingConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.ServerlessV2ScalingConfiguration] = js.undefined
  
  /**
    * The ID of the region that contains the source for the read replica.
    */
  var SourceRegion: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster is encrypted. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the storage type to be associated with the DB cluster. This setting is required to create a Multi-AZ DB cluster. Valid values: io1  When specified, a value for the Iops parameter is required. Default: io1  Valid for: Multi-AZ DB clusters only
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * Tags to assign to the DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of EC2 VPC security groups to associate with this DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object CreateDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String, Engine: String): CreateDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterMessage]
  }
  
  extension [Self <: CreateDBClusterMessage](x: Self) {
    
    inline def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBacktrackWindow(value: LongOptional): Self = StObject.set(x, "BacktrackWindow", value.asInstanceOf[js.Any])
    
    inline def setBacktrackWindowUndefined: Self = StObject.set(x, "BacktrackWindow", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
    
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
    
    inline def setEnableGlobalWriteForwarding(value: BooleanOptional): Self = StObject.set(x, "EnableGlobalWriteForwarding", value.asInstanceOf[js.Any])
    
    inline def setEnableGlobalWriteForwardingUndefined: Self = StObject.set(x, "EnableGlobalWriteForwarding", js.undefined)
    
    inline def setEnableHttpEndpoint(value: BooleanOptional): Self = StObject.set(x, "EnableHttpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEnableHttpEndpointUndefined: Self = StObject.set(x, "EnableHttpEndpoint", js.undefined)
    
    inline def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    inline def setEnablePerformanceInsights(value: BooleanOptional): Self = StObject.set(x, "EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsightsUndefined: Self = StObject.set(x, "EnablePerformanceInsights", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineMode(value: String): Self = StObject.set(x, "EngineMode", value.asInstanceOf[js.Any])
    
    inline def setEngineModeUndefined: Self = StObject.set(x, "EngineMode", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    inline def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    inline def setPerformanceInsightsRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPreSignedUrl(value: String): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setReplicationSourceIdentifier(value: String): Self = StObject.set(x, "ReplicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationSourceIdentifierUndefined: Self = StObject.set(x, "ReplicationSourceIdentifier", js.undefined)
    
    inline def setScalingConfiguration(value: ScalingConfiguration): Self = StObject.set(x, "ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigurationUndefined: Self = StObject.set(x, "ScalingConfiguration", js.undefined)
    
    inline def setServerlessV2ScalingConfiguration(value: ServerlessV2ScalingConfiguration): Self = StObject.set(x, "ServerlessV2ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerlessV2ScalingConfigurationUndefined: Self = StObject.set(x, "ServerlessV2ScalingConfiguration", js.undefined)
    
    inline def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
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
