package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletionConfig extends StObject {
  
  /**
    * The boolean value used to indicate whether or not you want to mark the media for deletion, once it has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the deletion configuration values are set to true, such as when the limit for the EdgeRetentionInHours, or the MaxLocalMediaSizeInMB, has been reached.  Since the default value is set to true, configure the uploader schedule such that the media files are not being deleted before they are initially uploaded to AWS cloud.
    */
  var DeleteAfterUpload: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.DeleteAfterUpload] = js.undefined
  
  /**
    * The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of the retention time is 720 hours, which translates to 30 days.
    */
  var EdgeRetentionInHours: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.EdgeRetentionInHours] = js.undefined
  
  /**
    * The value of the local size required in order to delete the edge configuration.
    */
  var LocalSizeConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.LocalSizeConfig] = js.undefined
}
object DeletionConfig {
  
  inline def apply(): DeletionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletionConfig] (val x: Self) extends AnyVal {
    
    inline def setDeleteAfterUpload(value: DeleteAfterUpload): Self = StObject.set(x, "DeleteAfterUpload", value.asInstanceOf[js.Any])
    
    inline def setDeleteAfterUploadUndefined: Self = StObject.set(x, "DeleteAfterUpload", js.undefined)
    
    inline def setEdgeRetentionInHours(value: EdgeRetentionInHours): Self = StObject.set(x, "EdgeRetentionInHours", value.asInstanceOf[js.Any])
    
    inline def setEdgeRetentionInHoursUndefined: Self = StObject.set(x, "EdgeRetentionInHours", js.undefined)
    
    inline def setLocalSizeConfig(value: LocalSizeConfig): Self = StObject.set(x, "LocalSizeConfig", value.asInstanceOf[js.Any])
    
    inline def setLocalSizeConfigUndefined: Self = StObject.set(x, "LocalSizeConfig", js.undefined)
  }
}
