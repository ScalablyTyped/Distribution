package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFacesResponse extends StObject {
  
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An array of Face objects. 
    */
  var Faces: js.UndefOr[FaceList] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFacesResponse {
  
  inline def apply(): ListFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacesResponse]
  }
  
  extension [Self <: ListFacesResponse](x: Self) {
    
    inline def setFaceModelVersion(value: String): Self = StObject.set(x, "FaceModelVersion", value.asInstanceOf[js.Any])
    
    inline def setFaceModelVersionUndefined: Self = StObject.set(x, "FaceModelVersion", js.undefined)
    
    inline def setFaces(value: FaceList): Self = StObject.set(x, "Faces", value.asInstanceOf[js.Any])
    
    inline def setFacesUndefined: Self = StObject.set(x, "Faces", js.undefined)
    
    inline def setFacesVarargs(value: Face*): Self = StObject.set(x, "Faces", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
