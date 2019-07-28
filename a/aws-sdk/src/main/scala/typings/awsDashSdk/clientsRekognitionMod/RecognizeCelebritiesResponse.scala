package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognizeCelebritiesResponse extends js.Object {
  /**
    * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an image.
    */
  var CelebrityFaces: js.UndefOr[CelebrityList] = js.undefined
  /**
    * The orientation of the input image (counterclockwise direction). If your application displays the image, you can use this value to correct the orientation. The bounding box coordinates returned in CelebrityFaces and UnrecognizedFaces represent face locations before the image orientation is corrected.   If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value of OrientationCorrection is null. The CelebrityFaces and UnrecognizedFaces bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata.  
    */
  var OrientationCorrection: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.OrientationCorrection] = js.undefined
  /**
    * Details about each unrecognized face in the image.
    */
  var UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.undefined
}

object RecognizeCelebritiesResponse {
  @scala.inline
  def apply(
    CelebrityFaces: CelebrityList = null,
    OrientationCorrection: OrientationCorrection = null,
    UnrecognizedFaces: ComparedFaceList = null
  ): RecognizeCelebritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (CelebrityFaces != null) __obj.updateDynamic("CelebrityFaces")(CelebrityFaces)
    if (OrientationCorrection != null) __obj.updateDynamic("OrientationCorrection")(OrientationCorrection.asInstanceOf[js.Any])
    if (UnrecognizedFaces != null) __obj.updateDynamic("UnrecognizedFaces")(UnrecognizedFaces)
    __obj.asInstanceOf[RecognizeCelebritiesResponse]
  }
}

