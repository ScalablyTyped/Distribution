package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbPendingModifiedValues extends StObject {
  
  /**
    * The new value of the allocated storage for the DB instance.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The new backup retention period for the DB instance.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The new CA certificate identifier for the DB instance.
    */
  var CaCertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The new DB instance class for the DB instance.
    */
  var DbInstanceClass: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The new DB instance identifier for the DB instance.
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the new subnet group for the DB instance.
    */
  var DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The new engine version for the DB instance.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The new provisioned IOPS value for the DB instance.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The new license model value for the DB instance.
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The new master user password for the DB instance.
    */
  var MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone deployment.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of log types that are being enabled or disabled.
    */
  var PendingCloudWatchLogsExports: js.UndefOr[AwsRdsPendingCloudWatchLogsExports] = js.undefined
  
  /**
    * The new port for the DB instance.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * Processor features that are being updated.
    */
  var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined
  
  /**
    * The new storage type for the DB instance.
    */
  var StorageType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbPendingModifiedValues {
  
  inline def apply(): AwsRdsDbPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbPendingModifiedValues]
  }
  
  extension [Self <: AwsRdsDbPendingModifiedValues](x: Self) {
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCaCertificateIdentifier(value: NonEmptyString): Self = StObject.set(x, "CaCertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateIdentifierUndefined: Self = StObject.set(x, "CaCertificateIdentifier", js.undefined)
    
    inline def setDbInstanceClass(value: NonEmptyString): Self = StObject.set(x, "DbInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceClassUndefined: Self = StObject.set(x, "DbInstanceClass", js.undefined)
    
    inline def setDbInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    inline def setDbSubnetGroupName(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "DbSubnetGroupName", js.undefined)
    
    inline def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUserPassword(value: NonEmptyString): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setPendingCloudWatchLogsExports(value: AwsRdsPendingCloudWatchLogsExports): Self = StObject.set(x, "PendingCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setPendingCloudWatchLogsExportsUndefined: Self = StObject.set(x, "PendingCloudWatchLogsExports", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value*))
    
    inline def setStorageType(value: NonEmptyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
