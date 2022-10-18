package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceRecord extends StObject {
  
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
    */
  var Face: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Face] = js.undefined
  
  /**
    * Structure containing attributes of the face that the algorithm detected.
    */
  var FaceDetail: js.UndefOr[typings.awsSdk.clientsRekognitionMod.FaceDetail] = js.undefined
}
object FaceRecord {
  
  inline def apply(): FaceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceRecord]
  }
  
  extension [Self <: FaceRecord](x: Self) {
    
    inline def setFace(value: Face): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceDetail(value: FaceDetail): Self = StObject.set(x, "FaceDetail", value.asInstanceOf[js.Any])
    
    inline def setFaceDetailUndefined: Self = StObject.set(x, "FaceDetail", js.undefined)
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
  }
}
