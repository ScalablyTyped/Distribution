package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains helper methods for generating class breaks visualizations for raster layers (i.e.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html)
	 */
trait classBreaks extends StObject {
  
  /**
  		 * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) used to render imagery data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-classBreaks.html#createRenderer)
  		 */
  def createRenderer(params: classBreaksCreateRendererParams): js.Promise[RasterClassBreaksResult]
}
object classBreaks {
  
  inline def apply(createRenderer: classBreaksCreateRendererParams => js.Promise[RasterClassBreaksResult]): classBreaks = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[classBreaks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: classBreaks] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: classBreaksCreateRendererParams => js.Promise[RasterClassBreaksResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
