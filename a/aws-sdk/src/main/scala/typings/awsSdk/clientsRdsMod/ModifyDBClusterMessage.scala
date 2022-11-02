package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterMessage extends StObject {
  
  /**
    * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster. Type: Integer Valid for: Multi-AZ DB clusters only
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates whether major version upgrades are allowed. Constraints: You must allow major version upgrades when specifying a value for the EngineVersion parameter that is a different major version than the DB cluster's current version. Valid for: Aurora DB clusters only
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window. The ApplyImmediately parameter only affects the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values. If the ApplyImmediately parameter is disabled, then changes to the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. By default, this parameter is disabled. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the maintenance window. By default, minor engine upgrades are applied automatically. Valid for: Multi-AZ DB clusters only
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).   Valid for: Aurora MySQL DB clusters only
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The number of days for which automated backups are retained. Specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB cluster. The values in the list depend on the DB engine being used.  RDS for MySQL  Possible values are error, general, and slowquery.  RDS for PostgreSQL  Possible values are postgresql and upgrade.  Aurora MySQL  Possible values are audit, error, general, and slowquery.  Aurora PostgreSQL  Possible value is postgresql. For more information about exporting CloudWatch Logs for Amazon RDS, see  Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide. For more information about exporting CloudWatch Logs for Amazon Aurora, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.CloudwatchLogsExportConfiguration] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default is not to copy them. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive. Constraints: This identifier must match the identifier of an existing DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBClusterIdentifier: String
  
  /**
    * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance classes and availability for your engine, see  DB Instance Class in the Amazon RDS User Guide. Valid for: Multi-AZ DB clusters only
    */
  var DBClusterInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB cluster parameter group to use for the DB cluster. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB parameter group to apply to all instances of the DB cluster.  When you apply a parameter group using the DBInstanceParameterGroupName parameter, the DB cluster isn't rebooted automatically. Also, parameter changes are applied immediately rather than during the next maintenance window.  Default: The existing name setting Constraints:   The DB parameter group must be in the same DB parameter group family as this DB cluster.   The DBInstanceParameterGroupName parameter is valid in combination with the AllowMajorVersionUpgrade parameter for a major version upgrade only.   Valid for: Aurora DB clusters only
    */
  var DBInstanceParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection isn't enabled. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Active Directory directory ID to move the DB cluster to. Specify none to remove the cluster from its current domain. The domain must be created prior to this operation. For more information, see Kerberos Authentication in the Amazon Aurora User Guide. Valid for: Aurora DB clusters only
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service. Valid for: Aurora DB clusters only
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
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
    * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless ApplyImmediately is enabled. To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for Aurora PostgreSQL, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for RDS for MySQL, use the following command:  aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for RDS for PostgreSQL, use the following command:  aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"  Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB instance in the Multi-AZ DB cluster. For information about valid IOPS values, see Amazon RDS Provisioned IOPS storage in the Amazon RDS User Guide. Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster. Valid for: Multi-AZ DB clusters only
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The new password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60  Valid for: Multi-AZ DB clusters only
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs. An example is arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, see To create an IAM role for Amazon RDS Enhanced Monitoring in the Amazon RDS User Guide.  If MonitoringInterval is set to a value other than 0, supply a MonitoringRoleArn value. Valid for: Multi-AZ DB clusters only
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The network type of the DB cluster. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB cluster. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon Aurora User Guide.  Valid for: Aurora DB clusters only
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2  Valid for: Aurora DB clusters only
    */
  var NewDBClusterIdentifier: js.UndefOr[String] = js.undefined
  
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
    * The port number on which the DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster. Valid for: Aurora DB clusters only
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter. The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region. To view the time blocks available, see  Backup window in the Amazon Aurora User Guide. Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.   Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide. Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in serverless DB engine mode. Valid for: Aurora DB clusters only
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.ScalingConfiguration] = js.undefined
  
  var ServerlessV2ScalingConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.ServerlessV2ScalingConfiguration] = js.undefined
  
  /**
    * Specifies the storage type to be associated with the DB cluster. Valid values: io1  When specified, a value for the Iops parameter is required. Default: io1  Valid for: Multi-AZ DB clusters only
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of VPC security groups that the DB cluster will belong to. Valid for: Aurora DB clusters and Multi-AZ DB clusters
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object ModifyDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): ModifyDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterMessage]
  }
  
  extension [Self <: ModifyDBClusterMessage](x: Self) {
    
    inline def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAllowMajorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AllowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "AllowMajorVersionUpgrade", js.undefined)
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setBacktrackWindow(value: LongOptional): Self = StObject.set(x, "BacktrackWindow", value.asInstanceOf[js.Any])
    
    inline def setBacktrackWindowUndefined: Self = StObject.set(x, "BacktrackWindow", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCloudwatchLogsExportConfiguration(value: CloudwatchLogsExportConfiguration): Self = StObject.set(x, "CloudwatchLogsExportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogsExportConfigurationUndefined: Self = StObject.set(x, "CloudwatchLogsExportConfiguration", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterInstanceClass(value: String): Self = StObject.set(x, "DBClusterInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBClusterInstanceClassUndefined: Self = StObject.set(x, "DBClusterInstanceClass", js.undefined)
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
    
    inline def setDBInstanceParameterGroupName(value: String): Self = StObject.set(x, "DBInstanceParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceParameterGroupNameUndefined: Self = StObject.set(x, "DBInstanceParameterGroupName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleName(value: String): Self = StObject.set(x, "DomainIAMRoleName", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleNameUndefined: Self = StObject.set(x, "DomainIAMRoleName", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEnableGlobalWriteForwarding(value: BooleanOptional): Self = StObject.set(x, "EnableGlobalWriteForwarding", value.asInstanceOf[js.Any])
    
    inline def setEnableGlobalWriteForwardingUndefined: Self = StObject.set(x, "EnableGlobalWriteForwarding", js.undefined)
    
    inline def setEnableHttpEndpoint(value: BooleanOptional): Self = StObject.set(x, "EnableHttpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEnableHttpEndpointUndefined: Self = StObject.set(x, "EnableHttpEndpoint", js.undefined)
    
    inline def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    inline def setEnablePerformanceInsights(value: BooleanOptional): Self = StObject.set(x, "EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsightsUndefined: Self = StObject.set(x, "EnablePerformanceInsights", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    inline def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setNewDBClusterIdentifier(value: String): Self = StObject.set(x, "NewDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewDBClusterIdentifierUndefined: Self = StObject.set(x, "NewDBClusterIdentifier", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
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
    
    inline def setScalingConfiguration(value: ScalingConfiguration): Self = StObject.set(x, "ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigurationUndefined: Self = StObject.set(x, "ScalingConfiguration", js.undefined)
    
    inline def setServerlessV2ScalingConfiguration(value: ServerlessV2ScalingConfiguration): Self = StObject.set(x, "ServerlessV2ScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerlessV2ScalingConfigurationUndefined: Self = StObject.set(x, "ServerlessV2ScalingConfiguration", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
