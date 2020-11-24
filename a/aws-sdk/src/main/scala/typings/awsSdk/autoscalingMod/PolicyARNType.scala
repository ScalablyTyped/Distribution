package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyARNType extends js.Object {
  
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.autoscalingMod.Alarms] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
}
object PolicyARNType {
  
  @scala.inline
  def apply(): PolicyARNType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyARNType]
  }
  
  @scala.inline
  implicit class PolicyARNTypeOps[Self <: PolicyARNType] (val x: Self) extends AnyVal {
    
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
    def setAlarmsVarargs(value: Alarm*): Self = this.set("Alarms", js.Array(value :_*))
    
    @scala.inline
    def setAlarms(value: Alarms): Self = this.set("Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarms: Self = this.set("Alarms", js.undefined)
    
    @scala.inline
    def setPolicyARN(value: ResourceName): Self = this.set("PolicyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyARN: Self = this.set("PolicyARN", js.undefined)
  }
}
