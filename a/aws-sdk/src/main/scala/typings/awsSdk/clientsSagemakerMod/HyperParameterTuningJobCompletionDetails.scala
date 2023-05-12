package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobCompletionDetails extends StObject {
  
  /**
    * The time in timestamp format that AMT detected model convergence, as defined by a lack of significant improvement over time based on criteria developed over a wide range of diverse benchmarking tests.
    */
  var ConvergenceDetectedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of training jobs launched by a tuning job that are not improving (1% or less) as measured by model performance evaluated against an objective function.
    */
  var NumberOfTrainingJobsObjectiveNotImproving: js.UndefOr[Integer] = js.undefined
}
object HyperParameterTuningJobCompletionDetails {
  
  inline def apply(): HyperParameterTuningJobCompletionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobCompletionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperParameterTuningJobCompletionDetails] (val x: Self) extends AnyVal {
    
    inline def setConvergenceDetectedTime(value: js.Date): Self = StObject.set(x, "ConvergenceDetectedTime", value.asInstanceOf[js.Any])
    
    inline def setConvergenceDetectedTimeUndefined: Self = StObject.set(x, "ConvergenceDetectedTime", js.undefined)
    
    inline def setNumberOfTrainingJobsObjectiveNotImproving(value: Integer): Self = StObject.set(x, "NumberOfTrainingJobsObjectiveNotImproving", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTrainingJobsObjectiveNotImprovingUndefined: Self = StObject.set(x, "NumberOfTrainingJobsObjectiveNotImproving", js.undefined)
  }
}
