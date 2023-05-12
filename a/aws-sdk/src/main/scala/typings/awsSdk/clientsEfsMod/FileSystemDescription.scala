package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemDescription extends StObject {
  
  /**
    * The unique and consistent identifier of the Availability Zone in which the file system's One Zone storage classes exist. For example, use1-az1 is an Availability Zone ID for the us-east-1 Amazon Web Services Region, and it has the same location in every Amazon Web Services account.
    */
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.clientsEfsMod.AvailabilityZoneId] = js.undefined
  
  /**
    * Describes the Amazon Web Services Availability Zone in which the file system is located, and is valid only for file systems using One Zone storage classes. For more information, see Using EFS storage classes in the Amazon EFS User Guide.
    */
  var AvailabilityZoneName: js.UndefOr[typings.awsSdk.clientsEfsMod.AvailabilityZoneName] = js.undefined
  
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
    */
  var CreationTime: js.Date
  
  /**
    * The opaque string specified in the request.
    */
  var CreationToken: typings.awsSdk.clientsEfsMod.CreationToken
  
  /**
    * A Boolean value that, if true, indicates that the file system is encrypted.
    */
  var Encrypted: js.UndefOr[typings.awsSdk.clientsEfsMod.Encrypted] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the EFS file system, in the format arn:aws:elasticfilesystem:region:account-id:file-system/file-system-id . Example with sample data: arn:aws:elasticfilesystem:us-west-2:1111333322228888:file-system/fs-01234567 
    */
  var FileSystemArn: js.UndefOr[typings.awsSdk.clientsEfsMod.FileSystemArn] = js.undefined
  
  /**
    * The ID of the file system, assigned by Amazon EFS.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
  
  /**
    * The ID of an KMS key used to protect the encrypted file system.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEfsMod.KmsKeyId] = js.undefined
  
  /**
    * The lifecycle phase of the file system.
    */
  var LifeCycleState: typings.awsSdk.clientsEfsMod.LifeCycleState
  
  /**
    * You can add tags to a file system, including a Name tag. For more information, see CreateFileSystem. If the file system has a Name tag, Amazon EFS returns the value in this field. 
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  /**
    * The current number of mount targets that the file system has. For more information, see CreateMountTarget.
    */
  var NumberOfMountTargets: MountTargetCount
  
  /**
    * The Amazon Web Services account that created the file system.
    */
  var OwnerId: AwsAccountId
  
  /**
    * The performance mode of the file system.
    */
  var PerformanceMode: typings.awsSdk.clientsEfsMod.PerformanceMode
  
  /**
    * The amount of provisioned throughput, measured in MiB/s, for the file system. Valid for file systems using ThroughputMode set to provisioned.
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typings.awsSdk.clientsEfsMod.ProvisionedThroughputInMibps] = js.undefined
  
  /**
    * The latest known metered size (in bytes) of data stored in the file system, in its Value field, and the time at which that size was determined in its Timestamp field. The Timestamp value is the integer number of seconds since 1970-01-01T00:00:00Z. The SizeInBytes value doesn't represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, SizeInBytes represents actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was at any point in time. 
    */
  var SizeInBytes: FileSystemSize
  
  /**
    * The tags associated with the file system, presented as an array of Tag objects.
    */
  var Tags: typings.awsSdk.clientsEfsMod.Tags
  
  /**
    * Displays the file system's throughput mode. For more information, see Throughput modes in the Amazon EFS User Guide. 
    */
  var ThroughputMode: js.UndefOr[typings.awsSdk.clientsEfsMod.ThroughputMode] = js.undefined
}
object FileSystemDescription {
  
  inline def apply(
    CreationTime: js.Date,
    CreationToken: CreationToken,
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    NumberOfMountTargets: MountTargetCount,
    OwnerId: AwsAccountId,
    PerformanceMode: PerformanceMode,
    SizeInBytes: FileSystemSize,
    Tags: Tags
  ): FileSystemDescription = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], CreationToken = CreationToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], NumberOfMountTargets = NumberOfMountTargets.asInstanceOf[js.Any], OwnerId = OwnerId.asInstanceOf[js.Any], PerformanceMode = PerformanceMode.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemDescription] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneName(value: AvailabilityZoneName): Self = StObject.set(x, "AvailabilityZoneName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "AvailabilityZoneName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationToken(value: CreationToken): Self = StObject.set(x, "CreationToken", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setFileSystemArn(value: FileSystemArn): Self = StObject.set(x, "FileSystemArn", value.asInstanceOf[js.Any])
    
    inline def setFileSystemArnUndefined: Self = StObject.set(x, "FileSystemArn", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLifeCycleState(value: LifeCycleState): Self = StObject.set(x, "LifeCycleState", value.asInstanceOf[js.Any])
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNumberOfMountTargets(value: MountTargetCount): Self = StObject.set(x, "NumberOfMountTargets", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: AwsAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setPerformanceMode(value: PerformanceMode): Self = StObject.set(x, "PerformanceMode", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = StObject.set(x, "ProvisionedThroughputInMibps", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputInMibpsUndefined: Self = StObject.set(x, "ProvisionedThroughputInMibps", js.undefined)
    
    inline def setSizeInBytes(value: FileSystemSize): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setThroughputMode(value: ThroughputMode): Self = StObject.set(x, "ThroughputMode", value.asInstanceOf[js.Any])
    
    inline def setThroughputModeUndefined: Self = StObject.set(x, "ThroughputMode", js.undefined)
  }
}
