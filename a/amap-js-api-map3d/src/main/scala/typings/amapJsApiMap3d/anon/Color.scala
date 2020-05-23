package typings.amapJsApiMap3d.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  var height: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    color: String | js.Array[Double] = null,
    height: Double | js.Array[Double] = null,
    width: js.UndefOr[Double] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

