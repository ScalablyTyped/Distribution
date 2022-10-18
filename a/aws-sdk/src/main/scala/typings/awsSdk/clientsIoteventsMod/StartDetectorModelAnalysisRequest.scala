package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDetectorModelAnalysisRequest extends StObject {
  
  var detectorModelDefinition: DetectorModelDefinition
}
object StartDetectorModelAnalysisRequest {
  
  inline def apply(detectorModelDefinition: DetectorModelDefinition): StartDetectorModelAnalysisRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDetectorModelAnalysisRequest]
  }
  
  extension [Self <: StartDetectorModelAnalysisRequest](x: Self) {
    
    inline def setDetectorModelDefinition(value: DetectorModelDefinition): Self = StObject.set(x, "detectorModelDefinition", value.asInstanceOf[js.Any])
  }
}
