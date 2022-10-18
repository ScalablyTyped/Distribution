package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectAnomaliesResponse extends StObject {
  
  /**
    * The results of the DetectAnomalies operation.
    */
  var DetectAnomalyResult: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.DetectAnomalyResult] = js.undefined
}
object DetectAnomaliesResponse {
  
  inline def apply(): DetectAnomaliesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectAnomaliesResponse]
  }
  
  extension [Self <: DetectAnomaliesResponse](x: Self) {
    
    inline def setDetectAnomalyResult(value: DetectAnomalyResult): Self = StObject.set(x, "DetectAnomalyResult", value.asInstanceOf[js.Any])
    
    inline def setDetectAnomalyResultUndefined: Self = StObject.set(x, "DetectAnomalyResult", js.undefined)
  }
}
