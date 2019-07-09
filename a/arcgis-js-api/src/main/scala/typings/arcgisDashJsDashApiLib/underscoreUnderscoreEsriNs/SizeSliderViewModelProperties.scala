package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_SizeSliderViewModelProperties: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.undefined
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.undefined
}

object SizeSliderViewModelProperties {
  @scala.inline
  def apply(
    labelFormatFunction: SmartMappingSliderBaseLabelFormatter = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null,
    stops: js.Array[SizeStopProperties] = null,
    values: js.Array[scala.Double] = null
  ): SizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(labelFormatFunction)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SizeSliderViewModelProperties]
  }
}

