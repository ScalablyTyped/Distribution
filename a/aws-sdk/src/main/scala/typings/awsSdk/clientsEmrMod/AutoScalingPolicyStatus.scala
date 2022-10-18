package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingPolicyStatus extends StObject {
  
  /**
    * Indicates the status of the automatic scaling policy.
    */
  var State: js.UndefOr[AutoScalingPolicyState] = js.undefined
  
  /**
    * The reason for a change in status.
    */
  var StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.undefined
}
object AutoScalingPolicyStatus {
  
  inline def apply(): AutoScalingPolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyStatus]
  }
  
  extension [Self <: AutoScalingPolicyStatus](x: Self) {
    
    inline def setState(value: AutoScalingPolicyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: AutoScalingPolicyStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
