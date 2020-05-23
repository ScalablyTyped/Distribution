package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartMappingSliderViewModel extends SliderViewModel {
  /**
    * Zooms the slider track to the bounds provided in this property. When min and/or max zoom values are provided, the absolute [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#min) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#max) slider values are preserved and rendered at their typical positions on the slider. However, the slider track itself is zoomed so that thumbs cannot be moved above or below the provided min and max zoomed values.  When a slider is in a zoomed state, the zoomed ends of the track will appear jagged. In the image below, notice how the top thumb cannot be moved past the zoom max of `31` even though the slider max is `200`.  ![slider-zoom](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-zoomed.png)  To exit a zoomed state, the user can click the jagged line or the developer can set the `zoomOptions` to `null`. It is up to the developer to provide a UI option for end users to enable zooming on the slider.  Setting the `zoomOptions` is useful when the slider is tied to heavily skewed datasets where the histogram renders only one or two bars because of outliers.  ![slider-not-zoomed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-skewed-not-zoomed.png)  You can remove the influence of outliers by zooming the slider and regenerating a histogram based on the zoomed min and max. This will provide a better view of the data and make the slider more useful to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var zoomOptions: SmartMappingSliderViewModelZoomOptions = js.native
  /**
    * Enables zooming on the slider. See [zoomOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions) for more information on zooming along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomingEnabled)
    */
  var zoomingEnabled: Boolean = js.native
  /**
    * Gets the [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#max) value of the slider. This is useful for when the user wants to change the slider max when it is not visible in the zoomed state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#getUnzoomedMax)
    *
    *
    */
  def getUnzoomedMax(): Unit = js.native
  /**
    * Gets the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#min) value of the slider. This is useful for when the user wants to change the slider min when it is not visible in the zoomed state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#getUnzoomedMin)
    *
    *
    */
  def getUnzoomedMin(): Unit = js.native
}

