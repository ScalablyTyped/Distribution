package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccuracyMetricsResponse extends StObject {
  
  /**
    *   The LatencyOptimized AutoML override strategy is only available in private beta. Contact Amazon Web Services Support or your account manager to learn more about access privileges.   The AutoML strategy used to train the predictor. Unless LatencyOptimized is specified, the AutoML strategy optimizes predictor accuracy. This parameter is only valid for predictors trained using AutoML.
    */
  var AutoMLOverrideStrategy: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.AutoMLOverrideStrategy] = js.undefined
  
  /**
    * Whether the predictor was created with CreateAutoPredictor.
    */
  var IsAutoPredictor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The accuracy metric used to optimize the predictor.
    */
  var OptimizationMetric: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.OptimizationMetric] = js.undefined
  
  /**
    * An array of results from evaluating the predictor.
    */
  var PredictorEvaluationResults: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.PredictorEvaluationResults] = js.undefined
}
object GetAccuracyMetricsResponse {
  
  inline def apply(): GetAccuracyMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccuracyMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccuracyMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoMLOverrideStrategy(value: AutoMLOverrideStrategy): Self = StObject.set(x, "AutoMLOverrideStrategy", value.asInstanceOf[js.Any])
    
    inline def setAutoMLOverrideStrategyUndefined: Self = StObject.set(x, "AutoMLOverrideStrategy", js.undefined)
    
    inline def setIsAutoPredictor(value: Boolean): Self = StObject.set(x, "IsAutoPredictor", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPredictorUndefined: Self = StObject.set(x, "IsAutoPredictor", js.undefined)
    
    inline def setOptimizationMetric(value: OptimizationMetric): Self = StObject.set(x, "OptimizationMetric", value.asInstanceOf[js.Any])
    
    inline def setOptimizationMetricUndefined: Self = StObject.set(x, "OptimizationMetric", js.undefined)
    
    inline def setPredictorEvaluationResults(value: PredictorEvaluationResults): Self = StObject.set(x, "PredictorEvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setPredictorEvaluationResultsUndefined: Self = StObject.set(x, "PredictorEvaluationResults", js.undefined)
    
    inline def setPredictorEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "PredictorEvaluationResults", js.Array(value*))
  }
}
