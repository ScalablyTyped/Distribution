package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerViewGL2DRenderRenderParameters
  extends stdLib.Object {
  /**
    * The WebGL or WebGL 2 context. Its concrete type depends on system configuration. Every time that `render()` is called, the API automatically resets WebGL to a conventional state which is _almost_ the default one; the only two things that may be non-default are the bound framebuffer and the viewport, which is set to match the entire framebuffer. _The body of `render()` **must not** change these settings_.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var context: stdLib.WebGLRenderingContext | js.Any
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var state: ViewState
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var stationary: scala.Boolean
}

object BaseLayerViewGL2DRenderRenderParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    context: stdLib.WebGLRenderingContext | js.Any,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    state: ViewState,
    stationary: scala.Boolean
  ): BaseLayerViewGL2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor, context = context.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state, stationary = stationary)
  
    __obj.asInstanceOf[BaseLayerViewGL2DRenderRenderParameters]
  }
}

