package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerConfig extends js.Object {
  
  /**
    *  Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the Scheduled trigger type. 
    */
  var triggerProperties: js.UndefOr[TriggerProperties] = js.native
  
  /**
    *  Specifies the type of flow trigger. This can be OnDemand, Scheduled, or Event. 
    */
  var triggerType: TriggerType = js.native
}
object TriggerConfig {
  
  @scala.inline
  def apply(triggerType: TriggerType): TriggerConfig = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerConfig]
  }
  
  @scala.inline
  implicit class TriggerConfigOps[Self <: TriggerConfig] (val x: Self) extends AnyVal {
    
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
    def setTriggerType(value: TriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerProperties(value: TriggerProperties): Self = this.set("triggerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerProperties: Self = this.set("triggerProperties", js.undefined)
  }
}
