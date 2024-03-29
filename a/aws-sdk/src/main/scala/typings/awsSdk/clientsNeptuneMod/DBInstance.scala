package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstance extends StObject {
  
  /**
    * Not supported by Neptune.
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
    *  (Not supported by Neptune) 
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
    * The database name.
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
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBSubnetGroup] = js.undefined
  
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Region-unique, immutable identifier for the DB instance. This identifier is found in Amazon CloudTrail log entries whenever the Amazon KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether or not the DB instance has deletion protection enabled. The instance can't be deleted when deletion protection is enabled. See Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Not supported
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined
  
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsNeptuneMod.Endpoint] = js.undefined
  
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
    * True if Amazon Identity and Access Management (IAM) authentication is enabled, and otherwise false.
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
    *  Not supported: The encryption for DB instances is managed by the DB cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * License model information for this DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported by Neptune.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The ARN for the IAM role that permits Neptune to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined
  
  /**
    * Specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.clientsNeptuneMod.PendingModifiedValues] = js.undefined
  
  /**
    *  (Not supported by Neptune) 
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  (Not supported by Neptune) 
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod.
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of the existing primary instance. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * This flag should no longer be used.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains one or more identifiers of DB clusters that are Read Replicas of this DB instance.
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
    * Not supported: The encryption for DB instances is managed by the DB cluster.
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
    * Not supported.
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
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: Boolean): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setDBInstanceArn(value: String): Self = StObject.set(x, "DBInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceArnUndefined: Self = StObject.set(x, "DBInstanceArn", js.undefined)
    
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
    
    inline def setDbInstancePort(value: Integer): Self = StObject.set(x, "DbInstancePort", value.asInstanceOf[js.Any])
    
    inline def setDbInstancePortUndefined: Self = StObject.set(x, "DbInstancePort", js.undefined)
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
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
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    inline def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setOptionGroupMemberships(value: OptionGroupMembershipList): Self = StObject.set(x, "OptionGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupMembershipsUndefined: Self = StObject.set(x, "OptionGroupMemberships", js.undefined)
    
    inline def setOptionGroupMembershipsVarargs(value: OptionGroupMembership*): Self = StObject.set(x, "OptionGroupMemberships", js.Array(value*))
    
    inline def setPendingModifiedValues(value: PendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setPerformanceInsightsEnabled(value: BooleanOptional): Self = StObject.set(x, "PerformanceInsightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "PerformanceInsightsEnabled", js.undefined)
    
    inline def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
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
    
    inline def setReadReplicaSourceDBInstanceIdentifier(value: String): Self = StObject.set(x, "ReadReplicaSourceDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaSourceDBInstanceIdentifierUndefined: Self = StObject.set(x, "ReadReplicaSourceDBInstanceIdentifier", js.undefined)
    
    inline def setSecondaryAvailabilityZone(value: String): Self = StObject.set(x, "SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAvailabilityZoneUndefined: Self = StObject.set(x, "SecondaryAvailabilityZone", js.undefined)
    
    inline def setStatusInfos(value: DBInstanceStatusInfoList): Self = StObject.set(x, "StatusInfos", value.asInstanceOf[js.Any])
    
    inline def setStatusInfosUndefined: Self = StObject.set(x, "StatusInfos", js.undefined)
    
    inline def setStatusInfosVarargs(value: DBInstanceStatusInfo*): Self = StObject.set(x, "StatusInfos", js.Array(value*))
    
    inline def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTdeCredentialArn(value: String): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value*))
  }
}
