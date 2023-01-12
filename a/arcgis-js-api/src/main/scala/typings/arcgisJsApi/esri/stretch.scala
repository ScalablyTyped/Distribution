package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating a single-band [stretch visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) for raster layers (i.e.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html)
  */
trait stretch extends StObject {
  
  /**
    * Generates a [RasterStretchRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) to render data from a single raster band.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html#createRenderer)
    */
  def createRenderer(params: stretchCreateRendererParams): js.Promise[RasterStretchColorrampResult]
}
object stretch {
  
  inline def apply(createRenderer: stretchCreateRendererParams => js.Promise[RasterStretchColorrampResult]): stretch = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[stretch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: stretch] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: stretchCreateRendererParams => js.Promise[RasterStretchColorrampResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
