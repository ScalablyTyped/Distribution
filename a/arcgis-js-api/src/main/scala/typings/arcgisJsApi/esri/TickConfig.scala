package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.percent
import typings.arcgisJsApi.arcgisJsApiStrings.position
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickConfig extends Object {
  /**
    * Callback for formatting tick labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * Indicates whether to render labels for the ticks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * The mode or method of positioning ticks along the slider track. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * count | Places a fixed number of ticks (provided in the `values` property) at equal distances from each other below the slider track.
    * percent | When set, and a single number is set on the `values` property, ticks will be placed at the specified percentage interval along the length of the slider. For example, when `mode` is percent and `values` is `5`, then 20 ticks will be placed below the slider track (at 5-percent intervals from each other). If an array of `values` is provided, the values are interpreted as percentages along the slider. So if `values` is `[10, 50, 90]`, then three ticks will be placed below the track; one at the midway point, and two 10 percent of the length from either end of the slider.
    * position | Indicates that ticks will only be placed at the values specified in the `values` property.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var mode: count | percent | position = js.native
  /**
    * Callback that fires for each tick. You can override default behaviors and styles with this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var tickCreatedFunction: js.UndefOr[TickCreatedFunction] = js.native
  /**
    * Indicates where ticks will be rendered below the track. See the description for `mode` for more information about how this property is interpreted by each mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var values: Double | js.Array[Double] = js.native
}

object TickConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: count | percent | position,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: Double | js.Array[Double]
  ): TickConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickConfig]
  }
  @scala.inline
  implicit class TickConfigOps[Self <: TickConfig] (val x: Self) extends AnyVal {
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
    def setMode(value: count | percent | position): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Double | js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("labelFormatFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLabelFormatFunction: Self = this.set("labelFormatFunction", js.undefined)
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = this.set("labelsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsVisible: Self = this.set("labelsVisible", js.undefined)
    @scala.inline
    def setTickCreatedFunction(
      value: (/* value */ Double, /* tickElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => Unit
    ): Self = this.set("tickCreatedFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTickCreatedFunction: Self = this.set("tickCreatedFunction", js.undefined)
  }
  
}

