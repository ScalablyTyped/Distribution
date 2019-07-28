package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSymbol extends Symbol {
  var angle: js.UndefOr[Double] = js.undefined
  var xoffset: js.UndefOr[Double] = js.undefined
  var yoffset: js.UndefOr[Double] = js.undefined
}

object MarkerSymbol {
  @scala.inline
  def apply(
    `type`: SymbolType,
    angle: Int | Double = null,
    style: String = null,
    xoffset: Int | Double = null,
    yoffset: Int | Double = null
  ): MarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbol]
  }
}

