package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Baseline
import typings.arcgisJsApi.arcgisJsApiStrings.Bold
import typings.arcgisJsApi.arcgisJsApiStrings.Bottom
import typings.arcgisJsApi.arcgisJsApiStrings.Center
import typings.arcgisJsApi.arcgisJsApiStrings.Italic
import typings.arcgisJsApi.arcgisJsApiStrings.Left
import typings.arcgisJsApi.arcgisJsApiStrings.Regular
import typings.arcgisJsApi.arcgisJsApiStrings.Right
import typings.arcgisJsApi.arcgisJsApiStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMTextSymbol extends StObject {
  
  /**
    * The amount of rotation applied to the text symbol, measured in degrees, around the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The font family name of the font (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var fontFamilyName: String
  
  /**
    * The style name for the font family.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var fontStyleName: js.UndefOr[Regular | Bold | Italic] = js.undefined
  
  /**
    * The size of the halo that extends beyond the symbol shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var haloSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The polygon symbol that is used to draw the halo for a text symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var haloSymbol: CIMPolygonSymbol
  
  /**
    * The size of the text in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var height: Double
  
  /**
    * The alignment type used to align the text to the geometry horizontally.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var horizontalAlignment: js.UndefOr[Left | Right | Center] = js.undefined
  
  /**
    * The X offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The Y offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether to draw the text with a strike through it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The polygon symbol that is used to draw the glyphs of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var symbol: CIMPolygonSymbol
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol
  
  /**
    * A value indicating whether to draw the text with an underline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var underline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The vertical alignment of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMTextSymbol)
    */
  var verticalAlignment: js.UndefOr[Top | Center | Baseline | Bottom] = js.undefined
}
object CIMTextSymbol {
  
  inline def apply(fontFamilyName: String, haloSymbol: CIMPolygonSymbol, height: Double, symbol: CIMPolygonSymbol): CIMTextSymbol = {
    val __obj = js.Dynamic.literal(fontFamilyName = fontFamilyName.asInstanceOf[js.Any], haloSymbol = haloSymbol.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMTextSymbol")
    __obj.asInstanceOf[CIMTextSymbol]
  }
  
  extension [Self <: CIMTextSymbol](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setFontFamilyName(value: String): Self = StObject.set(x, "fontFamilyName", value.asInstanceOf[js.Any])
    
    inline def setFontStyleName(value: Regular | Bold | Italic): Self = StObject.set(x, "fontStyleName", value.asInstanceOf[js.Any])
    
    inline def setFontStyleNameUndefined: Self = StObject.set(x, "fontStyleName", js.undefined)
    
    inline def setHaloSize(value: Double): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    inline def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    inline def setHaloSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "haloSymbol", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignment(value: Left | Right | Center): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setVerticalAlignment(value: Top | Center | Baseline | Bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
