package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierMetadata extends StObject {
  
  /**
    *  Describes the result metrics for the test data associated with an documentation classifier.
    */
  var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.undefined
  
  /**
    * The number of labels in the input data. 
    */
  var NumberOfLabels: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20 percent of the input documents, up to 10,000 documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.undefined
}
object ClassifierMetadata {
  
  inline def apply(): ClassifierMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierMetadata]
  }
  
  extension [Self <: ClassifierMetadata](x: Self) {
    
    inline def setEvaluationMetrics(value: ClassifierEvaluationMetrics): Self = StObject.set(x, "EvaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "EvaluationMetrics", js.undefined)
    
    inline def setNumberOfLabels(value: Integer): Self = StObject.set(x, "NumberOfLabels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLabelsUndefined: Self = StObject.set(x, "NumberOfLabels", js.undefined)
    
    inline def setNumberOfTestDocuments(value: Integer): Self = StObject.set(x, "NumberOfTestDocuments", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTestDocumentsUndefined: Self = StObject.set(x, "NumberOfTestDocuments", js.undefined)
    
    inline def setNumberOfTrainedDocuments(value: Integer): Self = StObject.set(x, "NumberOfTrainedDocuments", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTrainedDocumentsUndefined: Self = StObject.set(x, "NumberOfTrainedDocuments", js.undefined)
  }
}
