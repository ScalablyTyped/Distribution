package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparedSourceImageFace extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  /**
    * Confidence level that the selected bounding box contains a face.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
}

object ComparedSourceImageFace {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Confidence: Int | Double = null): ComparedSourceImageFace = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparedSourceImageFace]
  }
}

