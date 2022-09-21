package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating a [RasterColormapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html) for raster layers (i.e.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html)
  */
trait colormap extends StObject {
  
  /**
    * Generates a [RasterColormapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html) used to render imagery data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-colormap.html#createRenderer)
    */
  def createRenderer(params: colormapCreateRendererParams): js.Promise[RasterColormapResult]
}
object colormap {
  
  inline def apply(createRenderer: colormapCreateRendererParams => js.Promise[RasterColormapResult]): colormap = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[colormap]
  }
  
  extension [Self <: colormap](x: Self) {
    
    inline def setCreateRenderer(value: colormapCreateRendererParams => js.Promise[RasterColormapResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
