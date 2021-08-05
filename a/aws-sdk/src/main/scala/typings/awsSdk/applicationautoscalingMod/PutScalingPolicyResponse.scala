package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScalingPolicyResponse extends StObject {
  
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.applicationautoscalingMod.Alarms] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resulting scaling policy.
    */
  var PolicyARN: ResourceIdMaxLen1600
}
object PutScalingPolicyResponse {
  
  inline def apply(PolicyARN: ResourceIdMaxLen1600): PutScalingPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyARN = PolicyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyResponse]
  }
  
  extension [Self <: PutScalingPolicyResponse](x: Self) {
    
    inline def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value :_*))
    
    inline def setPolicyARN(value: ResourceIdMaxLen1600): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
  }
}
