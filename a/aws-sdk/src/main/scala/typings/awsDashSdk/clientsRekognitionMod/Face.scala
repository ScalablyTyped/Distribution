package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ExternalImageId] = js.undefined
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.FaceId] = js.undefined
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ImageId] = js.undefined
}

object Face {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: Int | Double = null,
    ExternalImageId: ExternalImageId = null,
    FaceId: FaceId = null,
    ImageId: ImageId = null
  ): Face = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (ExternalImageId != null) __obj.updateDynamic("ExternalImageId")(ExternalImageId)
    if (FaceId != null) __obj.updateDynamic("FaceId")(FaceId)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    __obj.asInstanceOf[Face]
  }
}

