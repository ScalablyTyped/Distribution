package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * A modified version of [SliderViewModel.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction), which is a custom function used to format labels. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_ColorSizeSliderViewModelProperties: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.undefined
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.  Use the [fromRendererResult()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#fromRendererResult) method to conveniently construct these stops from a renderer generated from the [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer) smart mapping module.  Use [updateVisualVariables()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#updateVisualVariables) to update the renderer's visual variables with the values matching the slider thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorSizeStop]] = js.undefined
}

object ColorSizeSliderViewModelProperties {
  @scala.inline
  def apply(
    labelFormatFunction: SmartMappingSliderBaseLabelFormatter = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    stops: js.Array[ColorSizeStop] = null,
    values: js.Array[Double] = null
  ): ColorSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(labelFormatFunction)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ColorSizeSliderViewModelProperties]
  }
}

