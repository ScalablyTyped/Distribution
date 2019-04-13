package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  /**
    * The height of the bounding box as a ratio of the overall document page height.
    */
  var Height: js.UndefOr[Float] = js.undefined
  /**
    * The left coordinate of the bounding box as a ratio of overall document page width.
    */
  var Left: js.UndefOr[Float] = js.undefined
  /**
    * The top coordinate of the bounding box as a ratio of overall document page height.
    */
  var Top: js.UndefOr[Float] = js.undefined
  /**
    * The width of the bounding box as a ratio of the overall document page width.
    */
  var Width: js.UndefOr[Float] = js.undefined
}

object BoundingBox {
  @scala.inline
  def apply(
    Height: js.UndefOr[Float] = js.undefined,
    Left: js.UndefOr[Float] = js.undefined,
    Top: js.UndefOr[Float] = js.undefined,
    Width: js.UndefOr[Float] = js.undefined
  ): BoundingBox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height)
    if (!js.isUndefined(Left)) __obj.updateDynamic("Left")(Left)
    if (!js.isUndefined(Top)) __obj.updateDynamic("Top")(Top)
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[BoundingBox]
  }
}

