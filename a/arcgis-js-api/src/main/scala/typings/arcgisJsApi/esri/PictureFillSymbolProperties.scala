package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureFillSymbolProperties extends FillSymbolProperties {
  
  /**
    * The height of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * The URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The width of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    */
  var width: js.UndefOr[Double | String] = js.native
  
  /**
    * The offset on the x-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  
  /**
    * The scale factor on the x axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    */
  var xscale: js.UndefOr[Double] = js.native
  
  /**
    * The offset on the y-axis in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    */
  var yoffset: js.UndefOr[Double | String] = js.native
  
  /**
    * The scale factor on the y axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    */
  var yscale: js.UndefOr[Double] = js.native
}
object PictureFillSymbolProperties {
  
  @scala.inline
  def apply(): PictureFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureFillSymbolProperties]
  }
  
  @scala.inline
  implicit class PictureFillSymbolPropertiesMutableBuilder[Self <: PictureFillSymbolProperties] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setXoffset(value: Double | String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffsetUndefined: Self = StObject.set(x, "xoffset", js.undefined)
    
    @scala.inline
    def setXscale(value: Double): Self = StObject.set(x, "xscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXscaleUndefined: Self = StObject.set(x, "xscale", js.undefined)
    
    @scala.inline
    def setYoffset(value: Double | String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffsetUndefined: Self = StObject.set(x, "yoffset", js.undefined)
    
    @scala.inline
    def setYscale(value: Double): Self = StObject.set(x, "yscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYscaleUndefined: Self = StObject.set(x, "yscale", js.undefined)
  }
}
