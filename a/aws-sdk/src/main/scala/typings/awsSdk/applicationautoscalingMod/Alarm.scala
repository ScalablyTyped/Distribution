package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alarm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: ResourceId = js.native
  
  /**
    * The name of the alarm.
    */
  var AlarmName: ResourceId = js.native
}
object Alarm {
  
  @scala.inline
  def apply(AlarmARN: ResourceId, AlarmName: ResourceId): Alarm = {
    val __obj = js.Dynamic.literal(AlarmARN = AlarmARN.asInstanceOf[js.Any], AlarmName = AlarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit class AlarmMutableBuilder[Self <: Alarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmARN(value: ResourceId): Self = StObject.set(x, "AlarmARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmName(value: ResourceId): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
  }
}
