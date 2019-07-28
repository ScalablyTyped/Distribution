package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesOverlayOptions extends OverlayOptions {
  var style: js.UndefOr[Style] = js.undefined
}

object StylesOverlayOptions {
  @scala.inline
  def apply(
    data: js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    style: Style = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StylesOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StylesOverlayOptions]
  }
}

