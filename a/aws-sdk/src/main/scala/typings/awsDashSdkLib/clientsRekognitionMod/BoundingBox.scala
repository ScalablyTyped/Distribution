package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  /**
    * Height of the bounding box as a ratio of the overall image height.
    */
  var Height: js.UndefOr[Float] = js.undefined
  /**
    * Left coordinate of the bounding box as a ratio of overall image width.
    */
  var Left: js.UndefOr[Float] = js.undefined
  /**
    * Top coordinate of the bounding box as a ratio of overall image height.
    */
  var Top: js.UndefOr[Float] = js.undefined
  /**
    * Width of the bounding box as a ratio of the overall image width.
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

