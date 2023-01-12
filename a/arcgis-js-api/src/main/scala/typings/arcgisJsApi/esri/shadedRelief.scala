package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating a [RasterShadedReliefRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html) to render elevation values in raster layers (i.e.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html)
  */
trait shadedRelief extends StObject {
  
  /**
    * Generates a [RasterShadedReliefRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html) to render elevation data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  def createRenderer(params: shadedReliefCreateRendererParams): js.Promise[RasterShadedReliefResult]
}
object shadedRelief {
  
  inline def apply(createRenderer: shadedReliefCreateRendererParams => js.Promise[RasterShadedReliefResult]): shadedRelief = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[shadedRelief]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: shadedRelief] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: shadedReliefCreateRendererParams => js.Promise[RasterShadedReliefResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
