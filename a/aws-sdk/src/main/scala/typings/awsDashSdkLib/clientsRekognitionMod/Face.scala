package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[FaceId] = js.undefined
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[ImageId] = js.undefined
}

object Face {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: js.UndefOr[Percent] = js.undefined,
    ExternalImageId: ExternalImageId = null,
    FaceId: FaceId = null,
    ImageId: ImageId = null
  ): Face = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (ExternalImageId != null) __obj.updateDynamic("ExternalImageId")(ExternalImageId)
    if (FaceId != null) __obj.updateDynamic("FaceId")(FaceId)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    __obj.asInstanceOf[Face]
  }
}

