package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.baseline_
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.left_
import typings.arcgisJsApi.arcgisJsApiStrings.middle
import typings.arcgisJsApi.arcgisJsApiStrings.right_
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSymbol
  extends StObject
     with Symbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with Symbol2D {
  
  /**
    * The angle of the text.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#angle)
    */
  var angle: Double = js.native
  
  /**
    * The background color of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#backgroundColor)
    */
  var backgroundColor: Color_ = js.native
  
  /**
    * The border color of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineColor)
    */
  var borderLineColor: Color_ = js.native
  
  /**
    * The border size or width of the label's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#borderLineSize)
    */
  var borderLineSize: Double = js.native
  
  /**
    * The [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html) used to style the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font)
    */
  var font: Font = js.native
  
  /**
    * The color of the text symbol's halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloColor)
    */
  var haloColor: Color_ = js.native
  
  /**
    * The size in points of the text symbol's halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize)
    */
  var haloSize: Double = js.native
  
  /**
    * Adjusts the horizontal alignment of the text in multi-lines.
    *
    * @default "center"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#horizontalAlignment)
    */
  var horizontalAlignment: left_ | right_ | center_ = js.native
  
  /**
    * Determines whether to adjust the spacing between characters in the text string.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#kerning)
    */
  var kerning: Boolean = js.native
  
  /**
    * The height of the space between each line of text.
    *
    * @default 1.0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineHeight)
    */
  var lineHeight: Double = js.native
  
  /**
    * The maximum length in points for each line of text.
    *
    * @default 192
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#lineWidth)
    */
  var lineWidth: Double = js.native
  
  /**
    * Determines whether every character in the text string is rotated.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#rotated)
    */
  var rotated: Boolean = js.native
  
  /**
    * The text string to display in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#text)
    */
  var text: String = js.native
  
  @JSName("type")
  val type_TextSymbol: text = js.native
  
  /**
    * Adjusts the vertical alignment of the text.
    *
    * @default "baseline"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#verticalAlignment)
    */
  var verticalAlignment: baseline_ | top_ | middle | bottom_ = js.native
  
  /**
    * The offset on the x-axis in points.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#xoffset)
    */
  var xoffset: Double = js.native
  
  /**
    * The offset on the y-axis in points.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#yoffset)
    */
  var yoffset: Double = js.native
}
