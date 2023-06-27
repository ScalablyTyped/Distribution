package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureMarkerSymbolProperties
  extends StObject
     with MarkerSymbolProperties {
  
  /**
  		 * The height of the image in points.
  		 *
  		 * @default 12
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
  		 */
  var height: js.UndefOr[Double | String] = js.undefined
  
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
}
object PictureMarkerSymbolProperties {
  
  inline def apply(): PictureMarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureMarkerSymbolProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PictureMarkerSymbolProperties] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
