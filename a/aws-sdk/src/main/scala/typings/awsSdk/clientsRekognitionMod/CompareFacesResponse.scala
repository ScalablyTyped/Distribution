package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareFacesResponse extends StObject {
  
  /**
    * An array of faces in the target image that match the source image face. Each CompareFacesMatch object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity score for the face in the bounding box and the face in the source image.
    */
  var FaceMatches: js.UndefOr[CompareFacesMatchList] = js.undefined
  
  /**
    * The face in the source image that was used for comparison.
    */
  var SourceImageFace: js.UndefOr[ComparedSourceImageFace] = js.undefined
  
  /**
    * The value of SourceImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
  
  /**
    * The value of TargetImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
  
  /**
    * An array of faces in the target image that did not match the source image face.
    */
  var UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList] = js.undefined
}
object CompareFacesResponse {
  
  inline def apply(): CompareFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesResponse]
  }
  
  extension [Self <: CompareFacesResponse](x: Self) {
    
    inline def setFaceMatches(value: CompareFacesMatchList): Self = StObject.set(x, "FaceMatches", value.asInstanceOf[js.Any])
    
    inline def setFaceMatchesUndefined: Self = StObject.set(x, "FaceMatches", js.undefined)
    
    inline def setFaceMatchesVarargs(value: CompareFacesMatch*): Self = StObject.set(x, "FaceMatches", js.Array(value*))
    
    inline def setSourceImageFace(value: ComparedSourceImageFace): Self = StObject.set(x, "SourceImageFace", value.asInstanceOf[js.Any])
    
    inline def setSourceImageFaceUndefined: Self = StObject.set(x, "SourceImageFace", js.undefined)
    
    inline def setSourceImageOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "SourceImageOrientationCorrection", value.asInstanceOf[js.Any])
    
    inline def setSourceImageOrientationCorrectionUndefined: Self = StObject.set(x, "SourceImageOrientationCorrection", js.undefined)
    
    inline def setTargetImageOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "TargetImageOrientationCorrection", value.asInstanceOf[js.Any])
    
    inline def setTargetImageOrientationCorrectionUndefined: Self = StObject.set(x, "TargetImageOrientationCorrection", js.undefined)
    
    inline def setUnmatchedFaces(value: CompareFacesUnmatchList): Self = StObject.set(x, "UnmatchedFaces", value.asInstanceOf[js.Any])
    
    inline def setUnmatchedFacesUndefined: Self = StObject.set(x, "UnmatchedFaces", js.undefined)
    
    inline def setUnmatchedFacesVarargs(value: ComparedFace*): Self = StObject.set(x, "UnmatchedFaces", js.Array(value*))
  }
}
