package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureMarkerSymbolProperties extends MarkerSymbolProperties {
  
  /**
    * The height of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * The URL to an image or SVG document.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The width of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    */
  var width: js.UndefOr[Double | String] = js.native
}
object PictureMarkerSymbolProperties {
  
  @scala.inline
  def apply(): PictureMarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureMarkerSymbolProperties]
  }
  
  @scala.inline
  implicit class PictureMarkerSymbolPropertiesMutableBuilder[Self <: PictureMarkerSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
