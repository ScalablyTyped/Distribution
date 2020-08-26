package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`side-by-side`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.card
import typings.arcgisJsApi.arcgisJsApiStrings.classic
import typings.arcgisJsApi.arcgisJsApiStrings.stack
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendStyle extends Object {
  /**
    * When a `card` type is specified, you can specify one of the following layout options.
    *
    * Value | Description
    * ------|------------
    * auto | This layout is responsive so that in wide views the legend has a `side-by-side` layout, and a `stack` layout in smaller (mobile) views.
    * side-by-side | The legend has a landscape orientation that allows users to scroll horizontally to view multiple legend cards at a time.
    * stack | The legend cards are stacked, which conserves space, but restricts the user to seeing only one card at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    *
    * @default stack
    */
  var layout: js.UndefOr[auto | `side-by-side` | stack] = js.native
  /**
    * Specifies the style of the legend. There are two possible values listed in the table below:
    *
    * Value | Description
    * ------|------------
    * classic | The legend has a portrait orientation. The user can scroll vertically when many elements are included in the legend's content.
    * card | In wide views, the legend has a landscape orientation that allows users to scroll horizontally to view all legend elements. This style can be responsive, making it ideal for mobile web apps. In smaller views, the legend collapses to occupy less space. One element is shown at a time in a card-style layout, which the user can navigate horizontally.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var `type`: classic | card = js.native
}

object LegendStyle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: classic | card
  ): LegendStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendStyle]
  }
  @scala.inline
  implicit class LegendStyleOps[Self <: LegendStyle] (val x: Self) extends AnyVal {
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
    def setType(value: classic | card): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: auto | `side-by-side` | stack): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
  }
  
}

