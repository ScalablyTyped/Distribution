package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.average
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.tick
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
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
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    stops: js.Array[ColorSizeStop] = null,
    thumbsConstrained: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null,
    zoomOptions: SmartMappingSliderViewModelZoomOptions = null,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): ColorSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3(inputFormatFunction))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3(inputParseFunction))
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsConstrained)) __obj.updateDynamic("thumbsConstrained")(thumbsConstrained.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSizeSliderViewModelProperties]
  }
}

