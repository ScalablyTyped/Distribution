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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSymbolProperties extends SymbolProperties {
  
  /**
    * The angle of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#angle)
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The background color of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The border color of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The border size or width of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: js.UndefOr[Double] = js.native
  
  /**
    * The [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html) used to style the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.native
  
  /**
    * The color of the text symbol's halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor)
    */
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The size in points of the text symbol's halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: js.UndefOr[Double | String] = js.native
  
  /**
    * Adjusts the horizontal alignment of the text in multi-lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#horizontalAlignment)
    */
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.native
  
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    */
  var kerning: js.UndefOr[Boolean] = js.native
  
  /**
    * The height of the space between each line of text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineHeight)
    */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /**
    * The maximum length in points for each line of text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth)
    */
  var lineWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Determines whether every character in the text string is rotated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    */
  var rotated: js.UndefOr[Boolean] = js.native
  
  /**
    * The text string to display in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Adjusts the vertical alignment of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    */
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.native
  
  /**
    * The offset on the x-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  
  /**
    * The offset on the y-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
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
