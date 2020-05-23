package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.baseline
import typings.arcgisRestApi.arcgisRestApiStrings.bottom
import typings.arcgisRestApi.arcgisRestApiStrings.center
import typings.arcgisRestApi.arcgisRestApiStrings.esriTS
import typings.arcgisRestApi.arcgisRestApiStrings.justify
import typings.arcgisRestApi.arcgisRestApiStrings.left
import typings.arcgisRestApi.arcgisRestApiStrings.middle
import typings.arcgisRestApi.arcgisRestApiStrings.right
import typings.arcgisRestApi.arcgisRestApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbol extends MarkerSymbol {
  var backgroundColor: js.UndefOr[Color] = js.undefined
   // <size>;
  var borderLineColor: js.UndefOr[Color] = js.undefined
  var borderLineSize: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
   // <size>;
  var haloColor: js.UndefOr[Color] = js.undefined
  var haloSize: js.UndefOr[Double] = js.undefined
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.undefined
  var kerning: js.UndefOr[Boolean] = js.undefined
  var rightToLeft: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_TextSymbol: esriTS
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.undefined
}

object TextSymbol {
  @scala.inline
  def apply(
    `type`: esriTS,
    angle: js.UndefOr[Double] = js.undefined,
    backgroundColor: Color = null,
    borderLineColor: Color = null,
    borderLineSize: js.UndefOr[Double] = js.undefined,
    color: Color = null,
    font: Font = null,
    haloColor: Color = null,
    haloSize: js.UndefOr[Double] = js.undefined,
    horizontalAlignment: left | right | center | justify = null,
    kerning: js.UndefOr[Boolean] = js.undefined,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    text: String = null,
    verticalAlignment: baseline | top | middle | bottom = null,
    xoffset: js.UndefOr[Double] = js.undefined,
    yoffset: js.UndefOr[Double] = js.undefined
  ): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderLineColor != null) __obj.updateDynamic("borderLineColor")(borderLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLineSize)) __obj.updateDynamic("borderLineSize")(borderLineSize.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (!js.isUndefined(haloSize)) __obj.updateDynamic("haloSize")(haloSize.get.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(xoffset)) __obj.updateDynamic("xoffset")(xoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoffset)) __obj.updateDynamic("yoffset")(yoffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol]
  }
}

