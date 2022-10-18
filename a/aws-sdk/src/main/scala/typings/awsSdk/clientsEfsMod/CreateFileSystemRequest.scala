package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemRequest extends StObject {
  
  /**
    * Used to create a file system that uses One Zone storage classes. It specifies the Amazon Web Services Availability Zone in which to create the file system. Use the format us-east-1a to specify the Availability Zone. For more information about One Zone storage classes, see Using EFS storage classes in the Amazon EFS User Guide.  One Zone storage classes are not available in all Availability Zones in Amazon Web Services Regions where Amazon EFS is available. 
    */
  var AvailabilityZoneName: js.UndefOr[typings.awsSdk.clientsEfsMod.AvailabilityZoneName] = js.undefined
  
  /**
    * Specifies whether automatic backups are enabled on the file system that you are creating. Set the value to true to enable automatic backups. If you are creating a file system that uses One Zone storage classes, automatic backups are enabled by default. For more information, see Automatic backups in the Amazon EFS User Guide. Default is false. However, if you specify an AvailabilityZoneName, the default is true.  Backup is not available in all Amazon Web Services Regions where Amazon EFS is available. 
    */
  var Backup: js.UndefOr[typings.awsSdk.clientsEfsMod.Backup] = js.undefined
  
  /**
    * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
    */
  var CreationToken: typings.awsSdk.clientsEfsMod.CreationToken
  
  /**
    * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have the option of specifying an existing Key Management Service key (KMS key). If you don't specify a KMS key, then the default KMS key for Amazon EFS, /aws/elasticfilesystem, is used to protect the encrypted file system. 
    */
  var Encrypted: js.UndefOr[typings.awsSdk.clientsEfsMod.Encrypted] = js.undefined
  
  /**
    * The ID of the KMS key that you want to use to protect the encrypted file system. This parameter is required only if you want to use a non-default KMS key. If this parameter is not specified, the default KMS key for Amazon EFS is used. You can specify a KMS key ID using the following formats:   Key ID - A unique identifier of the key, for example 1234abcd-12ab-34cd-56ef-1234567890ab.   ARN - An Amazon Resource Name (ARN) for the key, for example arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias - A previously created display name for a key, for example alias/projectKey1.   Key alias ARN - An ARN for a key alias, for example arn:aws:kms:us-west-2:444455556666:alias/projectKey1.   If you use KmsKeyId, you must set the CreateFileSystemRequest$Encrypted parameter to true.  EFS accepts only symmetric KMS keys. You cannot use asymmetric KMS keys with Amazon EFS file systems. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEfsMod.KmsKeyId] = js.undefined
  
  /**
    * The performance mode of the file system. We recommend generalPurpose performance mode for most file systems. File systems using the maxIO performance mode can scale to higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed after the file system has been created.  The maxIO mode is not supported on file systems using One Zone storage classes. 
    */
  var PerformanceMode: js.UndefOr[typings.awsSdk.clientsEfsMod.PerformanceMode] = js.undefined
  
  /**
    * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. Valid values are 1-1024. Required if ThroughputMode is set to provisioned. The upper limit for throughput is 1024 MiB/s. To increase this limit, contact Amazon Web Services Support. For more information, see Amazon EFS quotas that you can increase in the Amazon EFS User Guide.
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typings.awsSdk.clientsEfsMod.ProvisionedThroughputInMibps] = js.undefined
  
  /**
    * Use to create one or more tags associated with the file system. Each tag is a user-defined key-value pair. Name your file system on creation by including a "Key":"Name","Value":"{value}" key-value pair. Each key must be unique. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsEfsMod.Tags] = js.undefined
  
  /**
    * Specifies the throughput mode for the file system, either bursting or provisioned. If you set ThroughputMode to provisioned, you must also set a value for ProvisionedThroughputInMibps. After you create the file system, you can decrease your file system's throughput in Provisioned Throughput mode or change between the throughput modes, as long as it’s been more than 24 hours since the last decrease or throughput mode change. For more information, see Specifying throughput with provisioned mode in the Amazon EFS User Guide.  Default is bursting.
    */
  var ThroughputMode: js.UndefOr[typings.awsSdk.clientsEfsMod.ThroughputMode] = js.undefined
}
object CreateFileSystemRequest {
  
  inline def apply(CreationToken: CreationToken): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(CreationToken = CreationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
  
  extension [Self <: CreateFileSystemRequest](x: Self) {
    
    inline def setAvailabilityZoneName(value: AvailabilityZoneName): Self = StObject.set(x, "AvailabilityZoneName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "AvailabilityZoneName", js.undefined)
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
    
    inline def setCreationToken(value: CreationToken): Self = StObject.set(x, "CreationToken", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPerformanceMode(value: PerformanceMode): Self = StObject.set(x, "PerformanceMode", value.asInstanceOf[js.Any])
    
    inline def setPerformanceModeUndefined: Self = StObject.set(x, "PerformanceMode", js.undefined)
    
    inline def setProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = StObject.set(x, "ProvisionedThroughputInMibps", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputInMibpsUndefined: Self = StObject.set(x, "ProvisionedThroughputInMibps", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setThroughputMode(value: ThroughputMode): Self = StObject.set(x, "ThroughputMode", value.asInstanceOf[js.Any])
    
    inline def setThroughputModeUndefined: Self = StObject.set(x, "ThroughputMode", js.undefined)
  }
}
