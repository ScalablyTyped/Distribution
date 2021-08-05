package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.baseline
import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.justify
import typings.arcgisJsApi.arcgisJsApiStrings.left
import typings.arcgisJsApi.arcgisJsApiStrings.middle
import typings.arcgisJsApi.arcgisJsApiStrings.right
import typings.arcgisJsApi.arcgisJsApiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSymbolProperties
  extends StObject
     with SymbolProperties {
  
  /**
    * The angle of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#angle)
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The background color of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The border color of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The border size or width of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html) used to style the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.undefined
  
  /**
    * The color of the text symbol's halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor)
    */
  var haloColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The size in points of the text symbol's halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Adjusts the horizontal alignment of the text in multi-lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#horizontalAlignment)
    */
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.undefined
  
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    */
  var kerning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height of the space between each line of text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineHeight)
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum length in points for each line of text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth)
    */
  var lineWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Determines whether every character in the text string is rotated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    */
  var rotated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text string to display in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Adjusts the vertical alignment of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    */
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.undefined
  
  /**
    * The offset on the x-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    */
  var xoffset: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The offset on the y-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
    */
  var yoffset: js.UndefOr[Double | String] = js.undefined
}
object TextSymbolProperties {
  
  inline def apply(): TextSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSymbolProperties]
  }
  
  extension [Self <: TextSymbolProperties](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBackgroundColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBorderLineColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "borderLineColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLineColorUndefined: Self = StObject.set(x, "borderLineColor", js.undefined)
    
    inline def setBorderLineColorVarargs(value: Double*): Self = StObject.set(x, "borderLineColor", js.Array(value :_*))
    
    inline def setBorderLineSize(value: Double): Self = StObject.set(x, "borderLineSize", value.asInstanceOf[js.Any])
    
    inline def setBorderLineSizeUndefined: Self = StObject.set(x, "borderLineSize", js.undefined)
    
    inline def setFont(value: FontProperties): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHaloColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    inline def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    inline def setHaloColorVarargs(value: Double*): Self = StObject.set(x, "haloColor", js.Array(value :_*))
    
    inline def setHaloSize(value: Double | String): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    inline def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    inline def setHorizontalAlignment(value: left | right | center | justify): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineWidth(value: Double | String): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
    
    inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalAlignment(value: baseline | top | middle | bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setXoffset(value: Double | String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    inline def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    inline def setYoffset(value: Double | String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    inline def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
  }
}
