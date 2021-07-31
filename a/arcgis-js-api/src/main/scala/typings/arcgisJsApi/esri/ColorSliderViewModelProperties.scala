package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSliderViewModelProperties
  extends StObject
     with SmartMappingSliderViewModelProperties {
  
  /**
    * Only applicable when three thumbs (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#handlesSyncedToPrimary)
    */
  var handlesSyncedToPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#primaryHandleEnabled)
    */
  var primaryHandleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorStopProperties]] = js.undefined
}
object ColorSliderViewModelProperties {
  
  @scala.inline
  def apply(): ColorSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSliderViewModelProperties]
  }
  
  @scala.inline
  implicit class ColorSliderViewModelPropertiesMutableBuilder[Self <: ColorSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlesSyncedToPrimary(value: Boolean): Self = StObject.set(x, "handlesSyncedToPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesSyncedToPrimaryUndefined: Self = StObject.set(x, "handlesSyncedToPrimary", js.undefined)
    
    @scala.inline
    def setPrimaryHandleEnabled(value: Boolean): Self = StObject.set(x, "primaryHandleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryHandleEnabledUndefined: Self = StObject.set(x, "primaryHandleEnabled", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[ColorStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: ColorStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
