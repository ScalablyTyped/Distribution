package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelScores extends StObject {
  
  /**
    * The model version.
    */
  var modelVersion: js.UndefOr[ModelVersion] = js.undefined
  
  /**
    * The model's fraud prediction scores.
    */
  var scores: js.UndefOr[ModelPredictionMap] = js.undefined
}
object ModelScores {
  
  inline def apply(): ModelScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelScores]
  }
  
  extension [Self <: ModelScores](x: Self) {
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
    
    inline def setScores(value: ModelPredictionMap): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
  }
}
