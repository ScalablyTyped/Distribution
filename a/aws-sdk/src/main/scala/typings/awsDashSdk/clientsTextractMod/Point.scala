package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * The value of the X coordinate for a point on a Polygon.
    */
  var X: js.UndefOr[Float] = js.undefined
  /**
    * The value of the Y coordinate for a point on a Polygon.
    */
  var Y: js.UndefOr[Float] = js.undefined
}

object Point {
  @scala.inline
  def apply(X: js.UndefOr[Float] = js.undefined, Y: js.UndefOr[Float] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(X)) __obj.updateDynamic("X")(X)
    if (!js.isUndefined(Y)) __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Point]
  }
}

