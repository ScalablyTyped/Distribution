package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import typings.arcgisDashRestDashApi.arcgisDashRestDashApiStrings.esriSMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleMarkerSymbol extends MarkerSymbol {
  var color: js.UndefOr[Color] = js.undefined
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  @JSName("style")
  var style_SimpleMarkerSymbol: js.UndefOr[SimpleMarkerSymbolStyle] = js.undefined
  @JSName("type")
  var type_SimpleMarkerSymbol: esriSMS
}

object SimpleMarkerSymbol {
  @scala.inline
  def apply(
    `type`: esriSMS,
    angle: Int | Double = null,
    color: Color = null,
    outline: SimpleLineSymbol = null,
    size: Int | Double = null,
    style: SimpleMarkerSymbolStyle = null,
    xoffset: Int | Double = null,
    yoffset: Int | Double = null
  ): SimpleMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMarkerSymbol]
  }
}

