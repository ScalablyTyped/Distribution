package typings.arcgisJsApi.esri

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContext extends StObject {
  
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  def bindRenderTarget(): scala.Unit
  
  /**
    * The camera used to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var camera: RenderCamera
  
  /**
    * The WebGL rendering context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var gl: WebGLRenderingContext
  
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  def resetWebGLState(): scala.Unit
  
  /**
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight
}
object RenderContext {
  
  inline def apply(
    bindRenderTarget: () => scala.Unit,
    camera: RenderCamera,
    gl: WebGLRenderingContext,
    resetWebGLState: () => scala.Unit,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(bindRenderTarget = js.Any.fromFunction0(bindRenderTarget), camera = camera.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], resetWebGLState = js.Any.fromFunction0(resetWebGLState), sunLight = sunLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderContext] (val x: Self) extends AnyVal {
    
    inline def setBindRenderTarget(value: () => scala.Unit): Self = StObject.set(x, "bindRenderTarget", js.Any.fromFunction0(value))
    
    inline def setCamera(value: RenderCamera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setResetWebGLState(value: () => scala.Unit): Self = StObject.set(x, "resetWebGLState", js.Any.fromFunction0(value))
    
    inline def setSunLight(value: SunLight): Self = StObject.set(x, "sunLight", value.asInstanceOf[js.Any])
  }
}
