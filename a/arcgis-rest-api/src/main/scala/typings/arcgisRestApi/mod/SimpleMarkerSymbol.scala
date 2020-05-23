package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSMS
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
    angle: js.UndefOr[Double] = js.undefined,
    color: Color = null,
    outline: SimpleLineSymbol = null,
    size: js.UndefOr[Double] = js.undefined,
    style: SimpleMarkerSymbolStyle = null,
    xoffset: js.UndefOr[Double] = js.undefined,
    yoffset: js.UndefOr[Double] = js.undefined
  ): SimpleMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(xoffset)) __obj.updateDynamic("xoffset")(xoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoffset)) __obj.updateDynamic("yoffset")(yoffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMarkerSymbol]
  }
}

