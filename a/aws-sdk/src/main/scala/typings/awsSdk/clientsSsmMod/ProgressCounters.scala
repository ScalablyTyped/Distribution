package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressCounters extends StObject {
  
  /**
    * The total number of steps that the system cancelled in all specified Amazon Web Services Regions and Amazon Web Services accounts for the current Automation execution.
    */
  var CancelledSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps that failed to run in all specified Amazon Web Services Regions and Amazon Web Services accounts for the current Automation execution.
    */
  var FailedSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps that successfully completed in all specified Amazon Web Services Regions and Amazon Web Services accounts for the current Automation execution.
    */
  var SuccessSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps that timed out in all specified Amazon Web Services Regions and Amazon Web Services accounts for the current Automation execution.
    */
  var TimedOutSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps run in all specified Amazon Web Services Regions and Amazon Web Services accounts for the current Automation execution.
    */
  var TotalSteps: js.UndefOr[Integer] = js.undefined
}
object ProgressCounters {
  
  inline def apply(): ProgressCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressCounters]
  }
  
  extension [Self <: ProgressCounters](x: Self) {
    
    inline def setCancelledSteps(value: Integer): Self = StObject.set(x, "CancelledSteps", value.asInstanceOf[js.Any])
    
    inline def setCancelledStepsUndefined: Self = StObject.set(x, "CancelledSteps", js.undefined)
    
    inline def setFailedSteps(value: Integer): Self = StObject.set(x, "FailedSteps", value.asInstanceOf[js.Any])
    
    inline def setFailedStepsUndefined: Self = StObject.set(x, "FailedSteps", js.undefined)
    
    inline def setSuccessSteps(value: Integer): Self = StObject.set(x, "SuccessSteps", value.asInstanceOf[js.Any])
    
    inline def setSuccessStepsUndefined: Self = StObject.set(x, "SuccessSteps", js.undefined)
    
    inline def setTimedOutSteps(value: Integer): Self = StObject.set(x, "TimedOutSteps", value.asInstanceOf[js.Any])
    
    inline def setTimedOutStepsUndefined: Self = StObject.set(x, "TimedOutSteps", js.undefined)
    
    inline def setTotalSteps(value: Integer): Self = StObject.set(x, "TotalSteps", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsUndefined: Self = StObject.set(x, "TotalSteps", js.undefined)
  }
}
