package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorFieldRendererResult extends StObject {
  
  /**
  		 * The VectorFieldRenderer renderer to apply to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#VectorFieldRendererResult)
  		 */
  var renderer: VectorFieldRenderer
}
object VectorFieldRendererResult {
  
  inline def apply(renderer: VectorFieldRenderer): VectorFieldRendererResult = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorFieldRendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorFieldRendererResult] (val x: Self) extends AnyVal {
    
    inline def setRenderer(value: VectorFieldRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
