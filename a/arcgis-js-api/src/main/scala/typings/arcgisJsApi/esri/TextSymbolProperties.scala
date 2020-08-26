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

@js.native
trait TextSymbolProperties extends SymbolProperties {
  /**
    * The angle of the text. `0` is horizontal and the angle moves clockwise.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#angle)
    *
    * @default 0
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The background color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The border color of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The border size or width of the label's bounding box. This property is only supported for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: js.UndefOr[Double] = js.native
  /**
    * The [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html) used to style the text. This property allows the developer to set the font's family, decoration, size, style, and weight properties.  See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for more information and known limitations.
    * > **Known Limitations**
    *   * This property is not fully supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The available [Font.family](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) property values depend on whether you are working with a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.native
  /**
    * The color of the text symbol's halo. To include a halo in the TextSymbol, you must also set the size of the halo in [haloSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor)
    */
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The size in points of the text symbol's halo. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`). To include a halo in the TextSymbol, you must also set the color of the halo in [haloColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor).
    * > **Known Limitations**
    *   * Sub-pixel halo (i.e. fractional size such as 1.25px) renders inconsistently in various browsers.
    *   * Halo size should not be 1/4 larger than the [text size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size). For example, if your text size is 12, the halo size should not be larger than 3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: js.UndefOr[Double | String] = js.native
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
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.native
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    *
    * @default true
    */
  var kerning: js.UndefOr[Boolean] = js.native
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
  var lineHeight: js.UndefOr[Double] = js.native
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
  var lineWidth: js.UndefOr[Double | String] = js.native
  /**
    * Determines whether every character in the text string is rotated.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    *
    * @default false
    */
  var rotated: js.UndefOr[Boolean] = js.native
  /**
    * The text string to display in the view. Long text strings will be split into multiple lines. The length of the line is controlled by the [lineWidth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth) property. To manually create a new line, use the `\n` escape character.
    * > **Known Limitations**  This property only applies when TextSymbol is used to define the symbol property of a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html), and not for labeling purposes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Adjusts the vertical alignment of the text.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    *
    * @default baseline
    */
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.native
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  /**
    * The offset on the y-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.native
}

object TextSymbolProperties {
  @scala.inline
  def apply(): TextSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSymbolProperties]
  }
  @scala.inline
  implicit class TextSymbolPropertiesOps[Self <: TextSymbolProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setBackgroundColorVarargs(value: Double*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: Color_ | js.Array[Double] | String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderLineColorVarargs(value: Double*): Self = this.set("borderLineColor", js.Array(value :_*))
    @scala.inline
    def setBorderLineColor(value: Color_ | js.Array[Double] | String): Self = this.set("borderLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLineColor: Self = this.set("borderLineColor", js.undefined)
    @scala.inline
    def setBorderLineSize(value: Double): Self = this.set("borderLineSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLineSize: Self = this.set("borderLineSize", js.undefined)
    @scala.inline
    def setFont(value: FontProperties): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHaloColorVarargs(value: Double*): Self = this.set("haloColor", js.Array(value :_*))
    @scala.inline
    def setHaloColor(value: Color_ | js.Array[Double] | String): Self = this.set("haloColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHaloColor: Self = this.set("haloColor", js.undefined)
    @scala.inline
    def setHaloSize(value: Double | String): Self = this.set("haloSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHaloSize: Self = this.set("haloSize", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: left | right | center | justify): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setKerning(value: Boolean): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setLineWidth(value: Double | String): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setRotated(value: Boolean): Self = this.set("rotated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotated: Self = this.set("rotated", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: baseline | top | middle | bottom): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setXoffset(value: Double | String): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXoffset: Self = this.set("xoffset", js.undefined)
    @scala.inline
    def setYoffset(value: Double | String): Self = this.set("yoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoffset: Self = this.set("yoffset", js.undefined)
  }
  
}

