package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickConfig extends Object {
  /**
    * Callback for formatting tick labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  /**
    * Indicates whether to render labels for the ticks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
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
  var mode: String
  /**
    * Callback that fires for each tick. You can override default behaviors and styles with this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var tickCreatedFunction: js.UndefOr[TickCreatedFunction] = js.undefined
  /**
    * Indicates where ticks will be rendered below the track. See the description for `mode` for more information about how this property is interpreted by each mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var values: Double | js.Array[Double]
}

object TickConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: Double | js.Array[Double],
    labelFormatFunction: SliderLabelFormatter = null,
    labelsVisible: js.UndefOr[Boolean] = js.undefined,
    tickCreatedFunction: TickCreatedFunction = null
  ): TickConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any])
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(labelFormatFunction)
    if (!js.isUndefined(labelsVisible)) __obj.updateDynamic("labelsVisible")(labelsVisible)
    if (tickCreatedFunction != null) __obj.updateDynamic("tickCreatedFunction")(tickCreatedFunction)
    __obj.asInstanceOf[TickConfig]
  }
}

