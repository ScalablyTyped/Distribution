package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationStatus extends StObject {
  
  /**
    * The date and time the calculation completed processing.
    */
  var CompletionDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the calculation execution. A description of each state follows.  CREATING - The calculation is in the process of being created.  CREATED - The calculation has been created and is ready to run.  QUEUED - The calculation has been queued for processing.  RUNNING - The calculation is running.  CANCELING - A request to cancel the calculation has been received and the system is working to stop it.  CANCELED - The calculation is no longer running as the result of a cancel request.  COMPLETED - The calculation has completed without error.  FAILED - The calculation failed and is no longer running.
    */
  var State: js.UndefOr[CalculationExecutionState] = js.undefined
  
  /**
    * The reason for the calculation state change (for example, the calculation was canceled because the session was terminated).
    */
  var StateChangeReason: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The date and time the calculation was submitted for processing.
    */
  var SubmissionDateTime: js.UndefOr[js.Date] = js.undefined
}
object CalculationStatus {
  
  inline def apply(): CalculationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculationStatus] (val x: Self) extends AnyVal {
    
    inline def setCompletionDateTime(value: js.Date): Self = StObject.set(x, "CompletionDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateTimeUndefined: Self = StObject.set(x, "CompletionDateTime", js.undefined)
    
    inline def setState(value: CalculationExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: DescriptionString): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubmissionDateTime(value: js.Date): Self = StObject.set(x, "SubmissionDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubmissionDateTimeUndefined: Self = StObject.set(x, "SubmissionDateTime", js.undefined)
  }
}
