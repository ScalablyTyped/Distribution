package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSliderProperties extends WidgetteProperties {
  /**
    * Indicates whether to show the handles of the slider that may be dragged by the user. See the image in the [class description](#) to see where handles are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#handlesVisible)
    *
    * @default true
    */
  var handlesVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The histogram associated with the data represented on the slider. This may be generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogram)
    */
  var histogram: js.UndefOr[HistogramResult] = js.undefined
  /**
    * Indicates whether to show the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogram) in the slider UI. See the image in the [class description](#) to see where the histogram is typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogramVisible)
    *
    * @default true
    */
  var histogramVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width of the histogram in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#histogramWidth)
    *
    * @default 100
    */
  var histogramWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to show labels in the slider UI. See the image in the [class description](#) to see where labels are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum value or upper bound of the slider. This value overrides the `max` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics), but may not be less than the value of the maximum stop of the [color visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable).  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#maxValue)
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value or lower bound of the slider. This value overrides the `min` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics), but may not be greater than the value of the minimum stop of the [color visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable).  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#minValue)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the number of handles to show on the slider. Acceptable values are `2` or `3`. If `3` handles are specified, then the [syncedHandles](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#syncedHandles) property may be enabled to sync the movement of the outside handles with the middle, or primary, handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#numHandles)
    *
    * @default {"value":2,"set":""}
    */
  var numHandles: js.UndefOr[scala.Double] = js.undefined
  /**
    * The summary statistics of the data represented in the slider. This is an object that may be generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) statistics function. The `min` and `max` values in this object determine the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#maxValue) of the slider if values for those properties are not already provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics)
    */
  var statistics: js.UndefOr[ColorSliderStatistics] = js.undefined
  /**
    * Indicates whether to show the average in the slider UI. See the image in the [class description](#) to see where this symbol is typically placed. Hover over this symbol to view the average in the tooltip.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statisticsVisible)
    *
    * @default true
    */
  var statisticsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only applicable when [numHandles](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#numHandles) is set to `3`. This property indicates whether the outside handles are synced with the middle, or primary, handle. If the primary handle is dragged then the outside handles are dragged while maintaining the same distance from the primary handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#syncedHandles)
    *
    * @default false
    */
  var syncedHandles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to show tick marks next to the slider handles. See the image in the [class description](#) to see where ticks are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#ticksVisible)
    *
    * @default true
    */
  var ticksVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color visual variable represented by the slider. This must be set initially on the slider for it to render in the view. This may be created manually (see snippet below) or generated from the [colorRendererCreator](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html) helper methods. A new color visual variable is created each time the user slides handles or changes the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#minValue) or the [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#visualVariable)
    */
  var visualVariable: js.UndefOr[ColorVariableProperties] = js.undefined
}

object ColorSliderProperties {
  @scala.inline
  def apply(
    container: java.lang.String | stdLib.HTMLElement = null,
    handlesVisible: js.UndefOr[scala.Boolean] = js.undefined,
    histogram: HistogramResult = null,
    histogramVisible: js.UndefOr[scala.Boolean] = js.undefined,
    histogramWidth: scala.Int | scala.Double = null,
    labelsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    numHandles: scala.Int | scala.Double = null,
    statistics: ColorSliderStatistics = null,
    statisticsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    syncedHandles: js.UndefOr[scala.Boolean] = js.undefined,
    ticksVisible: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    visualVariable: ColorVariableProperties = null
  ): ColorSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(handlesVisible)) __obj.updateDynamic("handlesVisible")(handlesVisible)
    if (histogram != null) __obj.updateDynamic("histogram")(histogram)
    if (!js.isUndefined(histogramVisible)) __obj.updateDynamic("histogramVisible")(histogramVisible)
    if (histogramWidth != null) __obj.updateDynamic("histogramWidth")(histogramWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsVisible)) __obj.updateDynamic("labelsVisible")(labelsVisible)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (numHandles != null) __obj.updateDynamic("numHandles")(numHandles.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (!js.isUndefined(statisticsVisible)) __obj.updateDynamic("statisticsVisible")(statisticsVisible)
    if (!js.isUndefined(syncedHandles)) __obj.updateDynamic("syncedHandles")(syncedHandles)
    if (!js.isUndefined(ticksVisible)) __obj.updateDynamic("ticksVisible")(ticksVisible)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (visualVariable != null) __obj.updateDynamic("visualVariable")(visualVariable)
    __obj.asInstanceOf[ColorSliderProperties]
  }
}

