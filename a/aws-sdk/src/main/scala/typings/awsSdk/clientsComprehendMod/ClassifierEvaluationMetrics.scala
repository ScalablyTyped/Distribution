package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierEvaluationMetrics extends StObject {
  
  /**
    * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the test documents that were correctly recognized by the total number of labels in the test documents.
    */
  var Accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * A measure of how accurate the classifier results are for the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels compared to the total number of labels. Scores closer to zero are better.
    */
  var HammingLoss: js.UndefOr[Double] = js.undefined
  
  /**
    * A measure of how accurate the classifier results are for the test data. It is a combination of the Micro Precision and Micro Recall values. The Micro F1Score is the harmonic mean of the two scores. The highest score is 1, and the worst score is 0.
    */
  var MicroF1Score: js.UndefOr[Double] = js.undefined
  
  /**
    * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer returned substantially more relevant results than irrelevant ones. Unlike the Precision metric which comes from averaging the precision of all available labels, this is based on the overall score of all precision scores added together.
    */
  var MicroPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * A measure of how complete the classifier results are for the test data. High recall means that the classifier returned most of the relevant results. Specifically, this indicates how many of the correct categories in the text that the model can predict. It is a percentage of correct categories in the text that can found. Instead of averaging the recall scores of all labels (as with Recall), micro Recall is based on the overall score of all recall scores added together.
    */
  var MicroRecall: js.UndefOr[Double] = js.undefined
  
  /**
    * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier returned substantially more relevant results than irrelevant ones.
    */
  var Precision: js.UndefOr[Double] = js.undefined
  
  /**
    * A measure of how complete the classifier results are for the test data. High recall means that the classifier returned most of the relevant results. 
    */
  var Recall: js.UndefOr[Double] = js.undefined
}
object ClassifierEvaluationMetrics {
  
  inline def apply(): ClassifierEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierEvaluationMetrics]
  }
  
  extension [Self <: ClassifierEvaluationMetrics](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "Accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "Accuracy", js.undefined)
    
    inline def setF1Score(value: Double): Self = StObject.set(x, "F1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "F1Score", js.undefined)
    
    inline def setHammingLoss(value: Double): Self = StObject.set(x, "HammingLoss", value.asInstanceOf[js.Any])
    
    inline def setHammingLossUndefined: Self = StObject.set(x, "HammingLoss", js.undefined)
    
    inline def setMicroF1Score(value: Double): Self = StObject.set(x, "MicroF1Score", value.asInstanceOf[js.Any])
    
    inline def setMicroF1ScoreUndefined: Self = StObject.set(x, "MicroF1Score", js.undefined)
    
    inline def setMicroPrecision(value: Double): Self = StObject.set(x, "MicroPrecision", value.asInstanceOf[js.Any])
    
    inline def setMicroPrecisionUndefined: Self = StObject.set(x, "MicroPrecision", js.undefined)
    
    inline def setMicroRecall(value: Double): Self = StObject.set(x, "MicroRecall", value.asInstanceOf[js.Any])
    
    inline def setMicroRecallUndefined: Self = StObject.set(x, "MicroRecall", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "Precision", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "Recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "Recall", js.undefined)
  }
}
