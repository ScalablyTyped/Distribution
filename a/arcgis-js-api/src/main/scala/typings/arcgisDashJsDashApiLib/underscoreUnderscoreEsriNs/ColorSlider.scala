package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSlider
  extends Accessor
     with Widgette {
  /**
    * Indicates whether to show the handles of the slider that may be dragged by the user. See the image in the [class description](#) to see where handles are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#handlesVisible)
    *
    * @default true
    */
  var handlesVisible: scala.Boolean = js.native
  /**
    * The histogram associated with the data represented on the slider. This may be generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogram)
    */
  var histogram: HistogramResult = js.native
  /**
    * Indicates whether to show the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogram) in the slider UI. See the image in the [class description](#) to see where the histogram is typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogramVisible)
    *
    * @default true
    */
  var histogramVisible: scala.Boolean = js.native
  /**
    * The width of the histogram in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogramWidth)
    *
    * @default 100
    */
  var histogramWidth: scala.Double = js.native
  /**
    * Indicates whether to show labels in the slider UI. See the image in the [class description](#) to see where labels are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: scala.Boolean = js.native
  /**
    * The maximum value or upper bound of the slider. This value overrides the `max` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics), but may not be less than the value of the maximum stop of the [color visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable).  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#maxValue)
    */
  var maxValue: scala.Double = js.native
  /**
    * The minimum value or lower bound of the slider. This value overrides the `min` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics), but may not be greater than the value of the minimum stop of the [color visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable).  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#minValue)
    */
  var minValue: scala.Double = js.native
  /**
    * Indicates the number of handles to show on the slider. Acceptable values are `2` or `3`. If `3` handles are specified, then the [syncedHandles](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#syncedHandles) property may be enabled to sync the movement of the outside handles with the middle, or primary, handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#numHandles)
    *
    * @default {"value":2,"set":""}
    */
  var numHandles: scala.Double = js.native
  /**
    * The summary statistics of the data represented in the slider. This is an object that may be generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) statistics function. The `min` and `max` values in this object determine the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#maxValue) of the slider if values for those properties are not already provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics)
    */
  var statistics: ColorSliderStatistics = js.native
  /**
    * Indicates whether to show the average in the slider UI. See the image in the [class description](#) to see where this symbol is typically placed. Hover over this symbol to view the average in the tooltip.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statisticsVisible)
    *
    * @default true
    */
  var statisticsVisible: scala.Boolean = js.native
  /**
    * Only applicable when [numHandles](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#numHandles) is set to `3`. This property indicates whether the outside handles are synced with the middle, or primary, handle. If the primary handle is dragged then the outside handles are dragged while maintaining the same distance from the primary handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#syncedHandles)
    *
    * @default false
    */
  var syncedHandles: scala.Boolean = js.native
  /**
    * Indicates whether to show tick marks next to the slider handles. See the image in the [class description](#) to see where ticks are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#ticksVisible)
    *
    * @default true
    */
  var ticksVisible: scala.Boolean = js.native
  /**
    * Each object in this array represents a stop in the [color visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable) associated with the slider. The properties of each object describe whether the stop has a slider handle, the value of the handle and its associated color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#values)
    */
  val values: js.Array[ColorSliderValues] = js.native
  /**
    * The color visual variable represented by the slider. This must be set initially on the slider for it to render in the view. This may be created manually (see snippet below) or generated from the [colorRendererCreator](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html) helper methods. A new color visual variable is created each time the user slides handles or changes the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#minValue) or the [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable)
    */
  var visualVariable: ColorVariable = js.native
  /* InferMemberOverrides */
  override def destroy(): scala.Unit = js.native
}

