package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutScalingPolicyResponse extends js.Object {
  
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.applicationautoscalingMod.Alarms] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resulting scaling policy.
    */
  var PolicyARN: ResourceIdMaxLen1600 = js.native
}
object PutScalingPolicyResponse {
  
  @scala.inline
  def apply(PolicyARN: ResourceIdMaxLen1600): PutScalingPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyARN = PolicyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyResponse]
  }
  
  @scala.inline
  implicit class PutScalingPolicyResponseOps[Self <: PutScalingPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicyARN(value: ResourceIdMaxLen1600): Self = this.set("PolicyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = this.set("Alarms", js.Array(value :_*))
    
    @scala.inline
    def setAlarms(value: Alarms): Self = this.set("Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarms: Self = this.set("Alarms", js.undefined)
  }
}
