package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartMappingSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * Zooms the slider track to the bounds provided in this property. When min and/or max zoom values are provided, the absolute [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#min) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#max) slider values are preserved and rendered at their typical positions on the slider. However, the slider track itself is zoomed so that thumbs cannot be moved above or below the provided min and max zoomed values.  When a slider is in a zoomed state, the zoomed ends of the track will appear jagged. In the image below, notice how the top thumb cannot be moved past the zoom max of `31` even though the slider max is `200`.  ![slider-zoom](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-zoomed.png)  To exit a zoomed state, the user can click the jagged line or the developer can set the `zoomOptions` to `null`. It is up to the developer to provide a UI option for end users to enable zooming on the slider.  Setting the `zoomOptions` is useful when the slider is tied to heavily skewed datasets where the histogram renders only one or two bars because of outliers.  ![slider-not-zoomed](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/sliders/slider-skewed-not-zoomed.png)  You can remove the influence of outliers by zooming the slider and regenerating a histogram based on the zoomed min and max. This will provide a better view of the data and make the slider more useful to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var zoomOptions: js.UndefOr[SmartMappingSliderViewModelZoomOptions] = js.native
  /**
    * Enables zooming on the slider. See [zoomOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions) for more information on zooming along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomingEnabled)
    */
  var zoomingEnabled: js.UndefOr[Boolean] = js.native
}

object SmartMappingSliderViewModelProperties {
  @scala.inline
  def apply(): SmartMappingSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartMappingSliderViewModelProperties]
  }
  @scala.inline
  implicit class SmartMappingSliderViewModelPropertiesOps[Self <: SmartMappingSliderViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setZoomOptions(value: SmartMappingSliderViewModelZoomOptions): Self = this.set("zoomOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOptions: Self = this.set("zoomOptions", js.undefined)
    @scala.inline
    def setZoomingEnabled(value: Boolean): Self = this.set("zoomingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomingEnabled: Self = this.set("zoomingEnabled", js.undefined)
  }
  
}

