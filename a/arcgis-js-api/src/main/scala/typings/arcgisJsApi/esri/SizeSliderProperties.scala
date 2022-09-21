package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
  /**
    * Only applicable when three thumbs (i.e.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#handlesSyncedToPrimary)
    */
  var handlesSyncedToPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only applicable when three thumbs (i.e.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#persistSizeRangeEnabled)
    */
  var persistSizeRangeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#primaryHandleEnabled)
    */
  var primaryHandleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.undefined
  
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var style: js.UndefOr[SizeSliderStyleProperties] = js.undefined
  
  /**
    * The view model for the SizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[SizeSliderViewModelProperties] = js.undefined
}
object SizeSliderProperties {
  
  inline def apply(): SizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSliderProperties]
  }
  
  extension [Self <: SizeSliderProperties](x: Self) {
    
    inline def setHandlesSyncedToPrimary(value: Boolean): Self = StObject.set(x, "handlesSyncedToPrimary", value.asInstanceOf[js.Any])
    
    inline def setHandlesSyncedToPrimaryUndefined: Self = StObject.set(x, "handlesSyncedToPrimary", js.undefined)
    
    inline def setPersistSizeRangeEnabled(value: Boolean): Self = StObject.set(x, "persistSizeRangeEnabled", value.asInstanceOf[js.Any])
    
    inline def setPersistSizeRangeEnabledUndefined: Self = StObject.set(x, "persistSizeRangeEnabled", js.undefined)
    
    inline def setPrimaryHandleEnabled(value: Boolean): Self = StObject.set(x, "primaryHandleEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrimaryHandleEnabledUndefined: Self = StObject.set(x, "primaryHandleEnabled", js.undefined)
    
    inline def setStops(value: js.Array[SizeStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: SizeStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setStyle(value: SizeSliderStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setViewModel(value: SizeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
