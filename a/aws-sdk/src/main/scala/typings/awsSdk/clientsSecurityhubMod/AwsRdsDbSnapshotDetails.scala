package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSnapshotDetails extends StObject {
  
  /**
    * The amount of storage (in gigabytes) to be initially allocated for the database instance.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB snapshot.
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A name for the DB instance.
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name or ARN of the DB snapshot that is used to restore the DB instance.
    */
  var DbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier for the source DB instance.
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the DB snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the database engine to use for this DB instance. Valid values are as follows:    aurora     aurora-mysql     aurora-postgresql     c     mariadb     mysql     oracle-ee     oracle-se     oracle-se1     oracle-se2     sqlserver-ee     sqlserver-ex     sqlserver-se     sqlserver-web   
    */
  var Engine: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the database engine.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether mapping of IAM accounts to database accounts is enabled.
    */
  var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was taken, was created.
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * If Encrypted is true, the KMS key identifier for the encrypted DB snapshot.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * License model information for the restored DB instance.
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The master user name for the DB snapshot.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The option group name for the DB snapshot.
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.undefined
  
  /**
    * The port that the database engine was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined
  
  /**
    * When the snapshot was taken in Coordinated Universal Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of the DB snapshot.
    */
  var SnapshotType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The DB snapshot ARN that the DB snapshot was copied from.
    */
  var SourceDbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services Region that the DB snapshot was created in or copied from.
    */
  var SourceRegion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of this DB snapshot.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The storage type associated with the DB snapshot. Valid values are as follows:    gp2     io1     standard   
    */
  var StorageType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The time zone of the DB snapshot.
    */
  var Timezone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The VPC ID associated with the DB snapshot.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSnapshotDetails {
  
  inline def apply(): AwsRdsDbSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSnapshotDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbSnapshotDetails] (val x: Self) extends AnyVal {
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDbInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    inline def setDbSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbSnapshotIdentifierUndefined: Self = StObject.set(x, "DbSnapshotIdentifier", js.undefined)
    
    inline def setDbiResourceId(value: NonEmptyString): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setEngine(value: NonEmptyString): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setInstanceCreateTime(value: NonEmptyString): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value*))
    
    inline def setSnapshotCreateTime(value: NonEmptyString): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    inline def setSnapshotType(value: NonEmptyString): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    inline def setSourceDbSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "SourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDbSnapshotIdentifierUndefined: Self = StObject.set(x, "SourceDbSnapshotIdentifier", js.undefined)
    
    inline def setSourceRegion(value: NonEmptyString): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageType(value: NonEmptyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTdeCredentialArn(value: NonEmptyString): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    inline def setTimezone(value: NonEmptyString): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
