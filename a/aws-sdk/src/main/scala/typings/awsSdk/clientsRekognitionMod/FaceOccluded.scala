package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceOccluded extends StObject {
  
  /**
    * The confidence that the service has detected the presence of a face occlusion.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * True if a detected face’s eyes, nose, and mouth are partially captured or if they are covered by masks, dark sunglasses, cell phones, hands, or other objects. False if common occurrences that do not impact face verification are detected, such as eye glasses, lightly tinted sunglasses, strands of hair, and others.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object FaceOccluded {
  
  inline def apply(): FaceOccluded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceOccluded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceOccluded] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
