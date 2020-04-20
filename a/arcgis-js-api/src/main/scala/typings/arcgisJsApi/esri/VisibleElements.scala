package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleElements extends Object {
  /**
    * Indicates whether to the status indicators will be displayed. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}

object VisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    statusIndicators: js.UndefOr[Boolean] = js.undefined
  ): VisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(statusIndicators)) __obj.updateDynamic("statusIndicators")(statusIndicators.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleElements]
  }
}

