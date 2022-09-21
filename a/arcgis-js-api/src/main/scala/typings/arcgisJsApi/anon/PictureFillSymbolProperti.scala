package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.SimpleLineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PictureFillSymbolProperties & {  type :'picture-fill'} */
trait PictureFillSymbolProperti extends StObject {
  
  /**
    * The color of the symbol.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The height of the image in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  var `type`: (js.UndefOr[`simple-fill` | `picture-fill`]) & `picture-fill`
  
  /**
    * The URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the image in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The offset on the x-axis in points.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    */
  var xoffset: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The scale factor on the x axis of the symbol.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    */
  var xscale: js.UndefOr[Double] = js.undefined
  
  /**
    * The offset on the y-axis in pixels or points.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    */
  var yoffset: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The scale factor on the y axis of the symbol.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    */
  var yscale: js.UndefOr[Double] = js.undefined
}
object PictureFillSymbolProperti {
  
  inline def apply(`type`: (js.UndefOr[`simple-fill` | `picture-fill`]) & `picture-fill`): PictureFillSymbolProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbolProperti]
  }
  
  extension [Self <: PictureFillSymbolProperti](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOutline(value: SimpleLineSymbolProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setType(value: (js.UndefOr[`simple-fill` | `picture-fill`]) & `picture-fill`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXoffset(value: Double | String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    inline def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    inline def setXscale(value: Double): Self = StObject.set(x, "xscale", value.asInstanceOf[js.Any])
    
    inline def setXscaleUndefined: Self = StObject.set(x, "xscale", js.undefined)
    
    inline def setYoffset(value: Double | String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    inline def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
    
    inline def setYscale(value: Double): Self = StObject.set(x, "yscale", value.asInstanceOf[js.Any])
    
    inline def setYscaleUndefined: Self = StObject.set(x, "yscale", js.undefined)
  }
}
