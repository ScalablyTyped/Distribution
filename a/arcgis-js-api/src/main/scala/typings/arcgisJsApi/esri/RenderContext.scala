package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext extends Object {
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
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def bindRenderTarget(): Unit
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def resetWebGLState(): Unit
}

object RenderContext {
  @scala.inline
  def apply(
    bindRenderTarget: () => Unit,
    camera: RenderCamera,
    constructor: js.Function,
    gl: WebGLRenderingContext,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resetWebGLState: () => Unit,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(bindRenderTarget = js.Any.fromFunction0(bindRenderTarget), camera = camera.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resetWebGLState = js.Any.fromFunction0(resetWebGLState), sunLight = sunLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext]
  }
}

