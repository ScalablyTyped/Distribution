package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alarm extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[XmlStringMaxLen255] = js.native
}
object Alarm {
  
  @scala.inline
  def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit class AlarmOps[Self <: Alarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlarmARN(value: ResourceName): Self = this.set("AlarmARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmARN: Self = this.set("AlarmARN", js.undefined)
    
    @scala.inline
    def setAlarmName(value: XmlStringMaxLen255): Self = this.set("AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmName: Self = this.set("AlarmName", js.undefined)
  }
}
