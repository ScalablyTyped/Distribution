package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateEbsBlockDeviceRequest extends StObject {
  
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If you are creating a volume from a snapshot, you can't specify an encryption value.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. The following are the supported values for each volume type:    gp3: 3,000-16,000 IOPS    io1: 100-64,000 IOPS    io2: 100-64,000 IOPS   For io1 and io2 volumes, we guarantee 64,000 IOPS only for Instances built on the Nitro System. Other instance families guarantee performance up to 32,000 IOPS. This parameter is supported for io1, io2, and gp3 volumes only. This parameter is not supported for gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN of the symmetric Key Management Service (KMS) CMK used for encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEc2Mod.KmsKeyId] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SnapshotId] = js.undefined
  
  /**
    * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s. Valid Range: Minimum value of 125. Maximum value of 1000.
    */
  var Throughput: js.UndefOr[Integer] = js.undefined
  
  /**
    * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. The following are the supported volumes sizes for each volume type:    gp2 and gp3: 1-16,384    io1 and io2: 4-16,384    st1 and sc1: 125-16,384    standard: 1-1,024  
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The volume type. For more information, see Amazon EBS volume types in the Amazon Elastic Compute Cloud User Guide.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.clientsEc2Mod.VolumeType] = js.undefined
}
object LaunchTemplateEbsBlockDeviceRequest {
  
  inline def apply(): LaunchTemplateEbsBlockDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateEbsBlockDeviceRequest]
  }
  
  extension [Self <: LaunchTemplateEbsBlockDeviceRequest](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setThroughput(value: Integer): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeSize(value: Integer): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
