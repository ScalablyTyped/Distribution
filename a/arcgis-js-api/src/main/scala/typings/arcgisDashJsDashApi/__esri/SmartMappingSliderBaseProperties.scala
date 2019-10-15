package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartMappingSliderBaseProperties extends WidgetProperties {
  /**
    * The [Histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html) associated with the data represented on the slider. The bins are typically generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#histogramConfig)
    */
  var histogramConfig: js.UndefOr[HistogramConfig] = js.undefined
  /**
    * A modified version of [Slider.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction), which is a custom function used to format labels on the thumbs, min, max, and average values. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.undefined
  /**
    * The maximum value or upper bound of the slider. If the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) _in the constructor_ is greater than the `max` set in this property, then the `max` will update to match the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#max)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value or lower bound of the slider. If the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) _in the constructor_ is greater than the `min` set in this property, then the `min` will update to match the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#min)
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Zooms the slider track to the bounds provided in this property. When min and/or max zoom values are provided, the absolute [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#min) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#max) slider values are preserved and rendered at their typical positions on the slider. However, the slider track itself is zoomed so that thumbs cannot be moved above or below the provided min and max zoomed values.  When a slider is in a zoomed state, the zoomed ends of the track will appear jagged. In the image below, notice how the top thumb cannot be moved past the zoom max of `31` even though the slider max is `200`.  ![slider-zoom](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-zoomed.png)  To exit a zoomed state, the user can click the jagged line or the developer can set the `zoomOptions` to `null`. It is up to the developer to provide a UI option for end users to enable zooming on the slider.  Setting the `zoomOptions` is useful when the slider is tied to heavily skewed datasets where the histogram renders only one or two bars because of outliers.  ![slider-not-zoomed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-skewed-not-zoomed.png)  You can remove the influence of outliers by zooming the slider and regenerating a histogram based on the zoomed min and max. This will provide a better view of the data and make the slider more useful to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#zoomOptions)
    */
  var zoomOptions: js.UndefOr[SmartMappingSliderBaseZoomOptions] = js.undefined
}

object SmartMappingSliderBaseProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    histogramConfig: HistogramConfig = null,
    id: String = null,
    label: String = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    zoomOptions: SmartMappingSliderBaseZoomOptions = null
  ): SmartMappingSliderBaseProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (histogramConfig != null) __obj.updateDynamic("histogramConfig")(histogramConfig)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions)
    __obj.asInstanceOf[SmartMappingSliderBaseProperties]
  }
}

