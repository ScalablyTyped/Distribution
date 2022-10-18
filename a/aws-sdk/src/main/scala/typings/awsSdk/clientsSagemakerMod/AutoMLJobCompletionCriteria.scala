package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobCompletionCriteria extends StObject {
  
  /**
    * The maximum runtime, in seconds, an AutoML job has to complete. If an AutoML job exceeds the maximum runtime, the job is stopped automatically and its processing is ended gracefully. The AutoML job identifies the best model whose training was completed and marks it as the best-performing model. Any unfinished steps of the job, such as automatic one-click Autopilot model deployment, will not be completed. 
    */
  var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxAutoMLJobRuntimeInSeconds] = js.undefined
  
  /**
    * The maximum number of times a training job is allowed to run.
    */
  var MaxCandidates: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxCandidates] = js.undefined
  
  /**
    * The maximum time, in seconds, that each training job executed inside hyperparameter tuning is allowed to run as part of a hyperparameter tuning job. For more information, see the used by the action.
    */
  var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxRuntimePerTrainingJobInSeconds] = js.undefined
}
object AutoMLJobCompletionCriteria {
  
  inline def apply(): AutoMLJobCompletionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobCompletionCriteria]
  }
  
  extension [Self <: AutoMLJobCompletionCriteria](x: Self) {
    
    inline def setMaxAutoMLJobRuntimeInSeconds(value: MaxAutoMLJobRuntimeInSeconds): Self = StObject.set(x, "MaxAutoMLJobRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAutoMLJobRuntimeInSecondsUndefined: Self = StObject.set(x, "MaxAutoMLJobRuntimeInSeconds", js.undefined)
    
    inline def setMaxCandidates(value: MaxCandidates): Self = StObject.set(x, "MaxCandidates", value.asInstanceOf[js.Any])
    
    inline def setMaxCandidatesUndefined: Self = StObject.set(x, "MaxCandidates", js.undefined)
    
    inline def setMaxRuntimePerTrainingJobInSeconds(value: MaxRuntimePerTrainingJobInSeconds): Self = StObject.set(x, "MaxRuntimePerTrainingJobInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxRuntimePerTrainingJobInSecondsUndefined: Self = StObject.set(x, "MaxRuntimePerTrainingJobInSeconds", js.undefined)
  }
}
