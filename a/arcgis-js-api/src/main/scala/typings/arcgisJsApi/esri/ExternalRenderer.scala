package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalRenderer extends StObject {
  
  /**
    * Called when the external renderer is removed from a view, or when the [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready) state of the view turns false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var dispose: js.UndefOr[RenderContextCallback] = js.undefined
  
  /**
    * Called in every frame to execute the state update and draw calls.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var render: js.UndefOr[RenderContextCallback] = js.undefined
  
  /**
    * Typically called once after adding the external renderer to a view, or whenever the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) becomes [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var setup: js.UndefOr[RenderContextCallback] = js.undefined
}
object ExternalRenderer {
  
  inline def apply(): ExternalRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalRenderer] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: /* context */ js.UndefOr[RenderContext] => scala.Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setRender(value: /* context */ js.UndefOr[RenderContext] => scala.Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSetup(value: /* context */ js.UndefOr[RenderContext] => scala.Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
  }
}
