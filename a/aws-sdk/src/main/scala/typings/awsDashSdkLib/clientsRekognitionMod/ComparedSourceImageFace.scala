package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparedSourceImageFace extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * Confidence level that the selected bounding box contains a face.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
}

object ComparedSourceImageFace {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Confidence: js.UndefOr[Percent] = js.undefined): ComparedSourceImageFace = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    __obj.asInstanceOf[ComparedSourceImageFace]
  }
}

