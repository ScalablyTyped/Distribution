package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerListVisibleElements extends Object {
  /**
    * Indicates whether to the status indicators will be displayed. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}

object LayerListVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    statusIndicators: js.UndefOr[Boolean] = js.undefined
  ): LayerListVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(statusIndicators)) __obj.updateDynamic("statusIndicators")(statusIndicators.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerListVisibleElements]
  }
}

