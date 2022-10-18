package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoppingCondition extends StObject {
  
  /**
    * The maximum length of time, in seconds, that a training or compilation job can run before it is stopped. For compilation jobs, if the job does not complete during this time, a TimeOut error is generated. We recommend starting with 900 seconds and increasing as necessary based on your model. For all other jobs, if the job does not complete during this time, SageMaker ends the job. When RetryStrategy is specified in the job request, MaxRuntimeInSeconds specifies the maximum time for all of the attempts in total, not each individual attempt. The default value is 1 day. The maximum value is 28 days. The maximum time that a TrainingJob can run in total, including any time spent publishing metrics or archiving and uploading models after it has been stopped, is 30 days.
    */
  var MaxRuntimeInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxRuntimeInSeconds] = js.undefined
  
  /**
    * The maximum length of time, in seconds, that a managed Spot training job has to complete. It is the amount of time spent waiting for Spot capacity plus the amount of time the job can run. It must be equal to or greater than MaxRuntimeInSeconds. If the job does not complete during this time, SageMaker ends the job. When RetryStrategy is specified in the job request, MaxWaitTimeInSeconds specifies the maximum time for all of the attempts in total, not each individual attempt.
    */
  var MaxWaitTimeInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxWaitTimeInSeconds] = js.undefined
}
object StoppingCondition {
  
  inline def apply(): StoppingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoppingCondition]
  }
  
  extension [Self <: StoppingCondition](x: Self) {
    
    inline def setMaxRuntimeInSeconds(value: MaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxRuntimeInSecondsUndefined: Self = StObject.set(x, "MaxRuntimeInSeconds", js.undefined)
    
    inline def setMaxWaitTimeInSeconds(value: MaxWaitTimeInSeconds): Self = StObject.set(x, "MaxWaitTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitTimeInSecondsUndefined: Self = StObject.set(x, "MaxWaitTimeInSeconds", js.undefined)
  }
}
