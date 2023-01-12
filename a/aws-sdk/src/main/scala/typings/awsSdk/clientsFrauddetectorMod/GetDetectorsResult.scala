package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorsResult extends StObject {
  
  /**
    * The detectors.
    */
  var detectors: js.UndefOr[DetectorList] = js.undefined
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetDetectorsResult {
  
  inline def apply(): GetDetectorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDetectorsResult] (val x: Self) extends AnyVal {
    
    inline def setDetectors(value: DetectorList): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
    
    inline def setDetectorsVarargs(value: Detector*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
