package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonDetail extends StObject {
  
  /**
    * Bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Face details for the detected person.
    */
  var Face: js.UndefOr[FaceDetail] = js.undefined
  
  /**
    * Identifier for the person detected person within a video. Use to keep track of the person throughout the video. The identifier is not stored by Amazon Rekognition.
    */
  var Index: js.UndefOr[PersonIndex] = js.undefined
}
object PersonDetail {
  
  inline def apply(): PersonDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetail]
  }
  
  extension [Self <: PersonDetail](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setFace(value: FaceDetail): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    inline def setIndex(value: PersonIndex): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
