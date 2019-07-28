package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderViewModelBreaks]] = js.undefined
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_ClassedSizeSliderViewModelProperties: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.undefined
}

object ClassedSizeSliderViewModelProperties {
  @scala.inline
  def apply(
    breaks: js.Array[ClassedSizeSliderViewModelBreaks] = null,
    labelFormatFunction: SmartMappingSliderBaseLabelFormatter = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    values: js.Array[Double] = null
  ): ClassedSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (breaks != null) __obj.updateDynamic("breaks")(breaks)
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(labelFormatFunction)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ClassedSizeSliderViewModelProperties]
  }
}

