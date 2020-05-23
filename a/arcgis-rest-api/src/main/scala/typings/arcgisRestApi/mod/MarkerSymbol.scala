package typings.arcgisRestApi.mod

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
    angle: js.UndefOr[Double] = js.undefined,
    style: String = null,
    xoffset: js.UndefOr[Double] = js.undefined,
    yoffset: js.UndefOr[Double] = js.undefined
  ): MarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(xoffset)) __obj.updateDynamic("xoffset")(xoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoffset)) __obj.updateDynamic("yoffset")(yoffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbol]
  }
}

