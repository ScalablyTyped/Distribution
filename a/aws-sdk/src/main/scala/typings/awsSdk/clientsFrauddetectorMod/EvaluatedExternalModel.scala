package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluatedExternalModel extends StObject {
  
  /**
    *  Input variables use for generating predictions. 
    */
  var inputVariables: js.UndefOr[MapOfStrings] = js.undefined
  
  /**
    *  The endpoint of the external (Amazon Sagemaker) model. 
    */
  var modelEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    *  Output variables. 
    */
  var outputVariables: js.UndefOr[MapOfStrings] = js.undefined
  
  /**
    *  Indicates whether event variables were used to generate predictions. 
    */
  var useEventVariables: js.UndefOr[Boolean] = js.undefined
}
object EvaluatedExternalModel {
  
  inline def apply(): EvaluatedExternalModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluatedExternalModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluatedExternalModel] (val x: Self) extends AnyVal {
    
    inline def setInputVariables(value: MapOfStrings): Self = StObject.set(x, "inputVariables", value.asInstanceOf[js.Any])
    
    inline def setInputVariablesUndefined: Self = StObject.set(x, "inputVariables", js.undefined)
    
    inline def setModelEndpoint(value: String): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
    
    inline def setModelEndpointUndefined: Self = StObject.set(x, "modelEndpoint", js.undefined)
    
    inline def setOutputVariables(value: MapOfStrings): Self = StObject.set(x, "outputVariables", value.asInstanceOf[js.Any])
    
    inline def setOutputVariablesUndefined: Self = StObject.set(x, "outputVariables", js.undefined)
    
    inline def setUseEventVariables(value: Boolean): Self = StObject.set(x, "useEventVariables", value.asInstanceOf[js.Any])
    
    inline def setUseEventVariablesUndefined: Self = StObject.set(x, "useEventVariables", js.undefined)
  }
}
