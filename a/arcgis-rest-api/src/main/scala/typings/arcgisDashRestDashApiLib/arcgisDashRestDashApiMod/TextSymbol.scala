package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbol extends MarkerSymbol {
  var backgroundColor: js.UndefOr[Color] = js.undefined
   // <size>;
  var borderLineColor: js.UndefOr[Color] = js.undefined
  var borderLineSize: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
   // <size>;
  var haloColor: js.UndefOr[Color] = js.undefined
  var haloSize: js.UndefOr[scala.Double] = js.undefined
  var horizontalAlignment: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.left | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.right | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.center | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.justify
  ] = js.undefined
  var kerning: js.UndefOr[scala.Boolean] = js.undefined
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_TextSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriTS
  var verticalAlignment: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.baseline | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.top | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.middle | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bottom
  ] = js.undefined
}

object TextSymbol {
  @scala.inline
  def apply(
    `type`: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriTS,
    angle: scala.Int | scala.Double = null,
    backgroundColor: Color = null,
    borderLineColor: Color = null,
    borderLineSize: scala.Int | scala.Double = null,
    color: Color = null,
    font: Font = null,
    haloColor: Color = null,
    haloSize: scala.Int | scala.Double = null,
    horizontalAlignment: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.left | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.right | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.center | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.justify = null,
    kerning: js.UndefOr[scala.Boolean] = js.undefined,
    rightToLeft: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    text: java.lang.String = null,
    verticalAlignment: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.baseline | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.top | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.middle | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bottom = null,
    xoffset: scala.Int | scala.Double = null,
    yoffset: scala.Int | scala.Double = null
  ): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderLineColor != null) __obj.updateDynamic("borderLineColor")(borderLineColor)
    if (borderLineSize != null) __obj.updateDynamic("borderLineSize")(borderLineSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor)
    if (haloSize != null) __obj.updateDynamic("haloSize")(haloSize.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning)
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol]
  }
}

