package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartMappingSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * Zooms the slider track to the bounds provided in this property. When min and/or max zoom values are provided, the absolute [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#min) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#max) slider values are preserved and rendered at their typical positions on the slider. However, the slider track itself is zoomed so that thumbs cannot be moved above or below the provided min and max zoomed values.  When a slider is in a zoomed state, the zoomed ends of the track will appear jagged. In the image below, notice how the top thumb cannot be moved past the zoom max of `31` even though the slider max is `200`.  ![slider-zoom](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-zoomed.png)  To exit a zoomed state, the user can click the jagged line or the developer can set the `zoomOptions` to `null`. It is up to the developer to provide a UI option for end users to enable zooming on the slider.  Setting the `zoomOptions` is useful when the slider is tied to heavily skewed datasets where the histogram renders only one or two bars because of outliers.  ![slider-not-zoomed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-skewed-not-zoomed.png)  You can remove the influence of outliers by zooming the slider and regenerating a histogram based on the zoomed min and max. This will provide a better view of the data and make the slider more useful to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var zoomOptions: js.UndefOr[SmartMappingSliderViewModelZoomOptions] = js.undefined
  /**
    * Enables zooming on the slider. See [zoomOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions) for more information on zooming along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomingEnabled)
    */
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}

object SmartMappingSliderViewModelProperties {
  @scala.inline
  def apply(
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    thumbsConstrained: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null,
    zoomOptions: SmartMappingSliderViewModelZoomOptions = null,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): SmartMappingSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3(inputFormatFunction))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3(inputParseFunction))
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsConstrained)) __obj.updateDynamic("thumbsConstrained")(thumbsConstrained.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartMappingSliderViewModelProperties]
  }
}

