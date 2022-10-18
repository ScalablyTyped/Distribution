package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparedSourceImageFace extends StObject {
  
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Confidence level that the selected bounding box contains a face.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
}
object ComparedSourceImageFace {
  
  inline def apply(): ComparedSourceImageFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparedSourceImageFace]
  }
  
  extension [Self <: ComparedSourceImageFace](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
  }
}
