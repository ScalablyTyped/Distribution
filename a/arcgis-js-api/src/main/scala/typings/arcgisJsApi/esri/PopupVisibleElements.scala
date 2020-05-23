package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupVisibleElements extends Object {
  /**
    * Indicates whether to display a close button on the popup dialog. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to the feature navigation will be displayed. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#VisibleElements)
    */
  var featureNavigation: js.UndefOr[Boolean] = js.undefined
}

object PopupVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    featureNavigation: js.UndefOr[Boolean] = js.undefined
  ): PopupVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(featureNavigation)) __obj.updateDynamic("featureNavigation")(featureNavigation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupVisibleElements]
  }
}

