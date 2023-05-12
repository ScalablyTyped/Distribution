package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeConfig extends StObject {
  
  /**
    * The deletion configuration is made up of the retention time (EdgeRetentionInHours) and local size configuration (LocalSizeConfig) details that are used to make the deletion.
    */
  var DeletionConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.DeletionConfig] = js.undefined
  
  /**
    * The "Internet of Things (IoT) Thing" Arn of the stream.
    */
  var HubDeviceArn: typings.awsSdk.clientsKinesisvideoMod.HubDeviceArn
  
  /**
    * The recorder configuration consists of the local MediaSourceConfig details, that are used as credentials to access the local media files streamed on the camera. 
    */
  var RecorderConfig: typings.awsSdk.clientsKinesisvideoMod.RecorderConfig
  
  /**
    * The uploader configuration contains the ScheduleExpression details that are used to schedule upload jobs for the recorded media files from the Edge Agent to a Kinesis Video Stream.
    */
  var UploaderConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.UploaderConfig] = js.undefined
}
object EdgeConfig {
  
  inline def apply(HubDeviceArn: HubDeviceArn, RecorderConfig: RecorderConfig): EdgeConfig = {
    val __obj = js.Dynamic.literal(HubDeviceArn = HubDeviceArn.asInstanceOf[js.Any], RecorderConfig = RecorderConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeConfig] (val x: Self) extends AnyVal {
    
    inline def setDeletionConfig(value: DeletionConfig): Self = StObject.set(x, "DeletionConfig", value.asInstanceOf[js.Any])
    
    inline def setDeletionConfigUndefined: Self = StObject.set(x, "DeletionConfig", js.undefined)
    
    inline def setHubDeviceArn(value: HubDeviceArn): Self = StObject.set(x, "HubDeviceArn", value.asInstanceOf[js.Any])
    
    inline def setRecorderConfig(value: RecorderConfig): Self = StObject.set(x, "RecorderConfig", value.asInstanceOf[js.Any])
    
    inline def setUploaderConfig(value: UploaderConfig): Self = StObject.set(x, "UploaderConfig", value.asInstanceOf[js.Any])
    
    inline def setUploaderConfigUndefined: Self = StObject.set(x, "UploaderConfig", js.undefined)
  }
}
