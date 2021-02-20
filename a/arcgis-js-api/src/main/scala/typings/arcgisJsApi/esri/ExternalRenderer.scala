package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalRenderer extends Object {
  
  /**
    * Called when the external renderer is removed from a view, or when the [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready) state of the view turns false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var dispose: js.UndefOr[RenderContextCallback] = js.native
  
  /**
    * Called in every frame to execute the state update and draw calls.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var render: js.UndefOr[RenderContextCallback] = js.native
  
  /**
    * Typically called once after adding the external renderer to a view, or whenever the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) becomes [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var setup: js.UndefOr[RenderContextCallback] = js.native
}
object ExternalRenderer {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ExternalRenderer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ExternalRenderer]
  }
  
  @scala.inline
  implicit class ExternalRendererMutableBuilder[Self <: ExternalRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: /* context */ js.UndefOr[RenderContext] => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setRender(value: /* context */ js.UndefOr[RenderContext] => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSetup(value: /* context */ js.UndefOr[RenderContext] => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
  }
}
