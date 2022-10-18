package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * Information about the volume attachments.
    */
  var Attachments: js.UndefOr[VolumeAttachmentList] = js.undefined
  
  /**
    * The Availability Zone for the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The time stamp when volume creation was initiated.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the volume was created using fast snapshot restore.
    */
  var FastRestored: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Key Management Service (KMS) KMS key that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether Amazon EBS Multi-Attach is enabled.
    */
  var MultiAttachEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The snapshot from which the volume was created, if applicable.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume state.
    */
  var State: js.UndefOr[VolumeState] = js.undefined
  
  /**
    * Any tags assigned to the volume.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The throughput that the volume supports, in MiB/s.
    */
  var Throughput: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume type.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.clientsEc2Mod.VolumeType] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  extension [Self <: Volume](x: Self) {
    
    inline def setAttachments(value: VolumeAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: VolumeAttachment*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setFastRestored(value: Boolean): Self = StObject.set(x, "FastRestored", value.asInstanceOf[js.Any])
    
    inline def setFastRestoredUndefined: Self = StObject.set(x, "FastRestored", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMultiAttachEnabled(value: Boolean): Self = StObject.set(x, "MultiAttachEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiAttachEnabledUndefined: Self = StObject.set(x, "MultiAttachEnabled", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setState(value: VolumeState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setThroughput(value: Integer): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
