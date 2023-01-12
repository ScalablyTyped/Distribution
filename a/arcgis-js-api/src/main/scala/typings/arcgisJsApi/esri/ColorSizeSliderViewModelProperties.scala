package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSizeSliderViewModelProperties
  extends StObject
     with SizeSliderViewModelProperties {
  
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#stops)
    */
  @JSName("stops")
  var stops_ColorSizeSliderViewModelProperties: js.UndefOr[js.Array[ColorSizeStopProperties]] = js.undefined
}
object ColorSizeSliderViewModelProperties {
  
  inline def apply(): ColorSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSizeSliderViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSizeSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setStops(value: js.Array[ColorSizeStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: ColorSizeStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
