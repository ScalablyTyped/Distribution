package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingModifiedValues extends StObject {
  
  /**
    * The allocated storage size for the DB instance specified in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The automation mode of the RDS Custom DB instance: full or all-paused. If full, the DB instance automates monitoring and instance recovery. If all-paused, the instance pauses automation for the duration set by --resume-full-automation-mode-minutes.
    */
  var AutomationMode: js.UndefOr[typings.awsSdk.clientsRdsMod.AutomationMode] = js.undefined
  
  /**
    * The number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the CA certificate for the DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the compute and memory capacity class for the DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The database identifier for the DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The DB subnet group for the DB instance.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Provisioned IOPS value for the DB instance.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * The master credentials for the DB instance.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  
  var PendingCloudwatchLogsExports: js.UndefOr[typings.awsSdk.clientsRdsMod.PendingCloudwatchLogsExports] = js.undefined
  
  /**
    * The port for the DB instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  
  /**
    * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation. The minimum value is 60 (default). The maximum value is 1,440.
    */
  var ResumeFullAutomationModeTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The storage type of the DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
}
object PendingModifiedValues {
  
  inline def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  extension [Self <: PendingModifiedValues](x: Self) {
    
    inline def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAutomationMode(value: AutomationMode): Self = StObject.set(x, "AutomationMode", value.asInstanceOf[js.Any])
    
    inline def setAutomationModeUndefined: Self = StObject.set(x, "AutomationMode", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIAMDatabaseAuthenticationEnabled(value: BooleanOptional): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setPendingCloudwatchLogsExports(value: PendingCloudwatchLogsExports): Self = StObject.set(x, "PendingCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setPendingCloudwatchLogsExportsUndefined: Self = StObject.set(x, "PendingCloudwatchLogsExports", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProcessorFeatures(value: ProcessorFeatureList): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value*))
    
    inline def setResumeFullAutomationModeTime(value: js.Date): Self = StObject.set(x, "ResumeFullAutomationModeTime", value.asInstanceOf[js.Any])
    
    inline def setResumeFullAutomationModeTimeUndefined: Self = StObject.set(x, "ResumeFullAutomationModeTime", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
