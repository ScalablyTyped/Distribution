package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingDataResult extends StObject {
  
  /**
    * The training assets that you supplied for training.
    */
  var Input: js.UndefOr[TrainingData] = js.undefined
  
  /**
    * The images (assets) that were actually trained by Amazon Rekognition Custom Labels. 
    */
  var Output: js.UndefOr[TrainingData] = js.undefined
  
  /**
    * The location of the data validation manifest. The data validation manifest is created for the training dataset during model training.
    */
  var Validation: js.UndefOr[ValidationData] = js.undefined
}
object TrainingDataResult {
  
  inline def apply(): TrainingDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingDataResult]
  }
  
  extension [Self <: TrainingDataResult](x: Self) {
    
    inline def setInput(value: TrainingData): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setOutput(value: TrainingData): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setValidation(value: ValidationData): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "Validation", js.undefined)
  }
}
