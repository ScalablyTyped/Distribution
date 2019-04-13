package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonDetail extends js.Object {
  /**
    * Bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
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
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Face: FaceDetail = null,
    Index: js.UndefOr[PersonIndex] = js.undefined
  ): PersonDetail = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (Face != null) __obj.updateDynamic("Face")(Face)
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    __obj.asInstanceOf[PersonDetail]
  }
}

