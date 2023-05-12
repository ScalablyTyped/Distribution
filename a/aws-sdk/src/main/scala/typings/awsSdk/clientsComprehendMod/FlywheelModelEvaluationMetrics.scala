package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlywheelModelEvaluationMetrics extends StObject {
  
  /**
    * Average accuracy metric for the model.
    */
  var AverageAccuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * The average F1 score from the evaluation metrics.
    */
  var AverageF1Score: js.UndefOr[Double] = js.undefined
  
  /**
    * Average precision metric for the model.
    */
  var AveragePrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * Average recall metric for the model.
    */
  var AverageRecall: js.UndefOr[Double] = js.undefined
}
object FlywheelModelEvaluationMetrics {
  
  inline def apply(): FlywheelModelEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlywheelModelEvaluationMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlywheelModelEvaluationMetrics] (val x: Self) extends AnyVal {
    
    inline def setAverageAccuracy(value: Double): Self = StObject.set(x, "AverageAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAverageAccuracyUndefined: Self = StObject.set(x, "AverageAccuracy", js.undefined)
    
    inline def setAverageF1Score(value: Double): Self = StObject.set(x, "AverageF1Score", value.asInstanceOf[js.Any])
    
    inline def setAverageF1ScoreUndefined: Self = StObject.set(x, "AverageF1Score", js.undefined)
    
    inline def setAveragePrecision(value: Double): Self = StObject.set(x, "AveragePrecision", value.asInstanceOf[js.Any])
    
    inline def setAveragePrecisionUndefined: Self = StObject.set(x, "AveragePrecision", js.undefined)
    
    inline def setAverageRecall(value: Double): Self = StObject.set(x, "AverageRecall", value.asInstanceOf[js.Any])
    
    inline def setAverageRecallUndefined: Self = StObject.set(x, "AverageRecall", js.undefined)
  }
}
