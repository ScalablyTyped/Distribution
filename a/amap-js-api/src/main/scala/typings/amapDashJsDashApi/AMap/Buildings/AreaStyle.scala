package typings.amapDashJsDashApi.AMap.Buildings

import typings.amapDashJsDashApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaStyle extends js.Object {
  var color1: String
  var color2: js.UndefOr[String] = js.undefined
  var path: js.Array[LocationValue]
  var rejectTexture: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AreaStyle {
  @scala.inline
  def apply(
    color1: String,
    path: js.Array[LocationValue],
    color2: String = null,
    rejectTexture: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AreaStyle = {
    val __obj = js.Dynamic.literal(color1 = color1, path = path)
    if (color2 != null) __obj.updateDynamic("color2")(color2)
    if (!js.isUndefined(rejectTexture)) __obj.updateDynamic("rejectTexture")(rejectTexture)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AreaStyle]
  }
}

