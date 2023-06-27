package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains helper methods for generating an RGB [stretch visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) for raster layers (i.e.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html)
	 */
trait rgb extends StObject {
  
  /**
  		 * Generates an RGB [RasterStretchRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) to render three selected bands into red, green, and blue color channels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
  		 */
  def createRenderer(params: rgbCreateRendererParams): js.Promise[RasterRGBResult]
}
object rgb {
  
  inline def apply(createRenderer: rgbCreateRendererParams => js.Promise[RasterRGBResult]): rgb = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[rgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rgb] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: rgbCreateRendererParams => js.Promise[RasterRGBResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
