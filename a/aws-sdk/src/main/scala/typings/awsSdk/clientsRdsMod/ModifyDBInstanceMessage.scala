package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBInstanceMessage extends StObject {
  
  /**
    * The new amount of storage in gibibytes (GiB) to allocate for the DB instance. For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10% greater than the current value. For the valid values for allocated storage for each engine, see CreateDBInstance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. This setting doesn't apply to RDS Custom. Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that is a different major version than the DB instance's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB instance. By default, this parameter is disabled. If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next call to RebootDBInstance, or the next failure reboot. Review the table of parameters in Modifying a DB Instance in the Amazon RDS User Guide to see the impact of enabling or disabling ApplyImmediately for each modified parameter and to determine when the changes are applied.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the maintenance window. An outage occurs when all the following conditions are met:   The automatic upgrade is enabled for the maintenance window.   A newer minor version is available.   RDS has enabled automatic patching for the engine version.   If any of the preceding conditions isn't met, RDS applies the change as soon as possible and doesn't cause an outage. For an RDS Custom DB instance, set AutoMinorVersionUpgrade to false. Otherwise, the operation returns an error.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The automation mode of the RDS Custom DB instance: full or all paused. If full, the DB instance automates monitoring and instance recovery. If all paused, the instance pauses automation for the duration set by ResumeFullAutomationModeMinutes.
    */
  var AutomationMode: js.UndefOr[typings.awsSdk.clientsRdsMod.AutomationMode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup. This setting doesn't apply to RDS Custom.
    */
  var AwsBackupRecoveryPointArn: js.UndefOr[typings.awsSdk.clientsRdsMod.AwsBackupRecoveryPointArn] = js.undefined
  
  /**
    * The number of days to retain automated backups. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups.  Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few minutes, depending on the size and class of your DB instance.  These changes are applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the change is asynchronously applied as soon as possible.  Amazon Aurora  Not applicable. The retention period for automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Default: Uses existing setting Constraints:   It must be a value from 0 to 35. It can't be set to 0 if the DB instance is a source to read replicas. It can't be set to 0 for an RDS Custom for Oracle DB instance.   It can be specified for a MySQL read replica only if the source is running MySQL 5.6 or later.   It can be specified for a PostgreSQL read replica only if the source is running PostgreSQL 9.3.5.  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the certificate to associate with the DB instance. This setting doesn't apply to RDS Custom.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate. By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated until the DB instance is restarted.  Set this parameter only if you are not using SSL/TLS to connect to the DB instance.  If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to rotate your SSL/TLS certificate:   For more information about rotating your SSL/TLS certificate for RDS DB engines, see  Rotating Your SSL/TLS Certificate. in the Amazon RDS User Guide.    For more information about rotating your SSL/TLS certificate for Aurora DB engines, see  Rotating Your SSL/TLS Certificate in the Amazon Aurora User Guide.   This setting doesn't apply to RDS Custom.
    */
  var CertificateRotationRestart: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance. A change to the CloudwatchLogsExportConfiguration parameter is always applied to the DB instance immediately. Therefore, the ApplyImmediately parameter has no effect. This setting doesn't apply to RDS Custom.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typings.awsSdk.clientsRdsMod.CloudwatchLogsExportConfiguration] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags are not copied.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see ModifyDBCluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The new compute and memory capacity of the DB instance, for example db.m4.large. Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB instance classes in the Amazon RDS User Guide or Aurora DB instance classes in the Amazon Aurora User Guide. If you modify the DB instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is enabled for this request. This setting doesn't apply to RDS Custom for Oracle. Default: Uses existing setting
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied until you reboot the instance without failover. In this case, the DB instance isn't rebooted automatically, and the parameter changes aren't applied during the next maintenance window. However, if you modify dynamic parameters in the newly associated DB parameter group, these changes are applied immediately without a reboot. This setting doesn't apply to RDS Custom. Default: Uses existing setting Constraints: The DB parameter group must be in the same DB parameter group family as the DB instance.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the database accepts connections. The value of the DBPortNumber parameter must not match any of the port values specified for options in the option group for the DB instance. If you change the DBPortNumber value, your database restarts regardless of the value of the ApplyImmediately parameter. This setting doesn't apply to RDS Custom.  MySQL  Default: 3306  Valid values: 1150-65535   MariaDB  Default: 3306  Valid values: 1150-65535   PostgreSQL  Default: 5432  Valid values: 1150-65535  Type: Integer  Oracle  Default: 1521  Valid values: 1150-65535   SQL Server  Default: 1433  Valid values: 1150-65535 except 1234, 1434, 3260, 3343, 3389, 47001, and 49152-49156.  Amazon Aurora  Default: 3306  Valid values: 1150-65535 
    */
  var DBPortNumber: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage and the change is asynchronously applied as soon as possible. This setting doesn't apply to RDS Custom. Constraints:   If supplied, must match existing DBSecurityGroups.  
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined
  
  /**
    * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For more information, see Working with a DB instance in a VPC in the Amazon RDS User Guide. Changing the subnet group causes an outage during the change. The change is applied during the next maintenance window, unless you enable ApplyImmediately. This parameter doesn't apply to RDS Custom. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mydbsubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see  Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Active Directory directory ID to move the DB instance to. Specify none to remove the instance from its current domain. You must create the domain before this operation. Currently, you can create only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory Domain. For more information, see  Kerberos Authentication in the Amazon RDS User Guide. This setting doesn't apply to RDS Custom.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the IAM role to use when making API calls to the Directory Service. This setting doesn't apply to RDS Custom.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance. A CoIP provides local or external connectivity to resources in your Outpost subnets through your on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from outside of its virtual private cloud (VPC) on your local network. For more information about RDS on Outposts, see Working with Amazon RDS on Amazon Web Services Outposts in the Amazon RDS User Guide. For more information about CoIPs, see Customer-owned IP addresses in the Amazon Web Services Outposts User Guide.
    */
  var EnableCustomerOwnedIp: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts. By default, mapping isn't enabled. This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB cluster. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide.  This setting doesn't apply to RDS Custom.
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see Using Amazon Performance Insights in the Amazon RDS User Guide. This setting doesn't apply to RDS Custom.
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the default for that DB parameter group family. If you specify only a major version, Amazon RDS will update the DB instance to the default minor version if the current minor version is lower. For information about valid engine versions, see CreateDBInstance, or call DescribeDBEngineVersions. In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the PATCH_DB_FAILURE lifecycle.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. If you are migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change in storage type to take effect. If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24 hours, but the process can take up to several days in some cases. During the migration, the DB instance is available for use, but might experience performance degradation. While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance, and creating a DB snapshot of the instance. Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10% greater than the current value. Default: Uses existing setting
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The license model for the DB instance. This setting doesn't apply to RDS Custom. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * The new password for the master user. The password can include any printable ASCII character except "/", """, or "@". Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. Between the time of the request and the completion of the request, the MasterUserPassword element exists in the PendingModifiedValues element of the operation response. This setting doesn't apply to RDS Custom.  Amazon Aurora  Not applicable. The password for the master user is managed by the DB cluster. For more information, see ModifyDBCluster. Default: Uses existing setting  MariaDB  Constraints: Must contain from 8 to 41 characters.  Microsoft SQL Server  Constraints: Must contain from 8 to 128 characters.  MySQL  Constraints: Must contain from 8 to 41 characters.  Oracle  Constraints: Must contain from 8 to 30 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.  Amazon RDS API operations never return the password, so this action provides a way to regain access to a primary instance user if the password is lost. This includes restoring privileges that might have been accidentally revoked. 
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance. For more information about this setting, including limitations that apply to it, see  Managing capacity automatically with Amazon RDS storage autoscaling in the Amazon RDS User Guide. This setting doesn't apply to RDS Custom.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0, which is the default. If MonitoringRoleArn is specified, set MonitoringInterval to a value other than 0. This setting doesn't apply to RDS Custom. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, see To create an IAM role for Amazon RDS Enhanced Monitoring in the Amazon RDS User Guide.  If MonitoringInterval is set to a value other than 0, supply a MonitoringRoleArn value. This setting doesn't apply to RDS Custom.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage. The change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. This setting doesn't apply to RDS Custom.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The network type of the DB instance. Valid values:    IPV4     DUAL    The network type is determined by the DBSubnetGroup specified for the DB instance. A DBSubnetGroup can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon RDS User Guide. 
    */
  var NetworkType: js.UndefOr[String] = js.undefined
  
  /**
    * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier, an instance reboot occurs immediately if you enable ApplyImmediately, or will occur during the next maintenance window if you disable Apply Immediately. This value is stored as a lowercase string. This setting doesn't apply to RDS Custom. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates the DB instance should be associated with the specified option group. Changing this parameter doesn't result in an outage, with one exception. If the parameter change results in an option group that enables OEM, it can cause a brief period, lasting less than a second, during which new connections are rejected but existing connections aren't interrupted. The change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance after it is associated with a DB instance. This setting doesn't apply to RDS Custom.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for encryption of Performance Insights data. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region. This setting doesn't apply to RDS Custom.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:   7    month * 31, where month is a number of months from 1-23   731   For example, the following values are valid:   93 (3 months * 31)   341 (11 months * 31)   589 (19 months * 31)   731   If you specify a retention period such as 94, which isn't a valid value, RDS issues an error. This setting doesn't apply to RDS Custom.
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod parameter. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region. For more information, see Backup window in the Amazon RDS User Guide.   Amazon Aurora  Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   Must be in the format hh24:mi-hh24:mi   Must be in Universal Time Coordinated (UTC)   Must not conflict with the preferred maintenance window   Must be at least 30 minutes  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, then changing this parameter will cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. For more information, see Amazon RDS Maintenance Window in the Amazon RDS User Guide.  Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance. This setting doesn't apply to RDS Custom.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. This setting doesn't apply to RDS Custom. Default: 1 Valid Values: 0 - 15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address.  PubliclyAccessible only applies to DB instances in a VPC. The DB instance must be part of a public subnet and PubliclyAccessible must be enabled for it to be publicly accessible. Changes to the PubliclyAccessible parameter are applied immediately regardless of the value of the ApplyImmediately parameter.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that sets the open mode of a replica database to either mounted or read-only.  Currently, this parameter is only supported for Oracle DB instances.  Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload. For more information, see Working with Oracle Read Replicas for Amazon RDS in the Amazon RDS User Guide. This setting doesn't apply to RDS Custom.
    */
  var ReplicaMode: js.UndefOr[typings.awsSdk.clientsRdsMod.ReplicaMode] = js.undefined
  
  /**
    * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation. The minimum value is 60 (default). The maximum value is 1,440.
    */
  var ResumeFullAutomationModeMinutes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the storage throughput value for the DB instance. This setting doesn't apply to RDS Custom or Amazon Aurora.
    */
  var StorageThroughput: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the storage type to be associated with the DB instance. If you specify Provisioned IOPS (io1), you must also include a value for the Iops parameter. If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24 hours, but the process can take up to several days in some cases. During the migration, the DB instance is available for use, but might experience performance degradation. While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance, and creating a DB snapshot of the instance. Valid values: gp2 | gp3 | io1 | standard  Default: io1 if the Iops parameter is specified, otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
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
    * A list of Amazon EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon as possible. This setting doesn't apply to RDS Custom.  Amazon Aurora  Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   If supplied, must match existing VpcSecurityGroupIds.  
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object ModifyDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String): ModifyDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBInstanceMessage]
  }
  
  extension [Self <: ModifyDBInstanceMessage](x: Self) {
    
    inline def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAllowMajorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AllowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "AllowMajorVersionUpgrade", js.undefined)
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAutomationMode(value: AutomationMode): Self = StObject.set(x, "AutomationMode", value.asInstanceOf[js.Any])
    
    inline def setAutomationModeUndefined: Self = StObject.set(x, "AutomationMode", js.undefined)
    
    inline def setAwsBackupRecoveryPointArn(value: AwsBackupRecoveryPointArn): Self = StObject.set(x, "AwsBackupRecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setAwsBackupRecoveryPointArnUndefined: Self = StObject.set(x, "AwsBackupRecoveryPointArn", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setCertificateRotationRestart(value: BooleanOptional): Self = StObject.set(x, "CertificateRotationRestart", value.asInstanceOf[js.Any])
    
    inline def setCertificateRotationRestartUndefined: Self = StObject.set(x, "CertificateRotationRestart", js.undefined)
    
    inline def setCloudwatchLogsExportConfiguration(value: CloudwatchLogsExportConfiguration): Self = StObject.set(x, "CloudwatchLogsExportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogsExportConfigurationUndefined: Self = StObject.set(x, "CloudwatchLogsExportConfiguration", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
    inline def setDBPortNumber(value: IntegerOptional): Self = StObject.set(x, "DBPortNumber", value.asInstanceOf[js.Any])
    
    inline def setDBPortNumberUndefined: Self = StObject.set(x, "DBPortNumber", js.undefined)
    
    inline def setDBSecurityGroups(value: DBSecurityGroupNameList): Self = StObject.set(x, "DBSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupsUndefined: Self = StObject.set(x, "DBSecurityGroups", js.undefined)
    
    inline def setDBSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "DBSecurityGroups", js.Array(value*))
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleName(value: String): Self = StObject.set(x, "DomainIAMRoleName", value.asInstanceOf[js.Any])
    
    inline def setDomainIAMRoleNameUndefined: Self = StObject.set(x, "DomainIAMRoleName", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEnableCustomerOwnedIp(value: BooleanOptional): Self = StObject.set(x, "EnableCustomerOwnedIp", value.asInstanceOf[js.Any])
    
    inline def setEnableCustomerOwnedIpUndefined: Self = StObject.set(x, "EnableCustomerOwnedIp", js.undefined)
    
    inline def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    inline def setEnablePerformanceInsights(value: BooleanOptional): Self = StObject.set(x, "EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceInsightsUndefined: Self = StObject.set(x, "EnablePerformanceInsights", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMaxAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "MaxAllocatedStorage", js.undefined)
    
    inline def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    inline def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    inline def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setNewDBInstanceIdentifier(value: String): Self = StObject.set(x, "NewDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewDBInstanceIdentifierUndefined: Self = StObject.set(x, "NewDBInstanceIdentifier", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
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
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setReplicaMode(value: ReplicaMode): Self = StObject.set(x, "ReplicaMode", value.asInstanceOf[js.Any])
    
    inline def setReplicaModeUndefined: Self = StObject.set(x, "ReplicaMode", js.undefined)
    
    inline def setResumeFullAutomationModeMinutes(value: IntegerOptional): Self = StObject.set(x, "ResumeFullAutomationModeMinutes", value.asInstanceOf[js.Any])
    
    inline def setResumeFullAutomationModeMinutesUndefined: Self = StObject.set(x, "ResumeFullAutomationModeMinutes", js.undefined)
    
    inline def setStorageThroughput(value: IntegerOptional): Self = StObject.set(x, "StorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setStorageThroughputUndefined: Self = StObject.set(x, "StorageThroughput", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
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
