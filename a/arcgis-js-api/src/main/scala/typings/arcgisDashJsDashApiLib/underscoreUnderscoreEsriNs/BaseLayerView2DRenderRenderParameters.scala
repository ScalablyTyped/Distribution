package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerView2DRenderRenderParameters
  extends stdLib.Object {
  /**
    * The [canvas 2D context](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) in which to draw content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var context: stdLib.CanvasRenderingContext2D
  /**
    * The object that describes view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var state: ViewState
  /**
    * The stationary state of the `MapView`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  var stationary: scala.Boolean
}

object BaseLayerView2DRenderRenderParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    context: stdLib.CanvasRenderingContext2D,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    state: ViewState,
    stationary: scala.Boolean
  ): BaseLayerView2DRenderRenderParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor, context = context, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state, stationary = stationary)
  
    __obj.asInstanceOf[BaseLayerView2DRenderRenderParameters]
  }
}

