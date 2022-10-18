package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceAutomatedBackup extends StObject {
  
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Availability Zone that the automated backup was created in. For information on Amazon Web Services Regions and Availability Zones, see Regions and Availability Zones.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The retention period for the automated backups.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies where automated backups are stored: Amazon Web Services Outposts or the Amazon Web Services Region.
    */
  var BackupTarget: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the automated backups.
    */
  var DBInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the replicated automated backups.
    */
  var DBInstanceAutomatedBackupsArn: js.UndefOr[String] = js.undefined
  
  /**
    * The list of replications to different Amazon Web Services Regions associated with the automated backup.
    */
  var DBInstanceAutomatedBackupsReplications: js.UndefOr[DBInstanceAutomatedBackupsReplicationList] = js.undefined
  
  /**
    * The customer id of the instance that is/was associated with the automated backup.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an Amazon Web Services Region.
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
    * True if mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides the date and time that the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IOPS (I/O operations per second) value for the automated backup.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key ID for an automated backup. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
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
    * The Amazon Web Services Region associated with the automated backup.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * Earliest and latest time an instance can be restored to.
    */
  var RestoreWindow: js.UndefOr[typings.awsSdk.clientsRdsMod.RestoreWindow] = js.undefined
  
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
object DBInstanceAutomatedBackup {
  
  inline def apply(): DBInstanceAutomatedBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackup]
  }
  
  extension [Self <: DBInstanceAutomatedBackup](x: Self) {
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setBackupTarget(value: String): Self = StObject.set(x, "BackupTarget", value.asInstanceOf[js.Any])
    
    inline def setBackupTargetUndefined: Self = StObject.set(x, "BackupTarget", js.undefined)
    
    inline def setDBInstanceArn(value: String): Self = StObject.set(x, "DBInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceArnUndefined: Self = StObject.set(x, "DBInstanceArn", js.undefined)
    
    inline def setDBInstanceAutomatedBackupsArn(value: String): Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsArnUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", js.undefined)
    
    inline def setDBInstanceAutomatedBackupsReplications(value: DBInstanceAutomatedBackupsReplicationList): Self = StObject.set(x, "DBInstanceAutomatedBackupsReplications", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsReplicationsUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackupsReplications", js.undefined)
    
    inline def setDBInstanceAutomatedBackupsReplicationsVarargs(value: DBInstanceAutomatedBackupsReplication*): Self = StObject.set(x, "DBInstanceAutomatedBackupsReplications", js.Array(value*))
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setInstanceCreateTime(value: js.Date): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setRestoreWindow(value: RestoreWindow): Self = StObject.set(x, "RestoreWindow", value.asInstanceOf[js.Any])
    
    inline def setRestoreWindowUndefined: Self = StObject.set(x, "RestoreWindow", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTdeCredentialArn(value: String): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
