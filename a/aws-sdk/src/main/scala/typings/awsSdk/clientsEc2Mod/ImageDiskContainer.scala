package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDiskContainer extends StObject {
  
  /**
    * The description of the disk image.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The block device mapping for the disk.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the disk image being imported. Valid values: OVA | VHD | VHDX | VMDK | RAW 
    */
  var Format: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the EBS snapshot to be used for importing the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SnapshotId] = js.undefined
  
  /**
    * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an Amazon S3 URL (s3://..)
    */
  var Url: js.UndefOr[String] = js.undefined
  
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsSdk.clientsEc2Mod.UserBucket] = js.undefined
}
object ImageDiskContainer {
  
  inline def apply(): ImageDiskContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDiskContainer]
  }
  
  extension [Self <: ImageDiskContainer](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setUserBucket(value: UserBucket): Self = StObject.set(x, "UserBucket", value.asInstanceOf[js.Any])
    
    inline def setUserBucketUndefined: Self = StObject.set(x, "UserBucket", js.undefined)
  }
}
