package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderViewModelProperties
  extends StObject
     with SliderViewModelProperties {
  
  /**
    * Zooms the slider track to the bounds provided in this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var zoomOptions: js.UndefOr[SmartMappingSliderViewModelZoomOptions] = js.undefined
  
  /**
    * Enables zooming on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomingEnabled)
    */
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}
object SmartMappingSliderViewModelProperties {
  
  @scala.inline
  def apply(): SmartMappingSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartMappingSliderViewModelProperties]
  }
  
  @scala.inline
  implicit class SmartMappingSliderViewModelPropertiesMutableBuilder[Self <: SmartMappingSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZoomOptions(value: SmartMappingSliderViewModelZoomOptions): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
    
    @scala.inline
    def setZoomingEnabled(value: Boolean): Self = StObject.set(x, "zoomingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomingEnabledUndefined: Self = StObject.set(x, "zoomingEnabled", js.undefined)
  }
}
