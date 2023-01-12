package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelStepsInfo extends StObject {
  
  /**
    * The reason for the failure if the CancelSteps request fails.
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
    */
  var Status: js.UndefOr[CancelStepsRequestStatus] = js.undefined
  
  /**
    * The encrypted StepId of a step.
    */
  var StepId: js.UndefOr[typings.awsSdk.clientsEmrMod.StepId] = js.undefined
}
object CancelStepsInfo {
  
  inline def apply(): CancelStepsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelStepsInfo] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: CancelStepsRequestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStepId(value: StepId): Self = StObject.set(x, "StepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "StepId", js.undefined)
  }
}
