package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderConfig extends StObject {
  
  /**
    * The configuration details that consist of the credentials required (MediaUriSecretArn and MediaUriType) to access the media files streamed to the camera. 
    */
  var MediaSourceConfig: typings.awsSdk.clientsKinesisvideoMod.MediaSourceConfig
  
  /**
    * The configuration that consists of the ScheduleExpression and the DurationInMinutes details that specify the scheduling to record from a camera, or local media file, onto the Edge Agent. If the ScheduleExpression attribute is not provided, then the Edge Agent will always be set to recording mode.
    */
  var ScheduleConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ScheduleConfig] = js.undefined
}
object RecorderConfig {
  
  inline def apply(MediaSourceConfig: MediaSourceConfig): RecorderConfig = {
    val __obj = js.Dynamic.literal(MediaSourceConfig = MediaSourceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecorderConfig] (val x: Self) extends AnyVal {
    
    inline def setMediaSourceConfig(value: MediaSourceConfig): Self = StObject.set(x, "MediaSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfig(value: ScheduleConfig): Self = StObject.set(x, "ScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfigUndefined: Self = StObject.set(x, "ScheduleConfig", js.undefined)
  }
}
