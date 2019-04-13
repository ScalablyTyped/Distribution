package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareFacesResponse extends js.Object {
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
  @scala.inline
  def apply(
    FaceMatches: CompareFacesMatchList = null,
    SourceImageFace: ComparedSourceImageFace = null,
    SourceImageOrientationCorrection: OrientationCorrection = null,
    TargetImageOrientationCorrection: OrientationCorrection = null,
    UnmatchedFaces: CompareFacesUnmatchList = null
  ): CompareFacesResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches)
    if (SourceImageFace != null) __obj.updateDynamic("SourceImageFace")(SourceImageFace)
    if (SourceImageOrientationCorrection != null) __obj.updateDynamic("SourceImageOrientationCorrection")(SourceImageOrientationCorrection.asInstanceOf[js.Any])
    if (TargetImageOrientationCorrection != null) __obj.updateDynamic("TargetImageOrientationCorrection")(TargetImageOrientationCorrection.asInstanceOf[js.Any])
    if (UnmatchedFaces != null) __obj.updateDynamic("UnmatchedFaces")(UnmatchedFaces)
    __obj.asInstanceOf[CompareFacesResponse]
  }
}

