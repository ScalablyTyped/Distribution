package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  /**
    * An axis-aligned coarse representation of the location of the recognized item on the document page.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsTextractMod.BoundingBox] = js.native
  /**
    * Within the bounding box, a fine-grained polygon around the recognized item.
    */
  var Polygon: js.UndefOr[typings.awsDashSdk.clientsTextractMod.Polygon] = js.native
}

object Geometry {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Polygon: Polygon = null): Geometry = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Polygon != null) __obj.updateDynamic("Polygon")(Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

