package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacitySliderViewModelProperties
  extends StObject
     with SmartMappingSliderViewModelProperties {
  
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.undefined
}
object OpacitySliderViewModelProperties {
  
  inline def apply(): OpacitySliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacitySliderViewModelProperties]
  }
  
  extension [Self <: OpacitySliderViewModelProperties](x: Self) {
    
    inline def setStops(value: js.Array[OpacityStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: OpacityStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
