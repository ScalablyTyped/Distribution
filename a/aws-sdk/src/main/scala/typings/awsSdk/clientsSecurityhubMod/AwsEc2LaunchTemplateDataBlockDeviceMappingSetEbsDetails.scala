package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails extends StObject {
  
  /**
    *  Indicates whether the EBS volume is deleted on instance termination. 
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If you're creating a volume from a snapshot, you can't specify an encryption value. 
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The number of I/O operations per second (IOPS). 
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the symmetric Key Management Service (KMS) customer managed key used for encryption. 
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the EBS snapshot. 
    */
  var SnapshotId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s. 
    */
  var Throughput: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. 
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The volume type. 
    */
  var VolumeType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails] (val x: Self) extends AnyVal {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSnapshotId(value: NonEmptyString): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setThroughput(value: Integer): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeSize(value: Integer): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: NonEmptyString): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
