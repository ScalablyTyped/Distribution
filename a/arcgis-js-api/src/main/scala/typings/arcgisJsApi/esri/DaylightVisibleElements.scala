package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightVisibleElements extends Object {
  /**
    * When set to `false`, neither the date nor the season picker are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var datePicker: js.UndefOr[Boolean] = js.native
  /**
    * When set to `false`, neither of the play buttons are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var playButtons: js.UndefOr[Boolean] = js.native
  /**
    * When set to `false`, the shadow toggle button is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var shadowsToggle: js.UndefOr[Boolean] = js.native
  /**
    * When set to `false`, the timezone selector is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var timezone: js.UndefOr[Boolean] = js.native
}

object DaylightVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DaylightVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DaylightVisibleElements]
  }
  @scala.inline
  implicit class DaylightVisibleElementsOps[Self <: DaylightVisibleElements] (val x: Self) extends AnyVal {
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
    def setDatePicker(value: Boolean): Self = this.set("datePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePicker: Self = this.set("datePicker", js.undefined)
    @scala.inline
    def setPlayButtons(value: Boolean): Self = this.set("playButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayButtons: Self = this.set("playButtons", js.undefined)
    @scala.inline
    def setShadowsToggle(value: Boolean): Self = this.set("shadowsToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowsToggle: Self = this.set("shadowsToggle", js.undefined)
    @scala.inline
    def setTimezone(value: Boolean): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
  
}

