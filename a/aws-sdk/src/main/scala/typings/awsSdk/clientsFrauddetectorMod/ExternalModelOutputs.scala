package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalModelOutputs extends StObject {
  
  /**
    * The Amazon SageMaker model.
    */
  var externalModel: js.UndefOr[ExternalModelSummary] = js.undefined
  
  /**
    * The fraud prediction scores from Amazon SageMaker model.
    */
  var outputs: js.UndefOr[ExternalModelPredictionMap] = js.undefined
}
object ExternalModelOutputs {
  
  inline def apply(): ExternalModelOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalModelOutputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalModelOutputs] (val x: Self) extends AnyVal {
    
    inline def setExternalModel(value: ExternalModelSummary): Self = StObject.set(x, "externalModel", value.asInstanceOf[js.Any])
    
    inline def setExternalModelUndefined: Self = StObject.set(x, "externalModel", js.undefined)
    
    inline def setOutputs(value: ExternalModelPredictionMap): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
  }
}
