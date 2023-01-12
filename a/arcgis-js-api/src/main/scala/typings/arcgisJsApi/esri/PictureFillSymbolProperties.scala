package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureFillSymbolProperties
  extends StObject
     with FillSymbolProperties {
  
  /**
    * The height of the image in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
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
object PictureFillSymbolProperties {
  
  inline def apply(): PictureFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureFillSymbolProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PictureFillSymbolProperties] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
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
