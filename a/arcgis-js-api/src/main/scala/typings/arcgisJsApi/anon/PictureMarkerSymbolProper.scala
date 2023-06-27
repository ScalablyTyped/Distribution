package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import typings.arcgisJsApi.esri.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PictureMarkerSymbolProperties & {  type :'picture-marker'} */
trait PictureMarkerSymbolProper extends StObject {
  
  /**
  		 * The angle of the marker relative to the screen in degrees.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle)
  		 */
  var angle: js.UndefOr[Double] = js.undefined
  
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
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
  		 */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The symbol type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#type)
  		 */
  var `type`: js.UndefOr[`simple-marker` | `picture-marker`] = js.undefined
  
  /**
  		 * The URL to an image or SVG document.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
  
  /**
  		 * The width of the image in points.
  		 *
  		 * @default 12
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
  		 */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The offset on the x-axis in points.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#xoffset)
  		 */
  var xoffset: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The offset on the y-axis in points.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#yoffset)
  		 */
  var yoffset: js.UndefOr[Double | String] = js.undefined
}
object PictureMarkerSymbolProper {
  
  inline def apply(): PictureMarkerSymbolProper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureMarkerSymbolProper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PictureMarkerSymbolProper] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: `simple-marker` | `picture-marker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXoffset(value: Double | String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    inline def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    inline def setYoffset(value: Double | String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    inline def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
  }
}
