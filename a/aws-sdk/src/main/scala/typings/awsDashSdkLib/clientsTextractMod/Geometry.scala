package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /**
    * An axis-aligned coarse representation of the location of the recognized text on the document page.
    */
  var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * Within the bounding box, a fine-grained polygon around the recognized text.
    */
  var Polygon: js.UndefOr[Polygon] = js.undefined
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

