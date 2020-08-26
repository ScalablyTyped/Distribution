package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLayerViewGL2DRenderRenderParameters extends Object {
  /**
    * The WebGL or WebGL 2 context. Its concrete type depends on system configuration. Every time that `render()` is called, the API automatically resets WebGL to a conventional state which is _almost_ the default one; the only two things that may be non-default are the bound framebuffer and the viewport, which is set to match the entire framebuffer. _The body of `render()` **must not** change these settings_.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var context: WebGLRenderingContext | js.Any = js.native
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var state: ViewState = js.native
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  var stationary: Boolean = js.native
}

object BaseLayerViewGL2DRenderRenderParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    context: WebGLRenderingContext | js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: ViewState,
    stationary: Boolean
  ): BaseLayerViewGL2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state.asInstanceOf[js.Any], stationary = stationary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerViewGL2DRenderRenderParameters]
  }
  @scala.inline
  implicit class BaseLayerViewGL2DRenderRenderParametersOps[Self <: BaseLayerViewGL2DRenderRenderParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: WebGLRenderingContext | js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: ViewState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStationary(value: Boolean): Self = this.set("stationary", value.asInstanceOf[js.Any])
  }
  
}

