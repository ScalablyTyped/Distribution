package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: ResourceId
  
  /**
    * The name of the alarm.
    */
  var AlarmName: ResourceId
}
object Alarm {
  
  inline def apply(AlarmARN: ResourceId, AlarmName: ResourceId): Alarm = {
    val __obj = js.Dynamic.literal(AlarmARN = AlarmARN.asInstanceOf[js.Any], AlarmName = AlarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
  
  extension [Self <: Alarm](x: Self) {
    
    inline def setAlarmARN(value: ResourceId): Self = StObject.set(x, "AlarmARN", value.asInstanceOf[js.Any])
    
    inline def setAlarmName(value: ResourceId): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
  }
}
