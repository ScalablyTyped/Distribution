package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDiskContainer extends StObject {
  
  /**
    * The description of the disk image being imported.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK | RAW 
    */
  var Format: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..).
    */
  var Url: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsSdk.clientsEc2Mod.UserBucket] = js.undefined
}
object SnapshotDiskContainer {
  
  inline def apply(): SnapshotDiskContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDiskContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotDiskContainer] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setUserBucket(value: UserBucket): Self = StObject.set(x, "UserBucket", value.asInstanceOf[js.Any])
    
    inline def setUserBucketUndefined: Self = StObject.set(x, "UserBucket", js.undefined)
  }
}
