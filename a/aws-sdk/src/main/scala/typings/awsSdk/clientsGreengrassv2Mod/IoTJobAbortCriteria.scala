package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTJobAbortCriteria extends StObject {
  
  /**
    * The action to perform when the criteria are met.
    */
  var action: IoTJobAbortAction
  
  /**
    * The type of job deployment failure that can cancel a job.
    */
  var failureType: IoTJobExecutionFailureType
  
  /**
    * The minimum number of things that receive the configuration before the job can cancel.
    */
  var minNumberOfExecutedThings: IoTJobMinimumNumberOfExecutedThings
  
  /**
    * The minimum percentage of failureType failures that occur before the job can cancel. This parameter supports up to two digits after the decimal (for example, you can specify 10.9 or 10.99, but not 10.999).
    */
  var thresholdPercentage: IoTJobAbortThresholdPercentage
}
object IoTJobAbortCriteria {
  
  inline def apply(
    action: IoTJobAbortAction,
    failureType: IoTJobExecutionFailureType,
    minNumberOfExecutedThings: IoTJobMinimumNumberOfExecutedThings,
    thresholdPercentage: IoTJobAbortThresholdPercentage
  ): IoTJobAbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings.asInstanceOf[js.Any], thresholdPercentage = thresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IoTJobAbortCriteria]
  }
  
  extension [Self <: IoTJobAbortCriteria](x: Self) {
    
    inline def setAction(value: IoTJobAbortAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: IoTJobExecutionFailureType): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setMinNumberOfExecutedThings(value: IoTJobMinimumNumberOfExecutedThings): Self = StObject.set(x, "minNumberOfExecutedThings", value.asInstanceOf[js.Any])
    
    inline def setThresholdPercentage(value: IoTJobAbortThresholdPercentage): Self = StObject.set(x, "thresholdPercentage", value.asInstanceOf[js.Any])
  }
}
