package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.baseline_
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.left_
import typings.arcgisJsApi.arcgisJsApiStrings.middle
import typings.arcgisJsApi.arcgisJsApiStrings.right_
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import typings.arcgisJsApi.esri.FontProperties
import typings.arcgisJsApi.esri.TextSymbol3DLayerBackgroundProperties
import typings.arcgisJsApi.esri.TextSymbol3DLayerHaloProperties
import typings.arcgisJsApi.esri.TextSymbol3DLayerMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.TextSymbol3DLayerProperties & {  type :'text'} */
trait TextSymbol3DLayerProperti extends StObject {
  
  /**
    * The background of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#background)
    */
  var background: js.UndefOr[TextSymbol3DLayerBackgroundProperties] = js.undefined
  
  /**
    * The font of the text label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#font)
    */
  var font: js.UndefOr[FontProperties] = js.undefined
  
  /**
    * The halo surrounding the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#halo)
    */
  var halo: js.UndefOr[TextSymbol3DLayerHaloProperties] = js.undefined
  
  /**
    * Adjusts the horizontal alignment of the text in multi-lines.
    *
    * @default "center"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#horizontalAlignment)
    */
  var horizontalAlignment: js.UndefOr[left_ | right_ | center_] = js.undefined
  
  /**
    * The height of the space between each line of text.
    *
    * @default 1.0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#lineHeight)
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The material used to color the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[TextSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * Size of the text label in points.
    *
    * @default 9
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The text to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#text)
    */
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: text
  
  /**
    * Adjusts the vertical alignment of the text.
    *
    * @default "baseline"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#verticalAlignment)
    */
  var verticalAlignment: js.UndefOr[baseline_ | top_ | middle | bottom_] = js.undefined
}
object TextSymbol3DLayerProperti {
  
  inline def apply(): TextSymbol3DLayerProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[TextSymbol3DLayerProperti]
  }
  
  extension [Self <: TextSymbol3DLayerProperti](x: Self) {
    
    inline def setBackground(value: TextSymbol3DLayerBackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setFont(value: FontProperties): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHalo(value: TextSymbol3DLayerHaloProperties): Self = StObject.set(x, "halo", value.asInstanceOf[js.Any])
    
    inline def setHaloUndefined: Self = StObject.set(x, "halo", js.undefined)
    
    inline def setHorizontalAlignment(value: left_ | right_ | center_): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMaterial(value: TextSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(value: baseline_ | top_ | middle | bottom_): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
