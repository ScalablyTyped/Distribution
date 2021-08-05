package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSizeSliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorSizeStop]] = js.undefined
  
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
  
  extension [Self <: ColorSizeSliderProperties](x: Self) {
    
    inline def setStops(value: js.Array[ColorSizeStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: ColorSizeStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    inline def setViewModel(value: ColorSizeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
