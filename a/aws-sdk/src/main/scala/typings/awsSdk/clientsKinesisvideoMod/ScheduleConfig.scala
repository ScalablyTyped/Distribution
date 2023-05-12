package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfig extends StObject {
  
  /**
    * The total duration to record the media. If the ScheduleExpression attribute is provided, then the DurationInSeconds attribute should also be specified.
    */
  var DurationInSeconds: typings.awsSdk.clientsKinesisvideoMod.DurationInSeconds
  
  /**
    * The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media file, onto the Edge Agent. If the ScheduleExpression is not provided for the RecorderConfig, then the Edge Agent will always be set to recording mode. For more information about Quartz, refer to the  Cron Trigger Tutorial  page to understand the valid expressions and its use.
    */
  var ScheduleExpression: typings.awsSdk.clientsKinesisvideoMod.ScheduleExpression
}
object ScheduleConfig {
  
  inline def apply(DurationInSeconds: DurationInSeconds, ScheduleExpression: ScheduleExpression): ScheduleConfig = {
    val __obj = js.Dynamic.literal(DurationInSeconds = DurationInSeconds.asInstanceOf[js.Any], ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleConfig] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: DurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
  }
}
