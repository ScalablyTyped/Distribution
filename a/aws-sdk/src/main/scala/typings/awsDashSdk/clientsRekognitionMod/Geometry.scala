package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /**
    * An axis-aligned coarse representation of the detected text's location on the image.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  /**
    * Within the bounding box, a fine-grained polygon around the detected text.
    */
  var Polygon: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Polygon] = js.undefined
}

object Geometry {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Polygon: Polygon = null): Geometry = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (Polygon != null) __obj.updateDynamic("Polygon")(Polygon)
    __obj.asInstanceOf[Geometry]
  }
}

