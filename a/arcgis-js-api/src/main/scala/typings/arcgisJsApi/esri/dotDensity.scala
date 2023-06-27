package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains a helper method for generating a [dot density visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html)
	 */
trait dotDensity extends StObject {
  
  /**
  		 * Generates a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) based on one or more complementary numeric fields and/or Arcade expressions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
  		 */
  def createRenderer(params: dotDensityCreateRendererParams): js.Promise[RendererResult]
}
object dotDensity {
  
  inline def apply(createRenderer: dotDensityCreateRendererParams => js.Promise[RendererResult]): dotDensity = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[dotDensity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dotDensity] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: dotDensityCreateRendererParams => js.Promise[RendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
