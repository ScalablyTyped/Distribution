package typings.arcgisDashJsDashApi.__esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerCreateLayerViewOptions extends Object {
  /**
    * A signal to abort the creation of the layerview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object LayerCreateLayerViewOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    signal: AbortSignal = null
  ): LayerCreateLayerViewOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[LayerCreateLayerViewOptions]
  }
}

