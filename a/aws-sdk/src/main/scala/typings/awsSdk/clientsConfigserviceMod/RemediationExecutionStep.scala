package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationExecutionStep extends StObject {
  
  /**
    * An error message if the step was interrupted during execution.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the step.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the step started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The valid status of the step.
    */
  var State: js.UndefOr[RemediationExecutionStepState] = js.undefined
  
  /**
    * The time when the step stopped.
    */
  var StopTime: js.UndefOr[js.Date] = js.undefined
}
object RemediationExecutionStep {
  
  inline def apply(): RemediationExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemediationExecutionStep] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: RemediationExecutionStepState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "StopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "StopTime", js.undefined)
  }
}
