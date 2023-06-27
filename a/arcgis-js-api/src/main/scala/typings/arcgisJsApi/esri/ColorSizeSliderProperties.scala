package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSizeSliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
  /**
  		 * Only applicable when three thumbs (i.e.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#handlesSyncedToPrimary)
  		 */
  var handlesSyncedToPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Only applicable when three thumbs (i.e.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#persistSizeRangeEnabled)
  		 */
  var persistSizeRangeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When `true`, the slider will render a third handle between the two handles already provided by default.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#primaryHandleEnabled)
  		 */
  var primaryHandleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#stops)
  		 */
  var stops: js.UndefOr[js.Array[ColorSizeStopProperties]] = js.undefined
  
  /**
  		 * The view model for the ColorSizeSlider widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#viewModel)
  		 */
  var viewModel: js.UndefOr[ColorSizeSliderViewModelProperties] = js.undefined
}
object ColorSizeSliderProperties {
  
  inline def apply(): ColorSizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSizeSliderProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSizeSliderProperties] (val x: Self) extends AnyVal {
    
    inline def setHandlesSyncedToPrimary(value: Boolean): Self = StObject.set(x, "handlesSyncedToPrimary", value.asInstanceOf[js.Any])
    
    inline def setHandlesSyncedToPrimaryUndefined: Self = StObject.set(x, "handlesSyncedToPrimary", js.undefined)
    
    inline def setPersistSizeRangeEnabled(value: Boolean): Self = StObject.set(x, "persistSizeRangeEnabled", value.asInstanceOf[js.Any])
    
    inline def setPersistSizeRangeEnabledUndefined: Self = StObject.set(x, "persistSizeRangeEnabled", js.undefined)
    
    inline def setPrimaryHandleEnabled(value: Boolean): Self = StObject.set(x, "primaryHandleEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrimaryHandleEnabledUndefined: Self = StObject.set(x, "primaryHandleEnabled", js.undefined)
    
    inline def setStops(value: js.Array[ColorSizeStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: ColorSizeStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setViewModel(value: ColorSizeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
