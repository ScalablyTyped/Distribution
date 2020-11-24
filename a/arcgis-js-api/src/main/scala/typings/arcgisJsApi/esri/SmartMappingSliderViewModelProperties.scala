package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartMappingSliderViewModelProperties extends SliderViewModelProperties {
  
  /**
    * Zooms the slider track to the bounds provided in this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var zoomOptions: js.UndefOr[SmartMappingSliderViewModelZoomOptions] = js.native
  
  /**
    * Enables zooming on the slider.
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
