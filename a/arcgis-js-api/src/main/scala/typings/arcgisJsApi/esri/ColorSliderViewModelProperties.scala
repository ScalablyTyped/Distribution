package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  /**
    * Only applicable when three thumbs (i.e. handles) are set on the slider [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#values). This property indicates whether the position of the outside handles are synced with the middle, or primary, handle. When enabled, if the primary handle is moved then the outside handle positions are updated while maintaining a fixed distance from the primary handle.  Only applicable when [primaryHandleEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#primaryHandleEnabled) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#handlesSyncedToPrimary)
    *
    * @default true
    */
  var handlesSyncedToPrimary: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default. This is the primary handle. When [handlesSyncedToPrimary](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#handlesSyncedToPrimary) is `true`, then this handle will control the position of the others when moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#primaryHandleEnabled)
    *
    * @default false
    */
  var primaryHandleEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider. The colors in these stops will be used to render the color gradient on the slider's track. They should match the colors rendered in the associated layer's renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorStopProperties]] = js.native
}

object ColorSliderViewModelProperties {
  @scala.inline
  def apply(): ColorSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSliderViewModelProperties]
  }
  @scala.inline
  implicit class ColorSliderViewModelPropertiesOps[Self <: ColorSliderViewModelProperties] (val x: Self) extends AnyVal {
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
    def setHandlesSyncedToPrimary(value: Boolean): Self = this.set("handlesSyncedToPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlesSyncedToPrimary: Self = this.set("handlesSyncedToPrimary", js.undefined)
    @scala.inline
    def setPrimaryHandleEnabled(value: Boolean): Self = this.set("primaryHandleEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryHandleEnabled: Self = this.set("primaryHandleEnabled", js.undefined)
    @scala.inline
    def setStopsVarargs(value: ColorStopProperties*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[ColorStopProperties]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
  }
  
}

