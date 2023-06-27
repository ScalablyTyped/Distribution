package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTarget extends StObject {
  
  /**
  		 * The framebuffer where the [render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render) method should direct its output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
  		 */
  var framebuffer: Any
  
  /**
  		 * A viewport that fully covers `framebuffer`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
  		 */
  var viewport: js.Array[Double]
}
object RenderTarget {
  
  inline def apply(framebuffer: Any, viewport: js.Array[Double]): RenderTarget = {
    val __obj = js.Dynamic.literal(framebuffer = framebuffer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderTarget] (val x: Self) extends AnyVal {
    
    inline def setFramebuffer(value: Any): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: js.Array[Double]): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportVarargs(value: Double*): Self = StObject.set(x, "viewport", js.Array(value*))
  }
}
