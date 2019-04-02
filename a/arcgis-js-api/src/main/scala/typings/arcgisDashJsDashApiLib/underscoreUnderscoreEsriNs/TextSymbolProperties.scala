package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbolProperties extends SymbolProperties {
  /**
    * The angle of the text. `0` is horizontal and the angle moves clockwise.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#angle)
    *
    * @default 0
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The background color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * The border color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * The border size or width of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The font used to style the text.
    * > **Known Limitations**  This property is not fully supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.undefined
  /**
    * The color of the text symbol's halo. To include a halo in the TextSymbol, you must also set the size of the halo in [haloSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor)
    */
  var haloColor: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * The size in points of the text symbol's halo. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). To include a halo in the TextSymbol, you must also set the color of the halo in [haloColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *   * Halo size should not be 1/4 larger than the [text size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size). For example, if your text size is 12, the halo size should not be larger than 3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Adjusts the horizontal alignment of the text in multi-line labels.  **Possible Values:** left | right | center | justify
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#horizontalAlignment)
    *
    * @default center
    */
  var horizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    *
    * @default true
    */
  var kerning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines whether every character in the text string is rotated.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    *
    * @default false
    */
  var rotated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text string to display in the view. Long text strings will be split into multiple lines. The maximum length of each line is equal to this formula: (512 * [font.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)) / 24.
    * > **Known Limitations**  This property only applies when TextSymbol is used to define the symbol property of a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html), and not for labelling purposes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Adjusts the vertical alignment of the text.  **Possible Values:** baseline | top | middle | bottom
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    *
    * @default baseline
    */
  var verticalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The offset on the y-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TextSymbolProperties {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    backgroundColor: Color | js.Array[scala.Double] | java.lang.String = null,
    borderLineColor: Color | js.Array[scala.Double] | java.lang.String = null,
    borderLineSize: scala.Int | scala.Double = null,
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    font: FontProperties = null,
    haloColor: Color | js.Array[scala.Double] | java.lang.String = null,
    haloSize: scala.Double | java.lang.String = null,
    horizontalAlignment: java.lang.String = null,
    kerning: js.UndefOr[scala.Boolean] = js.undefined,
    rotated: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    verticalAlignment: java.lang.String = null,
    xoffset: scala.Double | java.lang.String = null,
    yoffset: scala.Double | java.lang.String = null
  ): TextSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderLineColor != null) __obj.updateDynamic("borderLineColor")(borderLineColor.asInstanceOf[js.Any])
    if (borderLineSize != null) __obj.updateDynamic("borderLineSize")(borderLineSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (haloSize != null) __obj.updateDynamic("haloSize")(haloSize.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning)
    if (!js.isUndefined(rotated)) __obj.updateDynamic("rotated")(rotated)
    if (text != null) __obj.updateDynamic("text")(text)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbolProperties]
  }
}

