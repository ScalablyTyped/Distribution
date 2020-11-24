package typings.arcgisJsApi.esri

import typings.std.CanvasRenderingContext2D
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerView2DRenderRenderParameters extends Object {
  
  /**
    * The [canvas 2D context](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) in which to draw content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var context: CanvasRenderingContext2D = js.native
  
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var state: ViewState = js.native
  
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var stationary: Boolean = js.native
}
object BaseLayerView2DRenderRenderParameters {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    context: CanvasRenderingContext2D,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: ViewState,
    stationary: Boolean
  ): BaseLayerView2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state.asInstanceOf[js.Any], stationary = stationary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerView2DRenderRenderParameters]
  }
  
  @scala.inline
  implicit class BaseLayerView2DRenderRenderParametersOps[Self <: BaseLayerView2DRenderRenderParameters] (val x: Self) extends AnyVal {
    
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
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ViewState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationary(value: Boolean): Self = this.set("stationary", value.asInstanceOf[js.Any])
  }
}
