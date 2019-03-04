package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleMarkerSymbol extends MarkerSymbol {
  var color: js.UndefOr[Color] = js.undefined
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  @JSName("style")
  var style_SimpleMarkerSymbol: js.UndefOr[SimpleMarkerSymbolStyle] = js.undefined
  @JSName("type")
  var type_SimpleMarkerSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMS
}

object SimpleMarkerSymbol {
  @scala.inline
  def apply(
    `type`: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMS,
    angle: scala.Int | scala.Double = null,
    color: Color = null,
    outline: SimpleLineSymbol = null,
    size: scala.Int | scala.Double = null,
    style: SimpleMarkerSymbolStyle = null,
    xoffset: scala.Int | scala.Double = null,
    yoffset: scala.Int | scala.Double = null
  ): SimpleMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMarkerSymbol]
  }
}

