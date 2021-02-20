package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutScalingPolicyResponse extends StObject {
  
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
  implicit class PutScalingPolicyResponseMutableBuilder[Self <: PutScalingPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value :_*))
    
    @scala.inline
    def setPolicyARN(value: ResourceIdMaxLen1600): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
  }
}
