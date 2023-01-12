package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeCelebritiesResponse extends StObject {
  
  /**
    * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 64 celebrities in an image. Each celebrity object includes the following attributes: Face, Confidence, Emotions, Landmarks, Pose, Quality, Smile, Id, KnownGender, MatchConfidence, Name, Urls.
    */
  var CelebrityFaces: js.UndefOr[CelebrityList] = js.undefined
  
  /**
    *  Support for estimating image orientation using the the OrientationCorrection field has ceased as of August 2021. Any returned values for this field included in an API response will always be NULL.  The orientation of the input image (counterclockwise direction). If your application displays the image, you can use this value to correct the orientation. The bounding box coordinates returned in CelebrityFaces and UnrecognizedFaces represent face locations before the image orientation is corrected.   If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value of OrientationCorrection is null. The CelebrityFaces and UnrecognizedFaces bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata.  
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.clientsRekognitionMod.OrientationCorrection] = js.undefined
  
  /**
    * Details about each unrecognized face in the image.
    */
  var UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.undefined
}
object RecognizeCelebritiesResponse {
  
  inline def apply(): RecognizeCelebritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizeCelebritiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizeCelebritiesResponse] (val x: Self) extends AnyVal {
    
    inline def setCelebrityFaces(value: CelebrityList): Self = StObject.set(x, "CelebrityFaces", value.asInstanceOf[js.Any])
    
    inline def setCelebrityFacesUndefined: Self = StObject.set(x, "CelebrityFaces", js.undefined)
    
    inline def setCelebrityFacesVarargs(value: Celebrity*): Self = StObject.set(x, "CelebrityFaces", js.Array(value*))
    
    inline def setOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "OrientationCorrection", value.asInstanceOf[js.Any])
    
    inline def setOrientationCorrectionUndefined: Self = StObject.set(x, "OrientationCorrection", js.undefined)
    
    inline def setUnrecognizedFaces(value: ComparedFaceList): Self = StObject.set(x, "UnrecognizedFaces", value.asInstanceOf[js.Any])
    
    inline def setUnrecognizedFacesUndefined: Self = StObject.set(x, "UnrecognizedFaces", js.undefined)
    
    inline def setUnrecognizedFacesVarargs(value: ComparedFace*): Self = StObject.set(x, "UnrecognizedFaces", js.Array(value*))
  }
}
