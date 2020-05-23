package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.baseline
import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.justify
import typings.arcgisJsApi.arcgisJsApiStrings.left
import typings.arcgisJsApi.arcgisJsApiStrings.middle
import typings.arcgisJsApi.arcgisJsApiStrings.right
import typings.arcgisJsApi.arcgisJsApiStrings.top
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
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * The background color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * The border color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * The border size or width of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: js.UndefOr[Double] = js.undefined
  /**
    * The [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html) used to style the text. This property allows the developer to set the font's family, decoration, size, style, and weight properties.  See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for more information and known limitations.
    * > **Known Limitations**
    *   * This property is not fully supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The available [Font.family](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) property values depend on whether you are working with a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
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
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * The size in points of the text symbol's halo. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). To include a halo in the TextSymbol, you must also set the color of the halo in [haloColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *   * Halo size should not be 1/4 larger than the [text size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size). For example, if your text size is 12, the halo size should not be larger than 3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: js.UndefOr[Double | String] = js.undefined
  /**
    * Adjusts the horizontal alignment of the text in multi-lines.
    * > **Known Limitations**
    *   * This property is not currently supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * This property only applies when TextSymbol is not used for labeling purposes. The `horizontalAlignment` for labels is inferred from the [labelPlacement](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement) value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#horizontalAlignment)
    *
    * @default center
    */
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.undefined
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    *
    * @default true
    */
  var kerning: js.UndefOr[Boolean] = js.undefined
  /**
    * The height of the space between each line of text. Only applies to multiline text.  This property can be considered as a multiplier of the default value of 1.0 (e.g. a value of 2.0 will be two times the height of the default height). The range of possible values is: 0.1 - 4.0. If a value of 0 is specified, the default value of 1.0 will be used.
    * > **Known Limitations**
    *   * This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The default value is subject to change in future releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineHeight)
    *
    * @default 1.0
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  /**
    * The maximum length in points for each line of text. This value may be autocast with a string expressing size in points or pixels (e.g. `72px`).  The default value is 192 points. The range of possible values is: 32px - 512px.  If text extends farther than the `lineWidth` value, then the line will break at the whitespace before the text that extends past the limit if possible, and a new line will be created.
    * > **Known Limitations**
    *   * This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The default value is subject to change in future releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth)
    *
    * @default 192
    */
  var lineWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Determines whether every character in the text string is rotated.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    *
    * @default false
    */
  var rotated: js.UndefOr[Boolean] = js.undefined
  /**
    * The text string to display in the view. Long text strings will be split into multiple lines. The length of the line is controlled by the [lineWidth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth) property. To manually create a new line, use the `\n` escape character.
    * > **Known Limitations**  This property only applies when TextSymbol is used to define the symbol property of a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html), and not for labeling purposes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Adjusts the vertical alignment of the text.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    *
    * @default baseline
    */
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.undefined
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.undefined
  /**
    * The offset on the y-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.undefined
}

object TextSymbolProperties {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    backgroundColor: Color_ | js.Array[Double] | String = null,
    borderLineColor: Color_ | js.Array[Double] | String = null,
    borderLineSize: js.UndefOr[Double] = js.undefined,
    color: Color_ | js.Array[Double] | String = null,
    font: FontProperties = null,
    haloColor: Color_ | js.Array[Double] | String = null,
    haloSize: Double | String = null,
    horizontalAlignment: left | right | center | justify = null,
    kerning: js.UndefOr[Boolean] = js.undefined,
    lineHeight: js.UndefOr[Double] = js.undefined,
    lineWidth: Double | String = null,
    rotated: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    verticalAlignment: baseline | top | middle | bottom = null,
    xoffset: Double | String = null,
    yoffset: Double | String = null
  ): TextSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderLineColor != null) __obj.updateDynamic("borderLineColor")(borderLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLineSize)) __obj.updateDynamic("borderLineSize")(borderLineSize.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (haloSize != null) __obj.updateDynamic("haloSize")(haloSize.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(rotated)) __obj.updateDynamic("rotated")(rotated.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbolProperties]
  }
}

