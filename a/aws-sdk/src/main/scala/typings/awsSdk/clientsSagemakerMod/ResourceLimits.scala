package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceLimits extends StObject {
  
  /**
    * The maximum number of training jobs that a hyperparameter tuning job can launch.
    */
  var MaxNumberOfTrainingJobs: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxNumberOfTrainingJobs] = js.undefined
  
  /**
    * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
    */
  var MaxParallelTrainingJobs: typings.awsSdk.clientsSagemakerMod.MaxParallelTrainingJobs
  
  /**
    * The maximum time in seconds that a hyperparameter tuning job can run.
    */
  var MaxRuntimeInSeconds: js.UndefOr[HyperParameterTuningMaxRuntimeInSeconds] = js.undefined
}
object ResourceLimits {
  
  inline def apply(MaxParallelTrainingJobs: MaxParallelTrainingJobs): ResourceLimits = {
    val __obj = js.Dynamic.literal(MaxParallelTrainingJobs = MaxParallelTrainingJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    
    inline def setMaxNumberOfTrainingJobs(value: MaxNumberOfTrainingJobs): Self = StObject.set(x, "MaxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfTrainingJobsUndefined: Self = StObject.set(x, "MaxNumberOfTrainingJobs", js.undefined)
    
    inline def setMaxParallelTrainingJobs(value: MaxParallelTrainingJobs): Self = StObject.set(x, "MaxParallelTrainingJobs", value.asInstanceOf[js.Any])
    
    inline def setMaxRuntimeInSeconds(value: HyperParameterTuningMaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxRuntimeInSecondsUndefined: Self = StObject.set(x, "MaxRuntimeInSeconds", js.undefined)
  }
}
