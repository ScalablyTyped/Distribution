package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSliderViewModelProperties
  extends StObject
     with SmartMappingPrimaryHandleSliderViewModelProperties {
  
  /**
    * This property is typically used in diverging, or `above-and-below` renderer configurations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#persistSizeRangeEnabled)
    */
  var persistSizeRangeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.undefined
}
object SizeSliderViewModelProperties {
  
  inline def apply(): SizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSliderViewModelProperties]
  }
  
  extension [Self <: SizeSliderViewModelProperties](x: Self) {
    
    inline def setPersistSizeRangeEnabled(value: Boolean): Self = StObject.set(x, "persistSizeRangeEnabled", value.asInstanceOf[js.Any])
    
    inline def setPersistSizeRangeEnabledUndefined: Self = StObject.set(x, "persistSizeRangeEnabled", js.undefined)
    
    inline def setStops(value: js.Array[SizeStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: SizeStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
