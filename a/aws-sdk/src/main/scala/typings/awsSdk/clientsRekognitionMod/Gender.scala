package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gender extends StObject {
  
  /**
    * Level of confidence in the prediction.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The predicted gender of the face.
    */
  var Value: js.UndefOr[GenderType] = js.undefined
}
object Gender {
  
  inline def apply(): Gender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gender] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setValue(value: GenderType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
