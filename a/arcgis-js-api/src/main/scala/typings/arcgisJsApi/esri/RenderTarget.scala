package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTarget
  extends StObject
     with Object {
  
  /**
    * The framebuffer where the [render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render) method should direct its output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
    */
  var framebuffer: js.Any
  
  /**
    * A viewport that fully covers `framebuffer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#RenderTarget)
    */
  var viewport: js.Array[Double]
}
object RenderTarget {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    framebuffer: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    viewport: js.Array[Double]
  ): RenderTarget = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], framebuffer = framebuffer.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTarget]
  }
  
  @scala.inline
  implicit class RenderTargetMutableBuilder[Self <: RenderTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramebuffer(value: js.Any): Self = StObject.set(x, "framebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: js.Array[Double]): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportVarargs(value: Double*): Self = StObject.set(x, "viewport", js.Array(value :_*))
  }
}
