package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploaderConfig extends StObject {
  
  /**
    * The configuration that consists of the ScheduleExpression and the DurationInMinutesdetails that specify the scheduling to record from a camera, or local media file, onto the Edge Agent. If the ScheduleExpression is not provided, then the Edge Agent will always be in recording mode.
    */
  var ScheduleConfig: typings.awsSdk.clientsKinesisvideoMod.ScheduleConfig
}
object UploaderConfig {
  
  inline def apply(ScheduleConfig: ScheduleConfig): UploaderConfig = {
    val __obj = js.Dynamic.literal(ScheduleConfig = ScheduleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploaderConfig] (val x: Self) extends AnyVal {
    
    inline def setScheduleConfig(value: ScheduleConfig): Self = StObject.set(x, "ScheduleConfig", value.asInstanceOf[js.Any])
  }
}
