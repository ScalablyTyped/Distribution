package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepStatus extends StObject {
  
  /**
    * The details for the step failure including reason, message, and log file path where the root cause was identified.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.clientsEmrMod.FailureDetails] = js.undefined
  
  /**
    * The execution state of the cluster step.
    */
  var State: js.UndefOr[StepState] = js.undefined
  
  /**
    * The reason for the step execution status change.
    */
  var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined
  
  /**
    * The timeline of the cluster step status over time.
    */
  var Timeline: js.UndefOr[StepTimeline] = js.undefined
}
object StepStatus {
  
  inline def apply(): StepStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepStatus]
  }
  
  extension [Self <: StepStatus](x: Self) {
    
    inline def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setState(value: StepState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: StepStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTimeline(value: StepTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
