package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderViewModelZoomOptions extends StObject {
  
  /**
    * The upper bound of the zoom.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The lower bound of the zoom.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderViewModel.html#zoomOptions)
    */
  var min: js.UndefOr[Double] = js.undefined
}
object SmartMappingSliderViewModelZoomOptions {
  
  inline def apply(): SmartMappingSliderViewModelZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartMappingSliderViewModelZoomOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartMappingSliderViewModelZoomOptions] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
