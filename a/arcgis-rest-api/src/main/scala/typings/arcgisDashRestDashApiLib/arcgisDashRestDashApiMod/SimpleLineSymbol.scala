package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleLineSymbol extends Symbol {
  var color: js.UndefOr[Color] = js.undefined
  @JSName("style")
  var style_SimpleLineSymbol: js.UndefOr[SimpleLineSymbolStyle] = js.undefined
  @JSName("type")
  var type_SimpleLineSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLS
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SimpleLineSymbol {
  @scala.inline
  def apply(
    `type`: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLS,
    color: Color = null,
    style: SimpleLineSymbolStyle = null,
    width: scala.Int | scala.Double = null
  ): SimpleLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLineSymbol]
  }
}

