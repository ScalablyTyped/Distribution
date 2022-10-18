package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EyeOpen extends StObject {
  
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * Boolean value that indicates whether the eyes on the face are open.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object EyeOpen {
  
  inline def apply(): EyeOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EyeOpen]
  }
  
  extension [Self <: EyeOpen](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
