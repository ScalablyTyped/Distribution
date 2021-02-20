package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorSizeStop]] = js.native
}
object ColorSizeSliderViewModelProperties {
  
  @scala.inline
  def apply(): ColorSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSizeSliderViewModelProperties]
  }
  
  @scala.inline
  implicit class ColorSizeSliderViewModelPropertiesMutableBuilder[Self <: ColorSizeSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[ColorSizeStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: ColorSizeStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
