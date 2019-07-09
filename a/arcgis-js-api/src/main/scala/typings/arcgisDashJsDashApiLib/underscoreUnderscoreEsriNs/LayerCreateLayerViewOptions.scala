package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerCreateLayerViewOptions
  extends stdLib.Object {
  /**
    * A signal to abort the creation of the layerview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
}

object LayerCreateLayerViewOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    signal: stdLib.AbortSignal = null
  ): LayerCreateLayerViewOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[LayerCreateLayerViewOptions]
  }
}

