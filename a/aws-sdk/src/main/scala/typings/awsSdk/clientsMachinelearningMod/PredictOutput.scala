package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictOutput extends StObject {
  
  var Prediction: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.Prediction] = js.undefined
}
object PredictOutput {
  
  inline def apply(): PredictOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictOutput] (val x: Self) extends AnyVal {
    
    inline def setPrediction(value: Prediction): Self = StObject.set(x, "Prediction", value.asInstanceOf[js.Any])
    
    inline def setPredictionUndefined: Self = StObject.set(x, "Prediction", js.undefined)
  }
}
