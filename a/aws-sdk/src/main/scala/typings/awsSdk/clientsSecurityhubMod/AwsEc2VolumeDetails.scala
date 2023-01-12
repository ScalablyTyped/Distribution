package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VolumeDetails extends StObject {
  
  /**
    * The volume attachments.
    */
  var Attachments: js.UndefOr[AwsEc2VolumeAttachmentList] = js.undefined
  
  /**
    * Indicates when the volume was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The device name for the volume that is attached to the instance. 
    */
  var DeviceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies whether the volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the KMS key that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The snapshot from which the volume was created.
    */
  var SnapshotId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The volume state. Valid values are as follows:    available     creating     deleted     deleting     error     in-use   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the volume. 
    */
  var VolumeId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the volume was scanned or skipped. 
    */
  var VolumeScanStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The volume type. 
    */
  var VolumeType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VolumeDetails {
  
  inline def apply(): AwsEc2VolumeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VolumeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2VolumeDetails] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: AwsEc2VolumeAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AwsEc2VolumeAttachment*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setCreateTime(value: NonEmptyString): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setDeviceName(value: NonEmptyString): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSnapshotId(value: NonEmptyString): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVolumeId(value: NonEmptyString): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    inline def setVolumeScanStatus(value: NonEmptyString): Self = StObject.set(x, "VolumeScanStatus", value.asInstanceOf[js.Any])
    
    inline def setVolumeScanStatusUndefined: Self = StObject.set(x, "VolumeScanStatus", js.undefined)
    
    inline def setVolumeType(value: NonEmptyString): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
