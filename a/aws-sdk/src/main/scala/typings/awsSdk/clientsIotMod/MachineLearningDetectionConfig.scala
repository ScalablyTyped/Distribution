package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineLearningDetectionConfig extends StObject {
  
  /**
    *  The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High. 
    */
  var confidenceLevel: ConfidenceLevel
}
object MachineLearningDetectionConfig {
  
  inline def apply(confidenceLevel: ConfidenceLevel): MachineLearningDetectionConfig = {
    val __obj = js.Dynamic.literal(confidenceLevel = confidenceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineLearningDetectionConfig]
  }
  
  extension [Self <: MachineLearningDetectionConfig](x: Self) {
    
    inline def setConfidenceLevel(value: ConfidenceLevel): Self = StObject.set(x, "confidenceLevel", value.asInstanceOf[js.Any])
  }
}
