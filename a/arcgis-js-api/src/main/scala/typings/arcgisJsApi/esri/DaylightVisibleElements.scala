package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaylightVisibleElements extends Object {
  /**
    * When set to `false`, neither the date nor the season picker are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    *
    * @default true
    */
  var datePicker: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `false`, neither of the play buttons are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    *
    * @default true
    */
  var playButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `false`, the shadow toggle button is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    *
    * @default true
    */
  var shadowsToggle: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `false`, the timezone selector is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    *
    * @default true
    */
  var timezone: js.UndefOr[Boolean] = js.undefined
}

object DaylightVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    datePicker: js.UndefOr[Boolean] = js.undefined,
    playButtons: js.UndefOr[Boolean] = js.undefined,
    shadowsToggle: js.UndefOr[Boolean] = js.undefined,
    timezone: js.UndefOr[Boolean] = js.undefined
  ): DaylightVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(datePicker)) __obj.updateDynamic("datePicker")(datePicker.asInstanceOf[js.Any])
    if (!js.isUndefined(playButtons)) __obj.updateDynamic("playButtons")(playButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowsToggle)) __obj.updateDynamic("shadowsToggle")(shadowsToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(timezone)) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaylightVisibleElements]
  }
}

