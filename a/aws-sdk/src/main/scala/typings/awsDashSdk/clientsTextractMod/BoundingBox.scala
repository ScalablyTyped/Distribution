package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBox extends js.Object {
  /**
    * The height of the bounding box as a ratio of the overall document page height.
    */
  var Height: js.UndefOr[Float] = js.native
  /**
    * The left coordinate of the bounding box as a ratio of overall document page width.
    */
  var Left: js.UndefOr[Float] = js.native
  /**
    * The top coordinate of the bounding box as a ratio of overall document page height.
    */
  var Top: js.UndefOr[Float] = js.native
  /**
    * The width of the bounding box as a ratio of the overall document page width.
    */
  var Width: js.UndefOr[Float] = js.native
}

object BoundingBox {
  @scala.inline
  def apply(
    Height: Int | Double = null,
    Left: Int | Double = null,
    Top: Int | Double = null,
    Width: Int | Double = null
  ): BoundingBox = {
    val __obj = js.Dynamic.literal()
    if (Height != null) __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    if (Left != null) __obj.updateDynamic("Left")(Left.asInstanceOf[js.Any])
    if (Top != null) __obj.updateDynamic("Top")(Top.asInstanceOf[js.Any])
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
}

