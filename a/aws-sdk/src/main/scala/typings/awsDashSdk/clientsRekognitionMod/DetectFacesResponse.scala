package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectFacesResponse extends js.Object {
  /**
    * Details of each face found in the image. 
    */
  var FaceDetails: js.UndefOr[FaceDetailList] = js.native
  /**
    * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var OrientationCorrection: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.OrientationCorrection] = js.native
}

object DetectFacesResponse {
  @scala.inline
  def apply(FaceDetails: FaceDetailList = null, OrientationCorrection: OrientationCorrection = null): DetectFacesResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceDetails != null) __obj.updateDynamic("FaceDetails")(FaceDetails.asInstanceOf[js.Any])
    if (OrientationCorrection != null) __obj.updateDynamic("OrientationCorrection")(OrientationCorrection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectFacesResponse]
  }
}

