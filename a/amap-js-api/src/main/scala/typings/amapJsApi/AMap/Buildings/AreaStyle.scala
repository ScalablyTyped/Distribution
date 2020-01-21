package typings.amapJsApi.AMap.Buildings

import typings.amapJsApi.AMap.LocationValue
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
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectTexture)) __obj.updateDynamic("rejectTexture")(rejectTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaStyle]
  }
}

