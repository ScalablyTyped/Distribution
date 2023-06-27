package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterColormapResult extends StObject {
  
  /**
  		 * The colormap renderer to apply to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#RasterColormapResult)
  		 */
  var renderer: RasterColormapRenderer
}
object RasterColormapResult {
  
  inline def apply(renderer: RasterColormapRenderer): RasterColormapResult = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterColormapResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterColormapResult] (val x: Self) extends AnyVal {
    
    inline def setRenderer(value: RasterColormapRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
