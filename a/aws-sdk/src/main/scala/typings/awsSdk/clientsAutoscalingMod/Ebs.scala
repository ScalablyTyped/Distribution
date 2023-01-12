package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ebs extends StObject {
  
  /**
    * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value is true.
    */
  var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined
  
  /**
    * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption. For more information, see Supported instance types. If your AMI uses encrypted volumes, you can also only launch it on supported instance types.  If you are creating a volume from a snapshot, you cannot create an unencrypted volume from an encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch configuration. If you enable encryption by default, the EBS volumes that you create are always encrypted, either using the Amazon Web Services managed KMS key or a customer-managed KMS key, regardless of whether the snapshot was encrypted.  For more information, see Use Amazon Web Services KMS keys to encrypt Amazon EBS volumes in the Amazon EC2 Auto Scaling User Guide. 
    */
  var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.undefined
  
  /**
    * The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For gp3 and io1 volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting.  The following are the supported values for each volume type:     gp3: 3,000-16,000 IOPS    io1: 100-64,000 IOPS   For io1 volumes, we guarantee 64,000 IOPS only for Instances built on the Nitro System. Other instance families guarantee performance up to 32,000 IOPS.   Iops is supported when the volume type is gp3 or io1 and required only when the volume type is io1. (Not used with standard, gp2, st1, or sc1 volumes.) 
    */
  var Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined
  
  /**
    * The snapshot ID of the volume to use. You must specify either a VolumeSize or a SnapshotId.
    */
  var SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The throughput (MiBps) to provision for a gp3 volume.
    */
  var Throughput: js.UndefOr[BlockDeviceEbsThroughput] = js.undefined
  
  /**
    * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:     gp2 and gp3: 1-16,384    io1: 4-16,384    st1 and sc1: 125-16,384    standard: 1-1,024   You must specify either a SnapshotId or a VolumeSize. If you specify both SnapshotId and VolumeSize, the volume size must be equal or greater than the size of the snapshot.
    */
  var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined
  
  /**
    * The volume type. For more information, see Amazon EBS volume types in the Amazon EC2 User Guide for Linux Instances. Valid values: standard | io1 | gp2 | st1 | sc1 | gp3 
    */
  var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined
}
object Ebs {
  
  inline def apply(): Ebs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ebs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ebs] (val x: Self) extends AnyVal {
    
    inline def setDeleteOnTermination(value: BlockDeviceEbsDeleteOnTermination): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: BlockDeviceEbsEncrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setIops(value: BlockDeviceEbsIops): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setSnapshotId(value: XmlStringMaxLen255): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setThroughput(value: BlockDeviceEbsThroughput): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeSize(value: BlockDeviceEbsVolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: BlockDeviceEbsVolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
