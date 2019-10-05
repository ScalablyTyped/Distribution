package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.undefined
}

object HeatmapSliderViewModelProperties {
  @scala.inline
  def apply(
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    stops: js.Array[HeatmapColorStopProperties] = null,
    values: js.Array[Double] = null
  ): HeatmapSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[HeatmapSliderViewModelProperties]
  }
}

