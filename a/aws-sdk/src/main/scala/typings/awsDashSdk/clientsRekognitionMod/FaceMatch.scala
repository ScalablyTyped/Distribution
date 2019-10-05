package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceMatch extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image ID that you assigned.
    */
  var Face: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Face] = js.undefined
  /**
    * Confidence in the match of this face with the input face.
    */
  var Similarity: js.UndefOr[Percent] = js.undefined
}

object FaceMatch {
  @scala.inline
  def apply(Face: Face = null, Similarity: Int | Double = null): FaceMatch = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face)
    if (Similarity != null) __obj.updateDynamic("Similarity")(Similarity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceMatch]
  }
}

