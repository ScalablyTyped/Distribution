package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TuningJobCompletionCriteria extends StObject {
  
  /**
    * A flag to stop your hyperparameter tuning job if model performance fails to improve as evaluated against an objective function.
    */
  var BestObjectiveNotImproving: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BestObjectiveNotImproving] = js.undefined
  
  /**
    * A flag to top your hyperparameter tuning job if automatic model tuning (AMT) has detected that your model has converged as evaluated against your objective function.
    */
  var ConvergenceDetected: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ConvergenceDetected] = js.undefined
  
  /**
    * The value of the objective metric.
    */
  var TargetObjectiveMetricValue: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TargetObjectiveMetricValue] = js.undefined
}
object TuningJobCompletionCriteria {
  
  inline def apply(): TuningJobCompletionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TuningJobCompletionCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TuningJobCompletionCriteria] (val x: Self) extends AnyVal {
    
    inline def setBestObjectiveNotImproving(value: BestObjectiveNotImproving): Self = StObject.set(x, "BestObjectiveNotImproving", value.asInstanceOf[js.Any])
    
    inline def setBestObjectiveNotImprovingUndefined: Self = StObject.set(x, "BestObjectiveNotImproving", js.undefined)
    
    inline def setConvergenceDetected(value: ConvergenceDetected): Self = StObject.set(x, "ConvergenceDetected", value.asInstanceOf[js.Any])
    
    inline def setConvergenceDetectedUndefined: Self = StObject.set(x, "ConvergenceDetected", js.undefined)
    
    inline def setTargetObjectiveMetricValue(value: TargetObjectiveMetricValue): Self = StObject.set(x, "TargetObjectiveMetricValue", value.asInstanceOf[js.Any])
    
    inline def setTargetObjectiveMetricValueUndefined: Self = StObject.set(x, "TargetObjectiveMetricValue", js.undefined)
  }
}
