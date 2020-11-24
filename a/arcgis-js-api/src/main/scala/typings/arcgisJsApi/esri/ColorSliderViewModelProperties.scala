package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  
  /**
    * Only applicable when three thumbs (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#handlesSyncedToPrimary)
    */
  var handlesSyncedToPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#primaryHandleEnabled)
    */
  var primaryHandleEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider.
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
