package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluatedModelVersion extends StObject {
  
  /**
    *  Evaluations generated for the model version. 
    */
  var evaluations: js.UndefOr[ListOfModelVersionEvaluations] = js.undefined
  
  /**
    *  The model ID. 
    */
  var modelId: js.UndefOr[String] = js.undefined
  
  /**
    * The model type.  Valid values: ONLINE_FRAUD_INSIGHTS | TRANSACTION_FRAUD_INSIGHTS 
    */
  var modelType: js.UndefOr[String] = js.undefined
  
  /**
    *  The model version. 
    */
  var modelVersion: js.UndefOr[String] = js.undefined
}
object EvaluatedModelVersion {
  
  inline def apply(): EvaluatedModelVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluatedModelVersion]
  }
  
  extension [Self <: EvaluatedModelVersion](x: Self) {
    
    inline def setEvaluations(value: ListOfModelVersionEvaluations): Self = StObject.set(x, "evaluations", value.asInstanceOf[js.Any])
    
    inline def setEvaluationsUndefined: Self = StObject.set(x, "evaluations", js.undefined)
    
    inline def setEvaluationsVarargs(value: ModelVersionEvaluation*): Self = StObject.set(x, "evaluations", js.Array(value*))
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
  }
}
