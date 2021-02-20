package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeSliderProperties extends SmartMappingSliderBaseProperties {
  
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorSizeStop]] = js.native
  
  /**
    * The view model for the ColorSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ColorSizeSliderViewModelProperties] = js.native
}
object ColorSizeSliderProperties {
  
  @scala.inline
  def apply(): ColorSizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSizeSliderProperties]
  }
  
  @scala.inline
  implicit class ColorSizeSliderPropertiesMutableBuilder[Self <: ColorSizeSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[ColorSizeStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: ColorSizeStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setViewModel(value: ColorSizeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
