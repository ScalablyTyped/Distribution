package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDockOptionsBreakpoint extends Object {
  /**
    * The maximum height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default 544
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The maximum width of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default 544
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PopupDockOptionsBreakpoint {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PopupDockOptionsBreakpoint = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDockOptionsBreakpoint]
  }
}

