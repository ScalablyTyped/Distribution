package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object Alarm {
  
  @scala.inline
  def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit class AlarmMutableBuilder[Self <: Alarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmARN(value: ResourceName): Self = StObject.set(x, "AlarmARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmARNUndefined: Self = StObject.set(x, "AlarmARN", js.undefined)
    
    @scala.inline
    def setAlarmName(value: XmlStringMaxLen255): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
  }
}
