package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
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
  
  @scala.inline
  def apply(): SizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSliderProperties]
  }
  
  @scala.inline
  implicit class SizeSliderPropertiesMutableBuilder[Self <: SizeSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[SizeStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: SizeStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: SizeSliderStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setViewModel(value: SizeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
