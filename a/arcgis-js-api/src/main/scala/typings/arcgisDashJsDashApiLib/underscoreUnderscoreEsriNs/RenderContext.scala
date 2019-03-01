package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext
  extends stdLib.Object {
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
  var gl: stdLib.WebGLRenderingContext
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
  def bindRenderTarget(): scala.Unit
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def resetWebGLState(): scala.Unit
}

object RenderContext {
  @scala.inline
  def apply(
    bindRenderTarget: js.Function0[scala.Unit],
    camera: RenderCamera,
    constructor: js.Function,
    gl: stdLib.WebGLRenderingContext,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    resetWebGLState: js.Function0[scala.Unit],
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindRenderTarget")(bindRenderTarget)
    __obj.updateDynamic("camera")(camera)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("gl")(gl)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("resetWebGLState")(resetWebGLState)
    __obj.updateDynamic("sunLight")(sunLight)
    __obj.asInstanceOf[RenderContext]
  }
}

