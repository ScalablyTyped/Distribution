package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSymbol extends Symbol {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var xoffset: js.UndefOr[scala.Double] = js.undefined
  var yoffset: js.UndefOr[scala.Double] = js.undefined
}

object MarkerSymbol {
  @scala.inline
  def apply(
    `type`: SymbolType,
    angle: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    xoffset: scala.Int | scala.Double = null,
    yoffset: scala.Int | scala.Double = null
  ): MarkerSymbol = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbol]
  }
}

