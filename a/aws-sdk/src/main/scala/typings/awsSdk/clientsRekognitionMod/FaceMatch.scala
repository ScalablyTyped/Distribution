package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceMatch extends StObject {
  
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image ID that you assigned.
    */
  var Face: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Face] = js.undefined
  
  /**
    * Confidence in the match of this face with the input face.
    */
  var Similarity: js.UndefOr[Percent] = js.undefined
}
object FaceMatch {
  
  inline def apply(): FaceMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceMatch] (val x: Self) extends AnyVal {
    
    inline def setFace(value: Face): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    inline def setSimilarity(value: Percent): Self = StObject.set(x, "Similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "Similarity", js.undefined)
  }
}
