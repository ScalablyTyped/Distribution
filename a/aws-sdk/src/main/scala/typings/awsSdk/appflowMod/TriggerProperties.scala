package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerProperties extends js.Object {
  
  /**
    *  Specifies the configuration details of a schedule-triggered flow as defined by the user. 
    */
  var Scheduled: js.UndefOr[ScheduledTriggerProperties] = js.native
}
object TriggerProperties {
  
  @scala.inline
  def apply(): TriggerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerProperties]
  }
  
  @scala.inline
  implicit class TriggerPropertiesOps[Self <: TriggerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScheduled(value: ScheduledTriggerProperties): Self = this.set("Scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduled: Self = this.set("Scheduled", js.undefined)
  }
}
